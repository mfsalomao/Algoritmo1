package Lista2;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		// Leia dois valores para as variáveis A e B, 
		// efetuar a troca dos valores de forma que a variável A
		// passe a possuir o valor da variável B, e que a
		// variável B passe a possuir o valor da variável A. 
		// Apresentar os valores trocados pelas variáveis.
		
		String A,B,AUX;
				
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de A: " );
		A = scan.next();
		System.out.print("Digite o valor de B: " );
		B = scan.next();
		
		AUX = A;
		A = B;
		B = AUX;
				
		System.out.println("O valor de A agora é "+A+ " e o de B agora é "+B+".");	

	}

}
