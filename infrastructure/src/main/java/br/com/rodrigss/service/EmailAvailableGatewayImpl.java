package br.com.rodrigss.service;
import br.com.rodrigss.application.gateway.EmailAvailableGateway;
import br.com.rodrigss.repository.UserEntityRepository;
import org.springframework.stereotype.Service;
/**
 * @author Rodrigo Estanislau
 */
@Service
public class EmailAvailableGatewayImpl implements EmailAvailableGateway {
    private UserEntityRepository userEntityRepository;

    public EmailAvailableGatewayImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public Boolean emailAvailable(String email) {
        return !userEntityRepository.existsByEmail(email);
    }
}