/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		
		String[] nomes = new String[10];
		String[] telefones = new String[10];
		String procura;
		int posicao = -1;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<nomes.length; i++) {
			System.out.print("Digite um nome: ");
			nomes[i] = scan.next();
			nomes[i] = nomes[i].toUpperCase();
			System.out.print("Digite um telefone: ");
			telefones[i] = scan.next();
		}
		
		System.out.print("Informe um nome para procura na lista de telefones: ");
		procura = scan.next();
		procura = procura.toUpperCase();
		
		for(int i=0; i<nomes.length; i++) {
			if (nomes[i].equals(procura)) {
				posicao = i;
				System.out.println("Nome: "+nomes[posicao]);
				System.out.println("Telefone: "+telefones[posicao]);
			}
		}
		
		if (posicao == -1) {
			System.out.println("O nome não foi encontrado na lista telefônica.");
		}
	}
}
