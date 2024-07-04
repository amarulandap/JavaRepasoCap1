/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmarulanda.cursorepasocap1;

/**
 * @author Andres_Marulanda
 */

import java.util.Scanner;

public class NumeroMayorYMenor {
    
    static Scanner leer = new Scanner(System.in);
    
    public static void main (String[] args){
        
        // Declarar las variables menor y mayor.
        int menor = 0;
        int mayor = 0;
        
        // Pedimos al usuario que ingrese cada uno de los datos.
        System.out.println("Ingrese el primer número: ");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int numero3 = leer.nextInt();  
        
        if (numero1 > numero2){
            if (numero1 > numero3){         // Número 1 es el mayor.
              if (numero2 > numero3){       // Comparo solo 2 y 3.
                    mayor = numero1;
                    menor = numero3;
                } else {
                    mayor = numero1;
                    menor = numero2;
                }  
            } else {                       
                mayor = numero3;           // También es mayor que el número2.
                menor = numero2;
            }    
        } else {                           // Número 1 es menor que número 2.
            if (numero2 > numero3){        
                if (numero1 > numero3){
                    mayor = numero2;
                    menor = numero3;
                } else {
                    mayor = numero2;
                    menor = numero1;
                }
            } else{                        // Número 3 es mayor que número 1 y número 2.
                mayor = numero3;
                menor = numero1;
            }
        }
        
        System.out.println("\nEl mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        
    }  
}
