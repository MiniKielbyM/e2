import java.util.Scanner;
public class SimpleCalculator {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Simple Java Calculator\nThis program will allow you to calculate the sum or mean of three numbers.");
        System.out.println("Enter your first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter your second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter your third number:");
        double num3 = scanner.nextDouble();
        System.out.println("would you like the sum (enter 1) or the average (enter 2) of these numbers?");
        if(scanner.nextInt() == 1){
            System.out.println("The sum of these numbers is " + Math.floor( 
            (num1 + num2 + num3)* 1e15) / 1e15);
        }
        else{
            System.out.println("The average of these numbers is " + Math.floor( 
            ((num1 + num2 + num3)/3)* 1e3) / 1e3);
        }
    }
}
