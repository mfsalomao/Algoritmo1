package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 14.
 * 
 * Crie um algoritmo que efetue o cálculo do salário líquido de um professor.
 * Serão fornecidos: valor da hora aula, o número de aulas dadas no mês e 
 * percentual de desconto no INSS. Se o professor ganhar mais que 10 salários
 * mínimos dizer que “Sortudo!”, se ele receber entre 6 e 9 salários mínimos, 
 * exibir a seguinte mensagem: “Um dia você chega lá!”, se receber menos que 6
 * salários mínimos você deverá exibir a seguinte mensagem:  “Ah! Coitado!”.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc14 { // Inicia a classe Exerc14.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara variáveis utilizadas no programa como float.
        float horaAula, numeroAulas, percINSS, salarioLiquido;
        
        // Declara salário mínimo como uma constante (R$ 937,00).
        final float salarioMinimo = 937f;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o valor da hora-aula: "); // Prompt para o usuário.
        horaAula = Float.parseFloat(scan.next()); // Lê valor da hora-aula.
        System.out.print("Informe o número de aulas dadas no mês: "); // Prompt para o usuário.
        numeroAulas = Float.parseFloat(scan.next()); // Lê o número de aulas dadas no mês.
        System.out.print("Informe o percentual de desconto do INSS: "); // Prompt para o usuário.
        percINSS = Float.parseFloat(scan.next()); // Lê o percentual do INSS.
        
        // O salário líquido do professor será o valor de sua hora-aula multiplicado
        // pelo número de aulas dadas no mês. Este valor sofrerá um desconto do INSS.
        salarioLiquido = (horaAula * numeroAulas) * (1-percINSS/100);
        
        // Testa se o salário líquido do professor é superior a 10 salários-mínimos.
        if (salarioLiquido > 10 * salarioMinimo) {
            // Exibe mensagem ao usuário.
            System.out.println("Sortudo! Salário líquido igual a R$ "+salarioLiquido);
        }else{ // Caso a condição acima seja falsa:
            // Testa se o salário líquido do professor está na faixa entre 6 a 10 salários mínimos.
            if ((salarioLiquido >= 6 * salarioMinimo) && (salarioLiquido <= 10 * salarioMinimo)) {
                // Exibe mensagem ao usuário.
                System.out.println("Um dia você chega lá! Salário líquido igual a R$ "+salarioLiquido);
            }else{ // Caso as condições acima sejam falsas:
                // Testa se o salário líquido do professor é inferior a 6 salários mínimos.
                 if (salarioLiquido < 6 * salarioMinimo) {
                     // Exibe mensagem ao usuário.
                     System.out.println("Ah! Coitado! Salário líquido igual a R$ "+salarioLiquido);
                 } // fim do if.
            } // fim do else.
        } // fim do else.
    } // fim do método principal.
} // fim da classe Exerc14.