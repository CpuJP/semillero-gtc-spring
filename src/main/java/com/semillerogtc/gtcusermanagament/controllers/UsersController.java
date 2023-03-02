package com.semillerogtc.gtcusermanagament.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/usuarios")
//No es necesario poner el '/' en el RequesMapping, el framework lo hace solo
public class UsersController {
    @GetMapping("/ping")
    public String ping() {
        return "Hola desde controlador usuarios";
    }
}