package calculo;

public class PruebaCaja {
    public static void main(String[] args) {
        //Creando constructor 
        Caja caja1 = new Caja();
        
        //Llamando constructor vacio
        //System.out.println("caja1 = " + caja1);
        
        //Asignando valores a constructor vacio
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        
        int resultado = caja1.multiplicacionConRetorno();
        System.out.println("resultado de multiplicacionConRetorno = " + resultado);
        
        Caja caja2 = new Caja(3,2,6);
        int resultado2 = caja2.multiplicarConArgumentos(3, 2,6);
        System.out.println("Resultado de multiplicaciónConArgumentos = " + resultado2);
    }
}
