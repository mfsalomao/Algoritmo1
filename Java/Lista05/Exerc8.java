/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int cont = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe um número inteiro: ");
			vetorA[i] = Integer.parseInt(scan.next());
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if (vetorA[i] == 30) {
				System.out.println("Há um valor igual a 30 na posição "+(i+1)+" do vetor A.");
				cont++;
			}
		}
		
		if(cont == 0) {
			System.out.println("Não há nenhum elemento com valor igual a  30 no vetor A.");
		}
		
	}
}
