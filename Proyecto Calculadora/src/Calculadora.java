// Import
import javax.swing.*;

// Creación de la calculadora
public class Calculadora {
   
    //Opción para sumar 
    public final static int Suma = 1;
    
    //Opción para restar
    public final static int Resta = 2;
    
    // Opción para multiplicar
    public final static int Multiplicación = 3;
    
    // Opción para dividir
    public final static int División = 4;
    
    /*
     * Método para realizar las operaciones básicas
     * @param Opción Determina que operación se va a realizar
     * @param Dato1 Determina el valor del primer dato que se va a utilizar para el cálculo
     * @param Dato2 Determina el valor del segundo dato que se va a utilizar para el cálculo
    */

    public static float Opción(Integer Opción, Float Dato1, Float Dato2) {

        // Resultado inicial (Antes de operar)
        Float Resultado = 0f;

        // Opciones disponibles para operar
        switch (Opción) {

            case 1:

                // Operación Suma
                Resultado = Dato1 + Dato2;

            break;

            case 2:

                // Operación Resta
                Resultado = Dato1 - Dato2;

            break;

            case 3:

                // Operación Multiplicación
                Resultado = Dato1 * Dato2;

            break;

            case 4:

                // Operación División
                // Comprobación de valor erroneo
                if (Dato1 == 0){

                    JOptionPane.showMessageDialog(null,"Es imposible dividir entre 0","El valor no es válido", JOptionPane.ERROR_MESSAGE);
                }
                else{

                    if(Dato2 == 0) {

                        JOptionPane.showMessageDialog(null,"Es imposible dividir entre 0","El valor no es válido", JOptionPane.ERROR_MESSAGE);
                    } 
                    else {

                            // Operación
                            Resultado = Dato1 / Dato2;
                        } 
                    }

            break;

            case 5:

                // Operación Raíz Cuadrada
                // Comprobación de los datos
                if (Dato1 < 0){

                    JOptionPane.showMessageDialog(null,"No se puede hacer la raíz de un número negativo","El valor no es válido", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    
                    if (Dato2 < 0){

                        JOptionPane.showMessageDialog(null,"No se puede hacer la raíz de un número negativo","El valor no es válido", JOptionPane.ERROR_MESSAGE);
                    }
                    else {

                        // Operación
                        JOptionPane.showMessageDialog(null, "La raíz Cuadrada del primer número es: " + Math.floor(Math.sqrt(Dato1)) + "\nLa raíz del segundo número es: " + Math.floor(Math.sqrt(Dato2)));

                    }
                }
                
            break;

            case 6:
                    
                // Operación Raíz Cúbica
                // Comprobación de los datos
                if (Dato1 < 0){

                    JOptionPane.showMessageDialog(null,"No se puede hacer la raíz de un número negativo","El valor no es válido", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    
                    if (Dato2 < 0){

                        JOptionPane.showMessageDialog(null,"No se puede hacer la raíz de un número negativo","El valor no es válido", JOptionPane.ERROR_MESSAGE);
                    }
                    else {

                        // Operación
                        JOptionPane.showMessageDialog(null, "La raíz Cuadrada del primer número es: " + Math.floor(Math.cbrt(Dato1)) + "\nLa raíz del segundo número es: " + Math.floor(Math.cbrt(Dato2)));

                    }
                }

            break;
                
            default:

                // Creamos un default para que de un resultado nulo cuando no se ponga ningún valor
                Resultado = null;

            break;
        }

        // Retornamos el resultado para que se pueda leer
        return Resultado;
    }
}
