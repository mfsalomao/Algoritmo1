/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc7 {
	
	public static void main(String[] args) {
		
		double[] vetor = new double[12];
		int x,y;
		double soma;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetor.length; i++){
			System.out.print("Informe um valor: ");
			vetor[i] = Double.parseDouble(scan.next());
		}
		
		System.out.print("Informe a posição X do vetor: ");
		x = Integer.parseInt(scan.next());
		
		System.out.print("Informe a posição Y do vetor: ");
		y = Integer.parseInt(scan.next());
		
		soma = vetor[x-1] + vetor[y-1];
		
		System.out.println("A soma do vetor correspondente às posições X e Y é "+soma);

	}

}
