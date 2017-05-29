/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		int[] vetorModificado = new int[20];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um valor inteiro: ");
			vetor[i] = Integer.parseInt(scan.next());
		}
		
		for(int i=0; i<vetor.length; i++) {
			vetorModificado[i] = vetor[(vetor.length-1)-i];
		}
		
		for(int i=0; i<vetorModificado.length; i++) {
			System.out.println(vetorModificado[i]);
		}
	}
}
