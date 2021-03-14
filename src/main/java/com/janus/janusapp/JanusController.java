package com.janus.janusapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class JanusController {
    @GetMapping("/hola")
    public String saludar(){
        return "Janus Bienvenido";
    }
}
