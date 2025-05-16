package br.com.rodrigss.application.gateway;
import br.com.rodrigss.core.domain.TransactionPin;
/**
 * @author Rodrigo Estanislau
 */
public interface TransactionPinValidateGateway {
    boolean validate(TransactionPin transactionPin);

}
