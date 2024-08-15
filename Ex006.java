/*
Lista 1
06 (Comparação de Números)   
Solicite ao usuário dois números inteiros e exiba se o primeiro é maior, menor ou igual ao segundo usando operadores lógicos.
*/

import java.util.Scanner;
public class Ex006 {
	public static void main(String[] args){

        System.out.println("Digite o primeiro número: ");
		Scanner entrada1 = new Scanner(System.in);
		int num1 = entrada1.nextInt();

        System.out.println("Digite o segundo número: ");
        Scanner entrada2 = new Scanner(System.in);
        int num2 = entrada2.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número é maior!");
        }   else if(num1 < num2){
                System.out.println("O primeiro número é menor!");
        }   else{
                System.out.println("Os dois números são iguais.");
        }
	}
}
