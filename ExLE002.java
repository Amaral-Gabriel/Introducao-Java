/*
Lista Extra
02.Verificador de Número Primo
Escreva um programa em Java que determine se um número é primo. Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.  
*/
import java.util.Scanner;

public class ExLE002 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        boolean ePrimo = true;

        if (numero <= 1) {
            ePrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ePrimo = false;
                    break;
                }
            }
        }

        if (ePrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        entrada.close();
    }
}
