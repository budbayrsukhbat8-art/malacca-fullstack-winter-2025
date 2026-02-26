import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        System.out.print("Too oruulnaa uu:");
        int num = scanner.nextInt();
        if (num> 0){
            System.out.println("Eyreg too");
        } else if (num < 0 ){

         System.out.println("Sorog too");
        } else {
            System.out.println("Teg");
        }
        scanner.close();
    }
}
