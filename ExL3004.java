/*
Lista 3
4. Contar Vogais em uma Frase.
Escreva um programa que receba uma frase e utilize um loop para contar quantas vogais (a, e, i, o, u) ela contém.  
*/

import java.util.Scanner;

public class ExL3004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a frase do usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase(); // Converte para minúsculas

        // Variável para armazenar a contagem de vogais
        int contadorDeVogais = 0;

        // Loop para percorrer cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            // Verifica se o caractere é uma vogal
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || 
                caractere == 'o' || caractere == 'u') {
                contadorDeVogais++;
            }
        }

        // Exibe o resultado
        System.out.println("A frase contém " + contadorDeVogais + " vogais.");

        // Fecha o Scanner
        scanner.close();
    }
}
