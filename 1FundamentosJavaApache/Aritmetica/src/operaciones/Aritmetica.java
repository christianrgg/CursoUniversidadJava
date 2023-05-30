package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Metodo
    //primera letra minutscula, de ahi uppercase
    //Void indica que este metodo no regresa nada
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    //Metodo que regresa un entero
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
          return a + b;
        
    }
}
