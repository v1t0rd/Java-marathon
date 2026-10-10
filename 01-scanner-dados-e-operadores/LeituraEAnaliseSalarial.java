// Para melhor contexto peço que por favor leia o README.
// Bem vindo ao Exercício Nivel 0
/* Crie um programa que leia o salário atual de um funcionário e a porcentagem de aumento que ele receberá. 
O sistema deve calcular e exibir:
O valor em reais do aumento concedido.
O novo salário final após o reajuste.*/


import java.util.Scanner;

public class LeituraEAnaliseSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioatual, percentual, aumento, salariofinal;

        System.out.println("Digite seu salário atual: ");
        salarioatual = input.nextFloat();
        System.out.println("Digite seu percentual de aumento (exemplo: 0,10): ");
        percentual = input.nextFloat();

        aumento = salarioatual * percentual;

        salariofinal = salarioatual + aumento;
        System.out.println("Seu salário final é " + salariofinal);
    }
}
