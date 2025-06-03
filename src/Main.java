import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the traffic management system!");
        System.out.print("Input the number of roads: ");
        int numberOfRoads = scanner.nextInt();

        System.out.print("Input the interval: ");
        int interval = scanner.nextInt();

        int option;
        do {
            showMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addRoad();
                    break;
                case 2:
                    deleteRoad();
                    break;
                case 3:
                    openSystem();
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 0);

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add road");
        System.out.println("2. Delete road");
        System.out.println("3. Open system");
        System.out.println("0. Quit");
        System.out.print("Choose an option: ");
    }

    public static void addRoad() {
        System.out.println("Road added.");
    }

    public static void deleteRoad() {
        System.out.println("Road deleted.");
    }

    public static void openSystem() {
        System.out.println("Traffic management system started.");
    }
}
