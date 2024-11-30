package com.freshkite.TODO.service;

import com.freshkite.TODO.DAL.Todorepo;
import com.freshkite.TODO.demoo.Todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
     Todorepo rep;

    public List<Todomodel> getTodoService(){

        return rep.GetAllTodos();
    }

    public Todomodel createTodoService(Todomodel tod){

        return rep.createTodos(tod);
    }

    public  Todomodel updateTodoService(Todomodel todo_entry,String id){

        return rep.updateTodos(todo_entry,id);
    }

    public String deleteTodoService(String id){

        return rep.deleteTodo(id);
    }
}
