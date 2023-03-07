package com.semillerogtc.gtcusermanagament.common;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Profile("dev")

public class DevEnvironmentService implements EnvironmentService {
    @Override
    public String getPoliticaClaveUsuario() {
        return "[0-9A-Za-z]";
    }

    @Override
    public  String getEnvironmentName() {
        return "dev";
    }
}
