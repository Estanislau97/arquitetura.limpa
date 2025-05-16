package br.com.rodrigss.core.exception;

/**
 * @author Rodrigo Estanislau
 */
public class TaxNumberException  extends  Exception{
    private String code;


    public TaxNumberException(String message, String code){
        super(message);
        this.code = code;
        }

}
