package org.example;

public class App {
    public static void main (String[] args) throws Exception {

        String nome = "Eva";
        int idade = 32;
        float peso = 62.222f;
        float valor = 52.56789f;


        System.out.println("Valor é:" + valor);

        System.out.printf("Valor è: R$ %.2f \n", valor); // formatação com duas decimais e real e /n e para quebra a linha
        System.out.printf("Valor è: R$ %.1f \n", valor); // formatação com uma decimal e real
        System.out.printf("Valor è: R$ %.0f \n", valor); // formatação sem aa  decimal e real

        System.out.printf("O nome é %s, e a idade é %d  è o peso é %.1f", nome, idade, peso);

    }

}
