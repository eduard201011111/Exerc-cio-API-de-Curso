package com.example.ExercicioAPIdeCurso.Controller;

import com.example.ExercicioAPIdeCurso.Banco.CursoBd;
import com.example.ExercicioAPIdeCurso.Model.Curso;
import com.example.ExercicioAPIdeCurso.View.CursoView;

import java.util.ArrayList;
import java.util.List;
public class CursoController {

    CursoBd repository = new CursoBd();


    public List<Curso> getAll() { return repository.findAll();
    }



    public Curso getByld(Long id) {
        return repository.getByld(id);
    }


    public boolean delete(Long id){
        return repository.delete(id);
    }

    public static Curso update(Long id, Curso curso) {
        return curso;
    }



    public Curso getById(Long id) {
        return repository.getByld(id);
    }

//    public void removerCurso(int idCurso) {
//        CursoBd.removerCurso(idCurso);
//    }



    public void adicionarCurso(Curso curso) {
    }
}