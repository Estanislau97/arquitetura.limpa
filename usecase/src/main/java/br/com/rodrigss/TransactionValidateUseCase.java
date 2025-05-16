package br.com.rodrigss;

import br.com.rodrigss.core.domain.Transaction;
import br.com.rodrigss.core.exception.TransferException;

/**
 * @author Rodrigo Estanislau
 */
public interface TransactionValidateUseCase {
    Boolean  validate(Transaction transaction) throws TransferException;
}
