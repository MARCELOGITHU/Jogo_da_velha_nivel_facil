package com.projetos.desafio.teste;

public class TesteEstudoArray {
    public static void main(String[] args) {
        int[][] tabela;
        tabela = new int[3][3];



                //MOSTRA A TABULEIRO ULTILIZANDO ESSE ARRAY
        for (int i = 0; i < tabela.length; i++) {
            int ref= 0;
            for (int j = 0; j < tabela.length; j++) {
                    System.out.print(tabela[i][j] + " | ");
                    ref++;
                if (ref == 3){
                    System.out.println();
                }
            }
        }
    }
}
