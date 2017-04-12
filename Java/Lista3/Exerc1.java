/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

// 1. Dada uma idade, informar se ela está compreendida no intervalo de 10 a 18 anos.


import java.util.Scanner;
/**
 *
 * @author johndoe
 */
public class Exerc1 {
    public static void main(String[] args) {
        int idade;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        idade = Integer.parseInt(scan.next());
        if ((idade >= 10) && (idade <= 18)) {
            System.out.println("A idade está compreendida no intervalo entre 10 e 18 anos.");
        }    
    }
}
