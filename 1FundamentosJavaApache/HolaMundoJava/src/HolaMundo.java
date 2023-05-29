
import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String args[]) {
        //CICLO FOR
        for(var contador = 0; contador < 3; contador++){
            System.out.println("contador = " + contador);
        }

//        Ciclo WHILE
//        var contador = 0;
//        while(contador < 3){ //Seleccionar contador < 3 y hacer clic derecho opción  "New Watch" y debuggear
//            System.out.println("contador = " + contador);
//            contador++;
//        }

        //Ciclo DO WHILE
//        var contador = 0;
//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        }while(contador <3);
//    
    
    //Usar While: Si queremos que la condición se compruebe desde un inicio y no se ejecute nada del código del ciclo en caso de que la condición sea falsa
    //Usar Do While: En caso de que necesitemos que se ejecute al menos una vez este bloque de código del ciclo independientemente de que la condición sea verdadera o falsa. (La condición se verifica al final de cada iteración por eso al mensuna vez sera ejecutará)
    
    // En resumen, el bucle while se utiliza cuando se quiere repetir un bloque de código mientras se cumpla una condición, mientras que el bucle do-while se utiliza cuando se desea ejecutar un bloque de código al menos una vez y luego repetirlo mientras se cumpla una condición.
    }
}
