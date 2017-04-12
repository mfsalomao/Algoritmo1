/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

// 2. Faça um algoritmo capaz de identificar se um numero é igual a 1,5 ou 10.
// Caso não seja nenhum desses valores, informe para o usuário a mensagem “valor inválido”.

import java.util.Scanner;
/**
 *
 * @author johndoe
 */
public class Exerc2 {
    public static void main(String[] args) {
        double num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        num = Double.parseDouble(scan.next());
        if ((num == 1) || (num == 5) || (num == 10)) {
            System.out.println("O número é igual a 1, 5 ou 10.");
        }else{
            System.out.println("valor inválido.");
        }
    }
}