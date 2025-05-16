package br.com.rodrigss.mapper;
import br.com.rodrigss.core.domain.TaxNumber;
import br.com.rodrigss.core.domain.User;
import br.com.rodrigss.dto.request.CreateUserRequest;
import br.com.rodrigss.entity.UserEntity;
import org.springframework.stereotype.Component;
/**
 * @author Rodrigo Estanislau
 */

@Component
public class UserMapper {

    public UserEntity toUserEntity(User user){
        return new UserEntity(
                user.getId(),
                user.getEmain(),
                user.getPassword(),
                user.getTaxNumber().getValue(),
                user.getFullname(),
                user.getType(),
                user.getCreatedAt(),
                user.getUpdateAt()
        );
    }

    public User toUser(CreateUserRequest request) throws Exception {
        return new User(
                request.email(),
                request.password(),
                new TaxNumber(request.taxNumber()),
                request.fullname(),
                request.type()
        );
    }
}