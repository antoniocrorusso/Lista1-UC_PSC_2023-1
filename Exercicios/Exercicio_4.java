//4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, soma, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota3 = input.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota4 = input.nextDouble();

        soma = nota1 + nota2 + nota3 + nota4;

        media = soma / 4;

        System.out.println("A média foi: " + media);
        input.close();
    }
    
}
