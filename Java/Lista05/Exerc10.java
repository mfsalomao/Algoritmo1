/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		int[] vetor = new int[80];
		int menor;
		int posicao = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número inteiro: ");
			vetor[i] = Integer.parseInt(scan.next());
		}
		
		menor = vetor[0];
		
		for(int i=1; i<vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			}
		}
		
		System.out.println("O menor elemento do vetor é " +vetor[posicao]+ " e sua posição é "+(posicao+1)+".");
	}
}
