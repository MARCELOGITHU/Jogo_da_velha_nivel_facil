package com.projetos.desafio.teste;

import com.projetos.desafio.model.Jogador;
import com.projetos.desafio.model.Tabuleiro;

import java.util.Arrays;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new Jogador();
        jogador1.setNome("lima");
        jogador1.setLetraEscolhida("X");

        Jogador jogador2 = new Jogador();
        jogador2.setNome("santos");
        jogador2.setLetraEscolhida("O");

//        System.out.println(tabuleiro.listaDePosicoesJaEscolhidas);

        System.out.println("\u001b[37mteste de texto\u001b[m");


    }
}
