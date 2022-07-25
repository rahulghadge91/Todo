package com.deloitte.Todo.entity;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;

/**
 * @author raghadge
 */

@Data
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String task;
    String description;
    LocalDate targetDate;
    Boolean status;

    private Long userId;


    public Todo() {
    }

    public Todo(String task, String description, LocalDate targetDate, Boolean status) {
        this.task = task;
        this.description = description;
        this.targetDate = targetDate;
        this.status = status;
    }

    public Todo(String task, String description, LocalDate targetDate, Boolean status, Long userId) {
        this.task = task;
        this.description = description;
        this.targetDate = targetDate;
        this.status = status;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
