package com.example.demoheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoherokuApplication {

    @GetMapping("/")
    public String home(){
        return "Demo Heroku";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoherokuApplication.class, args);
    }

}