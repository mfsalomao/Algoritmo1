package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 18.
 * 
 * Faça um programa que receba o valor do salário de uma pessoa e o valor de
 * um financiamento pretendido. Caso o financiamento seja menor ou igual a 5
 * vezes o salário da pessoa, o programa deverá escrever "Financiamento
 * Concedido"; senão, escreverá "Financiamento Negado". Independente de conceder
 * ou não o financiamento, o programa escreverá depois a frase "Obrigado por
 * nos consultar."
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc18 { // Inicia a classe Exerc18.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara variáveis utilizadas no programa como do tipo float.
        float salario, financiamento;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o salário: "); // Prompt para o usuário.
        salario = Float.parseFloat(scan.next()); // Lê o salário informado pelo usuário.
        System.out.print("Informe o financiamento pretendido: "); // Prompt para o usuário.
        financiamento = Float.parseFloat(scan.next()); // Lê o financiamento informado pelo usuário.
        
        // Testa condição: se o financiamento pretendido for menor ou igual a
        // cinco vezes o salário informado.
        if (financiamento <= 5 * salario) {
            // Exibe mensagem ao usuário.
            System.out.println("Financiamento concedido.");
        }else{ // Caso o financiamento pretendido seja superior a cinco vezes o salário informado:
            // Exibe mensagem ao usuário.
            System.out.println("Financiamento negado.");
        } // Fim do else.
        
        // Em qualquer situação, independentemente do financiamento ser concedido,
        // exibir a mensagem:
        System.out.println("Obrigado por nos consultar.");
        
    } // Fim do método principal.
} // Fim da classe Exerc18.