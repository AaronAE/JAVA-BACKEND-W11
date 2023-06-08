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
public class EJERCICIO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, opcion;
        String salir;
        
        System.out.println("Ingresa dos números ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
     
        
        do{
        System.out.println("MENU");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        System.out.println("Elija una opción");
        opcion= leer.nextInt();

        
        
            switch (opcion) {
            case 1:
                int suma= num1+num2;
                System.out.println("La suma de los números ingresados es: "+ suma);
                break;
            case 2:
                int resta = num1-num2;
                System.out.println("La resta de los números ingresados es: "+ resta);
                break;
            case 3:
                int producto= num1*num2;
                System.out.println("La multiplicación de los números ingresados es: "+ producto);
                break;
            case 4:
                int division= num1/num2;
                System.out.println("La división de los números ingresados es: "+ division );
                break;
            case 5:
                System.out.println("¿Está seguro que desea Salir?");
                 break;
            default:
                System.out.println("Ingrese un opción correcta");
            }      
        }while(opcion < 5);
        salir = leer.nextLine();
                if (salir.equalsIgnoreCase("S")) {     
                }
    }
}
