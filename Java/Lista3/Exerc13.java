package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 13.
 * 
 * Um endocrinologista deseja controlar a saúde de seus pacientes,
 * e para isso, se utiliza o índice de massa corporal (IMC). Sabendo que o IMC
 * é calculado através da fórmula IMC=peso/altura2, crie um algoritmo que 
 * apresente o nome do paciente e a faixa de risco, baseando na seguinte tabela:
 * 
 * IMC / Faixa de Risco
 * Abaixo dos 20 / Abaixo do peso
 * A partir dos 20 até 25 / Normal
 * A partir dos 25 até 35 / Excesso de peso
 * A partir dos 35 até 50 / Obesidade
 * A partir dos 50 / Obesidade Mórbida
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc13 { // Inicia a classe Exerc13.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara as variáveis utilizadas no programa como double.
        double peso, altura, imc;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o peso do paciente (em kg): "); // Prompt para o usuário.
        peso = Double.parseDouble(scan.next()); // Lê a variável peso.
        System.out.print("Informe a altura do paciente (em m): "); // Prompt para o usuário.
        altura = Double.parseDouble(scan.next()); // Lê a variável altura.
        
        // Calcula o IMC. Foi utilizado o método pow da classe Math para calcular
        // o quadrado da altura. Alternativamente, poderia ter sido utilizada a
        // fórmula imc = peso/(altura * altura);
        imc = peso/(Math.pow(altura, 2));
        
        // Testa se o IMC é inferior a 20.
        if (imc < 20) {
            // Exibe mensagem ao usuário.
            System.out.println("Abaixo do peso. IMC = "+imc);
        }else{ // Caso a condição acima seja falsa:
            // Testa se o IMC está entre 20 e 25.
            if ((imc >= 20) && (imc <= 25)) {
                // Exibe mensagem ao usuário.
                System.out.println("Normal. IMC = "+imc);
            }else{ // Caso as condições acima sejam falsas:
                // Testa se o IMC está entre 25 e 35:
                if ((imc >= 25) && (imc <= 35)) {
                    // Exibe mensagem ao usuário.
                    System.out.println("Excesso de peso. IMC = "+imc);
                }else{ // Caso as condições acima sejam falsas:
                    // Testa se o IMC está entre 35 e 50.
                    if ((imc >= 35) && (imc <= 50)) {
                        // Exibe mensagem ao usuário.
                        System.out.println("Obesidade. IMC = "+imc);
                    }else{ // Caso as condições acima sejam falsas:
                        // Testa se o IMC é superior a 50.
                        if (imc > 50) {
                            // Exibe mensagem ao usuário.
                            System.out.println("Obsesidade mórbida. IMC = "+imc);
                        } // Fim do if.
                    } // Fim do else.
                } // Fim do else.
            } // Fim do else.
        } // Fim do else.   
    } // Fim do método principal.
} // Fim da classe Exerc13.