/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conportamiento;

import Class.producto;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Comportamiento_producto extends producto {
    Conexion con= new Conexion();
    ArrayList<producto> prt= new ArrayList();
    public boolean Insertar() {
        String sql = "INSERT INTO public.producto(\n"
                + "	codigo, descripcion, numeros_existentes, precio)\n"
                + "	VALUES ('"+getCodigo()+"', '"+getDescripcion()+"', '"+getNumero_existente()+"', '"+getPrecio()+"');";
        return con.Insert(sql);
    }
    public java.util.List<producto>ListaP(){
        try {
            String sql="select * from producto;";
            ResultSet rs= con.Consulta(sql);
            while(rs.next()){
            producto pt= new producto();
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
