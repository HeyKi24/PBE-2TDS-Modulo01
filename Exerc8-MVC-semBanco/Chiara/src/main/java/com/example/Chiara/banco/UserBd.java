package com.example.Chiara.banco;
import com.example.Chiara.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserBd {
    private List<User> users;
    public UserBd(){
        this.users = new ArrayList<>();
    }
    public List<User> findAll(){
        return new ArrayList<>(users);
    }
    public User getById(long id){
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public boolean insert(User user){
        users.add(user);
        return true;
    }
    public boolean update(long id, User user){
        User userBd = users.stream()

                .filter(usuario -> usuario.getId()== id)
                .findFirst()
                .orElse(null);
        if (userBd == null){
            return false;
        }
        userBd.setNome(user.getNome());
        userBd.setSobrenome(user.getSobrenome());
        return true;
    }
}
