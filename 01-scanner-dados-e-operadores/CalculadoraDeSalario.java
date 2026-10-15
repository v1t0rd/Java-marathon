import java.util.Scanner;
/**
 * Calculadora de Salário Líquido.
 * Demonstração de uso da classe Scanner, variáveis primitivas
 * e precedência de operadores aritméticos em Java.
 */

public class CalculadoraDeSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario,desconto,porcentagem;
        double bonusDeMeta = 500;
        String nome = " ";


        System.out.println("Digite o nome do funcionário.");
        nome = input.nextLine();
        System.out.println("Olá " + nome + "!");

        System.out.println("Agora preciso que você digite seu salário bruto");
        salario = input.nextDouble();

        System.out.println("Digite a porcentagem do desconto (digite apenas o número");
        porcentagem = input.nextDouble();

        desconto = porcentagem/100;
        double salarioLiquido = salario - (salario * desconto) + bonusDeMeta;

        System.out.println("\n--- RESUMO DO CONTRACHEQUE ---");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("Desconto: " + porcentagem + "% (R$ " + (salario * desconto) + ")");
        System.out.println("Bônus de Meta: R$ " + bonusDeMeta);
        System.out.println("Salário Líquido Final: R$ " + salarioLiquido);

        input.close();
    }
}
