
/*
Michael Kielbasinski

The program is a lunch counter that allows the user to input the number of units
they want to purchase for each lunch item. It calculates the total price based
on the quantity entered and the predefined prices for each item. The program uses a
loop to iterate through the lunch items and prompts the user for input. If the input is a valid number,
it updates the total price accordingly. If the input is not a valid number, it displays an error message
and prompts the user again.
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class lunchCounter {
    private static Scanner scanner = new Scanner(System.in);
    private static NumberFormat formatter = NumberFormat.getCurrencyInstance();
    private static String temp;
    private static double totalPrice = 0;
    private static double[] prices = { 5.4, 6.5, 7.5 };

    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            while (true) {
                System.out.println("How many units of LunchItem" + (i + 1) + " would you like?");
                temp = scanner.nextLine();
                if (temp.matches("\\d+")) {
                    totalPrice += Integer.parseInt(temp) * prices[i];
                    break;
                } else {
                    System.out.println("Please enter a valid number");
                    continue;
                }
            }
        }
        System.out.println("Your total is " + formatter.format(totalPrice));
    }
}
