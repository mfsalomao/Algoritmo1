package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 16.
 * 
 * Fazer um programa para entrar com um número inteiro e informar se ele é
 * ou não divisível por 3 e por 7.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc16 { // Inicia a classe Exerc16.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara a variável numero como inteiro.
        int numero;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: "); // Prompt para o usuário.
        numero = Integer.parseInt(scan.next()); // Lê número informado pelo usuário.
        
        // Testa condição se o número é simultaneamente múltiplo de 3 (numero % 3 == 0)
        // e múltiplo de 7 (numero % 7 == 0). Em outras palavras, verifica se os restos
        // das divisões do número tanto por 3 quanto por 7 são iguais a zero.
        if ((numero % 3 == 0) && (numero % 7 == 0)) {
            // Exibe mensagem ao usuário se a condição for verdadeira.
            System.out.println("O número "+numero+" é divisível por 3 e por 7.");
        }else{
            // Exibe mensagem ao usuário se a condição for falsa.
            System.out.println("O número "+numero+" NÃO é divisível por 3 e por 7.");
        } // fim do else.
    } // fim do método principal.
} // fim da classe Exerc16.
