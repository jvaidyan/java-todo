package com.devexp.todo.bo;

import java.util.List;

import com.devexp.todo.controller.model.TodoItem;

public interface TodoBO {

    List<TodoItem> getTodoItems();

    TodoItem addTodoItem(TodoItem todoItem);

    void deleteTodoItem(Long id);

    List<TodoItem> getTodoItems(boolean complete);

    void changeTodoItemStatus(long id, String status);

}
