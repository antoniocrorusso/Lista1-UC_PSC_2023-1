// 7 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado (em M)? ");
        double lado = input.nextDouble();

        double area = lado * lado;

        System.out.println("A area do quadrado é: " + area + " e o dobro desta área é: " + (area * 2));
        input.close();
    }
}
