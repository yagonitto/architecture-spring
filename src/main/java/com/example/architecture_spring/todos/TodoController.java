package com.example.architecture_spring.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo) {
        try {
            return todoService.save(todo);
        } catch (IllegalArgumentException e) {
            var errorMessage = e.getMessage();

            throw new ResponseStatusException(HttpStatus.CONFLICT, errorMessage);
        }
    }

    @PutMapping("/{id}/status")
    public void updateStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);

        todoService.updateStatus(todo);
    }

    @GetMapping("/{id}")
    public TodoEntity findById(@PathVariable("id") Integer id) {
        return todoService.findById(id);
    }

}
