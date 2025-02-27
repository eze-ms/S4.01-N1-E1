package cat.itacademy.s04.t01.n01.exceptions;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}