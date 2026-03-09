class DivisionException extends Exception {
    DivisionException(String msg) {
        super(msg);
    }
}

class Calculator {

    int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Division by zero is not allowed");
        }
        return a / b;
    }
}

public class DivisionExce {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        try {
            int result = cal.divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (DivisionException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}