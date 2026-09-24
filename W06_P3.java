import java.util.Scanner;

public class W06_P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two integers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Try block with multiple catch blocks
        try {
            int result = num1 / num2;
            System.out.println("Division successful");
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            // Handles division by zero error
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            // Handles other general errors
            System.out.println("An unexpected error occurred");
        }

        sc.close();
    }
}


import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    String(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentManagementSystem {

    public static void main(string)
}