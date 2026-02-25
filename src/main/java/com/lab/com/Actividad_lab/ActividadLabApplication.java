package com.lab.com.Actividad_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class ActividadLabApplication {
    @GetMapping("/saludo")
    public String saludar(){
        return "Bienvenido a la actividad";
    }
    @GetMapping("/saludos")
    public String saludar(){
        return "llego la hora de empezar a programar cd/ci";
    }

	public static void main(String[] args) {
		SpringApplication.run(ActividadLabApplication.class, args);
	}

}
