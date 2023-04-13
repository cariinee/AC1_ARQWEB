package com.example.aula11.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity

public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200, nullable = false)
    private String dataInicioFim;
    @Column(length = 200, nullable = false)
    private String horarioInicioFim;
    @Column(length = 200, nullable = false)
    private String cidade;
    @Column(length = 200, nullable = false)
    private String estado;
    @Column(length = 200, nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name= "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name= "professor_id")
    private Professor professor;

    public Agenda(Long id, String dataInicioFim, String horarioInicioFim, String cidade, String estado, String cep,
            Curso curso, Professor professor) {
        this.id = id;
        this.dataInicioFim = dataInicioFim;
        this.horarioInicioFim = horarioInicioFim;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.curso = curso;
        this.professor = professor;
    }

    public Agenda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataInicioFim() {
        return dataInicioFim;
    }

    public void setDataInicioFim(String dataInicioFim) {
        this.dataInicioFim = dataInicioFim;
    }

    public String getHorarioInicioFim() {
        return horarioInicioFim;
    }

    public void setHorarioInicioFim(String horarioInicioFim) {
        this.horarioInicioFim = horarioInicioFim;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
