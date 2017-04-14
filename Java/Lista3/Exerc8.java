package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 8.
 * 
 * Faça um algoritmo onde deverá ser informado nome, nota de trabalho e
 * nota da prova. O algoritmo deverá calcular a média e se a média for maior
 * que 7(sete), imprimir o nome do aluno e a situação aprovado, senão reprovado.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc8 { // Inicia classe Exerc8.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        String nome; // Declara variável nome como String.
        
        // Declara variáveis referentes à nota de trabalho, nota da prova
        // e média do tipo float.
        float notaTrabalho, notaProva, media;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o nome do aluno: "); // Prompt para o usuário.
        nome = scan.next(); // Lê o nome informado pelo usuário.
        
        System.out.print("Digite a nota do trabalho: "); // Prompt para o usuário.
        notaTrabalho = Float.parseFloat(scan.next()); // Lê a nota do trabalho.
        
        System.out.print("Digite a nota da prova: "); // Prompt para o usuário.
        notaProva = Float.parseFloat(scan.next()); // Lê a nota da prova.
        
        // Calcula média simples entre a nota do trabalho e a nota da prova.
        media = (notaTrabalho + notaProva)/2;
        
        if (media > 7) { // Testa condição se a média for superior a 7:
            // Exibe mensagem para o usuário. Aluno aprovado.
            System.out.println("O aluno "+nome+" foi aprovado com média "+media+".");
        }else{ // Se a condição for falsa, ou seja, a média for igual ou inferior a 7:
            // Exibe mensagem para o usuário. Aluno reprovado.
            System.out.println("O aluno "+nome+" foi reprovado com média "+media+".");
        } // Fim do else.
    } // Fim do método principal.
} // Fim da classe Exerc8.
