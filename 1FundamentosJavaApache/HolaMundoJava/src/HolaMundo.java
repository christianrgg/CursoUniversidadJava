
/*

Operadores a nivel de bits: &, |, ^, <<, >>, >>>
Prioridad y orden de evaluación: (), [], ., - ~ ! ++ --, new(tipo)expresion, << >> >>>, < > <= >=, == !=, &, ||, ?:
*/

public class HolaMundo {
    
    public static void main(String args[]) {
        //Orden en que se evaluan los operadores en JAVA
        // https://res.cloudinary.com/ddfzagwob/image/upload/v1685065738/Recursos_Academicos/prioridad_op2jj5.png
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        //4+((5*6)/3) = 14
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4+5)*6/3; //18 ---> (9*6)/3
        System.out.println("resultado = " + resultado);
    }
}
