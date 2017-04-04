package Lista2;

import javax.swing.JOptionPane;

public class Exerc20 {

	public static void main(String[] args) {
		// Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo
		// e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
		// vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar ao final
		// do programa o seu nome, o salário fixo e salário no final do mês. 
		
		String vendedor;
		double salarioFixo, vendas, salario;
		vendedor = JOptionPane.showInputDialog(null,"Informe o nome do vendedor: ");
		vendas = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe as vendas efetuadas no mês: "));
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor do salário fixo: "));
		
		salario = salarioFixo + 0.15 * vendas;
		
		JOptionPane.showMessageDialog(null,"O salário no final do mês é R$ "+salario+".");		
	}

}
