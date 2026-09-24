// create an abstract class payment with abstract method pay. create upi , credit card and cash classes and display there payment methods
abstract class Payment {
    abstract void pay();
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paying via UPI");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Paying via Credit Card");
    }
}

class Cash extends Payment {
    void pay() {
        System.out.println("Paying via Cash");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment creditCard = new CreditCard();
        Payment cash = new Cash();

        upi.pay();
        creditCard.pay();
        cash.pay();
    }
}