package com.semillerogtc.gtcusermanagament.components;

import com.semillerogtc.gtcusermanagament.domain.Usuario;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UsersValidation {
    public Boolean execute(Usuario user) {
        // 1. (condicion) ? true : false -> if ternario
        //return (user == "Juan") ? true : false; if ternario
        // 2. return (user == "Juan") retornar la condicion
        // 3. if !(user == "Juan") return false;
        //return Objects.equals(user, "Juan");
        return (user.nombre == "Juan") ? true : false;
    }
}
