package com.ramjava.springboot.mongodb.rambuffer.service;

import com.ramjava.springboot.mongodb.rambuffer.collection.Person;
import com.ramjava.springboot.mongodb.rambuffer.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepo repo;
    @Override
    public String save(Person person) {
        return repo.save(person).getPersonId();
    }
}
