package com.projetos.desafio.model;

import java.util.*;

public class Tabuleiro {
    private final ArrayList<String> tabela = new ArrayList<>();
    public List<List<String>> listaDeCombinacoesParaGanhar = new ArrayList<>();
    public List<String> listaDePosicoesJaEscolhidas = new ArrayList<>();

    public Tabuleiro(){
        for (int i = 0; i < 8; i++) {
            List<String> lista = new ArrayList<>();
            listaDeCombinacoesParaGanhar.add(lista);
        }
        Collections.addAll(listaDeCombinacoesParaGanhar.get(0),"1", "2", "3");
        Collections.addAll(listaDeCombinacoesParaGanhar.get(1),"4", "5", "6");
        Collections.addAll(listaDeCombinacoesParaGanhar.get(2),"7", "8", "9");
        Collections.addAll(listaDeCombinacoesParaGanhar.get(3),"1", "4", "7");
        Collections.addAll(listaDeCombinacoesParaGanhar.get(4),"2", "5", "8");
        Collections.addAll(listaDeCombinacoesParaGanhar.get(5),"3", "6", "9");
        Collections.addAll(listaDeCombinacoesParaGanhar.get(6),"1", "5", "9");
        Collections.addAll(listaDeCombinacoesParaGanhar.get(7),"3", "5", "7");

    }

    public void mostraTabuleiro(){
        //MOSTRA A TABULEIRO ULTILIZANDO ESSE ARRAY
        int nRef = 1;
        int ref= 0;
        for (int i = 0; i < 9; i++) {
            tabela.add(String.valueOf(nRef));
            System.out.print("\u001b[37m" + tabela.get(i) + "\u001b[m");
            System.out.print("|");
            nRef++;
            ref++;
            if (ref == 3){
                System.out.println();
                ref = 0;
            }
        }
    }

    public void pegarPosicao(String posicao) {
        for (int i = 0; i < tabela.toArray().length; i++) {
            if (Objects.equals(posicao, tabela.get(i))){
                System.out.println(tabela.get(i));
            }

        }
    }

    public String trocarPosicao(String letraJogador, String stringARetirar) {
        String posicaoARetornar = null;
        for (int i = 0; i < tabela.toArray().length; i++) {
            if (Objects.equals(stringARetirar, tabela.get(i))){
                posicaoARetornar =  tabela.get(i);
                tabela.set(i, letraJogador);
            }
        }
        mostraTabuleiro();
        return posicaoARetornar;
    }

    public void jogadaEAlternacia(Jogador jogador1, Jogador jogador2){
        Jogador jogadorAJogar;

        boolean alguemGanhou = false;
        boolean trocou = false;
        while (!alguemGanhou) {
            Scanner leitura = new Scanner(System.in);

            if (!trocou) {
                jogadorAJogar = jogador1;
                trocou = true;
            } else {
                jogadorAJogar = jogador2;
                trocou = false;
            }

            System.out.println("Escolha uma posicao " + jogadorAJogar.getNome());
            int resposta = leitura.nextInt();
            String respostaString = String.valueOf(resposta);

            if (resposta > 9 || resposta < 1 || listaDePosicoesJaEscolhidas.contains(respostaString)) {
                System.out.println("Posicao nao existe ou ja escolhida");
                if (jogadorAJogar == jogador1) {
                    trocou = false;
                } else if (jogadorAJogar == jogador2) {
                    trocou = true;
                }
            } else {

                //Adiciona na lista de posicoes jogadas do jogador a string abaixo
                jogadorAJogar.adicionarPosicaoAlista(trocarPosicao(jogadorAJogar.getLetraEscolhida(), respostaString));
                listaDePosicoesJaEscolhidas.add(respostaString);

                //verifica se o a lista de posicoes jogadas bate com a lista de combinacoes
                for (int i = 0; i < listaDeCombinacoesParaGanhar.size(); i++) {
                    for (int j = 0; j < listaDeCombinacoesParaGanhar.get(i).size(); j++) {
                        if (jogadorAJogar.getListaDePosicoesJogadas().containsAll(listaDeCombinacoesParaGanhar.get(i))) {
                            System.out.println(jogadorAJogar.getNome() + " ganhou o jogo");
                            alguemGanhou = true;
                            break;
                        }
                    }
                }
            }
        }
    }
}