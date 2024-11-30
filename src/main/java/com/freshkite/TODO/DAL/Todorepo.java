package com.freshkite.TODO.DAL;

import com.freshkite.TODO.demoo.Todomodel;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Todorepo  {

    public List<Todomodel> GetAllTodos();
    public Todomodel createTodos(Todomodel todo_entry );
    public Todomodel updateTodos(Todomodel todo_entry, String id);
    public String deleteTodo(String id);
}
