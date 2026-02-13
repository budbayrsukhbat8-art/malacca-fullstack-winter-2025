import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nas oruulnaa uu: (0-100)");
        int age = input.nextInt();
        if (age >= 60 && age <= 100) {
            System.out.println("nasnii angilal: ahmad nastan");
        } else if (age >= 20 && age <= 59) {
         ;System.out.println("nasnii angilal: nasand huregchid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("nasnii angilal: oswor nas"); 
        } else if (age >= 0 && age <= 12) {
            System.out.println("nasnii angilal: huuhed");
        }

    }
}
