package com.csc;

// Your code goes here!
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Java Menu!!!");

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter the number between 1 and 100: ");
            int n = sc.nextInt();

            if (n > 0 && n < 101) {
                System.out.println("You entered: " + n);
                break;
            }  else {
                System.out.println("Invalid number! Please try again.");
                i--;
            }
        }

        sc.close();
    }
}
