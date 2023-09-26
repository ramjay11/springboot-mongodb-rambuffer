package com.ramjava.springboot.mongodb.rambuffer.service;

import com.ramjava.springboot.mongodb.rambuffer.collection.Person;

public interface PersonService {
    String save(Person person);
}
