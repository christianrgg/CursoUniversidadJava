
import java.util.Scanner;


public class HolaMundo {

    public static void main(String args[]) {
       /*
        Tipos primitivos enteros: byte(8 bits), short(1 bits), int(32bits), long (64 bits)
        */
       
       byte numeroByte = 127;
        System.out.println("Valor minimo byte" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte" + Byte.MAX_VALUE);
        //A partir del numero 128 ya no se guardará o copilará marcara perdida de presicion
        
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short" + Short.MIN_VALUE);
        System.out.println("Valor maximo short" + Short.MAX_VALUE);
        
        int numeroEntero = 2147483647;
        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("Valor minimo Int" + Integer.MIN_VALUE);
        System.out.println("Valor maximo Int" + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo Long" + Long.MIN_VALUE);
        System.out.println("Valor maximo Long" + Long.MAX_VALUE);
    }
}
