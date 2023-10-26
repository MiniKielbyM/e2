import java.util.Scanner;

public class LastNameMethodsPractice2 {
    private static Scanner scanner = new Scanner(System.in);

    private static String getInput(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        return input;
    }

    private static void ex1Output(String fname, String lname) {
        System.out.println("Grafton High School\n24 Providence Road\nGrafton, MA 01519" + "\n\nTo the parents of "
                + fname + " " + lname);

    }

    private static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    private static void zool(int num, String pet, String street) {
        System.out.println(num + " " + pet + " " + street);
    }

    private static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    private static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String fname = getInput("Enter your first name:");
        String lname = getInput("Enter your last name:");
        ex1Output(fname, lname);
        checkAge(20);
        zool(11, "Lego", "Lottie drive");
        printAmerican("Monday", "July", 4, 2016);
        printEuropean("Monday", 4, "July", 2016);
        scanner.close();
    }
}
