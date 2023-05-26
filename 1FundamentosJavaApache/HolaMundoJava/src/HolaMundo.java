
/*
Operadores logicos: && o &, || o |, !, ^
Operadores a nivel de bits: &, |, ^, <<, >>, >>>
Operador condicional: ?:
Prioridad y orden de evaluación: (), [], ., - ~ ! ++ --, new(tipo)expresion, << >> >>>, < > <= >=, == !=, &, ||, ?:
*/

public class HolaMundo {
    
    public static void main(String args[]) {
        var a = 10;
        var valorMinimo = 9;
        var valorMaximo = 10;
        
        var resultado = a >= 0 && a <= 10;
        if(resultado) {
            System.out.println("Dentro de rango");
        }
        else {
            System.out.println("Fuera de rangoo");
        }
        
        var vacaciones = true;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso) {
            System.out.println("Tiempo libre, Puede viajar");
        }
        else {
            System.out.println("No puede, debe trabajar");
        }
    }
}
