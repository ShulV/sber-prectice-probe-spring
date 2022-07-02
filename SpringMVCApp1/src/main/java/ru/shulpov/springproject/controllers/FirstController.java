package ru.shulpov.springproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.Integer.parseInt;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "age", required = false) String age) {
        System.out.println("Привет, " + name + ", твой возраст - " + age);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String sayGoodBye() {
        return "first/goodbye";
    }
    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value = "a", required = false) String a,
                                 @RequestParam(value = "b", required = false) String b,
                                 @RequestParam(value = "action", required = false) String action,
                                 Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);

        int intA, intB;

        try {
            intA = parseInt(a);
            intB = parseInt(b);
        }
        catch (Exception e) {
            model.addAttribute("error", "исключение: " + e.toString());
            return "first/calculator_error";
        }

        switch (action) {
            case "multiplication":
                model.addAttribute("action", "Умножение");
                model.addAttribute("result", intA * intB);
                break;
            case "addition":
                model.addAttribute("action", "Сложение");
                model.addAttribute("result", intA + intB);
                break;
            case "substraction":
                model.addAttribute("action", "Вычитание");
                model.addAttribute("result", intA - intB);
                break;
            case "division":
                model.addAttribute("action", "Деление");
                if (intB != 0) {
                    model.addAttribute("result", intA / intB);
                }
                else {
                    model.addAttribute("error", "Деление на ноль");
                    return "first/calculator_error";
                }
                break;
            default:
                model.addAttribute("error", "Неверное действие");
                return "first/calculator_error";
        }


        return "first/calculator";
    }
}
