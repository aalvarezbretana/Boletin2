/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál ha sido su sueldo fijo?");
        float fixo = teclado.nextFloat();
        System.out.println("¿Cuántos euros ha logrado en ventas?");
        float comision = teclado.nextFloat() * 5 / 100;
        System.out.println("¿Cuántos quilómetros ha hecho al mes?");
        float quilometraje = teclado.nextFloat() * 2;
        System.out.println("¿Cuántos días ha tenido que desplazarse?");
        float dietas = teclado.nextFloat() * 30;
        float bruto = fixo + comision + quilometraje + dietas;
        final float RSS = 36;
        float irpf = bruto * 18 / 100;
        float liquido = bruto - irpf - RSS;
        System.out.println("Su sueldo bruto es de " + bruto
                + " € y su sueldo líquido es de " + liquido + " €.");
    }

}
