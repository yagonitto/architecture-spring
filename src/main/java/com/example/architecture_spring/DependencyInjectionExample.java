package com.example.architecture_spring;

import com.example.architecture_spring.todos.MailSender;
import com.example.architecture_spring.todos.TodoRepository;
import com.example.architecture_spring.todos.TodoService;
import com.example.architecture_spring.todos.TodoValidator;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

public class DependencyInjectionExample {

    static void main(String[] args) throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("url");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        TodoRepository todoRepository = null; // new SimpleJpaRepository<TodoEntity, Integer>();
        TodoValidator todoValidator = new TodoValidator(todoRepository);
        MailSender mailSender = new MailSender();
        TodoService todoService = new TodoService(todoRepository, todoValidator, mailSender);

        ManagedBean managedBean = new ManagedBean(null);
        managedBean.setTodoValidator(todoValidator);
    }

}
