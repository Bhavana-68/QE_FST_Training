<<<<<<< HEAD
package activities;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1; 
        return n * factorial(n - 1);    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 

        System.out.println("Factorial of " + num + " is: " + factorial(num));

    }
}

=======
package activities;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1; 
        return n * factorial(n - 1);    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 

        System.out.println("Factorial of " + num + " is: " + factorial(num));

    }
}

>>>>>>> 1b212e018afe4005821d6af533a4466626af9bdc
