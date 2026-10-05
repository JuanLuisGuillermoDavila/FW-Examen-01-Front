package com.upiiz.examen01f.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/registro"})
    public String registro() {
        return "registro";   // templates/registro.html
    }

    @GetMapping("/busqueda")
    public String busqueda() {
        return "busqueda";   // templates/busqueda.html
    }
}