package lesson_20;

public class TransportTypeException extends Exception{
    public TransportTypeException() {
        super();
    }

    public TransportTypeException(String message) {
        super(message);
    }
    public TransportTypeException(String message, Throwable throwable) {
        super(message,throwable);
    }

}
