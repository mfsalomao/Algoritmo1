package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 19.
 * 
 * Dois carros percorreram diferentes distâncias em diferentes tempos. 
 * Sabendo que a velocidade média é a razão entre a distância percorrida e o
 * tempo levado para percorrê-la, faça um programa para ler as distâncias que
 * cada carro percorreu e o tempo que cada um levou, e indique o carro que teve
 * maior velocidade média.
 * 
 * @author Martinho de Freitas Salomão
 */

// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc19 { // Inicia a classe Exerc9.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        // Declara variáveis utilizadas no programa como do tipo float. As variáveis são
        // as distâncias, os tempos e as velocidades médias de cada carro.
        float distanciaC1, distanciaC2, tempoC1, tempoC2, vmC1, vmC2;
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe a distância percorrida pelo carro 1 (em quilômetros): "); // Prompt para o usuário.
        distanciaC1 = Float.parseFloat(scan.next()); // Lê a distância do carro 1.
        System.out.print("Informe o tempo gasto pelo carro 1 (em horas): "); // Prompt para o usuário.
        tempoC1 = Float.parseFloat(scan.next()); // Lê o tempo do carro 1.
        System.out.print("Informe a distância percorrida pelo carro 2 (em quilômetros): "); // Prompt para o usuário.
        distanciaC2 = Float.parseFloat(scan.next()); // Lê a distância do carro 2.
        System.out.print("Informe o tempo gasto pelo carro 2 (em horas): "); // Prompt para o usuário.
        tempoC2 = Float.parseFloat(scan.next()); // Lê o tempo do carro 2.
        
        vmC1 = (distanciaC1 / tempoC1); // Calcula velocidade média do carro 1.
        vmC2 = (distanciaC2 / tempoC2); // Calcula velocidade média do carro 2.
        
        // Testa condição se a velocidade média do carro 1 é maior que a do carro 2.
        if (vmC1 > vmC2) {
            // Exibe mensagem ao usuário.
            System.out.println("O carro 1 teve a maior velocidade média.");
        }else{ // Caso contrário:
            // Testa condição se a velocidade média do carro 2 é maior que a do carro 1.
            if (vmC2 > vmC1) {
                // Exibe mensagem ao usuário.
                System.out.println("O carro 2 teve a maior velocidade média.");
            }else{ // Caso contrário, ou seja, se nenhuma velocidade for superior a outra:
                // Exibe mensagem ao usuário.
                System.out.println("As velocidades médias foram iguais.");
            } // Fim do else.
        } // Fim do else.
        //Exibe mensagens ao usuário informando a velocidade média de cada carro.
        System.out.println("Velocidade média do carro 1: "+ vmC1+" km/h.");
        System.out.println("Velocidade média do carro 2: "+ vmC2+" km/h.");
    } // Fim do método principal.
} // Fim da classe Exerc19.