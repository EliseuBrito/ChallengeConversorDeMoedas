import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;

        while (true) {
            MenuOpcoes.exibir();
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1 -> Conversor.converter("usd", "brl", leitura);
                case 2 -> Conversor.converter("eur", "brl", leitura);
                case 3 -> Conversor.converter("gbp", "brl", leitura);
                case 4 -> Conversor.converter("brl", "usd", leitura);
                case 5 -> Conversor.converter("brl", "eur", leitura);
                case 6 -> Conversor.converter("brl", "gbp", leitura);
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
