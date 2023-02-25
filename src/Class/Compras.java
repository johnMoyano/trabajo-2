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
public class Compras extends producto{

    private String codigo_compras;
    private String fecha_compras;

    public Compras() {
    }

    public Compras(String codigo_compras, String fecha_compras) {
        this.codigo_compras = codigo_compras;
        this.fecha_compras = fecha_compras;
    }

    public Compras(String codigo_compras, String fecha_compras, String codigo, String descripcion, int numero_existente, float precio) {
        super(codigo, descripcion, numero_existente, precio);
        this.codigo_compras = codigo_compras;
        this.fecha_compras = fecha_compras;
    }

    public String getCodigo_compras() {
        return codigo_compras;
    }

    public void setCodigo_compras(String codigo_compras) {
        this.codigo_compras = codigo_compras;
    }

    public String getFecha_compras() {
        return fecha_compras;
    }

    public void setFecha_compras(String fecha_compras) {
        this.fecha_compras = fecha_compras;
    }
    
}
