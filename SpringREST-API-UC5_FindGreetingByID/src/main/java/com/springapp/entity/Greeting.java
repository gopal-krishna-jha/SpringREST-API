package com.springapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Use @Entity Annotation
@Entity
//Create a class Greeting to indicate the entity
public class Greeting {

    //Use @Id and @GeneratedValue  Annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Create a private variable id and message
    private Long id;
    private String message;

    //Create a getter method  to get id
    public Long getId() {
        //Return the value
        return id;
    }

    //Create a setter method to set id
    public void setId(Long id) {
        //Use this keyword to set the value
        this.id = id;
    }

    //Create a getter method to get message
    public String getMessage() {
        //Return the value
        return message;
    }


    //Create a setter method to set message
    public void setMessage(String message) {
        //Use this keyword to set the value
        this.message = message;
    }

}
