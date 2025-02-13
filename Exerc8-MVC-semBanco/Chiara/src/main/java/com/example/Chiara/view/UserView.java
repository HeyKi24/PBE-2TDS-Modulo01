package com.example.Chiara.view;

import com.example.Chiara.controler.UserControler;
import com.example.Chiara.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/{user}")

public class UserView {
    UserControler userControler = new UserControler();
    @GetMapping
    public List<User> getAll(){
        return userControler.getAll();
    }
    @GetMapping{"/{id}"}
    public User getById(@PathVariable long id){
        return userControler.getById(id);
    }
    @GetMapping
    public boolean insert(@RequestBody User user){
        return userControler.insert(user);
    }
    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PutMapping long id){
        return userControler.update(id, user);
    }
}
