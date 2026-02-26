// void = юу ч буцаахгүй
public static void sayHello() {
    System.out.println("Hello!");
    // return; ← Optional, бичихгүй байж болно
}

public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

public static void printLine(int count) {
    for (int i = 0; i < count; i++) {
        System.out.print("-");
    }
    System.out.println();
}

// Main-д дуудах
public static void main(String[] args) {
    sayHello();           // Output: Hello!
    greet("Alice");       // Output: Hello, Alice!
    printLine(20);        // Output: --------------------
}



