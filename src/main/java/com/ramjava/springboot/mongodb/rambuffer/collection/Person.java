package com.ramjava.springboot.mongodb.rambuffer.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL) // nulled fields won't be stored
public class Person {
    @Id // primary key
    private String personId;
    private String firstname;
    private String lastname;
    private int age;
    private List<String> hobbies;
    private List<Address> addresses;
}
