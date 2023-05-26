
/*
Operadores de relacion: <, >, <=, >=, !=, ==
Operadores logicos: && o &, || o |, !, ^
Operadores a nivel de bits: &, |, ^, <<, >>, >>>
Operador condicional: ?:
Prioridad y orden de evaluación: (), [], ., - ~ ! ++ --, new(tipo)expresion, << >> >>>, < > <= >=, == !=, &, ||, ?:
*/

public class HolaMundo {
    
    public static void main(String args[]) {
        var a = 3;
        var b = 2;
        
        var c = (a==b);
        System.out.println("c = " + c);
        
        var d  = a != b;
        System.out.println("d = " + d);
        
        //Procedimiento para variables cadena
        var cadena = "Hola";
        var cadena2 = "hola";
        var e = cadena == cadena2; //Compara referencias de objetos de la variable (string, var, int)
        System.out.println("e = " + e);
        
        //Para evaluar si una cadena es igual a otra en contenido
        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);

    }
}
