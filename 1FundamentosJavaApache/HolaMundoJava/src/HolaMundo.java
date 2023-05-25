
public class HolaMundo {

    public static void main(String args[]) {
        // Con diagonal invertida + n "\n" da un salto de linea
        var nombre = "Saira";
        System.out.println("Nueva linea: \n" + nombre);
        
        // Con diagonal invertida + t "\t" da un sangria de espacio
        System.out.println("Sangria: \t" + nombre);    
        
        // Caracter de retroceso Elimina el ultimo caracter (De acuerdo a las veces que lo escribas)
        System.out.println("Sangria: \b" + nombre); 
        System.out.println("Sangria: \b\b" + nombre); 
        
        // Caracter de comillas simples coloca todo entre comillas
        System.out.println("Comilla: \'" + nombre + "\'"); 
        
        // Caracter de comillas dobles coloca todo entre comillas dobles \"
        System.out.println("Comilla: \"" + nombre + "\""); 
        
    }
}
