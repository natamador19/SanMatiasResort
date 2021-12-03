/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 50489
 */
public class CryptContra {
     
     
    public static String CrypPass(String Password){
     
    String P="";
     int Key=3;    
        char[] arreglo=Password.toCharArray();
        for(char Pass:arreglo){
           Pass+=Key;
           P+=Pass; 
        }
         return P;
    }
    
    
    public String DIGESTION(String Pass){
        try {
            MessageDigest md= MessageDigest.getInstance("MD5");
            byte[] messagedigest=md.digest(Pass.getBytes());
            BigInteger no = new BigInteger(1,messagedigest);
            //Convertir en valor hexadecimal
            String hashtext=no.toString(16);
            while(hashtext.length()<30){
                hashtext=0+hashtext;
            }
         return hashtext;   
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    
    
    
    
}
