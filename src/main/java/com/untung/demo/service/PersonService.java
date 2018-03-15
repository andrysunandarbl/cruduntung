package com.untung.demo.service;

import com.untung.demo.model.Person;

import java.util.List;

/**
 * Created by andry.sunandar01 on 15/03/2018.
 */
public interface PersonService {
    List<Person> getAllPerson();
    void savePerson(Person person);
}
