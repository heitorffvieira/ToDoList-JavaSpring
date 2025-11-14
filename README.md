# To-Do List API – Spring Boot

Uma API simples e funcional para gerenciamento de tarefas (To-Do List), desenvolvida em Java + Spring Boot, utilizando boas práticas de arquitetura, tratamento de exceções e persistência com banco de dados relacional via Spring Data JPA.

## Funcionalidades

- Criar uma nova tarefa

- Listar todas as tarefas

- Buscar tarefa por ID

- Editar uma tarefa existente

- Remover uma tarefa

- Tratamento de erro para IDs inexistentes (404 Not Found)

## Tecnologias Utilizadas

- Java 17+

- Spring Boot 3

- Spring Web

- Spring Data JPA

- Hibernate

- Lombok

- DevTools

- H2 

- Maven

## Estrutura do Projeto
````
src/
 └── main/
     ├── java/br.com.vieiradev.todolist/
     │   ├── controller/
     │   │   └── TaskController.java
     │   ├── service/
     │   │   └── TaskService.java
     │   ├── model/
     │   │   └── Task.java
     │   ├── repository/
     │   │   └── TaskRepository.java
     │   └── exception/
     │       └── TaskException.java
     └── resources/
         ├── application.properties
         └── data.sql (opcional)
````

## Modelo de Dados
### Task
| Campo       | Tipo      | Descrição               |
| ----------- | --------- | ----------------------- |
| id          | Long      | Identificador da tarefa |
| name        | String    | Nome da tarefa          |
| description | String    | Detalhes da tarefa      |
| date        | LocalDate | Data prevista           |

## Endpoints da API

1. Listar todas as tarefas

````GET /task````

2. Buscar tarefa por ID

````GET /task/{id}````
-> Retorna 404 se o ID não existir.

3. Criar nova tarefa

````POST /task````

Exemplo de JSON:

````
{
  "name": "Estudar Spring Boot",
  "description": "Revisar conceitos de API REST",
  "date": "2025-11-15"
}
````

4. Atualizar tarefa

````PUT /task/{id}````

5. Deletar tarefa

````DELETE /task/{id}````

## Tratamento de Erros

Quando uma tarefa não é encontrada, é lançada a exceção:

````TaskException extends RuntimeException````


Respondendo com:

````Status: 404 Not Found

Mensagem: "Tarefa não encontrada. Tente novamente!"
````
