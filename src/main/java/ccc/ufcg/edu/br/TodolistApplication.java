package ccc.ufcg.edu.br;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ccc.ufcg.edu.br.model.Priority;
import ccc.ufcg.edu.br.model.Task;
import gerenciamento.repo.TarefaRepositorio;

@SpringBootApplication
public class TodolistApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}
	
}
