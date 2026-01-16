package com.experimentjava.firstproject;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
