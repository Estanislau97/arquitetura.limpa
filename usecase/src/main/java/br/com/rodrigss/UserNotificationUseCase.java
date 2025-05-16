package br.com.rodrigss;

import br.com.rodrigss.core.domain.Transaction;

/**
 * @author Rodrigo Estanislau
 */
public interface UserNotificationUseCase {
    Boolean notificate(Transaction transaction, String email);
}
