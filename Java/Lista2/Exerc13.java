package Lista2;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		// Faça um programa para ler dois números inteiros,
		// e apresente o quociente e o resto da divisão entre eles.
		int num1,num2,quoc, resto;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro (dividendo): ");
		num1 = Integer.parseInt(scan.next());
		System.out.print("Digite outro número inteiro (divisor): ");
		num2 = Integer.parseInt(scan.next());
		
		quoc = num1 / num2;
		resto = num1 % num2;
		
		System.out.println("O quociente da divisão entre " +num1+ " e " + num2+ " é " +quoc + " e o resto é " +resto+".");	
		

	}

}
