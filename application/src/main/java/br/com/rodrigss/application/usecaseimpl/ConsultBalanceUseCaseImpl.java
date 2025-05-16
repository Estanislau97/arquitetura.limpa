package br.com.rodrigss.application.usecaseimpl;
import br.com.rodrigss.application.gateway.ConsultBalanceGateway;
import br.com.rodrigss.ConsultBalanceUseCase;
import br.com.rodrigss.core.domain.Wallet;

import java.math.BigDecimal;

/**
 * @author Rodrigo Estanislau
 */
public class ConsultBalanceUseCaseImpl implements ConsultBalanceUseCase {

    private ConsultBalanceGateway consultBalanceGateway;

    public ConsultBalanceUseCaseImpl(ConsultBalanceGateway consultBalanceGateway) {
        this.consultBalanceGateway = consultBalanceGateway;
    }

    @Override
    public BigDecimal consult(Wallet wallet) {
        return consultBalanceGateway.consult(wallet);
    }
}
