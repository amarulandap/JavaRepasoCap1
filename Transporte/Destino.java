/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**@author Andres_Marulanda
 */

public class Destino {
    
    // Atributos.
    private String idDestino;
    private String nombre;
    private String departamento;
    
    // Constructor.
    public Destino (String idDestino, String nombre, String departamento){
        this.idDestino = idDestino;
        this.nombre = nombre;
        this.departamento = departamento;
    }
    
    // setters and getters.
    
    public void setIdDestino(String idDestino){
        this.idDestino = idDestino;
    }
    
    public String getIdDestino(){
        return this.idDestino;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
}
