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
        return "Demo Heroku88888888888888";
    }
    @GetMapping("/test")
    public String index(){
        return "TEST PAGE2222222222222222222222222";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoherokuApplication.class, args);
    }

}
