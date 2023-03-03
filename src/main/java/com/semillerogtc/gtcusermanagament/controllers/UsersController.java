package com.semillerogtc.gtcusermanagament.controllers;

import com.semillerogtc.gtcusermanagament.domain.Usuario;
import com.semillerogtc.gtcusermanagament.services.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Slf4j
@RequestMapping("/usuarios")
//No es necesario poner el '/' en el RequesMapping, el framework lo hace solo
public class UsersController {

    UsersService _user;

    /**
     * Diferentes tipos de inyección
    //Inyección por medio atributo de clase
    //Más dificil el testeo
    //@Autowired
    UsersService _user;
    UsersController() {}

    Inyección por método
    //@Autowired
    public void inicializar(UsersService user) {
        log.info("Se ejecuta método inicializar");
        _user = user;
    }
    */

    //Inyección por constructor
    UsersController(UsersService user) {
        _user = user;
    }

    @GetMapping("/ping")
    public String ping() {
        return "Hola desde controlador usuarios";
    }

    @PostMapping()
    public Boolean registrarUsuario() {
        var user = new Usuario();
        user.nombre = "carlos";
        return _user.registrarUsuario(user);
    }
}