/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * @author Andres_Marulanda
 */

public class Pasaje {
    
    // Atributos.
    private String idPasaje;
    private String idUsuario;
    private String idViaje;
    private int valor;
    
    // Constructor.
    public Pasaje(String idPasaje, String idUsuario, String idViaje, int valor){
        this.idPasaje = idPasaje;
        this.idUsuario = idUsuario;
        this.idViaje = idViaje;
        this.valor = valor;
    }
    
    // setters and getters.

    public String getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(String idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
