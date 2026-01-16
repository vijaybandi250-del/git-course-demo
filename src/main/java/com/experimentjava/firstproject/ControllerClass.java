package com.experimentjava.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
class CollectionsExample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Map<String, Integer> nameToAge = Map.of("Alice", 30, "Bob", 25);
    }
}
class LoopExample {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop
        int k = 1;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k <= 5);
    }
}
class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
    }
}

 class  currentDateTime {
    public static void main(String[] args) {
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
    }
}