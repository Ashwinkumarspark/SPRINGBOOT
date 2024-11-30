package com.freshkite.TODO.contoller;
import com.freshkite.TODO.DAL.Todorepo;
import com.freshkite.TODO.demoo.Todomodel;
import com.freshkite.TODO.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
     TodoService serv;


    @GetMapping("/todos")
    public List<Todomodel> getTodoController(){

        return serv.getTodoService();
    }

    @PostMapping("/todo")
    public Todomodel createTodoController(@RequestBody Todomodel tod){
        return serv.createTodoService(tod);
    }

    @PutMapping("/todo/{id}")
    public Todomodel updateTodoController(@PathVariable String id, @RequestBody Todomodel tod){
        return serv.updateTodoService(tod, id);
    }

    @DeleteMapping("/todo/{id}")
    public  String deleteController(@PathVariable String id){
        return serv.deleteTodoService(id);
    }


}
