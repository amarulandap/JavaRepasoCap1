/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmarulanda.registroalumnos;

/**@author Andres_Marulanda
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionDatos {
    
    static Scanner leer = new Scanner(System.in);
    
    public static int validarDatos(String mensaje){
        
        int numero;
        
        System.out.println(mensaje);
        try{
            numero = leer.nextInt();
        } catch (InputMismatchException e){
            // e.printStackTrace();
            numero = 0;
            leer.next();            // Limpiar NextInt para evitar que la excepción se convierta en un ciclo infinito.
        }
        return numero;
    }
    
}
