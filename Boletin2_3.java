/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos billetes de 100 tiene?");
        int bill_100 = teclado.nextInt() * 100;
        System.out.println("¿Cuántos billetes de 20 tiene?");
        int bill_20 = teclado.nextInt() * 20;
        System.out.println("¿Cuántos billetes de 5 tiene?");
        int bill_5 = teclado.nextInt() * 5;
        System.out.println("¿Cuántas monedas de 1 tiene?");
        int mon_1 = teclado.nextInt();
        System.out.println("El cálculo es " + (bill_100
                + bill_20 + bill_5 + mon_1) + " €.");
    }

}
