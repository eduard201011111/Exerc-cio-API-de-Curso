package com.example.ExercicioAPIdeCurso.Banco;

import com.example.ExercicioAPIdeCurso.Model.Aluno;
import com.example.ExercicioAPIdeCurso.Model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoBd {

    private static ArrayList<Curso> cursos = new ArrayList<>();

    public static void adicionarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso " + curso.getNome() + " adicionado");
    }

    public static void removerCurso(int idCurso) {
        for (Curso curso : cursos) {
            if (curso.getIdCurso() == idCurso) {
                cursos.remove(curso);
                System.out.println("Curso " + curso.getNome() + " removido");
                return;
            }
        }
        System.out.println("Curso com ID " + idCurso + " não encontrado.");
    }


    public static void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        } else {
            System.out.println("Lista de Cursos:");
            for (Curso curso : cursos) {
                System.out.println("ID: " + curso.getIdCurso() + ", Nome: " + curso.getNome() + ", Professor: " + curso.getProfessor().getNome());
            }
        }
    }

    public static Curso buscarCurso(int idCurso) {
        for (Curso curso : cursos) {
            if (curso.getIdCurso() == idCurso) {
                return curso;
            }
        }
        System.out.println("Curso não encontrado.");
        return null;
    }

    public List<Curso> findAll() {
        return cursos;
    }
}
