
// Import the Scanner class to allow user input
import java.util.Scanner;
public class SimpleCalculator {
    // Create a Scanner object to read user input
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Display a welcome message
        System.out.println(
                "Simple Java Calculator\nThis program will allow you to calculate the sum or mean of three numbers.");
        // Prompt the user to enter the first number
        System.out.println("Enter your first number:");
        double num1 = scanner.nextDouble();
        // Prompt the user to enter the second number
        System.out.println("Enter your second number:");
        double num2 = scanner.nextDouble();
        // Prompt the user to enter the third number
        System.out.println("Enter your third number:");
        double num3 = scanner.nextDouble();
        // Prompt the user to choose between calculating the sum or the average
        System.out.println("Would you like the sum (enter 1) or the average (enter 2) of these numbers?");
        // Read the user's choice
        int choice = scanner.nextInt();
        // Calculate and display the sum or average based on the user's choice
        if (choice == 1) {
            // Calculate the sum of the three numbers and round it to 15 decimal places
            double sum = Math.floor((num1 + num2 + num3) * 1e15) / 1e15;
            // Display the sum
            System.out.println("The sum of these numbers is " + sum);
        } else {
            // Calculate the average of the three numbers and round it to 3 decimal places
            double average = Math.floor(((num1 + num2 + num3) / 3) * 1e3) / 1e3;
            // Display the average
            System.out.println("The average of these numbers is " + average);
        }
    }
}