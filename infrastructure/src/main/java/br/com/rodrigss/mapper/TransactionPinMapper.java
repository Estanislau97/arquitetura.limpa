package br.com.rodrigss.mapper;
import br.com.rodrigss.core.domain.TransactionPin;
import br.com.rodrigss.entity.TransactionPinEntity;
import org.springframework.stereotype.Component;
/**
 * @author Rodrigo Estanislau
 */
@Component
public class TransactionPinMapper {

    public TransactionPinEntity toTransactionPinEntity(TransactionPin transactionPin){
        return new TransactionPinEntity(
                transactionPin.getPin(),
                transactionPin.getAttempt(),
                transactionPin.getBlocked(),
                transactionPin.getCreatedAt(),
                transactionPin.getUpdateAt()
        );
    }
}
