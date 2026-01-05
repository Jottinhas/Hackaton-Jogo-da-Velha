package org.example;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //DECLARACAO DE VARIAVEL
        String nomeUsuario;
        String nomePai;
        String nomeMae;

        //SAIDA DE DADOS
        System.out.print("Digite o seu nome: ");
        //LEITURA DE DADOS
        nomeUsuario = leitura.nextLine();

        System.out.print(nomeUsuario + ",Digite o nome do seu pai: ");
       nomePai = leitura.nextLine();

        System.out.print("Digite o nome da sua mãe:");
        nomeMae = leitura.nextLine();


    }
    }
