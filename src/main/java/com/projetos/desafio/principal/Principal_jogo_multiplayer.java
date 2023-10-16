package com.projetos.desafio.principal;

import com.projetos.desafio.model.Jogador;
import com.projetos.desafio.model.Tabuleiro;

import java.util.Scanner;

public class Principal_jogo_multiplayer {
    Scanner leitura = new Scanner(System.in);
    public void comecaJogo() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        //INICIO, NOME
        System.out.println("""
                JOGO DA VELHA
                
                Digite o nome do primeiro e segundo jogador
                """);
        String resposta = leitura.nextLine();
        jogador1.setNome(resposta);
        jogador1.setLetraEscolhida("X");
        resposta = leitura.nextLine();
        jogador2.setNome(resposta);
        jogador2.setLetraEscolhida("O");


        //INICIO DO JOGO
        System.out.println("""
                
                INICIO DO JOGO
                
                """);
        tabuleiro.mostraTabuleiro();
        tabuleiro.jogadaEAlternacia(jogador1, jogador2);




    }
}
