package com.ramjava.springboot.mongodb.rambuffer.controller;

import com.ramjava.springboot.mongodb.rambuffer.collection.Person;
import com.ramjava.springboot.mongodb.rambuffer.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @PostMapping
    public String save(@RequestBody Person person) {
        return service.save(person);
    }
}

















