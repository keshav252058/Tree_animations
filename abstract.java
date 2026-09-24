abstract class Student {
    abstract void calculateResult();
}

class StudentA extends Student {
    @Override
    void calculateResult() {
        int marks = 450;
        System.out.println("Student A Total Marks: " + marks);
    }
}

class StudentB extends Student {
    @Override
    void calculateResult() {
        int marks = 420;
        System.out.println("Student B Total Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student a = new StudentA();
        Student b = new StudentB();

        a.calculateResult();
        b.calculateResult();
    }
}