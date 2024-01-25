import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int tries = 0;

        int guessNum = rand.nextInt(100);
        boolean guessed = false;

        while (!guessed) {
            System.out.println("Guess the number:");
            int number = input.nextInt();
            if (number > guessNum) {
                System.out.println("a little bit lower");
                tries += 1;
            } else if (number < guessNum) {
                System.out.println("a little bit higher");
                tries += 1;
            }

            if (number == guessNum) {
                guessed = true;
                tries += 1;
                System.out.println("You guessed the number!!!");
                System.out.println("It took you " + tries + " tries to get the number.");
            }
        }
    }
}
