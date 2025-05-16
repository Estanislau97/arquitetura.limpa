package br.com.rodrigss.service;
import br.com.rodrigss.application.gateway.TaxNumberAvailableGateway;
import br.com.rodrigss.repository.UserEntityRepository;
import org.springframework.stereotype.Service;

import static br.com.rodrigss.utils.Utilities.log;
/**
 * @author Rodrigo Estanislau
 */
@Service
public class TaxNumberAvailableGatewayImpl implements TaxNumberAvailableGateway {
    private UserEntityRepository userEntityRepository;

    public TaxNumberAvailableGatewayImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public Boolean taxNumberAvailable(String taxNumber) {
        log.info("Inicio da verificação se o TaxNumber está disponível");
        return !userEntityRepository.existsByTaxNumber(taxNumber);
    }
}
