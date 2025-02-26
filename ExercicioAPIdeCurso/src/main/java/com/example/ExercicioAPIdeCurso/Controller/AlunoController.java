package com.example.ExercicioAPIdeCurso.Controller;

import com.example.ExercicioAPIdeCurso.Banco.AlunoBd;
import com.example.ExercicioAPIdeCurso.Model.Aluno;

import java.util.List;

public class AlunoController {

    AlunoBd repository = new AlunoBd();

    public List<Aluno> getAll(){ return repository.findAll();}

    public Aluno getId(Long id) {return repository.getId(id);}
    public boolean insertBanco(Aluno aluno){
        return repository.insert(aluno);
    }


}
