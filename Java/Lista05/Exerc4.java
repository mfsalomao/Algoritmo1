/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] vetor = new String[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor: ");
			vetor[i] = scan.next();
		}
		
		for (int i = (vetor.length-1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
	}
}
