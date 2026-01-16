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

class conditionals {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}