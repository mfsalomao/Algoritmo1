package lista4; // Pacote ao qual o programa está vinculado.

/**
 * 2. Faça um programa que escreve na tela a mesma frase 10 vezes. 
 * E depois faça com que o programa mostre o número de cada linha no
 * início e no final da linha, conforme ex: 
 * 1 Sou um programa Java! 1
 *  2 Sou um programa Java! 2
 *  3 Sou um programa Java! 3
 * @author Martinho de Freitas Salomão
 */

public class Exerc2 { // Início da classe.
    public static void main(String[] args) { // Início do método principal.
        
        // Início do laço for. A variável contador é declarada dentro do laço,
        // inicializada em 1 e incrementada em 1 unidade até que atinja 10.
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println(contador+" Sou um programa Java! "+contador); // Saída para o usuário.
        } // Fim do laço for.
    } // Fim do método principal.
} // Fim da classe.
