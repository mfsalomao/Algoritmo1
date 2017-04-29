package lista4; // Pacote ao qual o programa está vinculado.

/**
 * 9. Construir um algoritmo para gerar a seguinte série:
 * s =  1  +   1 +  1  +  ... +  1      para os 50 primeiros termos.
 *      1      2    3            n
 *
 * @author Martinho de Freitas Salomão
 */

public class Exerc9 { // Início da classe.
    public static void main(String[] args) { // Início do método principal.
        double soma = 0, n = 1; // Declaração de variáveis utilizadas no programa.
        
        // Início do laço for. A variável n começa com 1 (1/1) e vai sendo incrementada
        // até 50 (1/50). A variável soma irá adicionar cada 1/n.
        for (n = 1; n <= 50; n++) { 
            soma += 1/n; // Equivalente a soma = soma + 1/n.
        } // Fim do laço for.
        System.out.println("A soma é "+soma+"."); // Mensagem para o usuário.
    } // Fim do método principal.   
} // Fim da classe.
