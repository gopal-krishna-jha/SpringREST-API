package com.springapp.service;

import com.springapp.entity.Greeting;
import com.springapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


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

    //Create a method to get the greeting by id
    public Optional<Greeting> getGreetingById(Long id) {
        //Call the method to find the value and return the value
        return useRepository.findById(id);
    }

    //Create a method to get the all greeting
    public List<Greeting> getAllGreetings() {
        //Return the all greetings
        return useRepository.findAll();
    }


    //Create a method to edit the Greeting message
    public Optional<Greeting> editGreetingMessage(Long id, String newMessage) {
        //Create an object of Optional class and call the findById
        Optional<Greeting> optionalGreeting = useRepository.findById(id);
        //Check the condition and update the value
        if (optionalGreeting.isPresent()) {
            //Create an object of Greeting class
            Greeting greeting = optionalGreeting.get();
            //Call the method and set the message
            greeting.setMessage(newMessage);

            //Return the value
            return Optional.of(useRepository.save(greeting));
        }

        //Return the value when greeting message not found
        return Optional.empty();
    }

    //Create a method to delete the greeting message by id
    public boolean deleteGreetingMessage(Long id) {
        //Check the condition
        if (useRepository.existsById(id)) {
            //call the method and delete the greeting
            useRepository.deleteById(id);

            //return true if operation id completed
            return true;
        }

        //return false if greeting not exist
        return false;
    }
}
