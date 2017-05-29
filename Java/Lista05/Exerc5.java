/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] vetor = new String[10];
		String m;
		int cont=-1;
		
		for (int i=0; i < vetor.length; i++) {
			System.out.print("Digite um elemento do vetor: ");
			vetor[i] = scan.next();
		}
		
		System.out.print("Infome o valor de m: ");
		m = scan.next();
		
		for (int i=0; i < vetor.length; i++) {
			if (m.equals(vetor[i])) {
				cont = i+1;
			}
		}
		
		if (cont != -1) {
			System.out.println("O valor de m é " +m+ " e está na posição " +cont+ " do vetor." );
		}else{
			System.out.println("O valor de m é " +m+ " e não se encontra no vetor.");
		}
		
	}
}
