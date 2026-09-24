class Student {
    String enrollmentNo, name, branch, phoneNo;

    void insertRecord(String e, String n, String b, String p) {
        enrollmentNo = e;
        name = n;
        branch = b;
        phoneNo = p;
    }

    void displayRecord() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Phone No: " + phoneNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.insertRecord("101", "Keshav", "CSE", "9876543210");
        s.displayRecord();
    }
}