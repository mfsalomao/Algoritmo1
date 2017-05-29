/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		
		String[] vetor = new String[80];
		Scanner scan = new Scanner(System.in);
		int cont=0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite uma letra: ");
			vetor[i] = scan.next();
			vetor[i] = vetor[i].toUpperCase();
		}
		
		for(int i=0; i<vetor.length; i++) {
			if (vetor[i].equals("A")) {
				cont++;
			}
		}
		
		if (cont!=0) {
			System.out.println("A letra A aparece "+cont+ " vezes no vetor.");
		} else {
			System.out.println("A letra A não aparece no vetor.");
		}

	}

}
