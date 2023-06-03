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
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       String palabra,primeraLetra;
       
       System.out.println("Ingrese una palabra");
       palabra = leer.nextLine();
       primeraLetra = palabra.substring(0,1);
        //System.out.println(lon);
       
       if(primeraLetra.toUpperCase().equals("A")){
           System.out.println("Palabra correcta");
           
       }else {
           System.out.println("Palabra incorrecta");
    }
     }
    
}
