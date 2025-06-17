<<<<<<< HEAD
package activities;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int position = scanner.nextInt(); 

        System.out.println("Fibonacci number at position " + position + " is: " + fibonacci(position));

    }
}

=======
package activities;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int position = scanner.nextInt(); 

        System.out.println("Fibonacci number at position " + position + " is: " + fibonacci(position));

    }
}

>>>>>>> 1b212e018afe4005821d6af533a4466626af9bdc
