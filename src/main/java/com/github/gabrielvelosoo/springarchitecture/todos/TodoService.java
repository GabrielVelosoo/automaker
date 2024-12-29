package com.github.gabrielvelosoo.springarchitecture.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public TodoEntity save(TodoEntity todo) {
        return todoRepository.save(todo);
    }

    public void updateStatus(TodoEntity todo) {
        todoRepository.save(todo);
    }

    public TodoEntity findById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }
}
