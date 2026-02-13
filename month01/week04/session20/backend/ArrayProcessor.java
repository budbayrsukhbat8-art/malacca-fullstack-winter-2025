import java.util.Scanner;
import java.util.Arrays;

public class ArrayProcessor {

    // ===== ARRAY OPERATIONS =====

    // Array хэвлэх
    public static void printArray(int[] arr) {
        System.out.print("[");
        // TODO
        System.out.println("]");
    }

    // Нийлбэр олох
    public static int sum(int[] arr) {
        // TODO
    }

    // Дундаж олох
    public static double average(int[] arr) {
        // TODO
    }

    // Хамгийн ихийг олох
    public static int max(int[] arr) {
        // TODO
    }

    // Хамгийн багыг олох
    public static int min(int[] arr) {
        // TODO
    }

    // Элемент хайх
    public static int search(int[] arr, int target) {
        // TODO
    }

    // Элемент нэмэх (шинэ array буцаах)
    public static int[] addElement(int[] arr, int element) {
        // TODO
    }

    // Элемент устгах (index-ээр)
    public static int[] removeElement(int[] arr, int index) {
        // TODO
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        // TODO
    }

    // ===== MENU =====

    public static void printMenu() {
        System.out.println("\n========================================");
        System.out.println("         ARRAY PROCESSOR v1.0");
        System.out.println("========================================");
        System.out.println("1. View Array");
        System.out.println("2. Add Element");
        System.out.println("3. Remove Element");
        System.out.println("4. Calculate Sum");
        System.out.println("5. Calculate Average");
        System.out.println("6. Find Maximum");
        System.out.println("7. Find Minimum");
        System.out.println("8. Search Element");
        System.out.println("9. Sort Array");
        System.out.println("10. Statistics (All)");
        System.out.println("0. Exit");
        System.out.println("========================================");
        System.out.print("Enter choice: ");
    }

    // Статистик хэвлэх
    public static void printStatistics(int[] arr) {
        System.out.println("\n========== STATISTICS ==========");
        System.out.print("Array: ");
        printArray(arr);
        System.out.println("Length: " + arr.length);
        System.out.println("Sum: " + sum(arr));
        System.out.printf("Average: %.2f%n", average(arr));
        System.out.println("Maximum: " + max(arr));
        System.out.println("Minimum: " + min(arr));
        System.out.println("================================");
    }

    // ===== MAIN =====

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {23, 45, 12, 67, 34, 89, 11};

        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Current Array: ");
                    printArray(numbers);
                    break;

                case 2:
                    System.out.print("Enter element to add: ");
                    int newElement = scanner.nextInt();
                    numbers = addElement(numbers, newElement);
                    System.out.println("Element added!");
                    printArray(numbers);
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int index = scanner.nextInt();
                    numbers = removeElement(numbers, index);
                    System.out.println("Element removed!");
                    printArray(numbers);
                    break;

                case 4:
                    System.out.println("Sum: " + sum(numbers));
                    break;

                case 5:
                    System.out.printf("Average: %.2f%n", average(numbers));
                    break;

                case 6:
                    System.out.println("Maximum: " + max(numbers));
                    break;

                case 7:
                    System.out.println("Minimum: " + min(numbers));
                    break;

                case 8:
                    System.out.print("Enter element to search: ");
                    int target = scanner.nextInt();
                    int result = search(numbers, target);
                    if (result != -1) {
                        System.out.println("Found at index: " + result);
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 9:
                    bubbleSort(numbers);
                    System.out.println("Array sorted!");
                    printArray(numbers);
                    break;

                case 10:
                    printStatistics(numbers);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}


