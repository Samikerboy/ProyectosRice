public class Main {
    public static void main(String[] args) {
        int heroMagic = 12;
        int numLights = 20;
        boolean hasGauntlet = false;

        if (heroMagic > numLights) {
            System.out.println("Congratulations, you saved the day.");
        } else if (hasGauntlet == true) {
            System.out.println("You're not strong enough to light all the lights, but you hold up your gauntlet and it reflects enough light to keep the people safe.");
        } else {
            System.out.println("It wasn't enough");
        }
    }
}
