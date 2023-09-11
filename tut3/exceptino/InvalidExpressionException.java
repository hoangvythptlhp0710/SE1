package tut3.exceptino;

public class InvalidExpressionException extends ArithmeticException{
    public InvalidExpressionException(String message) {
        super(message);
    }

    public void printInfo(String message) {
        System.out.println(message);
    }
}
