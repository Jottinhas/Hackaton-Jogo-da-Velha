package org.example;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[]args){
        int valor1,valor2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor 1:");
        valor1 = teclado.nextInt();
        System.out.println("Digite o valor 2:");
        valor2 = teclado.nextInt();

        float resultado = 0;

        try{
           resultado = valor1 / valor2; //isso gera uma execeção
        }catch (Exception e){
            System.err.println("o valor 2 não pode ser zero.");

        }


        System.out.println("O resultado é:" + resultado);


    }

        }
