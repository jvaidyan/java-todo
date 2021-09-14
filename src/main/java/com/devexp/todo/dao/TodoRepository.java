package com.devexp.todo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devexp.todo.entity.TodoItemEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoItemEntity, Long>{

    List<TodoItemEntity> findByComplete(boolean complete);

    TodoItemEntity findById(long id);

}
