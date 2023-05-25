
/*
Operadores aritmeticos: +, -, *, /, %
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
        var resultado = a +b;
        System.out.println("resultado de la suma= " + resultado);
        
        resultado = a - b;
        System.out.println("resultado de la resta= " + resultado);
        
        resultado = a * b;
        System.out.println("resultado de multiplicación = " + resultado);
        
        resultado = a / b;
        System.out.println("resultado de  división= " + resultado);
        
        var resultado2 = 3.2/b;
        System.out.println("resultado2 = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        //Si solo es una linea de codigo lo que ira dentro del if o else se pueden omitir las llaves
        if(b % 2 == 0 ) 
            System.out.println("Es numero par");
        else 
            System.out.println("Es numero impar");

    }
}
