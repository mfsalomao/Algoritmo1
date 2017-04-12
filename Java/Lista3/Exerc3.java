/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

// 3. Dadas 3 pontuações de finalistas em um campeonato, informe qual a pontuação
// que ficou em primeiro, segundo e terceiro lugar.

import java.util.Scanner;
/**
 *
 * @author johndoe*/

public class Exerc3 {
    public static void main(String[] args) {
        double pontuacaoA, pontuacaoB, pontuacaoC, maior;
        String nomeA, nomeB, nomeC;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o nome do finalista: ");
        nomeA = scan.next();
        System.out.print("Informe a pontuação de "+nomeA+": ");
        pontuacaoA = Double.parseDouble(scan.next()); 
        System.out.print("Informe o nome do finalista: ");
        nomeB = scan.next();
        System.out.print("Informe a pontuação de "+nomeB+": ");
        pontuacaoB = Double.parseDouble(scan.next()); 
        System.out.print("Informe o nome do finalista: ");
        nomeC = scan.next();
        System.out.print("Informe a pontuação de "+nomeC+": ");
        pontuacaoC = Double.parseDouble(scan.next()); 
        
        if ((pontuacaoA > pontuacaoB) && (pontuacaoB > pontuacaoC)) {
            System.out.println(nomeA+" está em primeiro lugar com "+pontuacaoA+" pontos.");
            System.out.println(nomeB+" está em segundo lugar com "+pontuacaoB+" pontos.");
            System.out.println(nomeC+" está em terceiro lugar com "+pontuacaoC+" pontos.");         
        }else{
             if ((pontuacaoA > pontuacaoC) && (pontuacaoC > pontuacaoB)) {
                System.out.println(nomeA+" está em primeiro lugar com "+pontuacaoA+" pontos.");
                System.out.println(nomeC+" está em segundo lugar com "+pontuacaoC+" pontos.");
                System.out.println(nomeB+" está em terceiro lugar com "+pontuacaoB+" pontos."); 
            }else{
                if ((pontuacaoB > pontuacaoA) && (pontuacaoA > pontuacaoC)) {
                    System.out.println(nomeB+" está em primeiro lugar com "+pontuacaoB+" pontos.");
                    System.out.println(nomeA+" está em segundo lugar com "+pontuacaoA+" pontos.");
                    System.out.println(nomeC+" está em terceiro lugar com "+pontuacaoC+" pontos.");
                }else{
                    if ((pontuacaoB > pontuacaoC) && (pontuacaoC > pontuacaoA)) {
                        System.out.println(nomeB+" está em primeiro lugar com "+pontuacaoB+" pontos.");
                        System.out.println(nomeC+" está em segundo lugar com "+pontuacaoC+" pontos.");
                        System.out.println(nomeA+" está em terceiro lugar com "+pontuacaoA+" pontos.");
                    }else{
                        if ((pontuacaoC > pontuacaoA) && (pontuacaoA > pontuacaoB)) {
                            System.out.println(nomeC+" está em primeiro lugar com "+pontuacaoC+" pontos.");
                            System.out.println(nomeA+" está em segundo lugar com "+pontuacaoA+" pontos.");
                            System.out.println(nomeB+" está em terceiro lugar com "+pontuacaoB+" pontos.");
                        }else{
                            if ((pontuacaoC > pontuacaoB) && (pontuacaoB > pontuacaoA)) {
                                System.out.println(nomeC+" está em primeiro lugar com "+pontuacaoC+" pontos.");
                                System.out.println(nomeB+" está em segundo lugar com "+pontuacaoB+" pontos.");
                                System.out.println(nomeA+" está em terceiro lugar com "+pontuacaoA+" pontos.");
                            }else{
                                System.out.println("Não é possível determinar os colocados.");
                            }
                        }
                    }
                }
            }
        }
    }
}