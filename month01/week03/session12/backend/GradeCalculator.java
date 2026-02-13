import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("onoo oruulnaa uu (0-100):");
        int score = input.nextInt();
        if (score >= 90 && score <= 100){
            System.out.println("unelgee: A");
        } else if (score >= 80 &&  score <=100)
        {
            System.out.println("Unelgee: B");

        } else if (score >= 70 && score <=79)
        {
            System.out.println("Unelgee: C");
        } else if (score >= 60 && score <= 69)
        {
            System.out.println("Unelgee: D");
        } else if (score >= 0 && score <= 59)
        {
            System.out.println("Unelgee: F");
        } 
    }
}
