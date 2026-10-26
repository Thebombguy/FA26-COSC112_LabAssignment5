import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        boolean isPrime = true;

        // Check if number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 up to number / 2
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}