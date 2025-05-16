package br.com.rodrigss.repository;
import br.com.rodrigss.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Rodrigo Estanislau
 */
public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, Long> {
}
