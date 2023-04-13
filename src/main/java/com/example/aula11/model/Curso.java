package com.example.aula11.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500, nullable = false)
    private String descricao;
    @Column(length = 200, nullable = false)
    private String cargaHoraria;
    @Column(length = 200, nullable = false)
    private String objetivos;
    @Column(length = 200, nullable = false)
    private String ementa;

    @OneToMany(mappedBy = "curso")
    List<ProfessorCurso> professorCursos;

    @OneToMany(mappedBy = "curso")
    List<Agenda> agenda;

    public Curso(Long id, String descricao, String cargaHoraria, String objetivos, String ementa) {
        this.id = id;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.objetivos = objetivos;
        this.ementa = ementa;
    }

    public Curso() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
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
