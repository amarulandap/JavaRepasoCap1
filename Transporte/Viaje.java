/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * @author Andres_Marulanda
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje {
    
    //Atributos.
    private String idViaje;
    private String idDestino;
    private String placa;
    private LocalDate fecha;
    private LocalTime hora;
    
    // Constructor. (https://www.campusmvp.es/recursos/post/como-manejar-correctamente-fechas-en-java-el-paquete-java-time.aspx)
    public Viaje (String idViaje, String idDestino, String placa){
        this.idViaje = idViaje;
        this.idDestino = idDestino;
        this.placa = placa;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
    }
    
    // setters and getters.
    public void setIdViaje(String idViaje){
        this.idViaje = idViaje;
    }
    
    public String getIdViaje(){
        return this.idViaje;
    }
    
    public void setIdDestino(String idDestino){
        this.idDestino = idDestino;
    }
    
    public String getIdDestino(){
        return this.idDestino;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setFecha(){
        this.fecha = LocalDate.now();
    }
    
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public void setHora(){
        this.hora = LocalTime.now();
    }
    
    public LocalTime getHora(){
        return this.hora;
    }
}
