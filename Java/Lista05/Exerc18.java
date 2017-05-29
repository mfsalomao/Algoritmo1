/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		double[] vetorB = new double[10];
		int cont = 1;
		double fatorial = 1;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Digite um número inteiro positivo: ");
			vetorA[i] = Integer.parseInt(scan.next());
		}
		
		for(int i=0; i<vetorB.length; i++) {
			while (cont <= vetorA[i]) {
				fatorial *= vetorA[i];
				cont++;
			}
			vetorB[i] = fatorial;
			System.out.println("Número: "+vetorA[i]+ " - Fatorial: "+vetorB[i]);
		}
	}
}
