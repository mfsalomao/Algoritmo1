/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		String[] vetorA = new String[5];
		String[] vetorB = new String[10];
		String[] vetorC = new String[15];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.print("Informe um valor do vetor A: ");
			vetorA[i] = vetorC[i] = scan.next();
		}
	
		for(int i=0; i < vetorB.length; i++) {
			System.out.print("Informe um valor do vetor B: ");
			vetorB[i] = vetorC[(i+vetorA.length)] = scan.next();
		}
		
		for(int i=0; i< vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
	}
}
