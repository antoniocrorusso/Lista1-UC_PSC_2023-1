//3 - Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Forneça o primeiro numero: ");
        double numero1 = input.nextDouble();
        System.out.println("Forneça o segundo numero: ");
        double numero2 = input.nextDouble();
        System.out.println("A soma dos numeros é: " + (numero1 + numero2));
        input.close();
    }
}
