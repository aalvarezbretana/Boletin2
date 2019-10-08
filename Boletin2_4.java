/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuánto dinero desea dividir en billetes "
                + "y monedas?");
        int dinero = teclado.nextInt();
        int bill_100 = dinero / 100;
        int bill_20 = (dinero % 100) / 20;
        int bill_5 = (dinero % 20) / 5;
        int mon_1 = dinero % 5;
        System.out.println("Son " + bill_100 + " de 100, "
                + bill_20 + " de 20, " + bill_5 + " de 5 y "
                + mon_1 + " de 1.");
    }

}
