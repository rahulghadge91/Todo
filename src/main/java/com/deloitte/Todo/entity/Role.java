package com.deloitte.Todo.entity;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author raghadge
 */

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60)
    private String name;
}