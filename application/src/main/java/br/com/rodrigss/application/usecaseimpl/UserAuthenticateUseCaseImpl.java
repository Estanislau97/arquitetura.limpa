package br.com.rodrigss.application.usecaseimpl;
import br.com.rodrigss.application.gateway.UserAuthenticateGateway;
import br.com.rodrigss.core.exception.AuthenticateException;
import br.com.rodrigss.core.exception.enums.ErrorCodeEnum;
import br.com.rodrigss.UserAuthenticateUseCase;
/**
 * @author Rodrigo Estanislau
 */
public class UserAuthenticateUseCaseImpl implements UserAuthenticateUseCase {
    private UserAuthenticateGateway userAuthenticateGateway;

    public UserAuthenticateUseCaseImpl(UserAuthenticateGateway userAuthenticateGateway) {
        this.userAuthenticateGateway = userAuthenticateGateway;
    }


    @Override
    public Boolean authenticate(String username, String password) throws AuthenticateException {
        if (!userAuthenticateGateway.authenticate(username, password)){
            throw new AuthenticateException(ErrorCodeEnum.ATH0001.getMessage(), ErrorCodeEnum.ATH0001.getCode());
        }
        return true;
    }
}
