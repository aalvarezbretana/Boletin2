/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es el precio final?");
        float precio_final = teclado.nextFloat();
        System.out.println("¿Y el precio inicial?");
        float precio_inicial = teclado.nextFloat();
        float porcentaje = 100 - ((precio_final / precio_inicial) * 100);
        System.out.println("El porcentaje de descuento es "
                + Math.round(porcentaje) + "%.");
    }

}
