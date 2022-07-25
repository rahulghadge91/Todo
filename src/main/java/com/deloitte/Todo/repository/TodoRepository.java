package com.deloitte.Todo.repository;

import com.deloitte.Todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author raghadge
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {


    List<Todo> findByUserId(Long userId);

    List<Todo> findByUserIdAndTask(Long userId, String title);

    Todo findById(Long id);

    @Transactional
    void deleteById(Long todoid);
}
