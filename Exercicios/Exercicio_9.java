/*
    Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    C = 5 * ((F-32) / 9).
 */

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tempFahrenheit, tempCelsius;

        System.out.println("Qual a temperatura em Fahrenheit?");
        
        tempFahrenheit = input.nextDouble();

        tempCelsius = 5 * ((tempFahrenheit - 32) / 9);

        System.out.println("Em celsius essa temperatura é " + tempCelsius + " ºC");
        input.close();
    }   
}
