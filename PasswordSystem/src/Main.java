import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean guessed = false;

        Scanner passwordInput = new Scanner(System.in);

        while (!guessed) {
            System.out.println("Enter a password: ");
            String password = passwordInput.nextLine();

            if (password.equals("idTech123")) {
                guessed = true;
                System.out.println("Access granted!");
            } else {
                System.out.println("Password incorrect, try again.");
            }
        }
    }
}
