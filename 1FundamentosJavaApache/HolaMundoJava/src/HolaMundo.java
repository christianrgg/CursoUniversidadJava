
public class HolaMundo {

    public static void main(String args[]) {
        var nombre = "Christian Roberto";
        var apellidos = "Garcia Gutierrez";

        var nombreCompleto = nombre + " " + apellidos;
        System.out.println("nombreCompleto = " + nombreCompleto);

        //Para alinear caracteres clic derechos + Format
        //Palabras reservadas en JAVA
            //abstract	continue	for	new	switch
            //assert	default	goto	package	synchronized
            //boolean	do	if	private	this
            //break	double	implements	protected	throw
            //byte	else	import	public	thows
            //case	enum	instanceof	return	transient
            //catch	extends	int	short	try
            //char	final	interface	static	void
            //class	finally	long	strictfp	volatile
            //const	float	native	super	while
        
        var i = 3;
        var j = 5;
        System.out.println(i + j);
        System.out.println(i +j +nombreCompleto);
        
        //Contexto cadena, si encuentra al concatenar primero una cadena, todo lo demás concatenado sera cadena
        System.out.println(nombreCompleto + i + j);
        
        // Con parentesis se eliminaria el contexto cadena
        System.out.println(nombreCompleto + (i +j));
    }
}
