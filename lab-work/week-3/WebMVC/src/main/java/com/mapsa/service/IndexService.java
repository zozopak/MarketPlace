package com.mapsa.service;



import com.mapsa.modells.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class IndexService {
    public List<Person> persons=new ArrayList<Person>();

    public List<Person> getPersons(){
        Person user1=new Person() ;
        user1.setId(1);
        user1.setName("Ali");
        user1.setLastname("karimi");
        persons.add(user1);
       Person user2=new Person() ;
        user2.setId(2);
        user2.setName("Rastin");
        user2.setLastname("diba");
        persons.add(user2);
        return persons;
    }
}
