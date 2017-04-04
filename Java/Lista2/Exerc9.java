package Lista2;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		// Faça um programa que leia um número e exiba seu sucessor.
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		num1 = Integer.parseInt(scan.next());
		num2=num1+1;
		System.out.println("O número é " +num1+" e seu sucessor é " +num2 +".");

	}

}
