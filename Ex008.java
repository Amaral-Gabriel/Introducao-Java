/*
Lista 1
08 (Substituição de Caracteres em uma String)  
Solicite ao usuário uma string e um caractere para substituir e exiba a string resultante com todas as ocorrências do caractere substituídas por outro caractere.
*/

import java.util.Scanner;
public class Ex008 {
	public static void main(String[] args){

        System.out.println("Digite a palavra: ");
		Scanner entrada1 = new Scanner(System.in);
		String palavra = entrada1.nextLine();
        
        System.out.println("Digite uma letra para ser substituida: ");
		Scanner entrada2 = new Scanner(System.in);
		char letra = entrada2.next().charAt(0);

		System.out.println("Digite uma letra para ser colocada no lugar de outra: ");
		Scanner entrada3 = new Scanner(System.in);
		char cara = entrada3.next().charAt(0);


        System.out.println(palavra.replace(letra, cara));

		int cont = 0;

		for (int i=0;i<palavra.length();i++){
			if(palavra.charAt(i) == letra){
				cont++;
			}
		}
		System.out.println(cont+" ocorrências.");
	}
}
