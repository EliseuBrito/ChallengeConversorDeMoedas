import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;

        while (true) {
            MenuOpcoes.exibir();
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1 -> Conversor.converter("aud", "brl", leitura);
                case 2 -> Conversor.converter("cny", "brl", leitura);
                case 3 -> Conversor.converter("mxn", "brl", leitura);
                case 4 -> Conversor.converter("brl", "aud", leitura);
                case 5 -> Conversor.converter("brl", "cny", leitura);
                case 6 -> Conversor.converter("brl", "mxn", leitura);
                case 7 -> {
                    System.out.println("Fechando programa.");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }

            System.out.println();
        }
    }
}
