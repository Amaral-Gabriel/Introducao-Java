/*
Lista 1
06 (Comparação de Números)   
Solicite ao usuário dois números inteiros e exiba se o primeiro é maior, menor ou igual ao segundo usando operadores lógicos.
*/

import java.util.Scanner;
public class Ex006 {
	public static void main(String[] args){

        System.out.println("Digite a largura: ");
		Scanner entrada1 = new Scanner(System.in);
		double largura = entrada1.nextDouble();

        System.out.println("Digite a altura: ");
        Scanner entrada2 = new Scanner(System.in);
        double altura = entrada2.nextDouble();

		double area = altura * largura;
        double perimetro = (altura + largura) * 2;

		System.out.println("ÁREA: "+area);
        System.out.println("PERIMETRO: "+perimetro);
	}
}
