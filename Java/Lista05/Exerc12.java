/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[100];
		double[] vetorB = new double[100];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe um número inteiro par: ");
			vetorA[i] = Integer.parseInt(scan.next());
			if (vetorA[i] % 2 != 0) { // Se o número for ímpar, decrementa i em 1 unidade.
				i--;
			}
		}
		
		for(int i=0; i<vetorA.length; i++) {
			vetorB[i] = Math.pow(vetorA[i],3);
			System.out.println(vetorB[i]);
		}
	}
}