# 💻 Desafio Backend Java - Arquitetura Limpa

Este projeto foi desenvolvido como parte de um desafio proposto pelo canal [Daniel Santos - Back-end](https://www.youtube.com/watch?v=kImcxK3Hmu8&list=PLUOqm1GRyVXaJG29--_tYtO8AkMChovx1&index=1), 
com o objetivo de aprender e aplicar **boas práticas de desenvolvimento Java** utilizando **arquitetura limpa** e **Spring Boot**.

---

## 📚 O que aprendi neste desafio:

### ✅ Estruturação de Projeto com Arquitetura Limpa
- Organização do código em camadas bem definidas (Domain, Application, Infrastructure).
- Separação clara de responsabilidades (use cases, entidades, gateways, controllers, etc).
- Aplicação dos princípios do **SOLID** para manter um código limpo, testável e desacoplado.

### ✅ Modularização e Separação de Responsabilidades
- Criação de módulos para domínio, aplicação e infraestrutura.
- Cada módulo tem uma responsabilidade única e bem definida.
- Os contratos (interfaces) da aplicação não conhecem detalhes de infraestrutura.

### ✅ Utilização do Spring Boot
- Uso de Spring Boot para acelerar o desenvolvimento de APIs REST.
- Configuração automática e facilidade na injeção de dependências.
- Anotações como `@RestController`, `@Service`, `@Autowired`, entre outras.

### ✅ Qualidade de Código e Boas Práticas
- Padronização de respostas via DTOs (`BaseResponse`, `ErrorResponse`).
- Validações e tratamento de exceções personalizadas (`TaxNumberException`, `TransactionPinException`, etc).
- Uso de `Lombok` para reduzir boilerplate (`@Builder`, `@Data`, `@AllArgsConstructor`, etc).
- Controle de fluxo com interfaces e casos de uso claros.

---

## 🚀 Tecnologias utilizadas:

- **Java 17+**
- **Spring Boot**
- **Lombok**
- **Maven**
- **Arquitetura Limpa (Clean Architecture)**

---

## 📂 Estrutura do Projeto

