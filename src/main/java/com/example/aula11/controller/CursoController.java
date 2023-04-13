package com.example.aula11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula11.model.Curso;
import com.example.aula11.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> obterTodos() {
        return cursoRepository.obterTodos();
    }

    @PostMapping
    public Curso inserir(@RequestBody Curso curso){
        return cursoRepository.inserir(curso);
    }

    @PutMapping
    public Curso editar(@RequestBody Curso curso){
        return cursoRepository.editar(curso);
    }

    @DeleteMapping
    public Curso excluir(@RequestBody Curso curso){
        return cursoRepository.excluir(curso);
    }

    }