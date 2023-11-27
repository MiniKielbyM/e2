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
    private static double[] count = {0,0,0};
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            while (true) {
                System.out.println("How many units of LunchItem" + (i + 1) + " would you like?");
                temp = scanner.nextLine();
                if (temp.matches("\\d+")) {
                    count[i]=Integer.parseInt(temp);
                    break;
                } else {
                    System.out.println("Please enter a valid number");
                    continue;
                }
            }
        }
        System.out.println("Your total is " + getTotal(count[0], count[1], count[2]));
    }
    public static String getTotal(double count1, double count2, double count3) {
        return formatter.format(count1 * 5.4 + count2 * 6.5 + count3 * 7.5);
    }
}
