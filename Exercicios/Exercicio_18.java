import java.util.Scanner;

/*
 * 18 - Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
 * calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo (Em Mega Bytes)? ");
        double tamArquivo = input.nextDouble();

        System.out.println("Qual a velocidade da Internet (Em Megabits por Segundo)? ");
        double velocidadeMbits = input.nextDouble();

        double velocidadeMbyte = velocidadeMbits / 8; // 1 byte = 8 bits

        double tempoSegundos = tamArquivo / velocidadeMbyte;
        
        double segundosResto = tempoSegundos % 60;
        double minutos = (tempoSegundos - segundosResto) / 60;
        double tempoTotal = minutos + (segundosResto / 100);

        System.out.printf("O tempo de dowload sera de: %.1f min", tempoTotal);
        input.close();
    }   
}
