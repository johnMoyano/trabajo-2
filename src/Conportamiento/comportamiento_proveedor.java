/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conportamiento;

import Class.proveedores;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class comportamiento_proveedor extends proveedores{
    Conexion con= new Conexion();
    ArrayList<proveedores> prt= new ArrayList();
    public boolean Insertar() {
        String sql = "INSERT INTO public.producto(\n"
                + "	codigo, nombre, apellido, numero_telefono,direccion,provincia)\n"
                + "	VALUES ('"+getCodigo_proveedores()+"', '"+getNombre()+"','"+getApellido()+"','"+getNumero_telefono()+"', '"+getDireccion()+"', '"+getDireccion()+"');";
        return con.Insert(sql);
    }
    public java.util.List<proveedores>ListaPro(){
        try {
            String sql="select * from proveedores;";
            ResultSet rs= con.Consulta(sql);
            while(rs.next()){
            proveedores pt= new proveedores();
            pt.setCodigo(rs.getString("codigo"));
            pt.setDescripcion(rs.getString("descripcion"));
            pt.setNumero_existente(rs.getInt("numeros_existentes"));
            pt.setPrecio(rs.getFloat("precio"));
            prt.add(pt);
            }
            rs.close();
            return prt;
        } catch (SQLException ex) {
            Logger.getLogger(Comportamiento_producto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
}
