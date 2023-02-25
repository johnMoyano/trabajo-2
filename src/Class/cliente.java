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
public class cliente extends producto {

    private String codigo_cliente;
    private String nombre;
    private String apellido;
    private String direccion;

    public cliente() {
    }

    public cliente(String codigo_cliente, String nombre, String apellido, String direccion) {
        this.codigo_cliente = codigo_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public cliente(String codigo_cliente, String nombre, String apellido, String direccion, String codigo, String descripcion, int numero_existente, float precio) {
        super(codigo, descripcion, numero_existente, precio);
        this.codigo_cliente = codigo_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
