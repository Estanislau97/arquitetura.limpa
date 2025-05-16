package br.com.rodrigss.repository;
import br.com.rodrigss.entity.TransactionPinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Rodrigo Estanislau
 */
public interface TransactionPinEntityRepository extends JpaRepository<TransactionPinEntity, Long> {
}
