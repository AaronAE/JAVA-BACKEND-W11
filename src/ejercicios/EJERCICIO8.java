/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author espin
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       String clave;
       int lon;
       System.out.println("Ingrese una palabra de 8 caracteres");
       clave = leer.nextLine();
       lon = clave.length();
       
       if(lon == 8){
           System.out.println("Cantidad correcta");
           
       }else {
           System.out.println("Cantidad incorrecta");
       }
    }
    
}
