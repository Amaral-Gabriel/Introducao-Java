/*
Lista 3
2.  Tabuada Completa de 1 a 10.
Crie um programa que utilize loops para imprimir a tabuada completa de multiplicação de 1 a 10.
*/
public class ExL3002 {
    public static void main(String[] args) {
        // Loop para o multiplicador (1 a 10)
        for (int i = 1; i <= 10; i++) {
            // Loop para o multiplicando (1 a 10)
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println(); // Linha em branco para separar as tabuadas
        }
    }
}