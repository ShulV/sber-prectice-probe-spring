package ru.shulpov.springproject.config.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.shulpov.springproject.config.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_NUMBER;
    private List<Person> people;

    public PersonDAO() {
        people = new ArrayList<Person>();
        people.add(new Person(++PEOPLE_NUMBER, "Vasya"));
        people.add(new Person(++PEOPLE_NUMBER, "Gena"));
        people.add(new Person(++PEOPLE_NUMBER, "Oleg"));
        people.add(new Person(++PEOPLE_NUMBER, "Alex"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
