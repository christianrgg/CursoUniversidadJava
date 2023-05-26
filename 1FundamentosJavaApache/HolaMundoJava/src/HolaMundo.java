
/*
Operadores logicos: && o &, || o |, !, ^
Operadores a nivel de bits: &, |, ^, <<, >>, >>>
Operador condicional: ?:
Prioridad y orden de evaluación: (), [], ., - ~ ! ++ --, new(tipo)expresion, << >> >>>, < > <= >=, == !=, &, ||, ?:
*/

public class HolaMundo {
    
    public static void main(String args[]) {
        var resultado = (1>2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "Numero Par" : "Numero Impar";
        System.out.println("resultado = " + resultado);
    }
}
