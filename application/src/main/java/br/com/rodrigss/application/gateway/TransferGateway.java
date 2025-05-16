package br.com.rodrigss.application.gateway;
import br.com.rodrigss.core.domain.Transaction;

/**
 * @author Rodrigo Estanislau
 */
public interface TransferGateway {
    Boolean transfer(Transaction transaction);

}
