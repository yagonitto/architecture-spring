package com.example.architecture_spring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;
    private final TodoValidator todoValidator;
    private final MailSender mailSender;

    public TodoService(TodoRepository todoRepository, TodoValidator todoValidator, MailSender mailSender) {
        this.todoRepository = todoRepository;
        this.todoValidator = todoValidator;
        this.mailSender = mailSender;
    }

    public TodoEntity save(TodoEntity todo) {
        todoValidator.validate(todo);

        return todoRepository.save(todo);
    }

    public void updateStatus(TodoEntity todo) {
        todoRepository.save(todo);

        String status = todo.getCompleted() == Boolean.TRUE ? "true" : "false";
        mailSender.sendMail("Todo status updated to " + status + ": " + todo.getDescription());
    }

    public TodoEntity findById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }

}
