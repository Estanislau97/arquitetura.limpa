package br.com.rodrigss.application.gateway;

/**
 * @author Rodrigo Estanislau
 */
public interface EmailAvailableGateway {
    Boolean emailAvailable(String email);
}
