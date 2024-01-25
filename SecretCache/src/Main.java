import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int dollars = rand.nextInt(500000);
        System.out.println("You stumble upon the thieves secret cache. You find " + dollars + " dollars!");

    }
}
