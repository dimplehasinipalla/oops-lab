class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class xyz{
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        Bank bank2 = new ICICI();

        System.out.println("SBI Interest Rate: " + bank1.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + bank2.getInterestRate() + "%");
    }
}