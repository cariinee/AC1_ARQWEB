package com.example.aula11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.aula11.model.Curso;
import com.example.aula11.model.Professor;
import com.example.aula11.model.ProfessorCurso;
import com.example.aula11.repository.AgendaRepository;
import com.example.aula11.repository.CursoRepository;
import com.example.aula11.repository.ProfessorCursoRepository;
import com.example.aula11.repository.ProfessorRepository;

@SpringBootApplication
public class Aula11Application {

	@Bean
	public CommandLineRunner init(
			@Autowired CursoRepository cursoRepository,
			@Autowired AgendaRepository agendaRepository,
			@Autowired ProfessorRepository professorRepository,
			@Autowired ProfessorCursoRepository professorCursoRepository) {
				
		return args -> {
			System.out.println("* INSERIR *");
			Curso c1 = new Curso(null, "Curso de Psicologia", "2000h", "Formar Psicologos", "teste");
			cursoRepository.inserir(c1);

			Curso c2 = new Curso(null, "ADS", "1000h", "FormaR DEVS", "teste");
			cursoRepository.inserir(c2);

			Professor p1 = new Professor(null, "Rafael Moreno", "000.000.000-00", "00000000-0", "rua: joao silva, 545 - Sorocaba/SP", "(15)999999999");
			professorRepository.inserir(p1);

			Professor p2 = new Professor(null, "José da Silva", "000.000.000-00", "00000000-0", "rua: jose silva, 595 - Sorocaba/SP", "(15)999999999");
			professorRepository.inserir(p2);

			System.out.println("* HABILITAR PROFESSOR PARA UM CURSO *");
			ProfessorCurso professorCurso = new ProfessorCurso(null, c1, p2);

			ProfessorCurso professorCurso2 = new ProfessorCurso(null, c2, p2);

		};
	}
	public static void main(String[] args) {
		SpringApplication.run(Aula11Application.class, args);
	}

}
