/**
 * ДААЛГАВАР:
 * Student class үүсгэж, оюутны мэдээлэл хадгалах програм бич.
 *
 * ШААРДЛАГА:
 * 1. Student class-д дараах fields нэмэх:
 * - name (String) - Нэр
 * - id (int) - Оюутны дугаар
 * - age (int) - Нас
 * - gpa (double) - Голч дүн
 *
 * 2. displayInfo() method нэмэх - мэдээлэл хэвлэх
 *
 * 3. 2 Student object үүсгэж мэдээллийг хэвлэх
 *
 * ЖИШЭЭ ГАРАЛТ:
 * === Оюутан 1 ===
 * Нэр: Болд
 * Дугаар: 2024001
 * Нас: 20
 * Голч дүн: 3.5
 */

class Student {

    // Fields энд бичнэ үү
    String name;
    int id;
    int age;
    double gpa;

    // displayInfo() method энд бичнэ үү
public void displayInfo(){
    System.out.println("Ner : " + name);
    System.out.println("Dugaar :"+ id);
    System.out.println("Nas :" + age);
    System.out.println("Golch dun :" + gpa);
}
}

public class Budaa {
    public static void main(String[] args) {
        // 2 Student object үүсгэж, мэдээлэл хэвлэх
      Student budaa = new Student();
      budaa.name = "budaa";
      budaa.id = 123;
      budaa.age = 18;
      budaa.gpa = 3.5;
      budaa.displayInfo();
      
      Student ochiroo = new Student();
      ochiroo.name = "ochiroo";
      ochiroo.id = 456;
      ochiroo.age = 19;
      ochiroo.gpa = 3;
      ochiroo.displayInfo();
    }
}