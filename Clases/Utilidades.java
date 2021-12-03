/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 50489
 */
public class Utilidades {
    Conexion conn= new Conexion();
    Connection con=conn.conectar();
    ResultSet rs; 
    PreparedStatement ps; 
    //Facilita decisión en JOPTION
    public static String strPreguntaSiNo(String strMensaje){
    int seleccion=JOptionPane.showOptionDialog(null, strMensaje, "Seleccione una opción", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si","No"},"Si");
    if(seleccion !=-1){
        if((seleccion+1)==1){
        return "Si";
        }else{
           return "No";
        }
    }
    return null;
    }
    //Funcion para verificar si la contra es valida
  public static boolean isPasswordValid(String password){
      int num1=0,num2=0, num3=0; 
      boolean criterio1 =true;
      boolean criterio2=true;
      
      if(password.length()<8){
      criterio1=false;
      }
      for(int i=0;i<password.length();i++){
          if(password.charAt(i)>=65 &&password.charAt(i)<=90){
           num1++;
          }
          
          if(password.charAt(i)>=95 &&password.charAt(i)<=122){
           num2++;
          }
          if(Character.isDigit(password.charAt(i))){
                num3++;
            }    
      }
      if(num1>=1 && num3>=2){
      criterio2=true;
      }else{
      criterio2=false;}
      return (criterio2 && criterio1)?true :false;
  }
  public static boolean isEmail(String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if(mat.find()){
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }
    }

public static String FechaActual(){
 LocalDate hoy= LocalDate.now();
 DateTimeFormatter formato= DateTimeFormatter.ofPattern("E, MMM dd yyyy");
 String fecha_devolucion= hoy.format(formato);
 return fecha_devolucion; 

}
  
  
 
}
