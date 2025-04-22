package day6;

import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Print multiplication table from 1 to 10
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
