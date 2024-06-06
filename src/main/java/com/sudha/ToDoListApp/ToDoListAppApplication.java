package com.sudha.ToDoListApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ToDoListAppApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(ToDoListAppApplication.class, args);
		System.out.println("It is working.....");
	}

}
