package br.com.rodrigss.application.usecaseimpl;

import br.com.rodrigss.application.gateway.TransactionValidateGateway;
import br.com.rodrigss.core.domain.Transaction;
import br.com.rodrigss.core.exception.TransferException;
import br.com.rodrigss.core.exception.enums.ErrorCodeEnum;
import br.com.rodrigss.TransactionValidateUseCase;

/**
 * @author Rodrigo Estanislau
 */
public class TransactionValidateUseCaseImpl implements TransactionValidateUseCase {
    private TransactionValidateGateway transactionValidateGateway;

    @Override
    public Boolean validate(Transaction transaction) throws TransferException {
        if (!transactionValidateGateway.validate(transaction)) {
            throw new TransferException(ErrorCodeEnum.TR0004.getMessage(), ErrorCodeEnum.TR0004.getCode());
        }
        return true;
    }

}
