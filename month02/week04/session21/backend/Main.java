public class Main {
    public static void main(String[] args) {
        // Car 1
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2023;

        // Car 2
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Accord";
        car2.year = 2022;

        // Car 3
        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "X5";
        car3.year = 2024;

        // Тус бүр өөрийн өгөгдөл агуулна
        car1.displayInfo();
        System.out.println("---");
        car2.displayInfo();
        System.out.println("---");
        car3.displayInfo();
    }
}


    

