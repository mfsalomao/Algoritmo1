package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 20.
 * 
 * Leia uma média e um número de faltas dadas a um aluno e imprima aprovado,
 * reprovado por média e por falta, reprovado por média ou reprovado por falta.
 * Sendo média maior igual a 7 indica aprovado, e faltas maior igual a 32 
 * indica reprovado.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc20 { // Inicia a classe Exerc20;
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        float media; // Declara variável media como float.
        int faltas; // Declara variável faltas como inteiro.
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe a média do aluno: "); // Prompt para o usuário.
        media = Float.parseFloat(scan.next()); // Lê a média do aluno.
        System.out.print("Informe o número de faltas do aluno: "); // Prompt para o usuário.
        faltas = Integer.parseInt(scan.next()); // Lê o número de faltas do aluno.
        
        // Testa condição se a média é igual ou superior a 7 E se o número de
        // faltas é menor do que 32.
        if (media >= 7 && faltas < 32) {
            // Exibe mensagem ao usuário.
            System.out.println("Aprovado.");
        }else{ // Caso a condição acima seja falsa, o aluno está reprovado.
            // Testas se a média é menor do que 7 E o número de faltas é maior ou igual a 32.
            if (media < 7 && faltas >= 32) {
                // Exibe mensagem ao usuário.
                System.out.println("Reprovado por média e por falta.");
            }else{ // Se as condições acima forem falsas:
                // Testa se a média é inferior a 7 E se o número de faltas é inferior a 32.
                if (media < 7 && faltas < 32) {
                    // Exibe mensagem ao usuário.
                    System.out.println("Reprovado por média.");
                }else{ // Caso as condições acima sejam falsas:
                    // Testa se a média é igual ou superior a 7 E se o número de faltas
                    // é igual ou superior a 32.
                    if (media >= 7 && faltas >= 32) {
                        System.out.println("Reprovado por falta.");
                    } // fim do if.
                } // fim do else.
            } // fim do else.
        } // fim do else.
    } // fim do método principal.
} // fim da classe Exerc20.