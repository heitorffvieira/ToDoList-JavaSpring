package br.com.vieiradev.todolist.service;

import br.com.vieiradev.todolist.exception.TaskException;
import br.com.vieiradev.todolist.model.Task;
import br.com.vieiradev.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task getById(Long id) {
        return findTaskOrThrow(id);
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public Task update(Long id, Task task) {
        findTaskOrThrow(id);
        task.setId(id);
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        findTaskOrThrow(id);
        taskRepository.deleteById(id);
    }

    private Task findTaskOrThrow(Long id) {
        return taskRepository.findById(id).orElseThrow(TaskException::new);
    }

}
