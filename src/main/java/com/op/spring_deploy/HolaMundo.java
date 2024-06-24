package com.op.spring_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

    @Value("${app.message}")
    String message;

    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println(message);
        return "¡Hola Mundooooooooooooo!";
    }

}
