package com.springapp.service;

import com.springapp.entity.Greeting;
import com.springapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Use @Service Annotation
@Service
//Create a class GreetingService to indicate the services of My Greeting app
public class GreetingService {

    @Autowired
    private GreetingRepository useRepository;

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

    //Create a method to save the message with id
    public Greeting saveGreeting(Greeting greeting) {
        //return the value and save the data
        return useRepository.save(greeting);
    }

}
