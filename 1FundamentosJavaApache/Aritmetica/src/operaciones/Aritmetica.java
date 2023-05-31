package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Las clases por default crean un constructor llamado igual que la clase 
    //Se pueden crear los propios constructores. 
    
    //constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    //Cuando ya hay un constructor definido y se agrega uno o dos nuevos se le llama sobrecarga de constructores
    //Dentro de un metodo o un constructor la inferencia de var no esta permitida se tiene que usar int, boolean etc
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        
    }
    
    
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    //Metodo que regresa un entero
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
          return this.a + this.b; 
    }
    
    //Metodo con argumentos
    public int sumarConArgumentos(int a, int b){ 
        this.a = a; 
        this.b= b; 
//        return a+b;
        return this.sumarConRetorno();
    }
}

