class Product {
    // Fields
    String name;
    double price;
    int quantity;

    // Constructor
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Нийт үнийг тооцох
    double calculateTotal() {
        return price * quantity;
    }

    // Мэдээлэл хэвлэх
    void displayInfo() {
        System.out.println(name + " - " + (int)price + " x " + quantity +
                " = " + (int)calculateTotal() + "");
    }
}

public class ProductPractice {
    public static void main(String[] args) {

        Product p1 = new Product("laptop",250000, 1);
        Product p2 = new Product("Mouse", 45000, 3);
        Product p3 = new Product("Keyboard", 20000, 2);

        double grandTotal = 0;

        System.out.println("=== Product 1 ===");
        p1.displayInfo();
        grandTotal += p1.calculateTotal();

        System.out.println("=== Product 2 ===");
        p2.displayInfo();
        grandTotal += p2.calculateTotal();

        System.out.println("=== Product 3 ===");
        p3.displayInfo();
        grandTotal += p3.calculateTotal();

        System.out.println("----------------------------");
        System.out.println("GRAND TOTAL: " + (int)grandTotal + "");
    }
}
