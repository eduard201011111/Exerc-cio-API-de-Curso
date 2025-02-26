package com.example.ExercicioAPIdeCurso.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class ProfessorBd {
    private List<Professor> professores;

    public ProfessorBd() {
        this.professores = new ArrayList<>();
    }

    public List<Professor> findAll() {
        return new ArrayList<>(professores);
    }

    public Professor getByld(Long id) {
        return professores.stream()
                .filter(professor -> professor.getIdProfessor() == id)
                .findFirst()
                .orElse(null);
    }

    public Professor getByNom(String nome) {
        return professores.stream()
                .filter(professor -> professor.getNome() == nome)
                .findFirst()
                .orElse(null);
    }

    public List<Professor> professorOrdenados() {
        return professores.stream()
                .sorted(Comparator.comparing(Professor::getSalario).reversed())
                .toList();
    }

    public boolean insert(Professor professor) {
        professores.add(professor);
        return true;
    }

    public boolean update(Long id, Professor professor) {
        Professor professorBd = professores.stream()
                .filter(pro -> pro.getIdProfessor() == id)
                .findFirst()
                .orElse(null);
        if(professorBd == null){
            return false;
        }
        professorBd.setNome(professor.getNome());
        return true;
    }

}
