package com.deloitte.Todo.service;

import com.deloitte.Todo.entity.Todo;
import com.deloitte.Todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author raghadge
 */
@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;
    public List<Todo> retriveTodos() {
        return todoRepository.findAll();
    }

    public Object addTodo(Todo todo) {
        todoRepository.save(todo);
        return "Created";
    }

    public Object updateTodo(Todo todo,Long id) {
        Todo todo1 = todoRepository.findById(id);
        todo1.setTask(todo.getTask());
        todo1.setDescription(todo.getDescription());
        todo1.setStatus(todo.getStatus());
        todo1.setTargetDate(todo.getTargetDate());
       return todoRepository.save(todo1);
    }

    public void deleteById(Long todoid) {
        todoRepository.deleteById(todoid);

    }

    public Object addUserTodo(Todo todo, Long userId) {
        todo.setUserId(userId);
        return todoRepository.save(todo);
    }

    public List<Todo> getAllUserTodos(Long userId) {
        return todoRepository.findByUserId(userId);
    }

    public List<Todo> getTodoByTaskName(Long userId, String task) {
        return todoRepository.findByUserIdAndTask(userId,task);
    }
}
