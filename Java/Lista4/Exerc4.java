package lista4; // Paote ao qual o programa está vinculado.

/**
 * 4. Faça um algoritmo para somar os restos da divisão por 3 de 200
 * números inteiros.
 * 
 * @author Martinho de Freitas Salomão
 */

import java.util. Scanner; // Importa a classe Scanner do pacote java.util.

public class Exerc4 { // Início da classe.
    public static void main(String[] args) { // Início do método principal.
        
        // Declara variáveis como inteiras e inicializa soma com zero.
        int soma = 0, numero, contador;
        
        Scanner scan = new Scanner(System.in); // Cria um scanner chamado scan.
        
        // Início do laço for. O contador é inicializado com 1 e incrementado
        // em 1 unidade até atingir 200.
        for (contador = 1; contador <= 5; contador++ ) {
            System.out.print("Digite um numero inteiro: "); // Prompt para o usuário.
            numero = scan.nextInt(); // Entrada dos dados. Converte em inteiro.
            
            // Equivalente a soma = soma + (contador % 3), onde o operador
            // % significa resto.
            soma += numero % 3;
            
        } // Fim do laço for.
        
        // Mensagem para o usuário. 
        // Foi utilizado o método System.out.printf. 
        // O especificador de formato %d é um marcador de lugar para um valor inteiro.
        // A letra d significa "inteiro decimal". O \n indica nova linha.
        System.out.printf("A soma é %d.\n",soma); 
    } // Fim do método principal.
} // Fim da classe.
