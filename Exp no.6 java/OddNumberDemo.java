class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}

public class OddNumberDemo {

    static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd");
        } else {
            System.out.println("Number is even: " + num);
        }
    }

    public static void main(String[] args) {

        int number = 7;

        try {
            checkNumber(number);
        }
        catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}