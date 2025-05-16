package br.com.rodrigss.application.gateway;
import br.com.rodrigss.core.domain.Wallet;

import java.math.BigDecimal;
/**
 * @author Rodrigo Estanislau
 */
public interface ConsultBalanceGateway {
    BigDecimal consult(Wallet wallet);

}
