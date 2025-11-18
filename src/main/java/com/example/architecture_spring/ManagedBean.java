package com.example.architecture_spring;

import com.example.architecture_spring.todos.TodoEntity;
import com.example.architecture_spring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagedBean {

    @Autowired
    private TodoValidator todoValidator;

    public ManagedBean(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

    public void use() {
        TodoEntity entity = new TodoEntity();

        todoValidator.validate(entity);
    }

    @Autowired
    public void setTodoValidator(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

}
