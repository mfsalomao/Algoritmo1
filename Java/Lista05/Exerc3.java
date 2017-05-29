/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[20];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número inteiro: ");
			vetor[i] = Integer.parseInt(scan.next());
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.println(vetor[i]);
			}
		}
		
	}

}
