package br.com.rodrigss.application.gateway;

import br.com.rodrigss.core.domain.Wallet;

/**
 * @author Rodrigo Estanislau
 */
public interface FindWalletByTaxNumberGateway {
    Wallet findByTazNumber(String taxNumber);
}
