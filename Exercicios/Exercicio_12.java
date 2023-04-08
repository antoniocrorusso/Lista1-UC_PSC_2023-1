// 12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a sua altura (em M)? ");
        double altura = input.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O seu peso ideal é: " + pesoIdeal + " Kg.");
        input.close();
    }
}
