import java.util.Random;
import java.util.Scanner;

public class Program {

    static Scanner teclado = new Scanner(System.in);
    static Random random = new Random();

    static char[][] tabuleiro = new char[3][3];
    static final char[] CARACTERES_IDENTIFICADORES_ACEITOS = {'X', 'O'};

    public static void main(String[] args) {

        inicializarTabuleiro();

        char caractereUsuario = obterCaractereUsuario();
        char caractereComputador = obterCaractereComputador(caractereUsuario);

        boolean vezUsuarioJogar = sortearValorBooleano();

        while (true) {

            limparTela();
            exibirTabuleiro();

            if (vezUsuarioJogar) {
                processarVezUsuario(caractereUsuario);
                if (teveGanhador(caractereUsuario)) {
                    limparTela();
                    exibirTabuleiro();
                    exibirVitoriaUsuario();
                    break;
                }
            } else {
                processarVezComputador(caractereComputador, caractereUsuario);
                if (teveGanhador(caractereComputador)) {
                    limparTela();
                    exibirTabuleiro();
                    exibirVitoriaComputador();
                    break;
                }
            }

            if (teveEmpate()) {
                limparTela();
                exibirTabuleiro();
                exibirEmpate();
                break;
            }

            vezUsuarioJogar = !vezUsuarioJogar;
        }
    }

    static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    static boolean sortearValorBooleano() {
        return random.nextBoolean();
    }

    static char obterCaractereUsuario() {
        char caractere;
        while (true) {
            System.out.print("Escolha X ou O: ");
            caractere = teclado.nextLine().toUpperCase().charAt(0);
            if (caractere == 'X' || caractere == 'O') {
                return caractere;
            }
            System.out.println("Caractere inválido.");
        }
    }

    static char obterCaractereComputador(char caractereUsuario) {
        return caractereUsuario == 'X' ? 'O' : 'X';
    }

    static boolean jogadaValida(int linha, int coluna) {
        return linha >= 0 && linha < 3 &&
                coluna >= 0 && coluna < 3 &&
                tabuleiro[linha][coluna] == ' ';
    }

static int[] obterJogadaUsuario() {
    int linha, coluna;

    while (true) {
        System.out.print("Informe a jogada (linha||coluna): ");
        String entrada = teclado.nextLine();
        String[] partes = entrada.split(" ");

        if (partes.length != 2) {
            System.out.println("Formato inválido. Use: linha||coluna");
            continue;
        }

        try {
            linha = Integer.parseInt(partes[0]) - 1;
            coluna = Integer.parseInt(partes[1]) - 1;

            if (jogadaValida(linha, coluna)) {
                return new int[]{linha, coluna};
            } else {
                System.out.println("Jogada inválida, posição ocupada ou fora do tabuleiro.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Digite apenas números.");
        }
    }
}


    static int[] obterJogadaComputador() {
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (!jogadaValida(linha, coluna));

        return new int[]{linha, coluna};
    }

    static void processarVezUsuario(char caractereUsuario) {
        int[] jogada = obterJogadaUsuario();
        atualizaTabuleiro(jogada, caractereUsuario);
    }

    static void processarVezComputador(char caractereComputador, char caractereUsuario) {
    if (bloquearJogador(caractereUsuario, caractereComputador)) {
        return;
    }

    int[] jogada = obterJogadaComputador();
    atualizaTabuleiro(jogada, caractereComputador);
}


    static void atualizaTabuleiro(int[] jogada, char caractere) {
        tabuleiro[jogada[0]][jogada[1]] = caractere;
    }

    static boolean teveGanhador(char c) {
        return teveGanhadorLinha(c) ||
                teveGanhadorColuna(c) ||
                teveGanhadorDiagonalPrincipal(c) ||
                teveGanhadorDiagonalSecundaria(c);
    }

    static boolean teveGanhadorLinha(char c) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == c &&
                    tabuleiro[i][1] == c &&
                    tabuleiro[i][2] == c) {
                return true;
            }
        }
        return false;
    }

    static boolean teveGanhadorColuna(char c) {
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == c &&
                    tabuleiro[1][j] == c &&
                    tabuleiro[2][j] == c) {
                return true;
            }
        }
        return false;
    }

    static boolean teveGanhadorDiagonalPrincipal(char c) {
        return tabuleiro[0][0] == c &&
                tabuleiro[1][1] == c &&
                tabuleiro[2][2] == c;
    }

    static boolean teveGanhadorDiagonalSecundaria(char c) {
        return tabuleiro[0][2] == c &&
                tabuleiro[1][1] == c &&
                tabuleiro[2][0] == c;
    }

    static boolean teveEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean bloquearJogador(char caractereUsuario, char caractereComputador) {

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

            if (tabuleiro[i][j] == ' ') {
                tabuleiro[i][j] = caractereUsuario;
                if (teveGanhador(caractereUsuario)) {
                    tabuleiro[i][j] = caractereComputador;
                    return true;
                }
                tabuleiro[i][j] = ' ';
            }
        }
    }

    return false;
}

    static void limparTela() {
        System.out.println("\n\n\n\n\n\n");
    }

    static void exibirTabuleiro() {
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " +
                    tabuleiro[i][0] + " | " +
                    tabuleiro[i][1] + " | " +
                    tabuleiro[i][2]);
            if (i < 2) System.out.println(" ---+---+---");
        }
    }

    static void exibirVitoriaUsuario() {
        System.out.println( "  _  |       |  _\n" + //
                " ( \\ | VENCI | / )\n" + //
                "  \\ \\|_______|  / \n" + //
                "   \\           /\n" + //
                "    \\         /\n" );
    }

    static void exibirVitoriaComputador() {
        System.out.println("   _____________________\n" + //
                "  |  _________________  |\n" + //
                "  | |                 | |\n" + //
                "  | |    COMPUTADOR   | |\n" + //
                "  | |      VENCEU     | |\n" + //
                "  | |_________________| |\n" + //
                "  |_____________________|\n" + //);
                "    ________| |_______\n" + //
                "   |__________________|\n" + //
                "");
    }

    static void exibirEmpate() {
        System.out.println("       ___\n" + //
                "      /     \\\n" + //
                "     |  -_-  |  <-- \"Ninguém ganhou desta vez!\"\n" + //
                "      \\  V  /\n" + //
                "      --| |--\n" + //
                "     /  |  \\\n" + //
                "");
    }
}
