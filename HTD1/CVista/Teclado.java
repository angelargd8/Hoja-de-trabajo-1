/**
 * Autores:
 *  Angela García #22869
 *  Carlos Valladares #221164
 *  Santiago Pereira #22318
 */
//Para validar los espacios de los nombres o apellidos 
package CVista;
//Modulos:
import java.util.Scanner;

public class Teclado {
    Scanner leer;

    public Teclado() {
        leer = new Scanner(System.in);
        
    }

    
    /** 
     * @param titulo
     * @return String
     */
    public String getString(String titulo){
        String string1 = "";

        while(string1.equals("")){
            System.out.println(titulo);
            string1 = leer.nextLine();
        }      
        return string1;

    }


}