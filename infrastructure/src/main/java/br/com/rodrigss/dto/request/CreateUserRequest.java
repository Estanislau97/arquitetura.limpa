package br.com.rodrigss.dto.request;

import br.com.rodrigss.core.domain.enums.UserTypeEnum;
/**
 * @author Rodrigo Estanislau
 */
public record CreateUserRequest(String email, String password, String taxNumber, String fullname, UserTypeEnum type, String pin) {
}