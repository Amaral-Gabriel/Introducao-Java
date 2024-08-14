/*
Lista 1
01 (Casting)  
Faça um programa que solicite ao usuário um número decimal, converta-o para inteiro e exiba o resultado.
*/

import java.util.Scanner;
public class Ex001 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		double decimal = entrada.nextDouble();

		int inteiro = (int) decimal;

		System.out.println(inteiro);
	}
}