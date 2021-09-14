package com.devexp.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.devexp.todo.bo.TodoBO;
import com.devexp.todo.controller.model.TodoItem;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoBO todoBO;



    @GetMapping
    public List<TodoItem> getTodoItems(@RequestParam(required=false) Boolean complete){
        if(null == complete) {
            return todoBO.getTodoItems();
        }else {
            return todoBO.getTodoItems(complete);
        }
    }

    @PostMapping
    public TodoItem addTodoItem(@RequestBody TodoItem todoItem ){
        return todoBO.addTodoItem(todoItem);

    }
    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        todoBO.deleteTodoItem(id);
    }

    @PutMapping("/todo/id/{id}/status/{status}")
    public void changeTodoItemStatus(@PathVariable Long id, @PathVariable String status){

        todoBO.changeTodoItemStatus(id,status);;

    }

}
