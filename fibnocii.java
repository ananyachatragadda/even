import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner scanner = new Scanner(System.in);

        // Asking the user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Declaring the first two terms of the Fibonacci series
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Printing the Fibonacci series
        for (int i = 1; i <= n; ++i) {
            // Printing the first term
            System.out.print(firstTerm + " ");

            // Calculating the next term in the series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();  // Closing the scanner
    }
}
