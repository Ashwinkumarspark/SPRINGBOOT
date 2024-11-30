package com.freshkite.TODO.DAL;

import com.freshkite.TODO.demoo.Todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MongoTodoRepo implements Todorepo{
    @Autowired
    private Mongorepo mrepo;

    @Override
    public List<Todomodel> GetAllTodos() {
        return mrepo.findAll();
    }

    @Override
    public Todomodel createTodos(Todomodel todo_entry) {
        return mrepo.save(todo_entry);
    }

    @Override
    public Todomodel updateTodos(Todomodel todo_entry, String id) {
        Todomodel old=mrepo.findById(id).get();
        old.setTitle(todo_entry.getTitle());
        old.setDescription (todo_entry. getDescription());
        return mrepo.save(old);
    }

    @Override
    public String deleteTodo(String id) {
         mrepo.deleteById(id);
         return "deleted successfully";
    }
}
