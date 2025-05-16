package br.com.rodrigss.application.usecaseimpl;
import br.com.rodrigss.application.gateway.UserNotificationGateway;
import br.com.rodrigss.core.domain.Transaction;
import br.com.rodrigss.UserNotificationUseCase;
/**
 * @author Rodrigo Estanislau
 */
public class UserNotificationUseCaseImpl implements UserNotificationUseCase {

    private UserNotificationGateway userNotificationGateway;
    @Override
    public Boolean notificate(Transaction transaction, String email) {
        return userNotificationGateway.notificate(transaction, email);
    }
}