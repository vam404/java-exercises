package com.vam404;

import java.util.Scanner;

public class Exercise1 {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Define an array of strings to represent odd and even numbers
            String[] res = { "even", "odd" };

            // Read an integer from the user
            int input = scanner.nextInt();

            // Print whether the number is odd or even
            System.out.println(res[input % 2]);
        }
    }
}
