package lista3; // Nome do pacote ao qual o programa está vinculado.

/**
 * Lista 3 de Algoritmo 1 (FAESA) - Exercício 6.
 * 
 * Dado um estado, informar de qual região ele pertence.
 * 
 * @author Martinho de Freitas Salomão
 */
 
// Importa a classe Scanner do pacote java.util.
import java.util.Scanner;

public class Exerc6 { // Início da classe Exerc6.
    
    // Método principal, inicia a execução do aplicativo Java.
    public static void main(String[] args) {
        
        String estado; // Declara variável estado como string. Será a sigla do Estado.
        
        // Cria um Scanner chamado scan para obter entrada da janela de comando.
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe a sigla de um Estado brasileiro: "); // Prompt para o usuário.
        
        estado = scan.next(); // Lê a sigla do Estado fornecida pelo usuário.
        
        // Se o usuário tiver digitado em minúsculo, transforma em maiúsculo.
        estado = estado.toUpperCase(); 
        
        // Começa a avaliação das condições. Cada if testa se o Estado pertence
        // à determinada região. na condição é utilizado o OU (símbolo ||), pois
        // não é possível pertencer à mais de um Estado ao mesmo tempo. O comando
        // .equals() é utilizado pois se trata de verificar strings.
        
        // Testa condição para região Sudeste. 
        if (estado.equals("ES") || estado.equals("RJ") || estado.equals("SP") || estado.equals("MG")) {
            System.out.println("O Estado "+estado+" pertence à região Sudeste."); // Exibe mensagem para o usuário.
        
        // Se o Estado não pertencer à região Sudeste, testa para a região Sul.    
        }else{ 
            if (estado.equals("RS") || estado.equals("SC") || estado.equals("PR")) {
                System.out.println("O Estado "+estado+" pertence à região Sul."); // Exibe mensagem para o usuário.
                
            // Se o Estado não pertencer às regiões Sul e Sudeste, testa para a região Centro-Oeste.     
            }else{
                if (estado.equals("MS") || estado.equals("MT") || estado.equals("GO") || estado.equals("DF")) {
                    System.out.println("O Estado "+estado+" pertence à região Centro-Oeste."); // Exibe mensagem para o usuário.
                   
                // Se o Estado não pertencer às regiões Sul, Sudeste e Centro-Oeste, testa para a região Nordeste.    
                }else{
                    if (estado.equals("AL") || estado.equals("BA") || estado.equals("CE") || estado.equals("MA") ||
                            estado.equals("PB") || estado.equals("PI") || estado.equals("PE") || estado.equals("RN") ||
                            estado.equals("SE   ")) {
                        System.out.println("O Estado "+estado+" pertence à região Nordeste."); // Exibe mensagem para o usuário.
                        
                    // Se o Estado não pertencer às regiões Sul, Sudeste, Centro-Oeste e Nordeste,
                    // testa para a região Norte.    
                    }else{
                        if (estado.equals("AC") || estado.equals("AP") || estado.equals("AM") || estado.equals("PA") ||
                                estado.equals("RO") || estado.equals("TO")) {
                            System.out.println("O Estado "+estado+" pertence à região Norte."); // Exibe mensagem para o usuário.
                            
                        // Se o Estado não pertencer a nenhuma região do Brasil:    
                        }else{
                            System.out.println("Sigla de Estado não reconhecida.");
                        }
                    }
                }
            }
        }
    }
}