# API Listagem

Backend de uma tela de listagem de fundos e programas em tabelas.

## Tecnologias utilizadas
- Java 21
- Spring Boot 3.5.16
- Spring Data JPA
- Hibernate
- SQLite

## Endpoints disponíveis

| Método | URL | Descrição |
|--------|-----|-----------|
| GET | /fundos | Lista todos os fundos |
| GET | /programa | Lista todos os programas |

## Como rodar o projeto

1. Clone o repositório
2. Abra na IDE de sua preferência
3. Configure o caminho do banco SQLite no `application.properties`
4. Rode a classe `ApiListagemApplication`
5. Acesse `http://localhost:8080`