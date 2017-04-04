package Lista2;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		// Você irá fazer uma viagem internacional e precisa levar seu dinheiro em dólares.
		// Elabore um algoritmo para calcular e apresentar do valor da conversão de real (R$)
		// para dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e
		// quantos Reais(R$) você tem para converter em dólar. Ao final mostre a quantidade
		// de dólares que você irá levar para a viagem. 
		
		double cotacao, real, dolar;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a cotação do dólar: ");
		cotacao = Double.parseDouble(scan.next());
		System.out.print("Informe o valor em reais (R$): ");
		real = Double.parseDouble(scan.next());
		
		dolar = real / cotacao;
		
		System.out.println("O valor em dólares é US$ "+dolar+".");
	}

}
