package com.example.aula11.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.aula11.model.Agenda;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class AgendaRepository {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public Agenda inserir(Agenda agenda){
        return entityManager.merge(agenda);
    }

    public List<Agenda> obterTodos(){
        return entityManager.createQuery("from Agenda",Agenda.class).getResultList();
    }
}
