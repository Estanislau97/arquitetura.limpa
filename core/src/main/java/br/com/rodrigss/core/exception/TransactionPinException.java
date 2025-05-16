package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class TransactionPinException extends  Throwable{
    private String code;

    public TransactionPinException(String message, String code){
        super(message);
        this.code = code;
    }
}
