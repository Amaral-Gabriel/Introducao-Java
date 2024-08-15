/*
Lista 1
10 (Raiz Quadrada de um Número)  
Solicite ao usuário um número e exiba a raiz quadrada desse número usando a classe Math
*/

import java.util.Scanner;
import java.lang.Math;
public class Ex010 {
	public static void main(String[] args){

        System.out.println("Digite um número inteiro: ");
		Scanner entrada1 = new Scanner(System.in);
		int num = entrada1.nextInt();

        System.out.println(Math.sqrt(num));
	}
}
