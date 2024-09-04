import java.util.Scanner;

public class Lesson13HomeworkMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите произвольное предложение и получите ромб, состоящийся из символов предложения.");
        String satz = reader.nextLine();
        Lesson13Romb romb = new Lesson13Romb();
        romb.printRow(satz);
        romb.middlePrint(satz);
    }
}
