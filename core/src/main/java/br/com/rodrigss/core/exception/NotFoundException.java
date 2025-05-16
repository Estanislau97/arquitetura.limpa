package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class NotFoundException extends  Exception{
    private String code;


    public NotFoundException(String message, String code){
        super(message);
        this.code = code;
    }

}
