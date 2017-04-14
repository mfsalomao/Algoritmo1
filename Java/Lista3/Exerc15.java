package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 15.
 * 
 * Faça um algoritmo que receba três valores que representarão os lados de um
 * triângulo e serão fornecidos pelo usuário. Verifique se os valores formam um
 * triângulo e classifique esse triângulo como:
 *	equilátero – três lados iguais;
 *	isósceles – dois lados iguais;
 *	escaleno – três lados diferentes.
 * Lembre-se de que, para formar um triângulo:
 * Nenhum dos lados pode ser igual a zero;
 * Um lado não pode ser maior do que a soma dos outros dois.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc15 { // Inicia a classe Exerc15.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara as variáveis utilizadas no programa, ou seja, os lados do
        // triângulo (L1, L2 e L3).
        int l1,l2,l3;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do primeiro lado do triângulo: "); // Prompt para o usuário.
        l1 = Integer.parseInt(scan.next()); // Lê o primeiro lado do triângulo.
        
        System.out.print("Digite o valor do segundo lado do triângulo: "); // Prompt para o usuário.
        l2 = Integer.parseInt(scan.next()); // Lê o segundo lado do triângulo.
        
        System.out.print("Digite o valor do terceiro lado do triângulo: "); // Prompt para o usuário.
        l3 = Integer.parseInt(scan.next()); // Lê o terceiro lado do triângulo.
        
        // Testa condição de existência de um triângulo: o lado de um triângulo não pode ser
        // superior à soma dos outros dois. Por isso é utilizado o OU (operador ||), pois
        // basta que um lado seja superior à soma dos outros dois para que não seja um
        // triângulo.
        if ((l1 > l2 + l3) || (l2 > l1 + l3) || (l3 > l1 + l2)) {
            // Exibe mensagem ao usuário.
            System.out.println("Não é triângulo.");
        }else{ // Caso se trate de um triângulo:
            // Testa se os três lados são iguais. L1 = L2 = L3.
            if ((l1 == l2) && (l2 == l3)) {
                System.out.println("Triângulo equilátero.");
            }else{ // Caso os três lados não sejam iguais:
                // Testa se há pelo menos dois lados iguais.
                if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {
                    // Exibe mensagem ao usuário.
                    System.out.println("Triângulo isósceles.");
                }else{ // Caso contrário, os três lados serão diferentes.
                    System.out.println("Triângulo escaleno.");
                } //fim do else.
            } // fim do else.
        } // fim do else.
    } // fim do método principal.
} // fim da classe Exerc15.