import java.util.Scanner;
import java.util.Random;

public class Adventure {
    public String playerName;
    public int playerLevel;
    public double playerHealth;

    public Adventure(String name, int level, double health) {
        playerName = name;
        playerLevel = level;
        playerHealth = health;
    }

    public void caveOfWonders() {

        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();

        int playerChoice;
        int rockDamage;
        boolean hasSword = false;

        System.out.println("Welcome " + playerName + "!");
        System.out.println("Before you is a large cave mouth. Darkness lies within. Dare you enter the Cave of Wonders?");
        System.out.println("1. Enter the Cave of Wonders \n" + "2. Run away to the safety of your warm bed");
        playerChoice = input.nextInt();


        if (playerChoice == 1) {
            System.out.println("\nYou walk through the entrance of the cave with your head held high.");
            playerLevel++;
            System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel);

            // Rock Slide
            System.out.println("You travel forward into the dark cave. Yoou feel something press against your leg...");
            System.out.println("It's a trap! Suddenly you're being bombarded by rocks from above.");
            rockDamage = randomGenerator.nextInt(5);
            playerHealth -= rockDamage;
            System.out.println("THe rockslide hits you for " + rockDamage + "!");
            System.out.println("You have " + playerHealth + " health remaining." );

            // Finding Treasure
            System.out.println("You pick yourself up from the cave floor and brush a cloud of dust from your clothes.");
            System.out.println("The cave narrows as you press on until you manage to squeeze through an opening into a large natural cavern.");
            System.out.println("Before you is a treasure chest.");

            System.out.println("1. Open the chest.\n" + "2. Ignore the chest. It is obviously another trap.");
            playerChoice = input.nextInt();
            if (playerChoice == 1) {
                System.out.println("Uneasy after your brush with death, you slowly open the chest to reveal a magical sword!");
                hasSword = true;
            } else {
                System.out.println("You left without the sword that was there.");

            }

            System.out.println("\nYou leave the cavern and continue your journey.");
            System.out.println("Up ahead, the air grows warm and damp. You hear loud snoring.");
            System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
            System.out.println("You swallow hard and decide it's time to leave.");
            System.out.println("As you turn, your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");

            System.out.println("1. Fight the dragon.\n" + "2. Run for your life.");
            playerChoice = input.nextInt();

            switch (playerChoice) {
                case 1:
                    System.out.println("\nYou feel courage surge through your body as you charge the dragon!");
                    if (hasSword == true) {
                        System.out.println("You raise the magic sword and plunge it into the dragon, slaying the beast.");
                    } else {
                        System.out.println("You punnel the dragon with your fist to not avail. The dragon snarls and swallows you whole. Game Over!");
                        System.exit(0);
                    }
                default:
                    System.out.println("\nAs you run away to hide in the safety of your warm bed, the dragon yawns and returns to its slumber.");

            }


        } else {

                System.out.println(" runs home and goes to sleep");
                System.exit(0);

        }
    }
}
