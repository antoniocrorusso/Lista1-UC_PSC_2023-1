/*
 * 13 - Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * a) Para homens: (72.7*h) - 58
 * b) Para mulheres: (62.1*h) - 44.7
 */

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o gênero que você se identifica? \nDigite o número correspondente: \n1 - Masculino \n2 - Feminino");
        int genero = input.nextInt();

        System.out.println("Qual a sua altura (em M)? ");
        double altura = input.nextDouble();

        double pesoIdeal;

        if(genero == 1)
        {
            pesoIdeal = (72.7 * altura) - 58;
        } 
        else
        {
            pesoIdeal = (62.1 * altura) - 44.7;
        }


        System.out.println("O seu peso ideal é: " + pesoIdeal + " Kg.");
        input.close();
    }
}
