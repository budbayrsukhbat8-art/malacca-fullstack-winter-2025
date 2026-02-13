class Person {
    // Fields
    String name;
    int age;
    String city;

    // Constructor
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // introduce() method
    void introduce() {
        System.out.println("Нэр: " + name);
        System.out.println("Нас: " + age);
        System.out.println("Хот: " + city);
        System.out.println();
    }
}

public class PersonPractice {
    public static void main(String[] args) {

        // 3 Person object үүсгэх
        Person p1 = new Person("Бат", 25, "Улаанбаатар");
        Person p2 = new Person("Budka", 19, "Uwurkhangai");
        Person p3 = new Person("Тэмүүлэн", 22, "Darkhan");

        System.out.println("=== Хүн 1 ===");
        p1.introduce();

        System.out.println("=== Хүн 2 ===");
        p2.introduce();

        System.out.println("=== Хүн 3 ===");
        p3.introduce();
    }
}
