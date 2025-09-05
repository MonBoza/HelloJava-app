package com.monboza.hellojava;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from HelloJava-app!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hi Monica, Spring Boot is working!";
    }
}
