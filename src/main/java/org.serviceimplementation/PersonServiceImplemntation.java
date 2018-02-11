package org.serviceimplementation;

import org.model.Person;
import org.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.management.MXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class PersonServiceImplemntation implements PersonService {
    Person p1;
    Person p2;
    Person p3;
    Person p4;
    HashMap<Integer,Person> hashMap = new HashMap<Integer,Person>();
    public PersonServiceImplemntation()
    {

         p1 = new Person("Sid",26,949541928);
         p2 = new Person("Sidy",26,987654123);
         p3 = new Person("Sidharth",26,987651234);
         p4 = new Person("Siddy",26,1234567891);
        add();

    }
    private void add()
    {   int i;
        if(hashMap.isEmpty())
        {
            i=0;
        }
        else
            i=hashMap.size();

        hashMap.put(++i,p1);
        hashMap.put(++i,p2);
        hashMap.put(++i,p3);
        hashMap.put(++i,p4);
    }


    public List<Person> getAllPersons()
    {
        List<Person> allPerson = new ArrayList<Person>();
        for(Person p:hashMap.values())
            allPerson.add(p);

        return allPerson;
    }
    public Person getPerson(int id)
    {
        Person p=new Person();
        if(hashMap.get(id)!=null)
            p = hashMap.get(id);

        return p;
    }
  /*  public String deletePerson(int id)
    {

    }
    public String updatePerson(int id)
    {

    }
    public String addPerson(Person P)
    {

    }*/
    public String deleteAll()
    {
        if(hashMap.isEmpty())
            return "None to delete";
        else
            hashMap.clear();

        return "Success";
    }
}
