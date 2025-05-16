package br.com.rodrigss.service;
import br.com.rodrigss.application.gateway.CreateUserGateway;
import br.com.rodrigss.core.domain.User;
import br.com.rodrigss.core.domain.Wallet;
import br.com.rodrigss.mapper.TransactionPinMapper;
import br.com.rodrigss.mapper.UserMapper;
import br.com.rodrigss.mapper.WalletMapper;
import br.com.rodrigss.repository.TransactionPinEntityRepository;
import br.com.rodrigss.repository.UserEntityRepository;
import br.com.rodrigss.repository.WalletEntityRepository;
import org.springframework.stereotype.Service;
import static br.com.rodrigss.utils.Utilities.log;

/**
 * @author Rodrigo Estanislau
 */
@Service
public class CreateUserGatewayImpl implements CreateUserGateway {
    private UserEntityRepository userEntityRepository;
    private UserMapper userMapper;
    private TransactionPinEntityRepository transactionPinEntityRepository;
    private TransactionPinMapper transactionPinMapper;
    private WalletEntityRepository walletEntityRepository;
    private WalletMapper walletMapper;

    public CreateUserGatewayImpl(UserEntityRepository userEntityRepository, UserMapper userMapper, TransactionPinEntityRepository transactionPinEntityRepository, TransactionPinMapper transactionPinMapper, WalletEntityRepository walletEntityRepository, WalletMapper walletMapper) {
        this.userEntityRepository = userEntityRepository;
        this.userMapper = userMapper;
        this.transactionPinEntityRepository = transactionPinEntityRepository;
        this.transactionPinMapper = transactionPinMapper;
        this.walletEntityRepository = walletEntityRepository;
        this.walletMapper = walletMapper;
    }

    @Override
    public Boolean create(User user, Wallet wallet) {
        try {
            log.info("Inicio da criação do usuário::CreateUserGatewayImpl");
            var userSaved = userEntityRepository.save(userMapper.toUserEntity(user));
            var transactionPinSaved = transactionPinEntityRepository.save(transactionPinMapper.toTransactionPinEntity(wallet.getTransactionPin()));
            walletEntityRepository.save(walletMapper.toWalletEntity(wallet, userSaved, transactionPinSaved));
            log.info("Usuário criado com sucesso::CreateUserGatewayImpl");
            return true;
        } catch (Exception e) {
            log.error("Houve um erro na criação do usuário::CreateUserGatewayImpl");
            return false;
        }

    }
}
