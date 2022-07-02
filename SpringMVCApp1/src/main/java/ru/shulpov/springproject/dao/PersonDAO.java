package ru.shulpov.springproject.dao;

import org.springframework.stereotype.Component;
import ru.shulpov.springproject.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_NUMBER;
    private final List<Person> people;

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
        return people
                .stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_NUMBER);
        people.add(person);
    }

    public void update(Person updatedPerson, int id) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
    }
}
