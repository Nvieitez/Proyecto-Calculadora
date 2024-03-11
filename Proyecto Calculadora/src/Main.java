// Imports (Librería In_Out)
import com.Papfredder.In_Out.*;

// Imports
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Float ValorFinal = Calculadora.Opción(4,Entrada.Ventana("Introduzca el primer número"),Entrada.Ventana("Introduzca el segundo número"));

        //Visualizamos el retorno
        if(ValorFinal == null){

            JOptionPane.showMessageDialog(null,"El resultado final ha sido un valor erroneo");

        } else{

            Salida.Ventana(ValorFinal);
        }
    }
}