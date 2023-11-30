import java.text.NumberFormat;
import java.util.Scanner;

public class AddCoins {
    private static Scanner scanner = new Scanner(System.in);
    private static NumberFormat formatter = NumberFormat.getCurrencyInstance();
    private static double pennies;
    private static double dimes;
    private static double nickles;
    private static double quarters;
        private static String input = "";
    private static String calcCoins(double pennies, double dimes, double nickles, double quarters) {
        double total = ((pennies * 1) + (dimes * 10) + (nickles * 5) + (quarters * 25)) / 100;
        System.out.println("You have " + formatter.format(total) + " in coins");
        return "";
    }

    private static int validateInput() {

        while (true) {
            input = scanner.nextLine();
            if (input.matches("\\d+")) {
                if (Integer.parseInt(input) == Math.floor(Integer.parseInt(input))) {
                    return Integer.parseInt(input);
                } else {
                    System.out.println("Please enter a valid number");
                }
            } else {
                System.out.println("Please enter a valid number");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the amount of pennies you would like to add:");
        pennies = validateInput();
        System.out.println("Please enter the amount of dimes you would like to add:");
        dimes = validateInput();
        System.out.println("Please enter the amount of nickles you would like to add:");
        nickles = validateInput();
        System.out.println("Please enter the amount of quarters you would like to add:");
        quarters = validateInput();
        System.out.println(calcCoins(pennies, dimes, nickles, quarters));
    }
}
