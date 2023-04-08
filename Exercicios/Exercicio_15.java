import java.util.Scanner;

/*
 * 15 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
 * faça um programa que nos dê:
 * a) salário bruto.
 * b) quanto pagou ao INSS.
 * c) quanto pagou ao sindicato.
 * d) o salário líquido.
 * e) calcule os descontos e o salário líquido, conforme a tabela abaixo:
 *      + Salário Bruto : R$
 *      - IR (11%) : R$
 *      - INSS (8%) : R$
 *      - Sindicato ( 5%) : R$
 *      = Salário Liquido : R$
 * Obs.: Salário Bruto - Descontos = Salário Líquido.
 */


public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos reais você ganha por hora? ");
        double dinheiroHora = input.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês? ");
        double horasTrabalhadas = input.nextDouble();

        double salarioBruto = dinheiroHora * horasTrabalhadas;

        System.out.println("O seu salário bruto no mês é R$ " + salarioBruto);

        double descIR = salarioBruto * (8 / 100f);
        
        double descINSS = salarioBruto * (11 / 100f);

        double descSindicato = salarioBruto * (5 / 100f);

        double salarioLiquido = salarioBruto - descINSS - descIR - descSindicato;

        System.out.println("O seu desconto do INSS no mês foi R$ " + descINSS);
        System.out.println("O seu desconto do IR no mês foi R$ " + descIR);
        System.out.println("O seu desconto do Sindicato no mês foi R$ " + descSindicato);
        System.out.println("O seu Salário líquido no mês foi de R$ " + salarioLiquido);

        String tabela = String.format(
            """
            + Salário Bruto : R$ %1$.2f
            - IR (11%%) : R$ $%2$.2f
            - INSS (8%%) : R$ $%3$.2f
            - Sindicato ( 5%%) : R$ $%4$.2f
            = Salário Liquido : R$ $%5$.2f
            """, salarioBruto, descIR, descINSS, descSindicato, salarioLiquido);

        System.out.println(tabela);

        input.close();
    }
}
