/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		String[] nome = new String[3];
		int[] quantidade = new int[3];
		double[] preco = new double[3];
		double faturamento;
		double soma = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<nome.length; i++) {
			System.out.print("Digite o nome do produto: ");
			nome[i] = scan.next();
			System.out.print("Digite a quantidade do produto: ");
			quantidade[i] = Integer.parseInt(scan.next());
			System.out.print("Digite o preço do produto: ");
			preco[i] = Double.parseDouble(scan.next());
			System.out.println("");
		}
		
		for(int i=0; i<nome.length; i++) {
			faturamento = quantidade[i] * preco[i];
			soma += faturamento;
			System.out.println("Mercadoria: "+nome[i]+ " - Faturamento: R$ "+String.format("%.2f",faturamento));			
		}
		
		System.out.println("O faturamento total é R$ "+String.format("%.2f",soma));
	}
}
