package com.springapp.controller;

import org.springframework.web.bind.annotation.*;

//Use Annotations for controller
@RestController
@RequestMapping("/greet")
//Create a class GreetingController to control the MyGreeting App requests
public class GreetingController {

    //Use @GetMapping Annotation
    @GetMapping(value ={"","/"})
    //Create a method getGreeting to handle the GET request
    public String getGreeting(){
        //Return the value
        return "{\n\t \"Message\": Hello,\n\t\"greet\" : GoodMorning\n}";
    }

    //Use @PutMapping Annotation
    @PutMapping("/put/{firstName}")
    //Create a method to handle the put request
    public String putMapping(@PathVariable  String firstName){
        //Return the value
        return "{\n\t \"Name\": "+firstName+",\n\t\"Greet\" : GoodMorning\n}";
    }

    //Use @PostMapping Annotation
    @PostMapping("/post")
    //Create a method to handle the post request
    public String postMapping(@RequestBody String firstName){
        //return the value
        return  "{\n\t \"Name\": "+firstName+",\n\t\"Greet\" : GoodMorning\n}";
    }

    //Use @DeleteMapping Annotation
    @DeleteMapping("/delete/{firstName}")
    //Create a method to handle the delete request
    public String deleteMapping(@PathVariable String firstName){
        //Return the value
        return "{\n\t \"Name\": "+firstName+",\n\t\"Greet\" : Goodbye\n}";
    }
}
