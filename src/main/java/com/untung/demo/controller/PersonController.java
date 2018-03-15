package com.untung.demo.controller;

import com.untung.demo.model.Person;
import com.untung.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by andry.sunandar01 on 15/03/2018.
 */
@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> savePerson(@RequestParam String person){

        Person person1 = new Person();
        person1.setName(person);
        person1.setAge(39);
        personService.savePerson(person1);
        return new ResponseEntity(HttpStatus.CREATED);

    }
}
