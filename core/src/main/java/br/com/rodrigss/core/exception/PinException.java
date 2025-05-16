package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class PinException extends Exception{

    private String code;

    public PinException(String message, String code) {
        super(message);
        this.code = code;
    }
}
