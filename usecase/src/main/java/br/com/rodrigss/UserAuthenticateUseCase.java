package br.com.rodrigss;

import br.com.rodrigss.core.exception.AuthenticateException;

/**
 * @author Rodrigo Estanislau
 */
public interface UserAuthenticateUseCase {

    Boolean authenticate(String username, String password)  throws AuthenticateException;
}
