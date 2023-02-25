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
public class proveedores extends producto{
    private String codigo_proveedores;
    private String nombre;
    private String apellido;
    private String numero_telefono;
    private String direccion;
    private String provincia;

    public proveedores() {
    }

    public proveedores(String codigo_proveedores, String nombre, String apellido, String numero_telefono, String direccion, String provincia) {
        this.codigo_proveedores = codigo_proveedores;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_telefono = numero_telefono;
        this.direccion = direccion;
        this.provincia = provincia;
    }
    
     public proveedores(String codigo_proveedores, String nombre, String apellido, String numero_telefono, String direccion, String provincia, String codigo, String descripcion, int numero_existente, float precio) {
        this.codigo_proveedores = codigo_proveedores;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_telefono = numero_telefono;
        this.direccion = direccion;
        this.provincia = provincia;
    }

    public String getCodigo_proveedores() {
        return codigo_proveedores;
    }

    public void setCodigo_proveedores(String codigo_proveedores) {
        this.codigo_proveedores = codigo_proveedores;
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

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
     
}
