/*
Lista 1
11 (Potência de Dois Números )  
Solicite ao usuário a base e o expoente e exiba o resultado da base elevada ao expoente usando a classe Math.
*/

import java.util.Scanner;
import java.lang.Math;
public class Ex011 {
	public static void main(String[] args){

        System.out.println("Digite a base: ");
		Scanner entrada1 = new Scanner(System.in);
		int base = entrada1.nextInt();

        System.out.println("Digite o expoente: ");
		Scanner entrada2 = new Scanner(System.in);
		int expo = entrada2.nextInt();

        System.out.println(Math.pow(base, expo));
	}
}
C:\Users\gabri\OneDrive\Área de Trabalho\Introducao-Java\Ex001.java
