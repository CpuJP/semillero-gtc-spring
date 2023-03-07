package com.semillerogtc.gtcusermanagament.common;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Profile("qa")
public class QaEnvironmentService implements EnvironmentService {

    String origen;
    public String pol() {
        return  "acción";
    }
    @Override
    public String getPoliticaClaveUsuario() {
        return "[0-9{1}A-Za-z]";
    }
    @Override
    public String getEnvironmentName() {
        return "qa";
    }
}
