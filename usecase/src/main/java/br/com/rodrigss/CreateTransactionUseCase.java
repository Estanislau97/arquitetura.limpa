package br.com.rodrigss;

import br.com.rodrigss.core.domain.Transaction;
import br.com.rodrigss.core.exception.TransferException;

/**
 * @author Rodrigo Estanislau
 */
public interface CreateTransactionUseCase {
    Transaction create(Transaction transaction) throws TransferException;

}
