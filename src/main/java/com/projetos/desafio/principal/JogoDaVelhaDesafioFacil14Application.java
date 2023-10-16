package com.projetos.desafio.principal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JogoDaVelhaDesafioFacil14Application implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(JogoDaVelhaDesafioFacil14Application.class, args);}

	@Override
	public void run(String... args) {
		Principal_jogo_multiplayer principal = new Principal_jogo_multiplayer();
		principal.comecaJogo();
	}
}
