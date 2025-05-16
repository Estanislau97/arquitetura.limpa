package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class TransferException extends  Exception{
    private String code;

    public TransferException(String message, String code){
        super(message);
        this.code  = code;
    }
}
