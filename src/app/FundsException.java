package app;


// Кастомний виняток
// add extend Exception
public class FundsException extends Exception {

    public FundsException(String message) {
        super(message); // add variable message
    }
}
