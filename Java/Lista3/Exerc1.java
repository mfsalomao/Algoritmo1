package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 1.
 * 
 * Dada uma idade, informar se ela está compreendida no intervalo de 10 a 18 anos.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util. 
import java.util.Scanner;

public class Exerc1 { // Declaração de classe. Inicia a classe Exerc1. 
    
    // -- Declaração de método --
    // Public: Significa que o método é público e poderá ser chamado a partir de
    // métodos de outras classes.
    // Static: o método static é um método de classe. Ele realiza tarefas que não
    // dependem do conteúdo de nenhum objeto, ou são seja, a classe não precisa ser
    // instanciada para chamar esse método.
    // Void: indica que o método realizará uma tarefa mas não irá retornar nenhuma
    // informação para seu método chamador ao completar sua tarefa.
    // Main: sempre é chamado automaticamente pela JVM (Java Virtual Machine)
    // quando o aplicativo é executado. Uma classe que contém o método main sempre
    // inicia a execução de um aplicativo Java.
    // String[] args: argumentos do tipo string utilizados no método.
    public static void main(String[] args) {
        
        int idade; // Declara variável idade como inteiro.
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        // A variável scan é inicializada com o resultado da expressão de criação
        // de uma instância de classe new Scanner com objeto System.in.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe a idade: "); // Prompt para o usuário.
        
        // Lê a idade fornecida pelo usuário. Como é uma variável do tipo
        //int, utiliza-se Integer.parseInt para converter o valor de
        // scan (que é, por definição, uma string), para inteiro.
        idade = Integer.parseInt(scan.next());
        
        // Condição que testa se a idade está entre 10 e 18 anos.
        if ((idade >= 10) && (idade <= 18)) { // Início do bloco if.
            
            // Exibe mensagem para o usuário.
            System.out.println("A idade está compreendida no intervalo entre 10 e 18 anos.");
        } // Final do bloco if.
        
        // O bloco if foi finalizado. Se a idade não estiver compreendida no
        // intervalo entre 10 e 18 anos, o programa não exibirá nenhuma
        // mensagem ao usuário. Caso se queira exibir alguma mensagem, deverá
        // ser utilizado um else.
        
    } // Finaliza método principal.
} // Finaliza classe Exerc1.