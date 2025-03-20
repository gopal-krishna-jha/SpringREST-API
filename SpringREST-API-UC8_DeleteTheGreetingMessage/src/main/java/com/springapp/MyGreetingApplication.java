package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Use @SpringBootApplication Annotation
@SpringBootApplication

//Create a Main class MyGreetingApplication to run the application
public class MyGreetingApplication {

	public static void main(String[] args) {
		//Call the method to run the application
		SpringApplication.run(MyGreetingApplication.class, args);
	}

}
