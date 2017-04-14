package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 10.
 * 
 * Ler três valores numéricos e apresentar o menor valor.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc10 { // Inicia a classe Exerc10.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara as variáveis utilizadas no programa como double.
        double num1, num2, num3, menor;
        
        // Inicializa a variável menor.
        menor = 0;
                
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe um número: "); // Prompt para o usuário.
        num1 = Double.parseDouble(scan.next()); // Lê o primeiro valor numérico.
        System.out.print("Informe outro número: "); // Prompt para o usuário:
        num2 = Double.parseDouble(scan.next()); // Lê o segundo valor numérico.
        System.out.print("Informe mais um número: "); // Prompt para o usuário.
        num3 = Double.parseDouble(scan.next()); // Lê o terceiro valor numérico.
        
        // Testa se num1 <= num2 <= num3.
        if ((num1 <= num2) && (num2 <= num3)) {
            menor = num1; // Num1 será o menor número.
        }else{ // Caso a condição acima seja falsa:
            // Testa se num1 <= num3 <= num2.
            if ((num1 <= num3) && (num3 <= num2)) {
                menor = num1; // Num1 será o menor número.
            }else{ // Caso as condições acima sejam falsas.
                // Testa se num2 <= num1 <= num3.
                if ((num2 <= num1) && (num1 <= num3)) {
                    menor = num2; // Num2 será o menor número.
                }else{ // Caso as condições acima sejam falsas:
                    // Testa se num2 <= num3 <= num1.
                    if ((num2 <= num3) && (num3 <= num1)) {
                        menor = num2; // Num2 será o menor número.
                    }else{ // Caso as condições acima sejam falsas:
                        // Testa se num3 <= num1 <= num2.
                        if ((num3 <= num1) && (num1 <= num2)) {
                            menor = num3; // Num3 será o menor número.
                        }else{ // Caso as condições acima sejam falsas:
                            // Testa a última alternativa: num3 <= num2 <= num1.
                            if ((num3 <= num2) && (num2 <= num1)) {
                                menor = num3; // Num3 será o menor número.
                            } // Fim do else.
                        } // Fim do else.
                    } // Fim do else.
                } // Fim do else.
            } // Fim do else.
        } // Fim do else.
        
        // Exibe mensagem para o usuário.
        System.out.println("O menor número é "+menor);
        
    } // Fim do método principal.
} // Fim da classe Exerc10.