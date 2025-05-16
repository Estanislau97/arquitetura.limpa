package br.com.rodrigss.application.usecaseimpl;

import br.com.rodrigss.CreateTransactionUseCase;
import br.com.rodrigss.application.gateway.CreateTransactionGateway;
import br.com.rodrigss.core.domain.Transaction;
import br.com.rodrigss.core.exception.TransferException;
import br.com.rodrigss.core.exception.enums.ErrorCodeEnum;

/**
 * @author Rodrigo Estanislau
 */
public class CreateTransactionUseCaseImpl implements CreateTransactionUseCase {
    private CreateTransactionGateway createTransactionGateway;

    //TODO: Adicionar no construtor
    @Override
    public Transaction create(Transaction transaction) throws TransferException {
        var transactionSaved = createTransactionGateway.create(transaction);

        if (transactionSaved == null) {
            throw new TransferException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
        }

        return transactionSaved;
    }
}
