package com.example.aula11.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProfessorCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name= "professor_id")
    private Professor professor;

    public ProfessorCurso() {
    }

    public ProfessorCurso(Long id, Curso curso, Professor professor) {
        this.id = id;
        this.curso = curso;
        this.professor = professor;
    }
    
}
