package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class EmailException extends  Exception{
    private String code;


    public EmailException(String message, String code){
        super(message);
        this.code = code;
    }

}
