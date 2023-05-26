
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        //Para los casos switch las comprobaciones puedes ser numericas o strings
        var mes = 2;
        var estación = "Caso no encontrado";

        switch(mes) {
            case 12: case 1: case 2:
                estación = "Invierno";
                break;
            case 3: case 4: case 5:
                estación = "Primavera";
                break;
            case 6: case 7: case 8:
                estación = "Verano";
                break;
            case 9: case 10: case 11:
                estación = "Otonio";
                break;
            default:
                estación = "Caso no encontrado";
        }
        System.out.println("estación = " + estación);
    }
}
