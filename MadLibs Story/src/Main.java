import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the character's type: ");
        String characterType = input.nextLine();
        System.out.println("What's the character's name: ");
        String characterName = input.nextLine();
        System.out.println("What's the second character's name: ");
        String secondCharacterName = input.nextLine();
        System.out.println("Character's age: ");
        String characterAge = input.nextLine();
        System.out.println("Second Character's occupation:");
        String secondCharacterOccupation = input.nextLine();
        System.out.println("first setting: ");
        String firstSettingPlace = input.nextLine();
        String secondSettingPlace = "city";
        String pluralNoun = "trees";
        String anotherPluralNoun = "bushes";
        String action = "fight";
        String adjective = "happy";
        String anotherAdjective = "unpleasant";
        String pastTenseVerb = "ate";
        String anotherPastTenseVerb = "sounded";
        String singleLetter = "a";

        System.out.println("Once upon a time, there was a happy" + characterType +" named " + characterName + ". " + characterName + " was " + characterAge + " years old and lived by the " + firstSettingPlace + ". He ate " + pluralNoun + " and " + anotherPluralNoun + ". People thought " + characterName + " was too " + adjective + ". The people sent " + secondCharacterName + ", the village-s " + secondCharacterOccupation + ", to fight the " + characterType + ". " + characterName + " thought that sounded " + anotherAdjective + ", so he left the " + firstSettingPlace + ". Now he lives in the " + secondSettingPlace + " and eat the " + pluralNoun + " and " + anotherPluralNoun + " there instead.");
    }
}
