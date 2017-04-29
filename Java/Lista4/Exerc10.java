package lista4; // Pacote ao qual o programa está vinculado.

/**
 * 10). Escrever um algoritmo que leia um conjunto de valores e calcule a média
 * aritmética dos valores lidos, a quantidade de valores positivos e o 
 * percentual de valores negativos. Mostre os resultados no final. 
 * Para terminar o programa, o usuário deverá digitar o valor zero. 
 * O valor zero não entra nos cálculos.
 * 
 * @author Martinho de Freitas Salomão
 */

import java.util.Scanner; //Importa a classe Scanner do pacote java.util.

public class Exerc10 { // Início da classe.
    public static void main(String[] args) { // Início do método principal.
        
        // Declara variáveis utilizadas no programa.
        double valores, media, positivos, negativos, percNegativos, soma, total;
        
        Scanner scan = new Scanner(System.in); // Cria um scanner chamado scan.   
        System.out.print("Digite um número (0 para sair): "); // Prompt para o usuário
        valores = scan.nextDouble(); // Converte o valor digitado (string) para double.
        positivos = negativos = soma = total = 0; // Inicializa variáveis em zero.
        
        // O programa só efetua os cálculos se o valor digitado inicialmente for
        // diferente de zero.
        if (valores != 0) { 
            
            // Início do while. Só para quando o valor digitado for igual a zero.
            while(valores != 0){ 
                soma += valores; // Equivalente a soma = soma + valores.
                if (valores >= 0) { // Caso o valor digitado seja positivo:
                    positivos ++; // O total de positivos é incrementado em 1 unidade.
                }else{ // Caso seja negativo:
                    negativos ++; // O total de negativos é incrementado em 1 unidade.
                } // Fim do bloco if-else.
                total++; // quantidade total de valores (positivos e negativos).
                System.out.print("Digite um número (0 para sair): "); // Prompt para o usuário.
                valores = scan.nextDouble(); // Converte o valor digitado (string) para double.
            } // Fim do while.
            
            media = soma/total; // Calcula a média.
            percNegativos = (negativos/total) * 100; // Calcula o percentual de negativos.
            
            // Mensagens para o usuário.
            System.out.println("A média é "+media);
            System.out.println("A quantidade de números positivos é "+positivos);
            System.out.println("O percentual de números negativos é "+percNegativos+"%");
            
        } // Fim do bloco if.
    } // Fim do método principal.
} // Fim da classe.