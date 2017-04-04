package Lista2;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		// Escreva um algoritmo para determinar o consumo médio
		// de um automóvel sendo que será fornecida via teclado
		// a distância total percorrida pelo automóvel e o total
		// de combustível gasto. 
		float dist, comb, consumo;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a distância total percorrida (em quilômetros): ");
		dist = Float.parseFloat(scan.next());
		System.out.print("Informe o total de combustível gasto (em litros): ");
		comb = Float.parseFloat(scan.next());
		
		consumo = dist / comb;
		
		System.out.println("O consumo médio do automóvel é de: "+consumo+ " km/l.");
		

	}

}
