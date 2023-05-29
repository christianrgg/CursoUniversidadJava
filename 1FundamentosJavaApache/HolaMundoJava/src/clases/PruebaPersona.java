
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        //Se llama la clase Persona, Se define el nombre del objeto
        Persona persona1;
        
        //persona1 llama al constructor Persona para crear un nuevo objeto (Recordar windows navigator)
        persona1 = new Persona();
        //Asignar los atributos del nuevo objeto persona1
        persona1.nombre = "Juan";
        persona1.apellido = "Gutierrez";
        persona1.desplegarInformación();
    }
}
