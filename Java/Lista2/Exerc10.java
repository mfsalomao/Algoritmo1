package Lista2;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		// Construir um algoritmo para ler 5 valores inteiros, calcular e
		// imprimir a soma desses valores. 
		
		int num1, num2, num3, num4, num5, soma;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");		
		num1 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o segundo número inteiro: ");
		num2 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o terceiro número inteiro: ");
		num3 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o quarto número inteiro: ");
		num4 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o quinto número inteiro: ");
		num5 = Integer.parseInt(scan.next());
		
		soma = num1 + num2 + num3 + num4 + num5;
		
		System.out.println("A soma dos valores digitados é " + soma + ".");
		

	}

}
