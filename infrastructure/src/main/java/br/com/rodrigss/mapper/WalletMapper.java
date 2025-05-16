package br.com.rodrigss.mapper;
import br.com.rodrigss.core.domain.Wallet;
import br.com.rodrigss.entity.TransactionPinEntity;
import br.com.rodrigss.entity.UserEntity;
import br.com.rodrigss.entity.WalletEntity;
import org.springframework.stereotype.Component;

/**
 * @author Rodrigo Estanislau
 */
@Component
public class WalletMapper {

    public WalletEntity toWalletEntity(Wallet wallet, UserEntity userEntity, TransactionPinEntity transactionPinEntity) {
        return new WalletEntity(
                wallet.getBalance(),
                userEntity,
                transactionPinEntity,
                wallet.getCreatedAt(),
                wallet.getUpdateAt()
        );
    }
}