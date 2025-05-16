package br.com.rodrigss.application.gateway;

/**
 * @author Rodrigo Estanislau
 */
public interface UserAuthenticateGateway {
    Boolean authenticate(String username, String password);

}
