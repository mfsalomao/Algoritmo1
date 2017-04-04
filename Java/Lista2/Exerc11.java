package Lista2;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		// Construir um algoritmo para ler 6 valores reais,
		// calcular e imprimir a média desses valores. 
		
		float num1, num2, num3, num4, num5, num6, media;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		num1 = Float.parseFloat(scan.next());
		System.out.print("Digite o segundo número: ");
		num2 = Float.parseFloat(scan.next());
		System.out.print("Digite o terceiro número: ");
		num3 = Float.parseFloat(scan.next());
		System.out.print("Digite o quarto número: ");
		num4 = Float.parseFloat(scan.next());
		System.out.print("Digite o quinto número: ");
		num5 = Float.parseFloat(scan.next());
		System.out.print("Digite o sexto número: ");
		num6 = Float.parseFloat(scan.next());
		
		media = (num1 + num2 + num3 + num4 + num5 + num6)/6;
		
		System.out.println("A média dos valores digitados é " +media + ".");
		
		

	}

}
