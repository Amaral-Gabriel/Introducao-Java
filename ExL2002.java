/*
Lista 2
2. Classificação de Nota
Escreva um programa em Java que receba uma nota de 0 a 100 e utilize estruturas condicionais para classificar a nota nas seguintes categorias:
a. "Aprovado com Distinção" (nota ≥ 90)
b. "Aprovado" (nota ≥ 60 e < 90)
c. "Reprovado" (nota < 60)
*/

import java.util.Scanner;
public class ExL2002 {
    public static void main(String[] args){

        System.out.print("Digite a nota: ");
        Scanner entrada = new Scanner(System.in);
        int nota = entrada.nextInt();


        if (nota >= 90){
            System.out.println("Aprovado com Distinção");
        }   else if(nota >= 60 && nota < 90){
            System.out.println("Aprovado");
        }   else {
            System.out.println("Reprovado");
        }

    }
}
