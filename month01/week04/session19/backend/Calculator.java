


public class Calculator {
   

    // TODO: add method - хоёр тоо нэмэх
    public static int add(int a, int b) {
        return a + b;
    }

    // TODO: subtract method - хоёр тоо хасах
    public static int subtract(int a, int b) {
        return a - b;
    }

    // TODO: multiply method - хоёр тоо үржүүлэх
    public static int multiply(int a, int b) {
        // Fill in 
        return a * b;
    }

    // TODO: divide method - хоёр тоо хуваах (double буцаана)
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("5 + 3 = " + add(5, 3));           // 8
        System.out.println("10 - 4 = " + subtract(10, 4));    // 6
        System.out.println("6 * 7 = " + multiply(6, 7));      // 42
        System.out.println("15 / 4 = " + divide(15, 4));      // 3.75
    }
}


