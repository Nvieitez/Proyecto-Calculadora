package com.Papfredder.In_Out;

// Imports
import javax.swing.*;
import java.util.Scanner;

public class Entrada {

    /*
     * Variables para determinar la forma de pedir datos
     * @param Consola
     * @param Ventana
    */

    private final static float Consola = 0;
    private final static float Ventana = 0;

    /*
     * Método para introducir datos por consola (Scanner)
     * @param Mensaje
     * @return float
    */

    public static float Consola (String Mensaje){

        // Creación del scanner para pedir datos por consola
        Scanner Scanner = new Scanner (System.in);

        // Impresión del Mensaje
        System.out.println(Mensaje);

        // Return
        return Scanner.nextFloat();
    }

    /*
     * Método para introducir datos por ventana (JOptionPane)
     * @param Mensaje
     * @return float
    */

    public static float Ventana (String Mensaje){

        // Return 
        return Float.parseFloat(JOptionPane.showInputDialog(Mensaje));
    }
}
