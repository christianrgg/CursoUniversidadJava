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
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b= arg2;
//        return a+b;
        return sumarConRetorno();
    }
}

//PASOS PARA DEBUGUEAR
//1. Pon el punto de ruptura
//2. Clic derecho "debug file"
//3. Ir visualizando la ejecución
//4. Para entrar a algun metodo hacer doble clic sobre y debe seleccionarse
//5. Luego clic en boton "Step Into F7"
//6. Seguir debuggueando con "Step Over F8"