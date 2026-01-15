package com.experimentjava.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerClass {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

}