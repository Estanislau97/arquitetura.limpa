package br.com.rodrigss.dto.response;

/**
 * @author Rodrigo Estanislau
 */
public record ValidationError(String field, String message) {
}