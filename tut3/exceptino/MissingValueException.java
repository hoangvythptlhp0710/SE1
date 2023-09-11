package tut3.exceptino;

public class MissingValueException extends IndexOutOfBoundsException{
    public MissingValueException(String message) {
        super(message);
    }

    public void printInfo(String message) {
        System.out.println(message);
    }
}
