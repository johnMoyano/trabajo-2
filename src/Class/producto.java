/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author carlo
 */
public class producto {
    private String codigo;
    private String descripcion;
    private int numero_existente;
    private float precio;

    public producto() {
    }

    public producto(String codigo, String descripcion, int numero_existente, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.numero_existente = numero_existente;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumero_existente() {
        return numero_existente;
    }

    public void setNumero_existente(int numero_existente) {
        this.numero_existente = numero_existente;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
