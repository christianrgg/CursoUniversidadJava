
import java.util.Scanner;


public class HolaMundo {

    public static void main(String args[]) {
      //Convertir tipo String a tipo int
      var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //Pedir un valor
        /*var consola = new Scanner(System.in);
        System.out.println("Cual es tu edad?");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);*/
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //Extraer un caracter de una cadena y asignarlo a una variable char
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        

    }
}
