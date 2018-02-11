package org.service;

import java.util.List;
import org.model.Person;

public interface PersonService
{
    public List<Person> getAllPersons();
    public Person getPerson(int id);
    public String deleteAll();

  /*  public String deletePerson(int id);
    public String updatePerson(int id);
    public String addPerson(Person P);*/
}