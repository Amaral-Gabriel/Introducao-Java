/*
Lista 1
07 (Conversão de Tipos)  
Faça um programa que solicite ao usuário um número double, converta-o para String e exiba o resultado.
*/

import java.util.Scanner;
public class Ex007 {
	public static void main(String[] args){

        System.out.println("Digite um número: ");
		Scanner entrada1 = new Scanner(System.in);
		double num1 = entrada1.nextDouble();

        System.out.println("Número em double: "+num1);

        String str = Double.toString(num1);

        System.out.println("Número em string: "+num1);
	}
}
