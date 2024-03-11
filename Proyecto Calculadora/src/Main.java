// Imports (Librería In_Out)
import com.Papfredder.In_Out.*;

// Imports
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int BotónPresionado;

        BotónPresionado = Integer.parseInt((JOptionPane.showInputDialog("""
                Escribe el número de la operación deseada:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Raíz Cuadrada
                    6. Raíz Cúbica
                """)));

        Float ValorFinal = Calculadora.Opción(BotónPresionado,Entrada.Ventana("Introduzca el primer número"),Entrada.Ventana("Introduzca el segundo número"));
        
        //Visualizamos el retorno
           Salida.Ventana(ValorFinal);
    }
}
