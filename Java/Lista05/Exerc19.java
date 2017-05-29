/**
 * 
 */
package Lista05;

/**
 * @author mfsalomao
 *
 */

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		String[] sexo = new String[50];
		double[] altura = new double[50];
		int[] idade = new int[50];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<sexo.length; i++) {
			System.out.print("Informe o sexo da pessoa (M/F): ");
			sexo[i] = scan.next();
			sexo[i] = sexo[i].toUpperCase();
			System.out.print("Informe a altura da pessoa (em metros): ");
			altura[i] = Double.parseDouble(scan.next());
			System.out.print("Informe a idade da pessoa: ");
			idade[i] = Integer.parseInt(scan.next());			
		}
		
		int contLetraA = 0;
		double somaIdadeLetraA = 0;
		double mediaIdadeLetraA = 0;
		
		double maiorLetraB = idade[0];
		int posicaoLetraB = 0;
		
		int somaLetraC = 0;
		
		double somaHomensLetraD = 0;
		double percHomensLetraD;
		
		for(int i=0; i<sexo.length; i++) {
			if (altura[i] > 1.6) {
				somaIdadeLetraA += idade[i];
				contLetraA ++;
			}
			if (idade[i] > maiorLetraB) {
				maiorLetraB = idade[i];
				posicaoLetraB = i;
			}
			if (sexo[i].equals("F") && (idade[i] >= 20 && idade[i] <= 45) && altura[i] < 1.7 ) {
				somaLetraC ++;
			}
			if (sexo[i].equals("M")) {
				somaHomensLetraD ++;
			}
		}
		
		if (contLetraA != 0) {
			mediaIdadeLetraA = somaIdadeLetraA / contLetraA;
		}
		
		percHomensLetraD = (somaHomensLetraD / (sexo.length)) * 100;
		
		System.out.println("a) A média de idade das pessoas de altura superior a 1,60m é"
				+ " "+String.format("%.1f",mediaIdadeLetraA));
		System.out.println("b) A maior idade entre os habitantes é "+idade[posicaoLetraB]);
		System.out.println("c) A quantidade de indivíduos do sexo feminino cuja idade esteja entre 20 e 45 anos"
				+ " e altura inferior a 1,70m é "+somaLetraC);
		System.out.println("d) O percentual de homens é "+String.format("%.2f",percHomensLetraD)+"%");		
	}
}