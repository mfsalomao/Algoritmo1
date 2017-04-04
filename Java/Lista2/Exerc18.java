package Lista2;

import java.util.Scanner;

public class Exerc18 {
	
	// Faça um programa para calcular e apresentar o volume de uma lata de óleo,
	// utilizando a fórmula volume = 3.14159 ∗ raio ∗ raio ∗ altura. Identifique na fórmula
	// os valores de entrada de dados e leia-os via teclado.

	public static void main(String[] args) {
		float raio, altura, volume;
		float pi = 3.14159f;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o raio da lata de óleo: ");
		raio = Float.parseFloat(scan.next());
		System.out.print("Informe a altura da lata de óleo: ");
		altura = Float.parseFloat(scan.next());
		
		volume = pi * raio * raio * altura;
		
		System.out.println("O volume da lata de óleo é "+volume + ".");
		
	}

}
