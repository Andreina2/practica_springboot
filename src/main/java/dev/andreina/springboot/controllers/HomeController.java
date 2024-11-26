package dev.andreina.springboot.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HomeController {

    //Get
    @GetMapping("/")
    public String getMethodName() {
        return new String("Hello Spring and Spring Boot");
    }
    
    
}
