package com.example.aula11.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.aula11.model.Curso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CursoRepository {
    
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Curso inserir(Curso curso){
        return entityManager.merge(curso);
    }

    @Transactional
    public Curso editar(Curso curso){
        return entityManager.merge(curso);
    }

    @Transactional
    public Curso excluir(Curso curso){
        return entityManager.merge(curso);
    }

    public List<Curso> obterTodos(){
        return entityManager.createQuery("From Curso", Curso.class).getResultList();
    }

}
