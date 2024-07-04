/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmarulanda.cursorepasocap1;

/**
 * @author Andres_Marulanda
 */

import java.util.Scanner; // Paquete Scanner, importamos para poder leer datos ingresados desde el teclado.

public class condicionales {  
    
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args){

         // Trabajar las sentencias if y switch.
         
         // Condicional simple.
         byte cantidadManzanas = 10;
         
         if (cantidadManzanas == 10){
             System.out.println("Hay " + cantidadManzanas + " manzanas en la nevera.");
         }
         
         // Condicional doble.
         byte edad = 0;
         
         System.out.println("\nIngrese su edad: ");
         edad = leer.nextByte();
         
         if (edad >= 18){
             System.out.println("Es mayor de edad.");
         } else {
             System.out.println("Es menor de edad.");
         }
         
         // Condicional multiple.
         float calificacion = 0;
         
         System.out.println("\nIngrese la calificación: ");
         calificacion = leer.nextFloat();
         
         if (calificacion < 3){
             System.out.println("No aprobó.");
         } else if(calificacion >= 3 && calificacion < 4){
             System.out.println("Aprobó, pero debe reforzar.");
         }else if (calificacion >= 4 && calificacion <= 5){
             System.out.println("Aprobó, muy buen resultado.");
         } else {
             System.out.println("Nota no valida.");
         }
    }  
}
