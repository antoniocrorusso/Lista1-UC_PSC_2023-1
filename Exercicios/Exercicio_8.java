// 8 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos reais você ganha por hora? ");
        double dinheiroHora = input.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês? ");
        double horasTrabalhadas = input.nextDouble();

        System.out.println("O seu salário no mês é R$ " + dinheiroHora * horasTrabalhadas);
        input.close();
    }
}
