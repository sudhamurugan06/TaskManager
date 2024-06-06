package com.sudha.ToDoListApp.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sudha.ToDoListApp.Model.User;
import com.sudha.ToDoListApp.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public User createAccount(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	public String loginAccount(User user) {
		// TODO Auto-generated method stub
		 String username = user.getUserName();
	        String password = user.getPassword();
	        User existingUser = userRepository.findByUserName(username);
	        if (existingUser != null) {
	            // Check if the provided password matches the stored password
	            if (passwordEncoder.matches(password, existingUser.getPassword())) {
	                return "success login";
	            } else {
	                return "incorrect password";
	            }
	        } else {
	            return "user not found";
	        }
	    }

}
