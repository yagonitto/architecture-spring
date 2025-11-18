package com.example.architecture_spring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private final TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void validate(TodoEntity todo) {
        if (existsTodoWithDescription(todo.getDescription())) {
            throw new IllegalArgumentException("A todo with the same description already exists.");
        }
    }

    private boolean existsTodoWithDescription(String description) {
        return todoRepository.existsByDescription(description);
    }

}
