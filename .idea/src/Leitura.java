import java.util.Scanner;

public class Leitura {
    static Scanner teclado = new Scanner(System.in);
    static void limparBuffer() {
        if (teclado.hasNextLine()) {
            teclado.nextLine();
        }
    }
    // ---------- TIPOS NUMÉRICOS ----------

    static int lerValorInteiro(String mensagem) {
        int valor = 0;
        boolean ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            valor = teclado.nextInt();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        } while (ErroLeitura);
        return valor;
    }

    static float lerValorFloat(String mensagem) {
        float valor = 0;
        boolean ErroLeitura = true;
        do{
        try {
            System.out.print(mensagem);
            valor = teclado.nextFloat();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        } while (ErroLeitura);
        return valor;
    }

    static double lerValorDouble(String mensagem) {
        double valor = 0;
        boolean ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            valor = teclado.nextDouble();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        } while (ErroLeitura);
        return valor;
    }

    static long lerValorLong(String mensagem) {
        long valor = 0;
        boolean ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            valor = teclado.nextLong();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        } while (ErroLeitura);
        return valor;
    }

    static short lerValorShort(String mensagem) {
        short valor = 0;
        boolean ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            valor = teclado.nextShort();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        } while (ErroLeitura);
        return valor;
    }

    static byte lerValorByte(String mensagem) {
        byte valor = 0;
        boolean ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            valor = teclado.nextByte();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        } while (ErroLeitura);
        return valor;
    }

    // ---------- TIPOS TEXTUAIS ----------

    static String lerValorString(String mensagem) {
        String valor = "";
        boolean ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            valor = teclado.nextLine();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        }
        } while (ErroLeitura);
        return valor;
    }

    static char lerValorChar(String mensagem) {
        char valor = '\0';
        boolean ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            String entrada = teclado.nextLine();
            ErroLeitura = false;
            if (entrada.length() > 0) {
                valor = entrada.charAt(0);
            }
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        }
        } while (ErroLeitura);
        return valor;
    }

    // ---------- TIPOS LÓGICOS ----------

    static boolean lerValorBoolean(String mensagem) {
        boolean valor = false,ErroLeitura = true;
        do {
        try {
            System.out.print(mensagem);
            valor = teclado.nextBoolean();
            ErroLeitura = false;
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto. Digite true ou false.");
        } finally {
            limparBuffer();
        }
        } while (ErroLeitura);
        return valor;
    }
}
