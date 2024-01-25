import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner playerInput;
        playerInput = new Scanner(System.in);

        Scanner numberInput = new Scanner(System.in);

        String heroName;
        System.out.println("What is your superhero's name?");
        heroName = playerInput.nextLine();

        double heroHealth;

        System.out.println("How much health does " + heroName + " have?");
        heroHealth = numberInput.nextDouble();

        int defense;

        System.out.println("How much defense does " + heroName + " have?");
        defense = numberInput.nextInt();

        double agility;

        System.out.println("How much agility does " + heroName + " have?");
        agility = numberInput.nextDouble();

        String power;
        System.out.println("What power does " + heroName + " have?");
        power = numberInput.next();


        int heroStrength;

        System.out.println("How much strength does " + heroName + " has?");
        heroStrength = numberInput.nextInt();
        System.out.println("Welcome " + heroName + ",you have " + heroStrength + " strength, " + heroHealth + " HP, " + defense + " defense, " + agility + " agility and your superpower is " + power );
    }
}
