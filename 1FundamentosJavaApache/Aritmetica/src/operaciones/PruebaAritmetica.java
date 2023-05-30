package operaciones;


public class PruebaAritmetica {
    //Atajo psvm + TAB
    
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        //Atajo ctrl + espacio
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
    }
    
    
}
