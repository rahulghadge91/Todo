package com.deloitte.Todo.controller;

import com.deloitte.Todo.entity.Todo;
import com.deloitte.Todo.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author raghadge
 */
@RestController
public class TodoController {

    Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    TodoService todoService;

    //login user specific

    // create todo for logged in user

    @PostMapping("/api/user/{userId}/todo")
    private ResponseEntity<?> addUserTodo(@RequestBody Todo todo,@PathVariable Long userId){
        return ResponseEntity.ok(todoService.addUserTodo(todo,userId));
    }

    //get the todos for logged in user
    @GetMapping("/api/user/{userId}/todos")
    private List<Todo> getUserTodos(@PathVariable Long userId){
        logger.debug("Logged in user id = "+ userId);
        return todoService.getAllUserTodos(userId);
    }

    @GetMapping(value = "/api/user/{userId}/todo/{task}")
    public List<Todo> getTodoByName(@PathVariable Long userId,@PathVariable String title){ // @pathPa sting
        return todoService.getTodoByTaskName(userId,title) ;//.orElseThrow(() -> new ContactNotFoundException(firstName));
    }

    @PutMapping("/api/todo/{todoid}")
    public ResponseEntity<?> updateTodo(@RequestBody Todo todo,@PathVariable Long todoid){
        return ResponseEntity.ok(todoService.updateTodo(todo,todoid));
    }

    @DeleteMapping("/api/todo/{todoid}")
    public void deleteTodo(@PathVariable Long todoid){
            todoService.deleteById(todoid);
    }


//    @GetMapping("/api/todo")
//    public List<Todo>getAllTodo(){
//        return todoService.retriveTodos();
//    }
//
//    @PostMapping("/api/todo")
//    public ResponseEntity<?> createTodo(@RequestBody Todo todo){
//
//        return ResponseEntity.ok(todoService.addTodo(todo));
//    }


}
