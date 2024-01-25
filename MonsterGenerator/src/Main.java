import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random generator = new Random();
        String[] monsters = { "Ghost", "Goblin", "Ghoul" };
        String[] adjectives = { "Fast", "Festering", "Frightened" };

        monsters[2] = "Golem";

        System.out.println(monsters[0]);
        System.out.println(monsters[1]);
        System.out.println(monsters[2]);

        System.out.println("There are " + monsters.length + " possible monsters.");
        System.out.println("The last monster is: " + monsters[monsters.length-1]);

        int monsterIndex = generator.nextInt(monsters.length);
        int adjectivesIndex = generator.nextInt(adjectives.length);

        String monster = monsters[monsterIndex];
        String adjective = adjectives[adjectivesIndex];
        System.out.println("A " + adjective +" "+ monster + " appears!");
        
    }
}
