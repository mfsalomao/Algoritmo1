/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		String[] alunos = new String[50];
		int cont = alunos.length;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<cont; i++) {
			System.out.print("Digite o nome de um aluno: ");
			alunos[i] = scan.next();
			if ( alunos[i].equals("sair") || alunos[i].equals("SAIR") ) {
				cont = i;
			}
		}
		
		for(int i=0; i<cont; i++) {
			System.out.println(alunos[i]);
		}
		
		System.out.println("Foram digitados "+cont+" nomes de alunos.");
		
	}

}
