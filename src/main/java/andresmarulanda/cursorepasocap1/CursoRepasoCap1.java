/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andresmarulanda.cursorepasocap1;
/**
 * @author Andres_Marulanda
 */

// Importar las clases necesarias para instanciar los objetos para leer texto desde el teclado. 
import java.io.InputStreamReader;
import java.io.BufferedReader;          
import java.io.IOException;

public class CursoRepasoCap1 {

    public static void main(String[] args) throws IOException {
        
        // Crear las primeras variables.
        String nombre = "Andres Felipe";
        String apellido = "Marulanda Patiño";
        
        byte edad = 42;
        int documento = 1039865234;
        
        System.out.println("Número de documento: " + documento + "\n" +
                           "Nombre: " + nombre + "\n" +
                           "Apellido: " + apellido + "\n" +
                           "Edad: " + edad);
        
        // Capturar datos desde el teclado.
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader lector = new BufferedReader(capturarTeclado);
        
        System.out.println("\nIngrese su nombre: ");
        String nombre1 = lector.readLine();
        
        System.out.println("Ingrese su edad: ");
        String strEdad = lector.readLine();          // Capturar el valor de la edad, pero como texto.
        int edad1 = Integer.parseInt(strEdad);     // Convertimos el string en un entero.
        
        System.out.println("Hola " + nombre1 + " de edad " + edad1);
        
        
    }
}
