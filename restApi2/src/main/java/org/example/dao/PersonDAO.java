package org.example.dao;

import org.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private final List<Person> people = new ArrayList<Person>();

    @Autowired
    public PersonDAO() {

    }

    public List<Person> index() throws SQLException {
        return people;
    }

    public Person show(int id) {
        return people.get(id);
    }
}
