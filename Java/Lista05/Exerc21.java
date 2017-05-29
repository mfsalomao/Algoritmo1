/**
 * 
 */
package Lista05;

import java.util.Scanner;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		int[] vetorX = new int[10];
		int[] vetorY = new int[10];
		int[] vetorSoma = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorX.length; i++) {
			System.out.print("Informe um valor para o primeiro vetor: ");
			vetorX[i] = Integer.parseInt(scan.next());
		}
		
		for(int i=0; i<vetorY.length; i++) {
			System.out.print("Informe um valor para o segundo vetor: ");
			vetorY[i] = Integer.parseInt(scan.next());
		}
		
		for(int i=0; i<vetorSoma.length; i++) {
			vetorSoma[i] = vetorX[i] + vetorY[i];
			System.out.println(vetorSoma[i]);
		}
		
	}

}
