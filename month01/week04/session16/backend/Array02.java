

public class Array02 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        System.out.println("Ehnii onoo:" + scores[0]);
        System.out.println("Guraw dahi onoo:" + scores[2]);
        System.out.println("Suuliin onoo:" + scores[scores.length - 1]);
        scores[0] = 95;
        System.out.println("Shine ehnii onoo:" + scores[0]);
        System.out.println("Niit element:"+ scores.length);
    }
}
