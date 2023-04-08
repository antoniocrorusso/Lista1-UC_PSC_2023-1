/*
    10 -  Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.  
 */

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tempFahrenheit, tempCelsius;

        System.out.println("Qual a temperatura em Celcius?");
        
        tempCelsius = input.nextDouble();

        tempFahrenheit = (9 * tempCelsius) / 5 + 32;

        System.out.println("Em Fahrenheit essa temperatura é " + tempFahrenheit + " ºF");
        input.close();
    }
}
