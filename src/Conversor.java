import java.util.Scanner;

public class Conversor {
    public static void converter(String base, String destino, Scanner leitura) {
        ConsultaCotacao consulta = new ConsultaCotacao();

        System.out.println("Digite o valor a ser convertido:");
        float valor = leitura.nextFloat();

        Cotacao resultado = consulta.buscaCotacao(base, destino, valor);

        System.out.println("Moeda base: " + resultado.base_code());
        System.out.println("Moeda destino: " + resultado.target_code());
        System.out.printf("Valor %.2f [%s] equivale a %.2f [%s]%n", valor, resultado.base_code(), resultado.conversion_result(), resultado.target_code());
    }
}
