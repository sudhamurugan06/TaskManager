package com.sudha.ToDoListApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudha.ToDoListApp.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	 User findByUserName(String userName);
	
}
