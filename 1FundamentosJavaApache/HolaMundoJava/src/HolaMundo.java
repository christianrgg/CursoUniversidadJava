
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Proporciona la altura del Rectangulo en cm:");
        Scanner consola = new Scanner(System.in);
        var alto = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona la anchura del Rectangulo en cm:");
        var ancho = Double.parseDouble(consola.nextLine());
        var area = alto * ancho;
        var perimetro = (alto + ancho)*2;
        System.out.println("Perimetro: = " + perimetro);
        System.out.println("Área: = " + area);
        
    }
}
