package lista4; // Pacote ao qual o programa está vinculado.

/**
 * 3. Faça um programa que vai pedindo números ao usuário até que este introduza
 * o número -1. O computador deve dizer a média dos números introduzidos 
 * (excluindo o -1).
 * 
 * @author Martinho de Freitas Salomão
 */

import javax.swing.JOptionPane; // Carrega classe JOptionPane do pacote javax.swing.

public class Exerc3 { // Início da classe.
    public static void main(String[] args) { // Início do método principal.
        // Declara variáveis utilizadas no programa.
        int contador;
        double numero, soma, media;
        
        // Prompt (gráfico) para o usuário e conversão do valor digitado em string para float.
        // Este valor é armazenado na variável numero.
        numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número (-1 para finalizar):  "));
        
        if (numero != -1) { // Se o número digitado for igual a -1 não faz nada.
            soma = media = 0; // Inicializa as variáveis soma e média em zero.
            contador = 0; // Inicializa a variável contador em zero.
            while (numero != -1) { // Início do while. Pára quando o número digitado for igual a -1.   
                soma += numero; // Equivalente a soma = soma + numero.
            
                // Prompt para o usuário
                numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número (-1 para finalizar):  ")); 
            
                contador ++; // Incrementa contador. Equivalente a contador = contador + 1.           
            } // Fim do while
            media = soma / contador; // Calcula a média     
            JOptionPane.showMessageDialog(null,"A média é: "+media); // Saída gráfica para o usuário.
        }
    } // Fim do método principal.   
} // Fim da classe.
