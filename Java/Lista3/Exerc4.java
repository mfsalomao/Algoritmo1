package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 4.
 * 
 * Ler 2 números inteiros do teclado (A e B), verificar e imprimir qual deles
 * é o maior, ou a  mensagem “A=B” caso sejam iguais.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc4 { // Inicia a classe Exerc4.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {        
        int a, b; // Declara variáveis inteiras a e b.
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro A: "); // Prompt para o usuário.
        
        // Lê o número A fornecido pelo usuário. Como é uma variável do tipo
        //int, utiliza-se Integer.parseInt para converter o valor de
        // scan (que é, por definição, uma string), para inteiro.
        a = Integer.parseInt(scan.next());
        
        System.out.print("Digite um número inteiro B: "); // Prompt para o usuário.
        
        // Lê o número B fornecido pelo usuário. Como é uma variável do tipo
        //int, utiliza-se Integer.parseInt para converter o valor de
        // scan (que é, por definição, uma string), para inteiro.
        b = Integer.parseInt(scan.next());
        
        // Testa se a condição A > B é verdadeira:
        if (a > b) {
            // Exibe mensagem para o usuário.
            System.out.println("O número "+a+" (A) é maior.");
        }else{ // Se A não for maior do que B:
            if (b > a) { // Testa se B é maior do que A:
                // Exibe mensagem para o usuário.
                System.out.println("O número "+b+" (B) é maior.");
            }else{ // Se A não for maior do que B e B não for maior do que A, então:
                // Exibe mensagem para o usuário.
                System.out.println("Os números são iguais (A=B).");
            } // Fim do else.
        } // Fim do else.
    } // Fim do método principal.
} // Fim da classe Exerc4.