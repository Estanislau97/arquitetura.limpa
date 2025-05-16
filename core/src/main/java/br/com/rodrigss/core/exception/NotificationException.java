package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class NotificationException extends Exception{

    private String code;

    public NotificationException(String message, String code) {
        super(message);
        this.code = code;
    }
}
