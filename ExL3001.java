/*
Lista 3
1.  Imprimir Números Pares em Ordem Decrescente.
Escreva um programa que utilize um loop para imprimir todos os números pares de 100 a 0 em ordem decrescente.
*/
public class ExL3001 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}