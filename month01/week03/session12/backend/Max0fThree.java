import java.util.Scanner;

public class Max0fThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ehnii too:");
        int a = scanner.nextInt();
        System.out.print("Hoyr dahi too:");
        int b = scanner.nextInt();
        System.out.print("Guraw dahi too:");
        int c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Hamgiin ih:" + a);
        } else if (b >= c) {
            System.out.println("Hamgiin ih :" + a);
        } else if (b >= c) {
            System.out.println("Hamgiin ih:" + b);

        } else {
            System.out.println("Hamgiin ih:" + c);
        }
        scanner.close();

    }
}
