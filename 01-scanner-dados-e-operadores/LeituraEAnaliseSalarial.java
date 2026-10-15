/**
 * Calculadora de Reajuste Salarial.
 * Demonstra o uso de entrada de dados com Scanner, variáveis decimais (double)
 * e cálculo simples de porcentagem.
 */


import java.util.Scanner;

public class LeituraEAnaliseSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioatual, percentual, aumento, salariofinal;
       
        // Coleta de dados
        System.out.println("Digite seu salário atual: ");
        salarioatual = input.nextDouble();
        System.out.println("Digite seu percentual de aumento (exemplo: 0,10): ");
        percentual = input.nextDouble();
        
        // Calculos do valor absoluto do aumento e do salário reajustado
        aumento = salarioatual * percentual;
        salariofinal = salarioatual + aumento;
       
        // Resumo Do Reajuste
        System.out.println("\n--- RESUMO DO REAJUSTE ---");
        System.out.println("Salário Atual: R$ " + salarioatual);
        System.out.println("Aumento Concedido: R$ " + aumento);
        System.out.println("Novo Salário Final: R$ " + salariofinal);
    }
}
