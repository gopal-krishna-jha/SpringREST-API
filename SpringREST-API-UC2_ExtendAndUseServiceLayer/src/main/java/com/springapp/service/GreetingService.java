package com.springapp.service;

import org.springframework.stereotype.Service;

//Use @Service Annotation
@Service
//Create a class GreetingService to indicate the services of My Greeting app
public class GreetingService {

    //Create a method to get the simple greeting message
    public String getSimpleGreeting() {
        //Return the Hello World message
        return "Hello World";
    }
}
