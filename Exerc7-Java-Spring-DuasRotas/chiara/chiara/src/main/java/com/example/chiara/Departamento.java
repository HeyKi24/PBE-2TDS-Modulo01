package com.example.chiara;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    private int nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public Departamento(int id, int nome) {
        this.id = id;
        this.nome = nome;
    }

    private List<Departamento> departamentos = new ArrayList<>();

    @GetMapping
    public List<Departamento> getAll(){
        return departamentos;
    }
    @GetMapping("/{id}")
    public Departamento getById(@PathVariable Long id){
        return departamentos.stream()
    }
}
