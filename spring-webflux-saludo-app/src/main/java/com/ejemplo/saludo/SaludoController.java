package com.ejemplo.saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Mono<String> saludar(@RequestParam(defaultValue = "Usuario") String nombre) {
        return Mono.just("Hola " + nombre + ", bienvenido al servicio web reactivo!");
    }
}
