package calculo;

public class Caja {
    //Variables
    int ancho;
    int alto;
    int profundo;
    
    //Constructor vacio
    public Caja(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    //Constructor con argumentos
    public Caja (int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    //Metodo
    
    public void multiplicacion(){
        int resultado = ancho * alto * profundo;
        System.out.println("resultado = " + resultado);
    }
    
    public int multiplicacionConRetorno(){
        return this.ancho * this.alto * this.profundo;
    }
    
   
    public int multiplicarConArgumentos(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
     
        return this.multiplicacionConRetorno();
    }
}
