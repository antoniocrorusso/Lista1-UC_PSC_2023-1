import java.util.Scanner;

/*
 * 16 - Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
 * Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double areaPintar, quantLitros, quantLatas, precoTotal;

        System.out.println("Qual a área em m2 a se pintar? ");
        areaPintar = input.nextDouble();

        quantLitros = areaPintar / 3;

        quantLatas = Math.ceil(quantLitros / 18);

        precoTotal = quantLatas * 80;

        System.out.println("Serao necessários " + quantLatas + " latas");
        System.out.println("O preço total é R$ " + precoTotal);
        input.close();
    }
}
