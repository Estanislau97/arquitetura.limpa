package br.com.rodrigss.application.usecaseimpl;

import br.com.rodrigss.TaxNumberAvailableUseCase;
import br.com.rodrigss.application.gateway.TaxNumberAvailableGateway;

/**
 * @author Rodrigo Estanislau
 */
public class TaxNumberAvailableUseCaseImpl implements TaxNumberAvailableUseCase {
    private TaxNumberAvailableGateway taxNumberAvailableGateway;

    public TaxNumberAvailableUseCaseImpl(TaxNumberAvailableGateway taxNumberAvailableGateway){
        this.taxNumberAvailableGateway = taxNumberAvailableGateway;
    }


    @Override
    public Boolean taxNumberAvaliable(String taxNumber) {
        return taxNumberAvailableGateway.taxNumberAvailable(taxNumber);
    }
}
