
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        //INSTRUCCION
        System.out.println("Ingresa calificación del alumno");
        //LLANADO CLASE CONSOLA
        Scanner consola = new Scanner(System.in);
        //CONVIRTIENDO DATOS DE LA CONSOLA
        var calificación = Integer.parseInt(consola.nextLine());
        
        var letraCalificacion= "Caso no encontrado";

        switch(calificación) {
            case 10:
                letraCalificacion = "A";
                break;
            case 9:
                letraCalificacion = "B";
                break;
            case 8: 
                letraCalificacion = "C";
                break;
            case 7:
                letraCalificacion = "D";
                break;
            case 6:
                letraCalificacion = "E";
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                letraCalificacion = "F";
                break;
            default:
                letraCalificacion = "No aplica";
        }
        System.out.println("letraCalificacion = " + letraCalificacion);
    }
}
