package org.example;

import java.util.Scanner;

public class Estudo {
    public static void main(String[] args) {
        Scanner teclado;

        //atribuicao direto na variavel teclado
        teclado = new Scanner(System.in);


        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine(); //NextLine é para ler texto

        String mae;
        System.out.print("Digite o nome da sua mae ");
        mae = teclado.nextLine(); //NextLine é para ler texto

        Integer idade;
        System.out.print("Digite o seu idade: ");
        idade = teclado.nextInt(); //NextLine é para ler texto



        String pai;
        System.out.print("Digite o nome do seu pai: ");
        pai = teclado.nextLine(); //NextLine é para ler texto



        // + --> concatenar
        System.out.println("Nome: " + nome);
        System.out.println("nome da mãe: " + mae);
        System.out.println("nome da idade: " + idade);
        System.out.println("nome da pai: " + pai);



    }
}
