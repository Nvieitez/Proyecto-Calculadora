package com.Papfredder.In_Out;

// Imports
import javax.swing.*;

public class Salida {

    /*
     * Variables para determinar la forma de mostrar los datos
     * @param Consola
     * @param Ventana
    */

    private final static float Consola = 0;
    private final static float Ventana = 0;

    /*
     * Método para mostrar los datos por Consola
     * @param dato
     */

    public static void Consola (Float Dato){

        // La variable "Dato" es lo que se va a mostrar por consola
        System.out.println(Dato.floatValue());
    }

    /*
     * Método para mostrat los datos por pantalla (JOptionPane)
     * @param dato
     */

    public static void Ventana (Float Dato){

        JOptionPane.showMessageDialog(null, Dato);
    }
}
