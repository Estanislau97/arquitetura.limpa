package br.com.rodrigss;

import br.com.rodrigss.core.domain.User;
import br.com.rodrigss.core.exception.EmailException;
import br.com.rodrigss.core.exception.InternalServerErrorException;
import br.com.rodrigss.core.exception.TaxNumberException;
import br.com.rodrigss.core.exception.TransactionPinException;

/**
 * @author Rodrigo Estanislau
 */
public interface CreateUserUseCase {
    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException
            , InternalServerErrorException;
}
