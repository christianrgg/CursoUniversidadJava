//Para crear una clase
//    1. Clic derecho sobre "Source Packages"
//    2. Opción "New" y Java Class
//    3. Colocar el nombre de la clase
//    4. En input packages escribir clases. 


package clases;

//La primer letra de cada palabra debe estar en mayuscula

public class Persona {
    //Atributos de la clase
    String nombre;
    String apellido;
    
    // El public indica que es un metodo global
    // El void indica que no regresa ningun tipo de información
    public  void desplegarInformación(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellellido:" + apellido);
    }
    
    //Para verificar lo que contiene la clase clic en menu window y opción navigation
    
}
