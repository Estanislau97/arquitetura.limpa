package br.com.rodrigss;
import br.com.rodrigss.core.domain.TransactionPin;
import br.com.rodrigss.core.exception.PinException;
import br.com.rodrigss.core.exception.TransferException;
/**
 * @author Rodrigo Estanislau
 */
public interface TransactionPinValidateUseCase {
    Boolean validate(TransactionPin transactionPin) throws TransferException, PinException;
}
