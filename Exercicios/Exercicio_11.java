/*
 * 11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
 *  a) o produto do dobro do primeiro com metade do segundo .
 *  b) a soma do triplo do primeiro com o terceiro.
 *  c) o terceiro elevado ao cubo.
 */

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        
        int numeroInt1, numeroInt2;
        double numeroReal;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Forneca o primeiro numero inteiro: ");
        numeroInt1 = input.nextInt();
        System.out.println("Forneca o segundo numero inteiro: ");
        numeroInt2 = input.nextInt();
        System.out.println("Agora, forneca o numero real: ");
        numeroReal = input.nextDouble();

        double letraA = (numeroInt1 * 2) * (numeroInt2 / 2);
        System.out.println("O produto do dobro do primeiro com metado do segundo é: " + letraA);

        double letraB = (numeroInt1 * 3) + (numeroReal);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + letraB);

        double letraC = Math.pow(numeroReal, 3);
        System.out.println("O terceiro levado ao cubo é: " + letraC);

        input.close();
    }
}
