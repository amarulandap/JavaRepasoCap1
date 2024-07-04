/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andresmarulanda.cursorepasocap1;

/**
 * @author Andres_Marulanda
 */

import java.util.Scanner;

public class Funciones {
    
    // Creamos una variable global para leer los datos desde el teclado.
    static Scanner leer = new Scanner(System.in);
    
    // Crear el método principal desde donde se ejecutarán todas las funciones.
    public static void main(String [] args){
        
        calcularPromedio();
        validarNumeroPar();
    }
    
    // Método o función para validar que se están ingresando números enteros.
    public static int validarNumeroEntero(String mensaje){
        
        // Definimos la variable donde retornaremos el número ingresado.
        int numero = 0;
        
        System.out.println(mensaje);
        try{
            numero = leer.nextInt();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return numero;
    }
    
    // Función para calcular el promedio.
    public static void calcularPromedio(){
        
        int suma = 0;
        int cantidadNumeros = 0;    // Cantidad de números a promediar.
        float promedio = 0;
        
        int opcion = 0;
        
        String mensaje = "Ingrese un número entero: ";
        boolean promediar = true;
        while (promediar){
            suma += validarNumeroEntero(mensaje);   // Almacenamos la sumatoria de los números ingresados.
            cantidadNumeros += 1;
            
            System.out.println("¿Desea ingresar otro número?" + "\n" +
                                "1. SI" + "\n" + 
                                "2. NO");
            opcion = leer.nextInt();
            if (opcion == 2){
                promediar = false;
            }
        }
        
        promedio = (float)suma / (float)cantidadNumeros;
        System.out.println("El promedio es: " + promedio);
    }
    
    // Función para validar si un número es par.
    public static void validarNumeroPar(){
        
        int numeroPar = 0;
        
        String mensaje = "\nIngrese un número entero: ";
        numeroPar = validarNumeroEntero(mensaje);
        
        if ((numeroPar % 2) == 0){
            System.out.println("Número par.");
        } else {
            System.out.println("Número impar.");
        }
    }
}
