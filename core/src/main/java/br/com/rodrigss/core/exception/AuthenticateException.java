package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */

public class AuthenticateException extends Exception {

    private String code;

    public AuthenticateException(String message, String code) {
        super(message);
        this.code = code;
    }
}