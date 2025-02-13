package com.example.Chiara.controler;

import com.example.Chiara.banco.UserBd;
import com.example.Chiara.model.User;

import java.util.List;

public class UserControler {
    UserBd repository = new UserBd();
    public List<User> getAll(){
        return repository.findAll();
    }
    public User getById(long id){
        return repository.getById(id);
    }
    public boolean insert(User user){
        return repository.insert(user);
    }
    public User update(long id, User user) {
        boolean result = repository.update(id, user);
        if (result) {
            return user;
        }
        return null;
    }

}
