/*
Lista 1
09 (Conversão de String para Maiúsculas)  
Solicite ao usuário uma string e mostre a string em maiúsculas.
*/

import java.util.Scanner;
public class Ex009 {
	public static void main(String[] args){

        System.out.println("Digite a palavra: ");
		Scanner entrada1 = new Scanner(System.in);
		String palavra = entrada1.nextLine();

		System.out.println(palavra.toUpperCase());
	}
}
