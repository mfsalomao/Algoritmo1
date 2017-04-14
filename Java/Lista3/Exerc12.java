package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 12.
 * 
 * Elabore um algoritmo que dada a idade de um nadador classifique-o em uma
 * das seguintes categorias: 
 *		Infantil A = 5 a 7 anos 
 *		Infantil B = 8 a 11 anos 
 *		Juvenil A = 12 a 13 anos 
 *		Juvenil B = 14 a 17 anos 
 *		Adultos  = Maiores de 18 anos
 *		Menores que 5 anos não são classificados.
 * 
 * @author Martinho de Freitas Salomão
 */


// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc12 { // Inicia a classe Exerc12.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        int idade; // Declara a variável idade como inteiro.
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe a idade do nadador: "); // Prompt para o usuário.
        idade = Integer.parseInt(scan.next()); // Lê a idade do nadador.
        
        // Testa idade entre 5 e 7 anos.
        if ((idade >= 5) && (idade <= 7)) {
            // Exibe mensagem para o usuário. Categoria Infantil A.
            System.out.println("O nadador está na categoria Infantil A.");
        }else{ // Caso a condição acima seja falsa:
            // Testa idade entre 8 e 11 anos.
            if ((idade >= 8) && (idade <= 11)) {
                // Exibe mensagem para o usuário. Categoria Infantil B.
                System.out.println("O nadador está na categoria Infantil B.");
            }else{ // Caso as condições acima sejam falsas:
                // Testa idade entre 12 e 13 anos:
                if ((idade >= 12) && (idade <= 13)) {
                    // Exibe mensagem para o usuário. Categoria Juvenil A.
                    System.out.println("O nadador está na categoria Juvenil A.");
                }else{ // Caso as condições acima sejam falsas:
                    // Testa idade entre 14 e 17 anos:
                    if ((idade >= 14) && (idade <= 17)) {
                        // Exibe mensagem para o usuario. Categoria Juvenil B.
                        System.out.println("O nadador está na categoria Juvenil B.");
                    }else{ // Caso as condições acima sejam falsas:
                        // Testa se a idade é igual ou superior a 18 anos.
                        if (idade >= 18) {
                            // Exibe mensagem para o usuário. Categoria Adultos.
                            System.out.println("O nadador está na categoria Adultos.");
                        }else{ // Caso as condições acima sejam falsas:
                            // Exibe mensagem para o usuário, pois a única opção que
                            // sobrou é que a idade do nadador seja menor do que 5 anos.
                            System.out.println("Menores que 5 anos não são classificados.");
                        } // Fim do else.
                    } // Fim do else.
                } // Fim do else.
            } // Fim do else.
        } // Fim do else.
    } // Fim do método principal.
} // Fim da classe Exerc12.