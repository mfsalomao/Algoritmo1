package Lista2;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		// Faça um algoritmo onde deverá ser informado a base
		// e a altura de um triângulo. O algoritmo deverá exibir
		// o valor da área.
		
		float base, altura, area;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a base do triângulo: ");
		base = Float.parseFloat(scan.next());
		System.out.print("Informe a altura do triângulo: ");
		altura = Float.parseFloat(scan.next());
		
		area = (base * altura)/2;
		
		System.out.println("A área do triângulo é "+area +".");	

	}

}
