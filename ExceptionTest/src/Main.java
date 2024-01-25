import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // init scanner and money value
        Scanner input = new Scanner(System.in);
        float userMoney = 0;

        // TODO Handle the error that occurs when the user doesn't enter a number.
        try {
            System.out.println("Enter the amount of money your character has:");
            userMoney = input.nextFloat();
        }
        catch (InputMismatchException e) {
            input.nextLine();
            System.out.println("That's not a number. I'm going to assume you meant to say 0");
            userMoney = 0;
        }

        System.out.println("Great, you have " + userMoney + " money now.");
    }
}