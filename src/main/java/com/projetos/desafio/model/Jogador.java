package com.projetos.desafio.model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private String letraEscolhida;
    private int pontuacao;

    private List<String> listaDePosicoesJogadas = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLetraEscolhida() {
        return letraEscolhida;
    }

    public void setLetraEscolhida(String letraEscolhida) {
        this.letraEscolhida = "\u001b[97m" + letraEscolhida + "\u001b[m";
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public List<String> getListaDePosicoesJogadas() {
        return listaDePosicoesJogadas;
    }

    public void adicionarPosicaoAlista(String posicao) {
        listaDePosicoesJogadas.add(posicao);
    }
}
