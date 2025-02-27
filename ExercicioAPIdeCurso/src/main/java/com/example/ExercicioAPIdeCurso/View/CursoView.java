package com.example.ExercicioAPIdeCurso.View;

import com.example.ExercicioAPIdeCurso.Banco.CursoBd;
import com.example.ExercicioAPIdeCurso.Controller.CursoController;
import com.example.ExercicioAPIdeCurso.Model.Curso;
import com.example.ExercicioAPIdeCurso.Model.Professor;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoView {

    CursoController cursoController = new CursoController();


    @GetMapping("/{id}")
    public Curso getByld(@PathVariable Long id){
        return cursoController.getByld(id);
    }
    @PutMapping("/{id}")
    public Curso update(@RequestBody Curso curso, @PathVariable Long id){
        return cursoController.update(id, curso);
    }

    @PostMapping
    private boolean adicionarCurso(@RequestBody Curso curso) {
        cursoController.adicionarCurso(curso);
        return true;
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id){
        return cursoController.delete(id);
    }
}