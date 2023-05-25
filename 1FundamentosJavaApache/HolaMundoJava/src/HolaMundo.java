
import java.util.Scanner;
//Se solicita capturar la siguiente información de una tienda de libros:
//
//nombre (String)
//
//id (int)
//
//precio (double)
//
//envioGratuito (boolean)
//
//Tu tarea es imprimir un mensaje en el siguiente formato:
//
//Proporciona el nombre:
//Proporciona el id:
//Proporciona el precio:
//Proporciona el envio gratuito:
//<nombre> #<id>
//Precio: <simbolo><precio>
//Envio Gratuito: <envioGratuito>
//Por ejemplo:
//
//Proporciona el nombre:
//Programacion con Java
//Proporciona el id:
//1520
//Proporciona el precio:
//899
//Proporciona el envio gratuito:
//true
//Programacion con Java #1520
//Precio: $899.00
//Envio Gratuito: true

public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Proporciona el nombre del libro:");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("Proporciona el ID:");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre + " " + "#ID" + " " + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envioGratuito);

    }
}
