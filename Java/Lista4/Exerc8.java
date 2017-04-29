package lista4; // Pacote ao qual o programa está vinculado.

/**
 * 8. Dados dois números inteiros A e B, construa um algoritmo para calcular
 * a soma de todos os inteiros existentes entre A e B.
 * 
 * @author Martinho de Freitas Salomão
 */

import java.util.Scanner; // Importa a classe Scanner do pacote java.util.

public class Exerc8 { // Início da classe.
    public static void main(String[] args) { // Início do método principal.
        
        // Declara variáveis como inteiras e inicializa a variável soma em zero.
        int A,B,soma=0, contador;
        
        Scanner scan = new Scanner(System.in); // Cria um scanner chamado scan.
        System.out.print("Informe um número: "); // Prompt para o usuário.
        A = scan.nextInt(); // Converte a string A para inteiro.
        System.out.print("Informe outro número: "); // Prompt para o usuário.
        B = scan.nextInt(); // Converte a string B para inteiro.
        
        // O enunciado pede a soma dos inteiros existentes entre A e B, portanto
        // o programa deve considerar as três possibilidades: 1) o usuário digitar
        // A maior do que B; 2) o usuário digitar B maior do que A; 3) o usuário
        // digitar A = B ou números consecutivos. Neste último caso, a soma dos
        // inteiros no intervalo será igual a zero, que é o valor inicializado
        // pela variável soma.
        
        // Caso 3) intervalo vazio. Math.abs é utilizado para calcular o valor absoluto
        // de A-B, ou seja, |A-B| = |B-A|. Se esta diferença for igual a 1, os valores
        // são consecutivos e a soma é zero. Se A for igual a B, a soma também é igual
        // a zero.
        if ((Math.abs(A-B)==1) || (A==B)) {  
            System.out.println("Intervalo vazio. A soma é 0."); // Mensagem para o usuário.
        }else{ // Casos 1) e 2).
            if (A < B) { // Caso A seja menor do que B:
                contador = A; // O contador é inicializado com o menor número do intervalo.
                do { // Início do 'faça'.
                    contador ++; // O contador, que começa com A, é incrementado em 1 unidade.
                    soma += contador; // Equivalente a soma = soma + contador.
                }while(contador < B-1); // Fim do 'faça'. Para até que o contador seja menor do que B-1.
            }else{ // Se A não for menor do que B:
                if (B < A) { // Caso B seja menor do que A:
                    contador = B; // O contador é inicializado com o menor número do intervalo.
                    do { // Início do 'faça'.
                        contador ++; // O contador, que começa com B, é incrementado em 1 unidade.
                        soma += contador; // Equivalente a soma = soma + contador.
                    }while(contador < A-1); // Fim do 'faça'. Para até que o contador seja menor do que B-1.
                } // Fim do if.
            } // Fim do else.
        
            // Mensagem para o usuário. 
            // Foi utilizado o método System.out.printf. 
            // O especificador de formato %d é um marcador de lugar para um valor inteiro.
            // A letra d significa "inteiro decimal". O \n indica nova linha.
            System.out.printf("A soma é %d.\n",soma);
        } // Fim do if-else.
    } // Fim do método principal.    
} // Fim da classe.