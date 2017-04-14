package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 5.
 * 
 * Para ler 3 números reais do teclado e verificar se o primeiro é maior
 * que a soma dos outros dois.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc5 { // Inicia a classe Exerc4.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args){
        
        // Declara as variáveis num1, num2 e num3 como double (podem ser
        // quaisquer números reais).
        double num1,num2,num3;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: "); // Prompt para o usuário.
        num1 = Double.parseDouble(scan.next()); // Lê o primeiro número fornecido pelo usuário.
        System.out.print("Digite o segundo número: "); // Prompt para o usuário.
        num2 = Double.parseDouble(scan.next()); // Lê o segundo número fornecido pelo usuário.
        System.out.print("Digite o terceiro número: "); // Prompt para o usuário.
        num3 = Double.parseDouble(scan.next()); // Lê o terceiro númeo fornecido pelo usuário.
        
        // Testa se a condição a verdadeira. A condição é que o primeiro número (num1)
        // seja maior que a soma dos outros dois (num2 + num3).
        if (num1 > num2+num3) {
            // Exibe mensagem para o usuário se a condição for verdadeira.
            System.out.println("O primeiro número é maior que a soma dos demais.");
        }else{
            // Exibe mensagem para o usuário se a condição for falsa.
            System.out.println("O primeiro número NÃO é maior que a soma dos demais.");
        } // Fim do else.   
    } // Fim do método principal.
} // Fim da classe Exerc5.
