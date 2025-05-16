package br.com.rodrigss;

import br.com.rodrigss.core.domain.User;

/**
 * @author Rodrigo Estanislau
 */
public interface FindUserByTaxNumberUseCase {
    User findByTaxNumber(String TaxNumber);
}
