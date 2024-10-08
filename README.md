# Sobre a API RUN THE BANK

Esta API foi desenvolvida para gerenciar o cadastro de clientes e suas respectivas contas em uma instituição financeira. Ela permite o registro de clientes, tanto de Pessoa Física (PF) quanto de Pessoa Jurídica (PJ). Após a criação do cadastro de um cliente, é possível abrir uma ou mais contas associadas a esse cliente.

As contas criadas através da API suportam operações financeiras, como pagamentos entre contas. Essas operações realizam débitos (saídas) na conta do pagador e créditos (entradas) na conta do recebedor, facilitando a movimentação de saldos de forma segura e eficiente.

# ⚙ Tecnologias Utilizadas ⚙
Java version 17

Spring Boot Version (3.3.0)

Spring Data JPA

Spring Bean Validation

Lombok

Postman to test APIs

H2 Database

Spring Security

JWT tokens

🛠 Work With Maven(software project management)

# Documentação da API REST (Resources and Endpoints)
https://documenter.getpostman.com/view/25624093/2sAXjKaCEk#18b6fbc1-4271-4748-be65-87fba71bd433



# Como rodar o projeto

Clone o repositório: git clone git@github.com:Kaminskifking/RUN-THE-BANK.git
Instale as dependências: mvn install
Rodar o projeto: mvn spring-boot:run ou shift + f10 na IDEA Intellij

# Testes
Comando para rodar os testes: mvn test

# Propostas de melhoria na arquitetura:
Melhorar expections trazendo mais especificação em cada caso de ERRO e assim identificar melhor cada um.
Adicionar uma nova tabela e um novo serviço de Usuários com sistema de roles para definir quais tipos de usuários podem fazer determinados tipos de requisições.
Testes de erros.
Swagger para documentação da API.
