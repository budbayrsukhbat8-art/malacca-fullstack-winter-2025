public class TypeCasting {
public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // int -> double
    System.out.println("int utga:" + myInt);
    System.out.println("double bolson:"+myDouble);
    

    double price = 99.99;
    int roundedPrice = (int) price;
    System.out.println("\ndouble utga:" + price);
    System.out.println("int bolson:" + roundedPrice);
    String numStr = "123";
    int numFromStr = Integer.parseInt (numStr);
    System.out.println("\nString utga:" + numStr);
    System.out.println("int bolson:" + numFromStr);

    int number = 456;
    String strFromNum = String.valueOf (number);
    System.out.println("\nint utga:" + number);
    System.out.println("String bolson:" + strFromNum);
    


}

}


    

