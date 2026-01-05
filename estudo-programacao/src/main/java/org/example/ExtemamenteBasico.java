package org.example;

import java.util.Scanner;

public class ExtemamenteBasico {
    public static void main(String[] args){
        Scanner teclado;

        int  A, B;
        int X ;

        //atribuicao direta na variavel teclado
        teclado = new Scanner(System.in);


        //DADOS DE SAIDA
        //leia 2 valores inteiros
        //armazene-os nas variaveis A E B


        System.out.print("Digite o valor da variavel A: ");
         A = teclado.nextInt();//nextInt é para ler numeros

        System.out.print("Digite o valor da variavel B: ");
        B = teclado.nextInt();//nextInt é para ler numeros

        //atribuicao de dados
        X = A + B;


        //Efetue a soma de A e B atribuindo o seu resultado na variável X
        System.out.println("X = " + X);



    }

}


