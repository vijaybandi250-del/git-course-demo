package com.experimentjava.firstproject;

class MethodsExample {

    public MethodsExample() {
    }



    // Method to calculate the sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to greet a user by name
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}

public class BusinessLogic {
    public static void main(String[] args) {
        MethodsExample methodsExample = new MethodsExample();

        // Using the sum method
        int result = methodsExample.sum(5, 10);
        System.out.println("Sum: " + result);

        // Using the greet method
        String greeting = methodsExample.greet("Alice");
        System.out.println(greeting);

    }





}
