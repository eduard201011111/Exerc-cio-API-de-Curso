package com.example.ExercicioAPIdeCurso.Model;


public class Aluno {

    private Long Id;
    private String nome;
    private String cpf;

    public Aluno(Long id, String nome, String cpf) {
        Id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}