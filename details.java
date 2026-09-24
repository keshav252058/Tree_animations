// File: Main.java

class Student {
    // Member variables
    String enrollmentNo;
    String name;
    String branch;
    String phoneNo;

    // Method to insert/initialize record values
    void insertRecord(String roll, String studName, String studBranch, String phone) {
        enrollmentNo = roll;
        name = studName;
        branch = studBranch;
        phoneNo = phone;
    }

    // Method to display the student record
    void displayRecord() {
        System.out.println("----- Student Record -----");
        System.out.println("Enrollment No : " + enrollmentNo);
        System.out.println("Name          : " + name);
        System.out.println("Branch        : " + branch);
        System.out.println("Phone No      : " + phoneNo);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student s1 = new Student();
        
        // Inserting data
        s1.insertRecord("AJU/252058", "KESHAV KUMAR", "Computer Science", "987654XX");
        
        // Displaying data
        s1.displayRecord();
    }
}