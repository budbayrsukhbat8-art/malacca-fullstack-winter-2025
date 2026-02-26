import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        // Terminal deeree
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your name:");
        String name = scanner.nextLine();
        System.out.println("Your name is");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        scanner.close();

    }
}
