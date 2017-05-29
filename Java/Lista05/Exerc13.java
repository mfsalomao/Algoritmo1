/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[7]; 
		String[] dias = {"Segunda-feira", "Terça-Feira", "Quarta-feira", "Quinta-feira",
				"Sexta-feira", "Sábado","Domingo"};
		double soma = 0;
		double media;
		int acimaMedia = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.print("Digite a temperatura de "+dias[i]+": ");
			temperaturas[i] = Double.parseDouble(scan.next());
			soma += temperaturas[i];
		}
		
		media = soma/(temperaturas.length);
		
		for(int i=0; i<temperaturas.length; i++) {
			if (temperaturas[i] > media) {
				acimaMedia++;
			}
		}
		
		System.out.println("Foram registrados "+acimaMedia+ " dias acima da temperatura média da "
				+ "semana (" +String.format("%.2f", media)+ " graus).");

	}
}
