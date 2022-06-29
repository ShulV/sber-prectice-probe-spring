package ru.shulpov.springproject.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String sayHello(HttpServletRequest req) {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        System.out.println("Привет, " + name + ", твой возраст - " + age);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String sayGoodBye() {
        return "first/goodbye";
    }
}
