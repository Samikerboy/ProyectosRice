import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int playerClass, playerChoice;

        //Get the player's class choice
        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        playerClass = userInput.nextInt();

        //Player chooses an action
        System.out.println("There is a guard here, what do you do?");
        System.out.println("1 - Fight him");
        System.out.println("2 - Steal his wallet");
        System.out.println("3 - Throw a fireball");
        System.out.println("4 - Talk the guard into leaving");
        System.out.println("5 - Intimidate the guard");
        System.out.println("6 - Bond with the guard over your shared disdain for magic");

        playerChoice = userInput.nextInt();

        if (playerClass == 1 && playerChoice == 1) {
            System.out.println("You pull out your sword and fight the guard. He is good, but you are better. You win easily.");

        } else if (playerClass == 2 && playerChoice == 2) {
            System.out.println("You lurk in the shadow suntil the guard isnt looking and then sneak past him, snatching his wallent on the way. You find 4 gold pieces, some chewing gum, and a business card for Helmet Shining Dan: see your nose hairs or your money back!");
        } else if (playerClass == 3 && playerChoice == 3) {
            System.out.println("You raise your magic wand and send a huge fireball hurtling towards the guard. It hits him square in the chest, and although his armor is fire-proof, the sleeves peaking out around it are not. As he hurries to extiguish the flames, you are able to walk past.");
        } else if ((playerClass == 2 || playerClass == 3)&& playerChoice == 4) {
            System.out.println("You observe the guard for a moment, and notice several arappers for Dragon's Breath Chewing Gum littering the ground. You pick one up and start to walk past the guard. Suddenly, you turn and loudly say how glad you are that the nearest store is giving away free gum right now. A few more words of encouragement are all it takes for the guard to disapepar in search of more gum.");
        } else if ((playerClass == 1 || playerClass == 3) && playerChoice == 5) {
            System.out.println("You walk up boldy to the guard, your weapon in hand. He takes one look at you and puts down his sword, backing slowly away.");
        } else if (!(playerClass == 3) && playerChoice == 6) {
            System.out.println("You chat with the guard about several relatives of yours who were harassed by magic-users. As you snap stories about nages, you can see the guard relaxing. Eventually, you axk if it's okay if you go past and he says yes.");
        } else {
            System.out.println("The guard laughs at your meager attempts to get past him. He looks you up and down, doesn't even bother to draw his sword, and instead just punches you.");

        }

    }
}
