/*02 (Calculadora)   

Escreva um programa que solicite ao usuário dois números inteiros, e realize as operações de soma, subtração, divisão e multiplicação. Ao final, exiba o resultado
*/

import java.util.Scanner;
public class Ex002 {
	public static void main(String[] args){
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		int num1 = entrada1.nextInt();
		int num2 = entrada2.nextInt();

		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
	}
}
