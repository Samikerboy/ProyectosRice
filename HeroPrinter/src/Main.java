import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        String name = "The Ember Shadow";
        int strength = 4;
        double health = 12.5;
        boolean hasWeapon = true;
        String magic = "Insvisibility";
        String agility = "Teleportation";
        double punchTolerance = 13.2;
        Scanner input = new Scanner(System.in);


        System.out.println("Superhero Name: " + name);
        System.out.println("Strenght: " + strength);
        System.out.println("Health: " + health);
        System.out.println("Has Weapon: " + hasWeapon);
        System.out.println("Magic: " + magic);
        System.out.println("agility: " + agility);
        System.out.println("punchTolerance: " + punchTolerance);

        String villainName = "Dr. Evil";
        int villainStrength = 8;
        double villainHealth = 4.5;
        boolean villainHasWeapon = false;


        System.out.println("Villain Name: " + villainName);
        System.out.println("Strength: " + villainStrength);
        System.out.println("Health: " + villainHealth);
        System.out.println("Has Weapon: " + villainHasWeapon);

        health -= 2;

        System.out.println("Dr. Rhinoseros hits The Ember Shadow and does 2 damage.");
        System.out.println("The Ember Shadow's health is " + health + ".");

        strength *= 2;
        System.out.println("The Ember Shadow's strength doubled");
        System.out.println("The Ember Shadow's strength is " + strength + ".");

        System.out.println("------------------------------------------------");
        System.out.println("Give me a number and I'll tell you if it's odd or even");
        int num = input.nextInt();

        if (num % 2 > 0) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("Your number is even.");
        }

    }
}
