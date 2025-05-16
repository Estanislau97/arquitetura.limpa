package br.com.rodrigss.application.gateway;

import br.com.rodrigss.core.domain.TransactionPin;
import br.com.rodrigss.core.domain.User;
import br.com.rodrigss.core.domain.Wallet;
/**
 * @author Rodrigo Estanislau
 */
public interface CreateUserGateway {
    Boolean create(User user, Wallet wallet);
}
