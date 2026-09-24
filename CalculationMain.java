// File: CalculationMain.java

class Calculator {
    // Method for addition
    int sum(int a, int b) {
        return a + b;
    }

    // Method for multiplication
    int mul(int a, int b) {
        return a * b;
    }
}

public class CalculationMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 12;
        int num2 = 5;

        // Calling sum and mul functions
        int additionResult = calc.sum(num1, num2);
        int multiplicationResult = calc.mul(num1, num2);

        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Sum           : " + additionResult);
        System.out.println("Multiplication: " + multiplicationResult);
    }
}