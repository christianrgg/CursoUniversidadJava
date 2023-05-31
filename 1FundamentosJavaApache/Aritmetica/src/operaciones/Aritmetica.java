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
    
    //Metodo con argumentos
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b= a;
//        return a+b;
        return this.sumarConRetorno();
    }
}

// this hace referencia a un atributo de nuestra clase y no de nuestra variable local