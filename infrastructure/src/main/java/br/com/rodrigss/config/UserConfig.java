package br.com.rodrigss.config;


import br.com.rodrigss.application.gateway.CreateUserGateway;
import br.com.rodrigss.application.gateway.EmailAvailableGateway;
import br.com.rodrigss.application.gateway.TaxNumberAvailableGateway;
import br.com.rodrigss.application.usecaseimpl.CreateUserUseCaseImpl;
import br.com.rodrigss.application.usecaseimpl.EmailAvailableUseCaseImpl;
import br.com.rodrigss.application.usecaseimpl.TaxNumberAvailableUseCaseImpl;
import br.com.rodrigss.CreateUserUseCase;
import br.com.rodrigss.EmailAvailableUseCase;
import br.com.rodrigss.TaxNumberAvailableUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author Rodrigo Estanislau
 */

@Configuration
public class UserConfig {

    @Bean
    public TaxNumberAvailableUseCase taxNumberAvailableUseCase(TaxNumberAvailableGateway taxNumberAvailableGateway){
        return new TaxNumberAvailableUseCaseImpl(taxNumberAvailableGateway);
    }

    @Bean
    public EmailAvailableUseCase emailAvailableUseCase(EmailAvailableGateway emailAvailableGateway){
        return new EmailAvailableUseCaseImpl(emailAvailableGateway);
    }

    @Bean
    public CreateUserUseCase createUserUseCase(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway){
        return new CreateUserUseCaseImpl(taxNumberAvailableUseCase, emailAvailableUseCase, createUserGateway);
    }
}
