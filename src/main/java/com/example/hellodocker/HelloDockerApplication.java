package com.example.hellodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDockerApplication {

    @GetMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @GetMapping("/pepe")
    public String pepe() {
        return "Hello Pepe";
    }


    public static void main(String[] args) {
        SpringApplication.run(HelloDockerApplication.class, args);
    }

}
