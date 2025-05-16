package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class InternalServerErrorException extends  Exception{
    private String code;


    public InternalServerErrorException(String message, String code){
        super(message);
        this.code = code;
    }

}
