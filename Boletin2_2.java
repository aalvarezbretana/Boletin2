/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos grados Celsius(ºC) desea convertir en Kelvin "
                + "y Fahrenheit?");
        float celsius = teclado.nextFloat();
        float kelvin = celsius + 273.15f;
        float fahren = celsius * 9 / 5 + 32;
        System.out.println("Son " + kelvin + " K y " + fahren + " ºF.");
    }

}
