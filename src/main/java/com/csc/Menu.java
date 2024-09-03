package com.csc;

import java.util.Scanner;

public class InputTest {

    public static int userTest() {
        Scanner scanner = new Scanner(System.in);
        int n;
        String prompt = "Please enter a number between 1 to 100:";
        String error = "Invalid number, try again";
        int lowerBound = 1;
        int upperBound = 100;

        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();

                boolean isValid = true;
                if (n < lowerBound) {
                    isValid = false;
                }
                if (n > upperBound) {
                    isValid = false;
                }

                if (isValid) {
                    return n;
                } else {
                    System.out.println(error);
                }
            } else {
                System.out.println(error);
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        int result = userTest();
        System.out.println("You entered: " + result);
    }
}

