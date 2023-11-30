import java.util.Scanner;

public class AddCoins {
    private static Scanner scanner = new Scanner(System.in);
    private static String calcCoins(int pennies, int dimes, int nickles, int quarters){
        double total = ((pennies*1) + (dimes * 10) + (nickles * 5) + (quarters * 25))/100;
        System.out.println("You have $" + total + " coins");
        return "";
    }
    public static void main(String[] args) {
        System.out.println(calcCoins(60, 3, 1, 01));
    }
}
