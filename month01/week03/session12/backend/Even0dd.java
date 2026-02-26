import java.util.Scanner;

public class Even0dd {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        System.out.print(7);
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(number + "bol tegsh too");
        } else {
            System.out.println(number + "bol sondgoi too");
        }
        scanner.close();
        }
    }

