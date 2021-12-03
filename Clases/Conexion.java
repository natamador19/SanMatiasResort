/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 50489
 */
public class Conexion {
    Connection cn; 
    PreparedStatement ps; 
    ResultSet rs; 
    
    public Connection conectar(){
    try{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null , ex);
        }
        
        cn=DriverManager.getConnection("jdbc:mysql://localhost/sanmatiasresort","root","Natalyamador12");
        
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error en la conexión de base de datos");
        System.out.println("Error Conectando a la base de datos");
    }
    return cn;
    
    }
    
      public ResultSet LlenarTabla(String query){
      ResultSet datos=null;
        try {
            ps=cn.prepareStatement(query);
           datos=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      return datos ; 
  };
      
    public ResultSet consulta(String sql)
    {
        rs = null;
        
        try{
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la consulta"+e);
        }
        
        return rs;
    }
   
    public DefaultComboBoxModel obtenerCabaña(){
    DefaultComboBoxModel cmb=new DefaultComboBoxModel();
    cmb.addElement("Elija una opción");
    rs=this.consulta("select descripcion_cabaña from cabañas;");
        try {
            while(rs.next()){
                cmb.addElement(rs.getString("descripcion_cabaña"));
            }  
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return cmb;
    }
    
    public DefaultComboBoxModel obtenerEmpleados(){
    DefaultComboBoxModel cmb=new DefaultComboBoxModel();
    cmb.addElement("Elija una opción");
    rs=this.consulta("select nombre_empleado from empleados;");
        try {
            while(rs.next()){
                cmb.addElement(rs.getString("nombre_empleado"));
            }  
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return cmb;
    }
    
     public DefaultComboBoxModel obtenerCabañas (){
        DefaultComboBoxModel cmb = new DefaultComboBoxModel();
        cmb.addElement("Seleccione una cabaña");
        rs = this.consulta("Select descripcion_cabaña from cabañas order by codigo_cabaña");
        try{
            while(rs.next()){
                cmb.addElement(rs.getString("descripcion_cabaña"));
            }
            rs.close();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Error "+ex.getMessage());
        }
        return cmb;
    }
    
       public DefaultComboBoxModel obtenerCliente (){
        DefaultComboBoxModel cmb = new DefaultComboBoxModel();
        cmb.addElement("Seleccione un cliente");
        rs = this.consulta("Select nombre_cliente from clientes order by codigo_cliente");
        try{
            while(rs.next()){
                cmb.addElement(rs.getString("nombre_cliente"));
            }
            rs.close();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Error "+ex.getMessage());
        }
        return cmb;
    }
}
