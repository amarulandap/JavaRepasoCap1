/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andresmarulanda.registroalumnos;

/**@author Andres_Marulanda
 */

// Importar todos los paquetes que necesitamos.
import java.util.Scanner;
import java.util.ArrayList;
import andresmarulanda.registroalumnos.ValidacionDatos;

public class RegistroAlumnos {
    
    // Variable para leer los datos ingresados desde el teclado.
    static Scanner leer = new Scanner(System.in);
    
    // ArrayList para almacenar los datos de los alumnos.
    static ArrayList <Integer> identificacion = new ArrayList<Integer>();
    static ArrayList <String> nombreAlumno = new ArrayList<String>();
    static ArrayList <String> apellidoAlumno = new ArrayList<String>();
    static ArrayList <Byte> gradoAlumno = new ArrayList<Byte>();
    static ArrayList <String> nombreDocente = new ArrayList<String>();
    
    // Variable para almacenar el id del alumno.
    static int id = 0;
    
    static String nombre = " ";
    static String apellidos = " ";
    static byte grado = 0;
    static String docente = " ";
    
    static byte posicionId = 0;

    public static void main(String[] args) {
        
        while(true){
            System.out.println("\n1. Registrar un alumno." + "\n" + 
                           "2. Consultar un alumno." + "\n" +
                           "3. Actualizar un alumno." + "\n" + 
                           "4. Eliminar un alumno." + "\n" + 
                           "5. Salir.");
        
            String mensaje = "\nSeleccione una opción.";
            byte opcion = (byte)ValidacionDatos.validarDatos(mensaje);
            
            if(opcion == 1){
                registrarAlumno();
            } else if(opcion == 2){
                consultarAlumno();
            } else if (opcion == 3){
                actualizarAlumno();
            } else if (opcion == 4){
                System.out.println("\n" + opcion);
            } else if (opcion == 5){
                break;
            } else {
                System.out.println("\nOpción incorrecta.");
            }
        }    
    }
    
    public static void registrarAlumno(){
        
        System.out.print("Número de identificación: ");
        id = leer.nextInt();
        leer.nextLine();                                    // Int no captura el caracter del enter (\n), por lo que toca capturarlo.
        System.out.print("Nombre completo: ");
        nombre = leer.nextLine();
        System.out.print("Apellidos: ");
        apellidos = leer.nextLine();
        System.out.print("Grado: ");
        grado = leer.nextByte();
        leer.nextLine();                                    // Int no captura el caracter del enter (\n), por lo que toca capturarlo.
        System.out.print("Nombre del docente: ");
        docente = leer.nextLine();
        
        identificacion.add(id);
        nombreAlumno.add(nombre);
        apellidoAlumno.add(apellidos);
        gradoAlumno.add(grado);
        nombreDocente.add(docente);
    }
    
    public static void consultarAlumno(){
        
        // Pedimos al usuario que ingrese el número de identificación.
        System.out.print("Número de identificación: ");
        id = leer.nextInt();
        leer.nextLine();
        
        // Ubicamos la posición del número de identificación en el Array.
        posicionId = (byte) identificacion.indexOf(id);
        
        // Imprimir los datos del alumno.
        System.out.println("\nIdentificación: " + id + "\n" + 
                           "Nombre completo: " + nombreAlumno.get(posicionId) + " " + apellidoAlumno.get(posicionId) + "\n" + 
                           "Grado: " + gradoAlumno.get(posicionId) + "\n" + 
                           "Docente: " + nombreDocente.get(posicionId));
    }
    
    public static void actualizarAlumno(){
        
        // Pedimos al usuario que ingrese el número de identificación.
        System.out.print("Número de identificación: ");
        id = leer.nextInt();
        leer.nextLine();
        
        // Ubicamos la posición del número de identificación en el Array.
        posicionId = (byte) identificacion.indexOf(id);
        
        System.out.println("Qué dato desea actualizar: " + "\n" +
                           "1. Nombre completo. " + "\n" +
                           "2. Apellidos. " + "\n" + 
                           "3. Grado. " + "\n" + 
                           "4. Nombre docente. ");
        
        System.out.println("Seleccione una opción: ");
        byte opcion1 = leer.nextByte();
        leer.nextLine();
        
        if(opcion1 == 1){
           System.out.print("Nombre completo: ");
           nombre = leer.nextLine(); 
           nombreAlumno.set(posicionId, nombre);
        } else if (opcion1 == 2){
           System.out.print("Apellidos: ");
           apellidos = leer.nextLine();
           apellidoAlumno.set(posicionId, apellidos);
        } else if (opcion1 == 3){
           System.out.print("Grado: ");
           grado = leer.nextByte();
           leer.nextLine();
           gradoAlumno.set(posicionId,grado);
        } else if (opcion1 == 4){
           System.out.print("Nombre del docente: ");
           docente = leer.nextLine();
           nombreDocente.set(posicionId, docente);
        } else {
            System.out.println("Opción incorrecta.");
        }   
    }
}
