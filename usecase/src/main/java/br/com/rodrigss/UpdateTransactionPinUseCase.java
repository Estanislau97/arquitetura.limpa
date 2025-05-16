package br.com.rodrigss;

import br.com.rodrigss.core.domain.TransactionPin;

/**
 * @author Rodrigo Estanislau
 */
public interface UpdateTransactionPinUseCase {
    TransactionPin update(TransactionPin transactionPin);
}
