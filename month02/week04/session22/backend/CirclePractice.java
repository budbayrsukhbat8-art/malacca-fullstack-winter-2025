class Circle {
    // Fields
    double radius;
    String color;

    // PI тогтмол
    static final double PI = 3.14159;

    // Constructor
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Талбай тооцох
    double calculateArea() {
        return PI * radius * radius;
    }

    // Тойрог урт тооцох
    double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Мэдээлэл хэвлэх
    void displayInfo(String title) {
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│ === " + title + " ===");
        System.out.println("│ Өнгө: " + color);
        System.out.println("│ Радиус: " + radius);
        System.out.printf("│ Талбай: %.2f%n", calculateArea());
        System.out.printf("│ Тойрог: %.2f%n", calculateCircumference());
        System.out.println("└─────────────────────────────────────┘");
    }
}

public class CirclePractice {
    public static void main(String[] args) {

        // 2 Circle объект үүсгэх
        Circle circle1 = new Circle(5.0, "Улаан");
        Circle circle2 = new Circle(3.5, "Цэнхэр");

        // Мэдээлэл хэвлэх
        circle1.displayInfo("Circle 1");
        circle2.displayInfo("Circle 2");
    }
}
