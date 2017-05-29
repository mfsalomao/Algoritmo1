/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] A = new double[100];
		double soma = 0;
		for (int i =0; i<A.length; i++) {
			System.out.print("Digite um número: ");
			A[i] = Double.parseDouble(scan.next());
			soma += A[i];
		}
		System.out.println("O valor da soma é "+soma);
	}

}
