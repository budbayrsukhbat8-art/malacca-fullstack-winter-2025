import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Neree oruulna uu: ");
        String firstName = scanner.nextLine();

        System.out.println("Saina uu :" + firstName);
        scanner.close();
    }
    
}
