
import java.util.Scanner;


public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Escribe el titulo del libro");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Escribe el nombre del autor");
        var autor = consola.nextLine();
        System.out.println("El libro" +" "+ titulo + " " + "fue escrito por" + " " + autor);
    }
}
