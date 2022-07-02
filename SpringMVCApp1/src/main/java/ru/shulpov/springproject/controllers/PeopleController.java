package ru.shulpov.springproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shulpov.springproject.dao.PersonDAO;
import ru.shulpov.springproject.models.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDao;

    @Autowired
    public PeopleController(PersonDAO personDao) {
        this.personDao = personDao;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("people", personDao.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", personDao.show(id));
        return "people/show";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person, Model model) {
        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        personDao.save(person);
        return "redirect:/people/index";
    }
}