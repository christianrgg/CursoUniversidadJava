
public class HolaMundo {
    public static void main(String args[]){
         // Variable Entera
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        // Modificamos el valor de la variable entera
        miVariableEntera = 5;
        // Atajo para la siguiente line sout + TAB
        System.out.println(miVariableEntera);
        
         // Variable String
         String miVariableCadena = "Holis";
         System.out.println(miVariableCadena);
         
         miVariableCadena = "Holis, deja de ignorarme";
         System.out.println(miVariableCadena);
         
        // VAR - Inferencia de tipos en JAVA
        // Infiere el leteral o valor de la variable para ya no colocar int o string
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Soy cadena";
        System.out.println(miVariableCadena2);
        
        //Atajo para imprimir ultima variable soutv + TAB
        miVariableCadena2 = "Soy cadena con atajo";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
    }
}


/*PASOS PARA CREAR PROYECTO SENCILLO EN JAVA 
	1. Clic en new Proyect
	2. Seleccionar java with ant
	3. En projects seleccionar Java with aplication
	4. Clic en next y esperar a que se habilite la caracteristica del ide
	5. Colocar nombre del proyecto "HolaMundoJava"
	6. Colocar ubicación del proyecto lo más cercana a la raiz
	7. Crear clase HolaMundo
	8. Clic en finish
*/