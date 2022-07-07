package org.example.dao;

import org.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private final List<Person> people;
    @Autowired
    public PersonDAO() {
      people = new ArrayList<Person>();
      people.add(new Person(1, "Bob", 100, "bob@gmail.com"));
      people.add(new Person(2, "Kravar", 100, "kraken@gmail.com"));
      people.add(new Person(3, "Astahova", 100, "asstashka@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.get(id);
    }
}
