package com.sudha.ToDoListApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudha.ToDoListApp.Model.User;
import com.sudha.ToDoListApp.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public User createAcc(@RequestBody User user) {
		
		return userService.createAccount(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		return userService.loginAccount(user);
	}
}
