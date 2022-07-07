package org.example.controllers;

import org.example.dao.PersonDAO;
import org.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

    @RestController
    @RequestMapping("/people")
    public class PeopleController {

        private final PersonDAO personDAO;

        @Autowired
        public PeopleController(PersonDAO personDAO) {
            this.personDAO = personDAO;
        }

        @GetMapping()
        public List<Person> index() {
            return personDAO.index();
        }

        @GetMapping("/{id}")
        public Person show(@PathVariable("id") int id) {
            return personDAO.show(id);
        }
}
