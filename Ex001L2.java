/*
Lista 2
1. Verificação de Número Par ou Ímpar
Escreva um programa em Java que receba um número inteiro e determine se ele é par ou ímpar. Utilize uma estrutura condicional para exibir a mensagem "O número é par" ou "O número é ímpar", conforme o caso
*/

import java.util.Scanner;
public class Ex001L2 {
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
