/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 *
 * @author Andres_Marulanda
 */
public class Vehiculo {
    
    // Atributos.
    protected String placa;
    protected char tipo;
    protected String conductor;
    
    // Constructor.
    public Vehiculo(String placa, char tipo, String conductor){
        this.placa = placa;
        this.tipo = tipo;
        this.conductor = conductor;
    }
    
    // setters and getters.
    public void setPLaca(String placa){
        this.placa = placa;
    }
    
    public String getPLaca(){
        return this.placa;
    }
    
    public void setTipo(char tipo){
        this.tipo = tipo;
    }
    
    public char getTipo(){
        return this.tipo;
    }
    
    public void setConductor(String conductor){
        this.conductor = conductor;
    }
    
    public String getConductor(){
        return this.conductor;
    }
}
