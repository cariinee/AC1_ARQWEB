package com.example.aula11.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.aula11.model.ProfessorCurso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class ProfessorCursoRepository {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public ProfessorCurso inseir(ProfessorCurso professorCurso){
        return entityManager.merge(professorCurso);
    }

    public List<ProfessorCurso> obterTodos(){
        return entityManager.createQuery("from ProfessorCurso",ProfessorCurso.class).getResultList();   }
}
