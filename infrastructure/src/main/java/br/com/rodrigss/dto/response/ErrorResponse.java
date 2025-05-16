package br.com.rodrigss.dto.response;
import java.util.List;
/**
 * @author Rodrigo Estanislau
 */
public record ErrorResponse(String code, String messge, List<ValidationError> validitions){}
