package br.com.rodrigss.application.usecaseimpl;

import br.com.rodrigss.application.gateway.FindWalletByTaxNumberGateway;
import br.com.rodrigss.core.domain.Wallet;
import br.com.rodrigss.core.exception.NotFoundException;
import br.com.rodrigss.core.exception.enums.ErrorCodeEnum;
import br.com.rodrigss.FindWalletByTaxNumberUseCase;

/**
 * @author Rodrigo Estanislau
 */
public class FindWalletByTaxNumberUseCaseImpl implements  FindWalletByTaxNumberUseCase{
    private FindWalletByTaxNumberGateway findWalletByTaxNumberGateway;

    @Override
    public Wallet findByTaxNumber(String taxNumber) throws NotFoundException {
        var wallet = findWalletByTaxNumberGateway.findByTazNumber(taxNumber);
        if (wallet == null) {
            throw new NotFoundException(ErrorCodeEnum.WA0001.getMessage(), ErrorCodeEnum.WA0001.getCode());
        }
        return wallet;
    }
}
