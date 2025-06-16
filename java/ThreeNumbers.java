package activities;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner for input

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int z = scanner.nextInt();

        if (x == y && y == z) {
            System.out.println("All numbers are equal.");
        } else if (x == y || y == z || x == z) {
            System.out.println("Two numbers are equal.");
        } else {
            System.out.println("All numbers are not equal.");
        }

    }
}
