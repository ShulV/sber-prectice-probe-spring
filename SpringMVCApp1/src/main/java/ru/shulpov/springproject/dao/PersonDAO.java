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
        people.add(new Person(++PEOPLE_NUMBER, "Vasya", 19, "Vasya@mail.ru"));
        people.add(new Person(++PEOPLE_NUMBER, "Gena", 25, "Gena@mail.ru"));
        people.add(new Person(++PEOPLE_NUMBER, "Oleg", 43, "Oleg@mail.ru"));
        people.add(new Person(++PEOPLE_NUMBER, "Alex", 12, "Alex@mail.ru"));
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
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
