
public class HolaMundo {

    public static void main(String args[]) {
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean) {
            System.out.println("La bandera esta alzada");
        }
        else {
            System.out.println("La bandera esta abajo");
        }
        
        var edad = 17;
        
        if(edad >=18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }

    }
}
