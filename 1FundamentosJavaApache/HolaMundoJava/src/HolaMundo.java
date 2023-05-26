
import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Ingresa el primer valor:");
        Scanner consola = new Scanner(System.in);
        int valor1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa el segundo valor:");
        var valor2 = Integer.parseInt(consola.nextLine());
        if (valor1 > valor2)  {
            System.out.println("En número mayor es " + valor1);
        }
        else {
            System.out.println("El número mayor es " + valor2);
        }
    }
}
