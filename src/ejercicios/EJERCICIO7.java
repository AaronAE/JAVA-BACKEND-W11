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
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       String claveO = "eureka";
       String clave;
       
       System.out.println("Ingrese su contraseña");
       clave = leer.nextLine();
       
       if(clave.equals(claveO)){
           System.out.println("Contraseña correcta");
           
       }else {
           System.out.println("COntraseña incorrecta");
       }
    }
    
}
