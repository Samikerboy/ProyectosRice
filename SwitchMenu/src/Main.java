import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a class\n1: Warrior\n2: Rogue\n3: Wizard");
        int choice = userInput.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You picked Warrior!");
                break;
            case 2:
                System.out.println("You picked Rogue!");
                break;
            case 3:
                System.out.println("You picked Wizard");
                break;
            default:
                System.out.println("That wasn't an option.");
                break;
        }
    }

}