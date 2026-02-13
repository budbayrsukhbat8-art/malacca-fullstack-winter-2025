

public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Ehnii:" + numbers[0]);
        System.out.println("Suuliin:" + numbers[numbers.length - 1]);
        for (int i = 0; i < numbers.length;i ++){
            System.out.println(numbers[i]);}
            for (int num: numbers){
                System.out.println(num);
            }
        
    }
}
