package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 9.
 * 
 * Ler dois valores numéricos e apresentar a diferença do maior para o menor.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc9 { // Inicia a classe Exerc9.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara variáveis num1, num2, maior, menor e diferença como double.
        double num1, num2, maior, menor, diferenca;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: "); // Prompt para o usuário.
        num1 = Double.parseDouble(scan.next()); // Lê o primeiro número.
        
        System.out.print("Digite outro número: "); // Prompt para o usuário.
        num2 = Double.parseDouble(scan.next()); // Lê o segundo número.
        
        // Testa condição se o primeiro número é maior que o segundo.
        if (num1 > num2) { 
            maior = num1; // O maior número será o primeiro.
            menor = num2; // O menor número será o segundo.
        }else{ // Caso o primeiro número não seja maior que o segundo:
            if (num2 > num1) { // Testa se o segundo número é maior que o primeiro.
                maior = num2;  // O maior número será o segundo.
                menor = num1; // O menor número será o primeiro.
            }else{ // Caso nenhum número seja maior que o outro, ambos serão iguais.
                maior = num1; // O maior e o menor número serão iguais a num1 ou num2.
                menor = num1; // O maior e o menor número serão iguais a num1 ou num2.
            } // Fim do else.
        } // Fim do else.
        diferenca = maior - menor; // Calcula a diferença do maior número para o menor.
        
        // Exibe mensagem para o usuário. Se os números forem iguais, a diferença
        // será zero.
        System.out.println("A diferença do maior para o menor número é "+diferenca);
    } // Fim do método principal.
} // Fim da classe Exerc9.