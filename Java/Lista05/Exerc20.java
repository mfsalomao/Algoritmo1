/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */
import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		
		String[] vetorA = new String[10];
		String[] vetorB = new String[10];
		String[] vetorC = new String[20];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe um valor para o primeiro vetor: ");
			vetorA[i] = scan.next();
		}
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.print("Informe um valor para o segundo vetor: ");
			vetorB[i] = scan.next();
		}
		
		int k=0;
		int j=0;
		while(j<vetorA.length) {			
			vetorC[k] = vetorA[j];
			k=k+2;
			j++;
		}
		
		j=0;
		k=1;		
		while(j<vetorB.length) {			
			vetorC[k] = vetorB[j];
			k=k+2;
			j++;
		}		
	
		for(int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
	}
}
