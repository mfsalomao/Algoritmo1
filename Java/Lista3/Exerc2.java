package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 2.
 * 
 * Faça um algoritmo capaz de identificar se um numero é igual a 1,5 ou 10.
 * Caso não seja nenhum desses valores, informe para o usuário a mensagem 
 * “valor inválido”.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util. 
import java.util.Scanner;

public class Exerc2 { //Inicia a classe Exerc2.
    
    // Método principal, inicia a execução do aplicativo Java. 
    public static void main(String[] args) {
        
        // Declara variável num como double, pois o usuário pode informar qualquer número.
        double num; 
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número: "); // Prompt para o usuário.
        
        // Lê o número fornecido pelo usuário. Como é uma variável do tipo
        //double, utiliza-se Double.parseDouble para converter o valor de
        // scan (que é, por definição, uma string), para double.
        num = Double.parseDouble(scan.next());
        
        // Condição que testa se o número é igual OU igual a 5 OU
        // igual a 10.
        if ((num == 1) || (num == 5) || (num == 10)) { // Início do bloco if.
            
            // Exibe mensagem para o usuário.
            System.out.println("O número é igual a 1, 5 ou 10.");
                
        }else{ // Fim do bloco if e início do bloco else (condição falsa).
            
            // Exibe mensagem para o usuário.
            System.out.println("valor inválido.");
        } // Fim do bloco else.
    } // Finaliza método principal.
} // Finaliza classe Exerc2.