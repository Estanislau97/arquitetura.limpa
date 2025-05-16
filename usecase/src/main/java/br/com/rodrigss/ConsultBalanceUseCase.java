package br.com.rodrigss;
import br.com.rodrigss.core.domain.Wallet;

import java.math.BigDecimal;
/**
 * @author Rodrigo Estanislau
 */
public interface ConsultBalanceUseCase {
    BigDecimal consult(Wallet wallet);
}