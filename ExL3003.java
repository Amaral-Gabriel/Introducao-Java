/*
Lista 3
3. Verificação de Palíndromo.
Escreva um programa que receba uma palavra e utilize um loop para verificar se ela é um palíndromo. Um palíndromo é uma palavra que permanece a mesma quando lida de trás para frente, como "radar" ou "level". 
*/
import java.util.Scanner;

public class ExL3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        boolean ehPalindromo = true;

        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        scanner.close();
    }
}
