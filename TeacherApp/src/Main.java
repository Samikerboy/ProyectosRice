import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Sam", "JP", "Gabriel", "Santiago", "John", "Paulina"};
        Random rand = new Random();
        int studentsIndex = rand.nextInt(students.length);
        String student = students[studentsIndex];
        System.out.println("The student picker chose: " + student);
    }
}
