package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class BadRequestException extends  Exception{
    private String code;


    public BadRequestException(String message, String code){
        super(message);
        this.code = code;
    }

}
