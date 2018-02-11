package org.contrller;
import org.model.Person;
import org.serviceimplementation.PersonServiceImplemntation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

   @Autowired
    PersonServiceImplemntation personServiceImplemntation;

    @RequestMapping("/{id}")
    public Person returnPerson(@PathVariable(value="id")int id){
        Person p = personServiceImplemntation.getPerson(id);
        return p;


    }

    @RequestMapping("/allPersons")
    public List<Person> getAllPersons(){
        List<Person> p = personServiceImplemntation.getAllPersons();
        return p;

    }

    @RequestMapping("/deleteAll")
    public String deleteAll(){
        String status= personServiceImplemntation.deleteAll();
        return status;

    }
}