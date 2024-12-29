package com.github.gabrielvelosoo.springarchitecture.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo) {
        return this.todoService.save(todo);
    }

    @PutMapping(value = "/{id}")
    public void updateStatus(@PathVariable Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        todoService.updateStatus(todo);
    }

    @GetMapping(value = "/{id}")
    public TodoEntity findById(@PathVariable Integer id) {
        return todoService.findById(id);
    }
}
