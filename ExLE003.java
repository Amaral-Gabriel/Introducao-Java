import java.util.Scanner;

public class ExLE003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o comprimento do lado 2: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o comprimento do lado 3: ");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        scanner.close();
    }
}
