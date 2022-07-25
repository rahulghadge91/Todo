package com.deloitte.Todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raghadge
 */

@RestController //
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
            return "Hello World !";
    }
}
