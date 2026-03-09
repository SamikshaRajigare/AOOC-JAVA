class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount");
        }
        balance += amount;
        System.out.println("Amount deposited successfully");
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully");
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        try {
            acc.deposit(2000);
            acc.withdraw(8000);
        }
        catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        acc.balanceEnquiry();
    }
}