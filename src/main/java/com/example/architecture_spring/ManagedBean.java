package com.example.architecture_spring;

import com.example.architecture_spring.todos.TodoEntity;
import com.example.architecture_spring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) // default
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//@Scope("request")
//@Scope("session")
//@Scope("application")
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
