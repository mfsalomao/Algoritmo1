package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 17.
 * 
 * A prefeitura de Vitória abriu uma linha de crédito para os funcionários.
 * O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
 * Fazer um programa em Java que permita entrar com o salário bruto e o valor 
 * da prestação e informar se o empréstimo pode ou não ser concedido.
 *
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc17 { // Inicia a classe Exerc17.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara as variáveis utilizadas no programa como do tipo float.
        float salarioBruto, prestacao;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Informe o valor do salário bruto: "); // Prompt para o usuário.
        salarioBruto = Float.parseFloat(scan.next()); // Lê o salário bruto.
        System.out.print("Informe o valor da prestação: "); // Prompt para o usuário.
        prestacao = Float.parseFloat(scan.next()); // Lê o valor da prestação.
        
        // Testa se a prestação é igual ou inferior a 30% do salário bruto.
        if (prestacao <= (salarioBruto * 0.3)) {
            // Exibe mensagem ao usuário.
            System.out.println("A prestação representa "+(prestacao/salarioBruto)*100+
                    "% do salário bruto. O empréstimo pode ser concedido.");
        }else{ // Caso a condição acima seja falsa:
            // Exibe mensagem ao usuário.
            System.out.println("A prestação representa "+(prestacao/salarioBruto)*100+
                    "% do salário bruto. O empréstimo NÃO pode ser concedido.");
        } // fim do else.
    } // fim do método principal.
} // fim da classe Exerc17.