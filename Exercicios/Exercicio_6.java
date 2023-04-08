//6 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o raio do círculo (em cm)? ");
        double raio = input.nextDouble();
        double area = Math.PI * (raio * raio);
        System.out.println("A área desse círculo é: " + area + " cm²");
        input.close();
    }
}
