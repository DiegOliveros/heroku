package com.example.usuarios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping ("/losusuarios")
    String getPeople(Model model){
        model.addAttribute("algo","2. Esto es un texto desde una variable en el controlador");
        model.addAttribute("persona", Arrays.asList(
                new Person("Michael", "Vásquez",85),
                new Person("Paty", "Vásquez",55),
                new Person("Lucas", "Torres",85),
                new Person("Carlos", "Salinas",12)
        ));

        return "usuarios";
    }
}
