package br.com.rodrigss;
import br.com.rodrigss.core.domain.Wallet;
import br.com.rodrigss.core.exception.NotFoundException;
/**
 * @author Rodrigo Estanislau
 */
public interface FindWalletByTaxNumberUseCase {
    Wallet findByTaxNumber(String TaxNumber) throws NotFoundException;
}
