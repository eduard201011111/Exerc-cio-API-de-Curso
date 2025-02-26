package com.example.ExercicioAPIdeCurso.Controller;

import com.example.ExercicioAPIdeCurso.Banco.CursoBd;
import com.example.ExercicioAPIdeCurso.Model.Curso;
import com.example.ExercicioAPIdeCurso.View.CursoView;

import java.util.ArrayList;
import java.util.List;
public class CursoController {

    CursoBd repository = new CursoBd();

    public static Curso update(Long id, Curso curso) {
        return curso;
    }

    public static boolean insert(Curso curso) {
        return true;
    }

    public Curso getById(Long id) {
        return repository.get
    }

    public List<Curso> getAll() {
        return repository.findAll();
    }

    public void adicionarCurso(Curso curso) {
        CursoBd.adicionarCurso(curso);
    }

    public void removerCurso(int idCurso) {
        CursoBd.removerCurso(idCurso);
    }

    public void listarCursos() {
        CursoBd.listarCursos();
    }

    public Curso buscarCurso(int idCurso) {
        return CursoBd.buscarCurso(idCurso);
    }
}