
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the traffic management system!");

        System.out.print("Input the number of roads:");
        int roadNumber = readValidNumber(scanner);

        System.out.print("Input the interval:");
        int intervalNumber = readValidNumber(scanner);

        int option;
        do {
            menu();
            option = readValidMenuOption(scanner);
            switch (option) {
                case 1:
                    System.out.println("Road added");
                    break;
                case 2:
                    System.out.println("Road deleted");
                    break;
                case 3:
                    System.out.println("System opened");
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Add road");
        System.out.println("2. Delete road");
        System.out.println("3. Open System");
        System.out.println("0. Quit");
    }

    // Reusable input validation method
    public static int readValidNumber(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            try {
                int number = Integer.parseInt(input);
                if (number >= 0 && number <= 3) {
                    return number;
                } else {
                    System.out.print("Error! Incorrect input! Try again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Error! Incorrect input! Try again: ");
            }
        }
    }

    // Specifically for menu options
    public static int readValidMenuOption(Scanner scanner) {
        //System.out.print("Choose an option (0-3): ");
        return readValidNumber(scanner);
    }
}
