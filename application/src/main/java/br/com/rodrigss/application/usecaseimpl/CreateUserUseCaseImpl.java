package br.com.rodrigss.application.usecaseimpl;

import br.com.rodrigss.application.gateway.CreateUserGateway;
import br.com.rodrigss.core.domain.TransactionPin;
import br.com.rodrigss.core.domain.User;
import br.com.rodrigss.core.domain.Wallet;
import br.com.rodrigss.core.exception.EmailException;
import br.com.rodrigss.core.exception.InternalServerErrorException;
import br.com.rodrigss.core.exception.TaxNumberException;
import br.com.rodrigss.core.exception.TransactionPinException;
import br.com.rodrigss.core.exception.enums.ErrorCodeEnum;
import br.com.rodrigss.*;

import java.math.BigDecimal;


public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private TaxNumberAvailableUseCase taxNumberAvailableUseCase;
    private EmailAvailableUseCase emailAvailableUseCase;
    private CreateUserGateway createUserGateway;

    public CreateUserUseCaseImpl(TaxNumberAvailableUseCase taxNumberAvailableUseCase
            , EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway) {
        this.taxNumberAvailableUseCase = taxNumberAvailableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;

    }

    @Override
    public void  create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException,
            InternalServerErrorException {
        if (!taxNumberAvailableUseCase.taxNumberAvaliable(user.getTaxNumber().getValue())) {
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
        }

        if (!emailAvailableUseCase.emailAvailableEmail(user.getEmain())) {
            throw new EmailException(ErrorCodeEnum.ON0003.getMessage(), ErrorCodeEnum.ON0003.getCode());
        }

        if (!createUserGateway.create(user, new Wallet(new TransactionPin(pin), BigDecimal.ZERO, user))) {
            throw new InternalServerErrorException(ErrorCodeEnum.ON0004.getMessage(), ErrorCodeEnum.ON0004.getCode());
        }
    }
}