import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        Boolean exit = false;

        while (exit == false) {
            System.out.println("Welcome to your fortune teller! I know how good your future will be, based on your own luck! If you're lucky, you'll have a lucky outcome. Tell me to 'roll' when you're ready to roll the dice for your future and exit to end the game.");

            String roll = input.next();
            if (roll.equals("roll")) {
                int randomNumber = random.nextInt(11);
                System.out.println("Fortune Selected: " + randomNumber);
                if (randomNumber == 1) {
                    System.out.println("Oh no! You selected the lowest fortune!");
                } else if (randomNumber == 2) {
                    System.out.println("Oh! Sadly you selected one of the lowest fortunes.");
                } else if (randomNumber == 3) {
                    System.out.println("Oh no! You selected a low fortune!");
                }else if (randomNumber == 4) {
                    System.out.println("Oh no! You selected an low-average fortune!");
                }else if (randomNumber == 5) {
                    System.out.println("Oh no! You selected an average fortune!");
                }else if (randomNumber == 6) {
                    System.out.println("Oh no! You selected a great-average fortune!");
                }else if (randomNumber == 7) {
                    System.out.println("You selected a great fortune.");
                }else if (randomNumber == 8) {
                    System.out.println("You selected a very big fortune!");
                }else if (randomNumber == 9) {
                    System.out.println("Yeyyy! You selected one of the biggest fortunes");
                }else if (randomNumber == 10) {
                    System.out.println("Congratulations! You selected the biggest of all the fortunes");
                }
            }
            if (roll.equals("exit")) {
                System.out.println("Bye bye!");
                System.exit(0);
            }
        }

    }
}
