
/*
Operadores de relacion: <, >, <=, >=, !=, ==
Operadores logicos: && o &, || o |, !, ^
Operadores unitarios: ~, -
Operadores a nivel de bits: &, |, ^, <<, >>, >>>
Operadores de asignación: ++, --, =, *=, /=, %=, +=, -=, <<=, >>=, >>>=
Operador condicional: ?:
Prioridad y orden de evaluación: (), [], ., - ~ ! ++ --, new(tipo)expresion, << >> >>>, < > <= >=, == !=, &, ||, ?:


*/

public class HolaMundo {
    
    public static void main(String args[]) {
        
        int a=3, b=2;
        int c = a + 5 -b;
        System.out.println("c = " + c);
        
        var d = a==c;
        System.out.println("d = " + d);
        
        a +=1; // a= a +1;
        System.out.println("a = " + a);
        
        a +=3; // a= a +1;
        System.out.println("a = " + a);
        
        a -=2; // a= a +1;
        System.out.println("a = " + a);
        
        a *=4; // a= a +1;
        System.out.println("a = " + a);
        
        a /=3; // a= a +1;
        System.out.println("a = " + a);
        
        a %=1; // a= a +1;
        System.out.println("a = " + a);

    }
}
