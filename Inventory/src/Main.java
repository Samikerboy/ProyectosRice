public class Main {

    public static void main(String[] args) {
        String[] inventory = new String[5];

        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Key";
        inventory[3] = "Enchanted stick";

        printInventory(inventory);
        if (checkInventory(inventory, "Key")) {
            System.out.println("You opened the locked door!");
        } else {
            System.out.println("You don't have the key to open the door.");
        }

    }

    public static void printInventory(String[] inventory) {
        for(String item: inventory) {
            System.out.println(item);
        }
    }
    public static boolean checkInventory(String[] inventory, String toCheck) {
        for (String item : inventory) {
            if (item.equals(toCheck)) {
                return true;
            }
        }
        return false;
    }
}
