import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        intro();
        Scanner userInput = new Scanner(System.in);

        String adjective = getUserInput("Enter an adjective: ", userInput);
        String noun = getUserInput("Enter an noun: ", userInput);
        String animal = getUserInput("Enter an animal: ", userInput);
        String noise = getUserInput("Enter an noise: ", userInput);


        printMadLib(adjective, noun, animal, noise);
        outro();
    }

    public static void intro() {
        System.out.println("Welcome to MadLibs!");
    }
    public static void printMadLib(String adjective, String noun, String animal, String noise) {
        System.out.println("Yesterday, my pet "+ animal + " dragon and I went to the IRL zoo.");
        System.out.println("We saw cows and even 6 "+ noun + "!");
        System.out.println("I got to stop by the food stadium and ate 42 very "+ adjective + " shrimp.");
        System.out.println("My favorite part of the day, by far, was when the animals made really "+ adjective +"  noises.");
        System.out.println("The turtle doves went "+ noise + " and the cows went booooop");
    }
    public static void outro() {
        System.out.println("Goodbye");
    }
    public static String getUserInput(String message, Scanner userInput) {
        System.out.println(message);
        return userInput.nextLine();
    }
}
