/*
Lista Extra
01. Calculadora de  Índice de Massa Corporal (IMC)
Escreva um programa em Java que calcule o Índice de Massa Corporal (IMC) de uma pessoa e exiba a categoria correspondente de acordo com o valor do IMC. A fórmula para calcular o IMC é:
Abaixo de 18.5: Abaixo do peso
Entre 18.5 e 24.9: Peso normal
Entre 25.0 e 29.9: Sobrepeso
30.0 ou acima: Obesidade
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExLE001 {
    public static void main(String[] args){

        System.out.print("Seu peso: ");
        Scanner entradaPeso = new Scanner(System.in);
        double peso = entradaPeso.nextDouble();

        System.out.print("Sua altura: ");
        Scanner entrada2 = new Scanner(System.in);
        double alt = entrada2.nextDouble();

        double imc = peso / (alt*alt);

        DecimalFormat d = new DecimalFormat("###,###.###");

        if (imc < 18.5){
            System.out.println("Seu IMC: "+d.format(imc)+". Você está abaixo do peso.");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu IMC: "+d.format(imc)+". Seu peso está normal.");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Seu IMC: "+d.format(imc)+". Você está com sobrepeso.");
        } else if(imc >= 30){
            System.out.println("Seu IMC: "+d.format(imc)+". Você está com obesidade.");
        }

    }
}