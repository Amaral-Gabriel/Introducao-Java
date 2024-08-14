/*
Lista 1
03 (Média de três números decimais)  
Escreva um programa  que receba três números decimais do usuário, calcule a média e exiba o resultado. 
*/

import java.util.Scanner;
public class Ex003 {
	public static void main(String[] args){

        System.out.println("Digite o primeiro número: ");
		Scanner entrada1 = new Scanner(System.in);
		double num1 = entrada1.nextDouble();

        System.out.println("Digite o segundo número: ");
        Scanner entrada2 = new Scanner(System.in);
        double num2 = entrada2.nextDouble();

        System.out.println("Digite o terceiro número: ");
        Scanner entrada3 = new Scanner(System.in);
        double num3 = entrada3.nextDouble();

		double media = (num1 + num2 + num3) / 3;

		System.out.println(media);
	}
}
