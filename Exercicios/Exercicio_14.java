import java.util.Scanner;

/*
 * 14 -
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
 * João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
 * Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
 * Imprima os dados do programa com as mensagens adequadas.
 */

public class Exercicio_14 {
    public static void main(String[] args) {

        double pesoDaPesca, excesso, multa;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe qual foi o peso da pesca em KG: ");
        pesoDaPesca = input.nextDouble();

        excesso = pesoDaPesca - 50;

        if (excesso <= 0)
        {
            System.out.println("Não houve excesso, logo não há multa a se pagar.");
        } 
        else
        {
            multa = 4 * Math.ceil(excesso);

            System.out.println("O excesso foi de " + excesso + " Kg.");
            System.out.println("Deve pagar uma multa de R$ " + multa);

        }
        input.close();
    }
}
