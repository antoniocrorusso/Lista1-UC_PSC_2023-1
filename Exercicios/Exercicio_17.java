import java.util.Scanner;

/*
 * 17 - Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
 * Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 
 * ou em galões de 3,6 litros, que custam R$ 25,00.
 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
 * a) comprar apenas latas de 18 litros;
 * b) comprar apenas galões de 3,6 litros;
 * c) misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double areaPintar, quantLitros;

        System.out.println("Qual a área em m2 a se pintar? ");
        areaPintar = input.nextDouble();

        quantLitros = areaPintar / 6;

        double quantLatas = Math.ceil(quantLitros / 18);
        double precoTotalLatas = quantLatas * 80;

        System.out.println(String.format(
            """
            Levando somente latas:
            Deverá levar -  %.1f latas.
            Valor total - R$: %.2f
            """, quantLatas, precoTotalLatas)
        );

        double quantGaloes = Math.ceil(quantLitros / 3.6);
        double precoTotalGaloes = quantGaloes * 25.0;

        System.out.println(String.format(
            """
            Levando somente Galoes:
            Deverá levar -  %.1f Galoes.
            Valor total - R$: %.2f
            """, quantGaloes, precoTotalGaloes)
        );

        double sobraLatas = quantLitros % 18f;
        double mixLatas = (quantLitros - sobraLatas) / 18f;
        double mixGaloes = Math.ceil(sobraLatas / 3.6);

        double preçoMix = (mixLatas * 80) + (mixGaloes * 25); 

        System.out.println(String.format(
            """
            Levando um Mix de Latas e Galoes:
            Deverá levar:
            %.1f Latas
            %.1f Galoes.
            Valor total - R$: %.2f
            """, mixLatas, mixGaloes, preçoMix)
        );
        input.close();
    }
}
