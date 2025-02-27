package com.example.ExercicioAPIdeCurso.Model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Professor {
    private String nome;
    private String cpf;
    private double salario;
    private Long idProfessor;

    public Professor(String nome, String cpf, double salario, Long idProfessor) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.idProfessor = idProfessor;
    }

    public Professor(String nomeProfessor) {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }
}