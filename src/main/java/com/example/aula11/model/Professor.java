package com.example.aula11.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 400, nullable = false)
    private String nome;
    @Column(length = 200, nullable = false)
    private String cpf;
    @Column(length = 200, nullable = false)
    private String rg;
    @Column(length = 200, nullable = false)
    private String endereco;
    @Column(length = 200, nullable = false)
    private String celular;

    @OneToMany(mappedBy = "professor")
    List<ProfessorCurso> professorCursos;

    @OneToMany(mappedBy = "professor")
    List<Agenda> agenda;

    public Professor(Long id, String nome, String cpf, String rg, String endereco, String celular) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.celular = celular;
    }

    public Professor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<ProfessorCurso> getProfessorCursos() {
        return professorCursos;
    }

    public void setProfessorCursos(List<ProfessorCurso> professorCursos) {
        this.professorCursos = professorCursos;
    }

    public List<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Agenda> agenda) {
        this.agenda = agenda;
    }
}
