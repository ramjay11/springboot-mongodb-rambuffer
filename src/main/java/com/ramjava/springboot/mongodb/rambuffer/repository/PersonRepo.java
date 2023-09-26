package com.ramjava.springboot.mongodb.rambuffer.repository;

import com.ramjava.springboot.mongodb.rambuffer.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends MongoRepository<Person, String> {
}
