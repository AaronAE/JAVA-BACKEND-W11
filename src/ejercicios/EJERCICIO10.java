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
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero positivo");
        int limitePositivo = scanner.nextInt();

        int suma;
        do {
            suma=0;
            System.out.println("Digite el primer numero");
            int primerNumero = scanner.nextInt();
            System.out.println("Digite el segundo numero");
            int segundoNumero = scanner.nextInt();
            suma = primerNumero + segundoNumero;
        } while(limitePositivo > suma);
    }
    
}
