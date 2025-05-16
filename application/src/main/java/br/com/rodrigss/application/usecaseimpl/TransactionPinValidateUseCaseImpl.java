package br.com.rodrigss.application.usecaseimpl;

import br.com.rodrigss.TransactionValidateUseCase;
import br.com.rodrigss.application.gateway.TransactionPinValidateGateway;
import br.com.rodrigss.core.domain.TransactionPin;
import br.com.rodrigss.core.exception.PinException;
import br.com.rodrigss.core.exception.enums.ErrorCodeEnum;
import br.com.rodrigss.TransactionPinValidateUseCase;
import br.com.rodrigss.UpdateTransactionPinUseCase;

/**
 * @author Rodrigo Estanislau
 */

public class TransactionPinValidateUseCaseImpl implements TransactionPinValidateUseCase {
    private TransactionPinValidateGateway transactionPinValidateGateway;
    private UpdateTransactionPinUseCase updateTransactionPinUseCase;

    public TransactionPinValidateUseCaseImpl(TransactionPinValidateGateway transactionPinValidateGateway) {
        this.transactionPinValidateGateway = transactionPinValidateGateway;
    }

    @Override
    public Boolean validate(TransactionPin transactionPin) throws PinException {
        if (transactionPin.getBlocked()) throw new PinException(ErrorCodeEnum.PIN0001.getMessage(), ErrorCodeEnum.PIN0001.getCode());

        if (!transactionPinValidateGateway.validate(transactionPin)){
            transactionPin.setAttempt();
            var transactionPinUpdated = updateTransactionPinUseCase.update(transactionPin);
            throw new PinException(ErrorCodeEnum.pin0002GetMessage(transactionPinUpdated.getAttempt()), ErrorCodeEnum.PIN0002.getCode());
        }

        if (transactionPin.getAttempt() < 3){
            transactionPin.restaureAttempt();
            updateTransactionPinUseCase.update(transactionPin);
        }

        return true;
    }
}