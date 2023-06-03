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
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados actualmente");
        float num = leer.nextFloat();
        float faren = 32 +  ((9*num)/5);
        System.out.println("Los grados Fahrenheit son: "+faren);
    }
    
}
