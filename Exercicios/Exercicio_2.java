//2 - Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Forneça um número: ");
        int numero = input.nextInt();
        System.out.println("O número informado foi: " + numero);
        input.close();
    }
}
