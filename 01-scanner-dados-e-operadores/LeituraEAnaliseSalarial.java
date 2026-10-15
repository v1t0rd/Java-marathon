import java.util.Scanner;

/**
 * Calculadora de Reajuste Salarial.
 * Demonstra o uso de entrada de dados com Scanner, variáveis decimais (double)
 * e cálculo simples de porcentagem.
 */
public class LeituraEAnaliseSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioAtual, percentual, aumento, salarioFinal;

        // Coleta de dados
        System.out.println("Digite seu salário atual: ");
        salarioAtual = input.nextDouble();
        System.out.println("Digite seu percentual de aumento (exemplo: 0,10): ");
        percentual = input.nextDouble();

        // Calculos do valor absoluto do aumento e do salário reajustado
        aumento = salarioAtual * percentual;
        salarioFinal = salarioAtual + aumento;

        // Resumo Do Reajuste
        System.out.println("\n--- RESUMO DO REAJUSTE ---");
        System.out.println("Salário Atual: R$ " + salarioAtual);
        System.out.println("Aumento Concedido: R$ " + aumento);
        System.out.println("Novo Salário Final: R$ " + salarioFinal);

        input.close();
    }
}
