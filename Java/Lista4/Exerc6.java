package lista4; // Pacote ao qual o programa está vinculado.

/**
 * 
 * 6). Inicializar as variáveis FATORIAL e CONTADOR com 1; Solicitar o valor de
 * um número para calcular a sua fatorial; Multiplicar sucessivamente a variável
 * FATORIAL pela variável CONTADOR; Incrementar 1 à variável CONTADOR, efetuando
 * o controle até o valor solicitado; Apresentar ao final o valor obtido.
 * 
 * @author Martinho de Freitas Salomão
 */

import javax.swing.JOptionPane; // Carrega a classe JOptionPane dentro do pacote javax.swing.

public class Exerc6 { // Inicia a classe.
    public static void main(String[] args) { // Inicia o método principal.
        
        // Declara variáveis como inteiras e as inicializa em 1.
        int numero,fatorial = 1, contador = 1; 
        
        // Prompt (gráfico) para o usuário e conversão do valor digitado em string para inteiro.
        // Este valor é armazenado na variável numero.
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo: "));
        
        // Calcula o fatorial apenas se o número fornecido pelo usuário for positivo.
        if (numero >= 0) { 
            // Início do while. O contador começa com 1 e vai sendo incrementado até
            // chegar ao número fornecido pelo usuário. Atingida esta condição,
            // o while é finalizado.
            while (contador <= numero) {
                // O fatorial é igual a ele mesmo vezes o contador.
                // Exemplo: o usuário digitou 4.
                // Quando o contador é igual a 1, o fatorial é 1*1 = 1. 
                // Quando o contador é igual a 2, o fatorial é 1*2 = 2.
                // Quando o contador é igual a 3, o fatorial é igual a 1*2*3 = 6.
                // Quando o contador é igual a 4, o fatorial é igual a 1*2*3*4 = 12.
                // Outro exemplo:
                // Se o número digitado for igual a zero, o fatorial será igual
                // ao 1, seu valor de inicialização.
                fatorial = fatorial * contador;  // Calcula o fatorial.
                contador ++; // Incrementa o contador.
            } // Fim do while.
            
            // Saída gráfica para o usuário.
            JOptionPane.showMessageDialog(null, "O fatorial de "+numero+ " é "+fatorial+"."); 
        }else{ // Caso o número seja negativo: 
            // Saída gráfica para o usuário. Não existe fatorial de número negativo.
            JOptionPane.showMessageDialog(null, "Número negativo."); 
        } // Fim do if-else.
    } // Fim do método principal.
} // Fim da classe.
