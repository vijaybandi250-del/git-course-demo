package com.experimentjava.firstproject;
class Animal {

    void eat() {
        System.out.println("This animal eats food.");
    }
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("The dog barks.");
    }


}
class cat extends Animal {

    void eat() {
        System.out.println("The cat eats fish.");
    }


}

public class InheritanceClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sound();

        Animal cat = new cat();
        cat.eat();
        cat.sound();
        System.out.println("getClass of dog object: " + dog.getClass().getName());
        System.out.println("getClass of cat object: " + cat.getClass().getName());

    }
}
