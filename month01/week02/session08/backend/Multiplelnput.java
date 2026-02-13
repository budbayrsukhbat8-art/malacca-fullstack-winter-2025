
import java.util.Scanner;

public class Multiplelnput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Registration");
        // Name (String)
        System.out.print("Name");
        String name = scanner.nextLine();
        System.out.print("Age :");
        int age = scanner.nextInt();
       System.out.print("GPA");
        double gpa = scanner.nextDouble();
        System.out.print("Boolean");
        boolean isActive = scanner.nextBoolean();
        System.out.print("Float");
        float height = scanner.nextFloat();
        
      
      
    }
}
