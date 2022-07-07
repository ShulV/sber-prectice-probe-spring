package ru.shulpov.springproject.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shulpov.springproject.dao.PersonDAO;
import ru.shulpov.springproject.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
    @RequestMapping("/people")
    public class PeopleController {

        private final PersonDAO personDAO;

        @Autowired
        public PeopleController(PersonDAO personDAO) {
            this.personDAO = personDAO;
        }

        @GetMapping("")
        public Map<String, String> index() {
            Map<String, String> bobs = new HashMap<>();
            bobs.put("Bob1", "Genuis");
            bobs.put("Bob2", "SuperGenuis");
            return bobs;
        }

        @GetMapping("/{id}")
        public Person show(@PathVariable("id") int id) {
            return personDAO.show(id);
        }
}
