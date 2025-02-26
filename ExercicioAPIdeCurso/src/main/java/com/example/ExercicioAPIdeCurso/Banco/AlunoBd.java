package com.example.ExercicioAPIdeCurso.Banco;

import com.example.ExercicioAPIdeCurso.Model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoBd {

    public  Aluno getId(Long id){
        return alunos.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public boolean insert(Aluno aluno){
        alunos.add(aluno);
        return true;
    }


}
