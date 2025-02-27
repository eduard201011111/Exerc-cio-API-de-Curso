package com.example.ExercicioAPIdeCurso.Banco;

import com.example.ExercicioAPIdeCurso.Model.Aluno;
import com.example.ExercicioAPIdeCurso.Model.Curso;
import java.util.List;
import java.util.ArrayList;

public class CursoBd {

    private static List<Curso> cursos;

    public CursoBd() {
        this.cursos = new ArrayList<>();
    }

    //busca todos
    public List<Curso> findAll() {
        return new ArrayList<>(cursos);
    }

    public Curso getByld(Long id) {
        return cursos.stream()
                .filter(curso -> curso.getIdCurso() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean insert(Curso curso){
        cursos.add(curso);
        return true;
    }

    public boolean delete(Long id) {
        Curso cursoBd = cursos.stream()
                .filter(func -> func.getIdCurso() == id)
                .findFirst()
                .orElse(null);

        if (cursoBd == null) {
            return false;
        }
        cursos.remove(cursoBd);

        return true;
    }
}




