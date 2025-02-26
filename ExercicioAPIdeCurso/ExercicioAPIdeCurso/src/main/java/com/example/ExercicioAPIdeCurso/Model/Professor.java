package com.example.ExercicioAPIdeCurso.Model;

public class Professor {
    private  String nome;
    private String cpf;
    private double salario;
    private int idProfessor;

public Professor(String nome, String cpf, double salario, int idProfessor) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
    this.idProfessor = idProfessor;
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

    public int getIdProfessor() {
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

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
}
