/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * @author Andres_Marulanda
 */

public class Encomienda {
    
    // Atributos.
    private String idEncomienda;
    private String idViaje; 
    private String descripcion;
    private int valor;
    
    // Constructor.
    public Encomienda(String idEncomienda, String idViaje, String descripcion, int valor){
        this.idEncomienda = idEncomienda;
        this.idViaje = idViaje;
        this.descripcion = descripcion;
        this.valor = valor;
    }
    
    // Setters and getters.

    public String getIdEncomienda() {
        return idEncomienda;
    }

    public void setIdEncomienda(String idEncomienda) {
        this.idEncomienda = idEncomienda;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
