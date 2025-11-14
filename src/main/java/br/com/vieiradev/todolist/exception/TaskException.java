package br.com.vieiradev.todolist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TaskException extends RuntimeException {
    public TaskException() {
        super("Tarefa não encontrada. Tente novamente!");
    }
}
