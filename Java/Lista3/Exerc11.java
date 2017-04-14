package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 11.
 * 
 * Leia o valor do salário atual de um funcionário e calcule o reajuste
 * salarial conforme percentual abaixo:
 *		salário < 500, reajuste de 15%
 *		salário >= 500 e <= 1000, reajuste de 10%
 *		salário > 1000, reajuste de 5%
 * Apresente o valor do novo salário.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc11 { // Inicia a classe Exerc11.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara como variáveis do tipo double o salário atual do funcionário
        // e o novo salário reajustado.
        double salarioAtual, novoSalario;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o salário atual do funcionário: "); // Prompt para o usuário.
        salarioAtual = Double.parseDouble(scan.next()); // Lê o salário atual do funcionário.
        
        // Inicializa a variável novoSalario. Inicialmente, ela é igual ao salário
        // atual do funcionário, ou seja, ainda não testamos as condições para
        // verficarmos qual será o reajuste concedido.
        novoSalario = salarioAtual;
        
        // Se o salário atual for menor que $500:
        if ((salarioAtual >=0) && (salarioAtual < 500)) {
            novoSalario = salarioAtual * (1.15); // Reajusta o salário atual em 15%.
        }else{ // Caso a condição acima seja falsa:
            // Se o salário atual estiver entre $500 e $1000:
            if ((salarioAtual >=500) && (salarioAtual <= 1000)) {
                novoSalario = salarioAtual * (1.10); // Reajusta o salário em 10%.
            }else{ // Caso as condições acima sejam falsas:
                // Se o salário atual for superior a $1000:
                if (salarioAtual > 1000) {
                    novoSalario = salarioAtual * (1.05); // Reajusta o salário em 5%.
                } // Fim do if.
            } // Fim do else.
        } // Fim do else.
        
        // Exibe mensagem para o usuário.
        System.out.println("O novo salário do funcionário é R$ "+novoSalario);
        
    } // Fim do método principal.
} // Fim da classe Exerc11.