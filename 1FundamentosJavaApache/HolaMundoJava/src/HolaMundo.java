
/*
Operadores de relacion: <, >, <=, >=, !=, ==
Operadores logicos: && o &, || o |, !, ^
Operadores a nivel de bits: &, |, ^, <<, >>, >>>
Operador condicional: ?:
Prioridad y orden de evaluación: (), [], ., - ~ ! ++ --, new(tipo)expresion, << >> >>>, < > <= >=, == !=, &, ||, ?:
*/

public class HolaMundo {
    
    public static void main(String args[]) {
        //Operadores relacionales
        var a = 2;
        var b = 3;
        
        var g = a >= b; //Myot que > o el mayor o igual >=
        System.out.println("g = " + g);
        
        if(a % 2 ==0 ){
            System.out.println("A es numero par");
        }
        else {
            System.out.println("A es numero impar");
        } 
        
        var edad = 30;
        var adulto = 18;
        if(edad >= adulto) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
        
        
        

    }
}
