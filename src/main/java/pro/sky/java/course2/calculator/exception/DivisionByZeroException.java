package pro.sky.java.course2.calculator.exception;

public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException(String s) {
        super(s);
    }
}
