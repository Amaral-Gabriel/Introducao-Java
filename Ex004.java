/*
Lista 1
04 (Área e Perímetro de um Retângulo)
Escreva um programa que solicite ao usuário a largura e a altura de um retângulo, calcule a área e o perímetro e exiba o resultado.
*/

import java.util.Scanner;
public class Ex004 {
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
