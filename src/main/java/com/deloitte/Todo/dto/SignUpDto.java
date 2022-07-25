package com.deloitte.Todo.dto;

import lombok.Data;

/**
 * @author raghadge
 */
@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
