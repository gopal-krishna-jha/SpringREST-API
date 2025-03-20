package com.springapp.repository;

import com.springapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Use @Repository to define the repository
@Repository
//Create an interface GreetingRepository which extends JpaRepository to inherit the properties
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}

