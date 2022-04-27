package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação <br /> Persistência <br /> Mentalidade de Crescimento <br /> Proatividade <br /> Responsabilidade Pessoal <br /> Atenção aos Detalhes <br /> Trabalho em Equipe <br /> Orientação ao Futuro";
	}

	@GetMapping("/objetivo")
	public String objetivo() {
		return "<b /> Objetivos da Semana <br /> Aprender mais sobre MySQL <br /> Aprender Spring <br /> Inserir os registros no DB do Projeto <br />";
	}
}
