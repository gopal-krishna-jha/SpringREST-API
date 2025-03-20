package com.springapp.controller;

import com.springapp.entity.Greeting;
import com.springapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Use Annotations for controller
@RestController
@RequestMapping("/greet")
//Create a class GreetingController to control the MyGreeting App requests
public class GreetingController {

    //Use @Autowired Annotation for loose coupling
    @Autowired
    //Create a private object of GreetingService class
    private GreetingService useService;

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

    //Use @GetMapping Annotation
    @GetMapping("/simple")
    //Create a method simpleGreeting to get the simple greeting message
    public String simpleGreeting(){
        //Return the message
        return useService.getSimpleGreeting();
    }

    //Use @GetMapping Annotation
    @GetMapping("/param/")
    //Create a method to get the greeting by the user attributes
    public String getGreeting(@RequestParam(required = false) String firstName,@RequestParam(required = false) String lastName){
        //Return the value and call the method
        return useService.getGreeting(firstName,lastName);
    }

    //Use the @PostMapping Annotation
    @PostMapping("/save")
    //Create a method to save the Greeting message
    public Greeting saveGreeting(@RequestBody Greeting greeting) {
        //call the saveGreeting method and return the value
        return useService.saveGreeting(greeting);
    }

    //Use the @GetMapping Annotation
    @GetMapping("/id/{id}")
    //Create a method to find the greeting by id
    public Optional<Greeting> findGreetingById(@PathVariable Long id){
            //Return the value
           return useService.getGreetingById(id);
    }

    //Use @GetMapping Annotation
    @GetMapping("/all")
    //Create method to find the all greeting message
    public List<Greeting> listAllGreetings() {
        //Return the all greetings
        return useService.getAllGreetings();
    }
}
