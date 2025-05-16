package br.com.rodrigss.repository;
import br.com.rodrigss.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Rodrigo Estanislau
 */
public interface WalletEntityRepository extends JpaRepository<WalletEntity, Long> {
}
