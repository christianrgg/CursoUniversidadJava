
public class HolaMundo {

    public static void main(String args[]) {
        char miCaracter = 'A';
        System.out.println("miCaracter = " + miCaracter);

        //Lista Unicode
        char varChar = '\u0022';
        System.out.println("varChar = " + varChar);

        char varDecimal = 35;
        System.out.println("varDecimal = " + varDecimal);

        char varSimbolo = '$';
        System.out.println("varSimbolo = " + varSimbolo);

        
        //Inferencia con var en tipo char
        var varChar2 = '\u0022';
        System.out.println("varChar2 = " + varChar2);

        var varDecimal2 = (char)35;
        System.out.println("varDecimal2 = " + varDecimal2);

        var varSimbolo2 = '$';
        System.out.println("varSimbolo2 = " + varSimbolo2);
        
        
        //Convertir char a entero: Arrojara el decimal del unicode como resultado: 36
        int variableEnteraSimbolo = '$';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

    }
}
