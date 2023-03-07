package com.semillerogtc.gtcusermanagament.controllers;

import com.semillerogtc.gtcusermanagament.common.EnvironmentService;
import com.semillerogtc.gtcusermanagament.domain.Usuario;
import com.semillerogtc.gtcusermanagament.services.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
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
    EnvironmentService environmentService;

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
    //Qualifier la primera letra en minúscula
    UsersController(UsersService user,@Qualifier(value="devEnvironmentService") EnvironmentService environmentService) {
        _user = user;
        this.environmentService = environmentService;
        log.info("Se ejecuta constructor inicializar");
        log.info("Ambiente configurado: " + environmentService.getEnvironmentName());
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