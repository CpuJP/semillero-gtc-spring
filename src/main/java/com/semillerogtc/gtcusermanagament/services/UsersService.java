package com.semillerogtc.gtcusermanagament.services;

import com.semillerogtc.gtcusermanagament.components.UsersValidation;
import com.semillerogtc.gtcusermanagament.domain.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    UsersValidation usersValidation;

    UsersService(UsersValidation usersValidation) {
        this.usersValidation = usersValidation;
    }
    public Boolean registrarUsuario(Usuario user) {
        boolean resultado = usersValidation.execute(user);
        return resultado;
    }

    public String consultarUsuario() {
        return "true";
    }
}
