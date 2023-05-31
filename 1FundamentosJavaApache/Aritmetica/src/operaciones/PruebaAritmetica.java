package operaciones;


public class PruebaAritmetica {
    //Atajo psvm + TAB
    
    public static void main(String[] args) {
        
        //Variables locales solo pueden usar var
        var a = 10; //Se almacenan en la memoria stack
        var b = 2; //Se almacenan en la memoria stack
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica(); //Se almacena en la memoria heap
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
        
    }
    
    public static void miMetodo(){
        //La variable "a" esta fuera del alcance donde esta definida
        //a=20;
        System.out.println("Otro metodo");
        
    }
    
    //Variables locales se almacenan en la memoria stack
    //Vatiables tipo objeto se almacenan en la memoria heap
    
}
