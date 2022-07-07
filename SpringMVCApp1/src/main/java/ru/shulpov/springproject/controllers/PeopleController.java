package ru.shulpov.springproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.shulpov.springproject.dao.PersonDAO;
import ru.shulpov.springproject.models.Person;

import javax.validation.Valid;
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
    public List<Person> index() throws SQLException {
        return personDAO.index();
    }

    @GetMapping("/{id}")
    public Person show(@PathVariable("id") int id) {
        return personDAO.show(id);
    }

//    @GetMapping("/new")
//    public String newPerson(@ModelAttribute("person") Person person) {
//        return "people/new";
//    }

//    @PostMapping()
//    public String create(@ModelAttribute("person") @Valid Person person,
//                         BindingResult bindingResult) {
//        if (bindingResult.hasErrors())
//            return "people/new";
//
//        personDAO.save(person);
//        return "redirect:/people";
//    }

//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) {
//        model.addAttribute("person", personDAO.show(id));
//        return "people/edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult,
//                         @PathVariable("id") int id) {
//        if (bindingResult.hasErrors())
//            return "people/edit";
//
//        personDAO.update(id, person);
//        return "redirect:/people";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") int id) {
//        personDAO.delete(id);
//        return "redirect:/people";
//    }
}