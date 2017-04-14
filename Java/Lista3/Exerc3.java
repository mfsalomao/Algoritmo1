package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 3.
 * 
 * Dadas 3 pontuações de finalistas em um campeonato, informe qual a pontuação
 * que ficou em primeiro, segundo e terceiro lugar.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util. 
import java.util.Scanner;

public class Exerc3 { // Início da classe Exerc3.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara variáveis referentes à pontuação de cada finalista. Como a
        // pontuação não precisa ser necessariamente um número inteiro, foi
        // escolhido o tipo float (também poderia ser utilizado o double).
        float pontuacaoA, pontuacaoB, pontuacaoC;
        
        // Declara variáveis referentes ao nome de cada finalista. String não é
        // um tipo primitivo, e sim uma classe. 
        String nomeA, nomeB, nomeC;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o nome do finalista: "); // Prompt para o usuário.
        
        // Lê o nome do usuário. Coloca-se diretamente o método next do valor de
        // scan, pois já se trata de uma string.
        nomeA = scan.next();
        System.out.print("Informe a pontuação de "+nomeA+": "); // Prompt para o usuário.
        
        // Lê a pontuação fornecida pelo usuário. Como é uma variável do tipo
        // float, utiliza-se Float.parseFloat para converter o valor de
        // scan (que é, por definição, uma string), para float.
        pontuacaoA = Float.parseFloat(scan.next()); 
        
        // Repetem-se os mesmos procedimentos descritos acima para os demais 
        // finalistas.
        
        System.out.print("Informe o nome do finalista: ");
        nomeB = scan.next();
        System.out.print("Informe a pontuação de "+nomeB+": ");
        pontuacaoB = Float.parseFloat(scan.next()); 
        System.out.print("Informe o nome do finalista: ");
        nomeC = scan.next();
        System.out.print("Informe a pontuação de "+nomeC+": ");
        pontuacaoC = Float.parseFloat(scan.next()); 
        
        // Início do bloco if. Testa se a condição é verdadeira. Aqui é necessário
        // testar qual é o maior número, o segundo maior número e o menor número.
        // Para cada finalista, serão testadas duas situações em que sua pontuação
        // é a maior. Por exemplo, se A > B e B > C, então necessariamente, por
        // transitividade, A > C. Nessa situação, A é a maior pontuação, B é a
        // segunda maior e C é a menor. Se, por outro lado, A > C e C > B, então
        // A é a maior pontuação, C é a segunda maior e B é a menor. Este
        // procedimento é estendido para B como maior pontuação (B > A e A > C, 
        // (B > C, C > A) e para C como maior pontuação (C > A e A > B, C > B e
        // B > A). Estas são todas as situações em que é possível determinar quem
        // ficou em primeiro lugar, quem ficou em segundo e quem ficou em terceiro.
        
        // Testa A > B, B > C, A > C.
        if ((pontuacaoA > pontuacaoB) && (pontuacaoB > pontuacaoC)) {             
            // Exibe mensagem para o usuário. A (maior), B (segundo maior), C (menor).
            System.out.println(nomeA+" está em primeiro lugar com "+pontuacaoA+" pontos.");
            System.out.println(nomeB+" está em segundo lugar com "+pontuacaoB+" pontos.");
            System.out.println(nomeC+" está em terceiro lugar com "+pontuacaoC+" pontos."); 
            
        }else{ // Caso a condição acima seja falsa:            
            // Testa A > C, C > B, A > C. 
             if ((pontuacaoA > pontuacaoC) && (pontuacaoC > pontuacaoB)) {                 
                // Exibe mensagem para o usuário. A (maior), C (segundo maior), B (menor). 
                System.out.println(nomeA+" está em primeiro lugar com "+pontuacaoA+" pontos.");
                System.out.println(nomeC+" está em segundo lugar com "+pontuacaoC+" pontos.");
                System.out.println(nomeB+" está em terceiro lugar com "+pontuacaoB+" pontos."); 
                
            }else{ // Caso as condições acima sejam falsas:                 
                // Testa B > A, A > C, B > C.                 
                if ((pontuacaoB > pontuacaoA) && (pontuacaoA > pontuacaoC)) {                    
                    // Exibe mensagem para o usuário. B (maior), A (segundo maior), C (menor).
                    System.out.println(nomeB+" está em primeiro lugar com "+pontuacaoB+" pontos.");
                    System.out.println(nomeA+" está em segundo lugar com "+pontuacaoA+" pontos.");
                    System.out.println(nomeC+" está em terceiro lugar com "+pontuacaoC+" pontos.");
                    
                }else{ // Caso as condições acima sejam falsas:                    
                    // Testa B > C, C > A, B > A. 
                    if ((pontuacaoB > pontuacaoC) && (pontuacaoC > pontuacaoA)) {
                        // Exibe mensagem para o usuário. B (maior), C (segundo maior), A (menor).
                        System.out.println(nomeB+" está em primeiro lugar com "+pontuacaoB+" pontos.");
                        System.out.println(nomeC+" está em segundo lugar com "+pontuacaoC+" pontos.");
                        System.out.println(nomeA+" está em terceiro lugar com "+pontuacaoA+" pontos.");
                        
                    }else{ // Caso as condições acima sejam falsas:
                        // Testa C > A, A > B, C > B. 
                        if ((pontuacaoC > pontuacaoA) && (pontuacaoA > pontuacaoB)) {
                            // Exibe mensagem para o usuário. C (maior), A (segundo maior), B (menor).
                            System.out.println(nomeC+" está em primeiro lugar com "+pontuacaoC+" pontos.");
                            System.out.println(nomeA+" está em segundo lugar com "+pontuacaoA+" pontos.");
                            System.out.println(nomeB+" está em terceiro lugar com "+pontuacaoB+" pontos.");
                            
                        }else{ // Caso as condições acima sejam falsas:
                            // Testa finalmente se C > B, B > A, C > A.
                            if ((pontuacaoC > pontuacaoB) && (pontuacaoB > pontuacaoA)) {
                                // Exibe mensagem para o usuário. C (maior), B (segundo maior), A (menor).
                                System.out.println(nomeC+" está em primeiro lugar com "+pontuacaoC+" pontos.");
                                System.out.println(nomeB+" está em segundo lugar com "+pontuacaoB+" pontos.");
                                System.out.println(nomeA+" está em terceiro lugar com "+pontuacaoA+" pontos.");
                            
                            // Caso todas as condições acima sejam falsas, ou seja, se houver algum empate:
                            }else{ 
                                System.out.println("Não é possível determinar os colocados.");
                            } // Fim do else.
                        } // Fim do else.
                    } // Fim do else.
                } // Fim do else.
            } // Fim do else.
        } // Fim do else.
    } // Fim do método principal.
} // Fim da classe Exerc3.