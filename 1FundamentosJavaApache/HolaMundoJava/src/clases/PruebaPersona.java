
package clases;

public class PruebaPersona {
    public static void main(String[] args) {      
        Persona persona1 = new Persona(); // Esta es la forma de hacerlo en una sola linea
        persona1.nombre = "Juan";
        persona1.apellido = "Gutierrez";
        persona1.desplegarInformación();
        
        //Para obtener ubicación en memoria
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2); //Consola: persona2 = clases.Persona@15aeb7ab   nombredelpaquete + nombre de la clase + ubicación en memoria
        
        persona2.desplegarInformación();
        persona2.nombre = "Saira";
        persona2.apellido = "Hernandez";
        persona2.desplegarInformación();
    }
}
