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
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = leer.nextInt();
       if (num % 2 != 0) {
            System.out.println("Este número es impar");
           
       }else {
            System.out.println("Este número es par");
    
       }
    }
    
}
