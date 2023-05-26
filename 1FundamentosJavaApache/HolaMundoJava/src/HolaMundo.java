
/*
Operadores de relacion: <, >, <=, >=, !=, ==
Operadores logicos: && o &, || o |, !, ^
Operadores unarios: ~, -
Operadores a nivel de bits: &, |, ^, <<, >>, >>>
Operador condicional: ?:
Prioridad y orden de evaluación: (), [], ., - ~ ! ++ --, new(tipo)expresion, << >> >>>, < > <= >=, == !=, &, ||, ?:


*/

public class HolaMundo {
    
    public static void main(String args[]) {
        //Operadores de cambio de signo
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
       
        //Operadores de complemento logicos. 
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Operadores de incremento
        //1. Pre-incremento (Simbolo antes de la variable)
        var e = 3;
        var f = ++e; //Primero se incrementa la variabe y despues se usa su valor
        System.out.println("e = " + e); //Ya no será 3 sino 4
        System.out.println("f = " + f); //Ya no será 3 sino 4
        //Post-incremento (Simbolo despues de la variable)
        var g = 5;
        var h = g++; //Primero se utiliza el valor y despues se incrementa
        System.out.println("h = " + h); //Primero se uso el varlor y dio 5
        System.out.println("g = " + g); //Se incrmenta el valor y da 6 

        //Operadores de decremento
        //1. Predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i); //Ya esta decrementada
        System.out.println("j = " + j); 
        //2.Postdecremento
        var k = 4;
        var l = k--; //Primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k); //Tenia pendiente un decremento
        System.out.println("l = " + l);
        
        
        

    }
}
