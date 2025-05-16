package br.com.rodrigss.repository;
import br.com.rodrigss.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
/**
 * @author Rodrigo Estanislau
 */
public interface UserEntityRepository extends JpaRepository<UserEntity, UUID> {

    Boolean existsByTaxNumber(String taxNumber);

    Boolean existsByEmail(String email);
}
