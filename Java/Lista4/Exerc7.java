package lista4; // Pacote ao qual o programa está vinculado.

/**
 * 7. Apresentar todos os valores numéricos inteiros ímpares situados na faixa
 * de 0 a 20. Para verificar se o número é ímpar efetuar dentro do loop. 
 * Caso o número seja ímpar, mostre-o, não sendo, passe para o próximo número.
 * 
 * @author Martinho de Freitas Salomão
 */

public class Exerc7 { // Inicia a classe.
    public static void main(String[] args) { // Inicia o método principal.
        
        // Declara a variável i como inteira dentro do laço for, inicializando-a
        // em zero e incrementando-a em 1 unidade até atingir 20.
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar.
                System.out.println(i); // Imprime o número se ele for ímpar.
            } // Fim do if.
        } // Fim do laço for.
    } // Fim do método principal.    
} // Fim da classe.
