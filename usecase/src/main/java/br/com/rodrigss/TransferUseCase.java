package br.com.rodrigss;

import br.com.rodrigss.core.exception.*;

import java.math.BigDecimal;
/**
 * @author Rodrigo Estanislau
 */
public interface TransferUseCase {
    Boolean transfer(String fromTaxNumber, String toTaxNumber, BigDecimal value, String pin)
            throws InternalServerErrorException, TransferException, NotFoundException
            , NotificationException, PinException;
}
