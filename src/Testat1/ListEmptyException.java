package Testat1;

/**
 * The exception if the list is empty
 * @author Aleks
 */
public class ListEmptyException extends Exception {
    /**
     * The constructor to create this exception object.
     */
    public ListEmptyException() {
    }

    /**
     * The constructor to create this exception object with a message.
     * @param message The text that should be received if you call getMessage().
     */
    public ListEmptyException(String message) {
        super(message);
    }
}