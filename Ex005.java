/*
Lista 1
05 (Verificação de Par)
Crie um programa que receba um número inteiro e verifique se ele é par, exibindo uma mensagem correspondente.
*/

import java.util.Scanner;
public class Ex005 {
	public static void main(String[] args){

        System.out.println("Digite o número: ");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();

        int resto = num % 2;

        // Está dando erro quando tem mais de 10 digitos
        if (resto == 0){
            System.out.println("Par");
        }   else{
                System.out.println("Ímpar");
        }
	}
}
