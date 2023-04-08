//5 - Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Forneça um número em metros: ");
        double metros = input.nextDouble();
        System.out.println("O seu número em centímetros é: " + (metros * 100));
        input.close();
    }
    
}
