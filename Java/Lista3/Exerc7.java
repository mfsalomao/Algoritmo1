package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 7.
 * 
 * Faça um algoritmo onde deverá ser informado um número. O algoritmo deverá
 * exibir se o número é positivo, negativo ou nulo.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc7 { // Inicia a classe Exerc7.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara variável numero como double.
        double numero;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: "); // Prompt para o usuário.
        numero = Double.parseDouble(scan.next()); // Lê o número fornecido pelo usuário.
        
        // Teste a condição se o número é estritamente positivo:
        if (numero > 0) {
            System.out.println("O número "+numero+" é positivo."); // Exibe mensagem para o usuáro.
        }else{ // Se o número não for estritamente positivo:
            if (numero < 0) { // Testa se o número é negativo.
            System.out.println("O número "+numero+" é negativo."); // Exibe mensagem para o usuário.
        }else{ // Se o número não for estritamente positivo nem negativo:
                System.out.println("O número "+numero+" é igual a zero."); // Exibe mensagem para o usuário.
            } // Fim do else.
        } // Fim do else.
    } // Fim do método principal.
} // Fim da classe Exerc7.