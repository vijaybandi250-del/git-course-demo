package com.experimentjava.firstproject;

class ConditionsDemo {

    // Method to demonstrate if-else condition
    public void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Method to demonstrate switch-case condition
    public void dayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }
}

public class ConditionsExample {
    public static void main(String[] args) {

        ConditionsDemo conditionsDemo = new ConditionsDemo();

        // Test if-else condition
        conditionsDemo.checkNumber(10);
        conditionsDemo.checkNumber(-5);
        conditionsDemo.checkNumber(0);

        // Test switch-case condition
        conditionsDemo.dayOfWeek(3);
        conditionsDemo.dayOfWeek(7);
        conditionsDemo.dayOfWeek(10);

    }
}
