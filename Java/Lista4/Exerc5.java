package lista4; // Pacote a qual o programa está vinculado.

/**
 * 5. Faça um algoritmo que leia a altura de moças inscritas em um concurso de
 * beleza. Para finalizar será digitado zero na altura. 
 * Imprima as duas maiores alturas.
 * 
 * @author Martinho de Freitas Salomão
 */

import javax.swing.JOptionPane; // Importa classe JOptionPane do pacote javax.swing.

public class Exerc5 { // Início da classe.
    public static void main(String[] args) { // Início do método principal.
        
        // Declaração das variáveis como float, pois a altura geralmente é
        // representada pelo formato de ponto flutuante (ex: 1.85 m).
        float altura, maior1, maior2; 
        
        // Prompt (gráfico) para o usuário e conversão do valor digitado em string para float.
        // Este valor é armazenado na variável numero.
        altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a altura: "));
        
        // A variável maior1, que medirá a maior altura, pode ser inicializada pela altura fornecida pelo usuário.
        // A variável maior2, que medirá a segunda maior altura, pode ser incializada por zero.
        // Ou seja, se o usuário digitar apenas um valor, esta altura será a primeira maior,
        // e a segunda maior será zero.
        maior1 = altura;
        maior2 = 0;        
        while (altura != 0) { // Início do while, que continua até que o usuário digite zero.
            altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a altura: ")); //Prompt para o usuário.
            if (altura >= maior1) { // Se a altura digitada for maior ou igual à maior altura até então:
                maior2 = maior1; // À segunda maior altura atribui-se o valor de maior1. 
                maior1 = altura; // O valor de maior1 passa a ser a altura fornecida pelo usuário.
            }else{ // Caso contrário:
                // Se a altura digitada por menor que o maior valor registrado, mas maior do que o
                // segundo maior valor registrado:
                if (altura >= maior2) { 
                    maior2 = altura; // Ao segundo maior valor registrado, atribuímos à altura fornecida pelo usuário. 
                } // Fim do if.
            } // Fim do else.
        } // Fim do while.
        
        // Saída gráfica para o usuário.
        JOptionPane.showMessageDialog(null,"A maior altura é "+maior1+" e a segunda maior é "+maior2+".");
    }
    
}
