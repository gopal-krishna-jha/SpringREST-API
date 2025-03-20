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

    //Create  a method to get the greeting by user attributes
    public String getGreeting(String firstName, String lastName) {
        //Check the condition and return the value
        if (firstName != null && lastName != null) {
            //Return the message
            return "Nice to meet you " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            //Return the message
            return "Nice to meet you  " + firstName + "!";
        } else if (lastName != null) {
            //Return the message
            return "Nice to meet you " + lastName + "!";
        } else {
            //Return the message
            return "Hello World";
        }
    }
}
