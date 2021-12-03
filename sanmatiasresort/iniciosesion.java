    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanmatiasresort;

import Clases.Conexion;
import Clases.CryptContra;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanfer Siu
 */
public class iniciosesion extends javax.swing.JFrame {

    String usuario, contrasenia; 
    public static String user;
    Conexion cn = new Conexion();
    Connection conn=cn.conectar();
    CryptContra crypt=new CryptContra();
    ResultSet rs; 
    PreparedStatement ps;
    int contador=0;
    public static int empleado,rol;
    public static String usuarios;

    

    
    public iniciosesion() {
        initComponents();
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panelprincipal = new javax.swing.JPanel();
        lbliniciosesion = new javax.swing.JLabel();
        btnentrar = new javax.swing.JButton();
        lblcontrasena = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblolvidastetucontrasena = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblusuario1 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        txtcontrasena = new javax.swing.JPasswordField();

        jButton5.setText("Reservación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(33, 126, 194));

        panelprincipal.setBackground(new java.awt.Color(33, 126, 194));
        panelprincipal.setForeground(new java.awt.Color(33, 126, 194));

        lbliniciosesion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbliniciosesion.setForeground(new java.awt.Color(255, 255, 255));
        lbliniciosesion.setText("INICIO DE SESIÓN");

        btnentrar.setBackground(new java.awt.Color(30, 149, 55));
        btnentrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnentrar.setForeground(new java.awt.Color(255, 255, 255));
        btnentrar.setText("Entrar");
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });

        lblcontrasena.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblcontrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblcontrasena.setText("Contraseña");

        lblusuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setText("Usuario");

        lblolvidastetucontrasena.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblolvidastetucontrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblolvidastetucontrasena.setText("¿Olvidaste tu contraseña?");

        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 126, 194));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        lblusuario1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblusuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario1.setText("¿Olvidaste tu contraseña?");
        lblusuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblusuario1MouseClicked(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(30, 149, 55));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setName(""); // NOI18N
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        txtcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontrasenaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblolvidastetucontrasena)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(499, Short.MAX_VALUE))))
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, Short.MAX_VALUE)
                .addGap(121, 121, 121)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(169, 169, 169))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(209, 209, 209))
                            .addComponent(lbliniciosesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblusuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(81, 81, 81)))
                        .addGap(182, 182, 182))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcontrasena, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(224, 224, 224))))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lbliniciosesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblusuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(113, 113, 113))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblolvidastetucontrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnentrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    public boolean Compatible(String p, String u){
        boolean respuesta=false; 
        String user="",password="";
        String query;
        String hashedquery=crypt.DIGESTION(p);
        query="SELECT nombre_usuario,contraseña_usuario,codigo_rol,codigo_empleado from usuarios where nombre_usuario = ? and contraseña_usuario=?; ";
        
        try {
            ps=conn.prepareStatement(query);
              ps.setString(1, u);
              ps.setString(2, hashedquery);
              rs=ps.executeQuery();
              while(rs.next()){
                  user=rs.getString(1);
                  password=rs.getString(2);
                  empleado=rs.getInt(3);
                  rol=rs.getInt(4);
                  
                  System.out.println("password");
                  if(u.equals(user)&& hashedquery.equals(password)){
                      respuesta=true;
                  }else{
                 respuesta=false;}
              ps=conn.prepareStatement("SELECT nombre_empleado from empleados where codigo_empleado=?");
              ps.setInt(1,empleado);
              rs=ps.executeQuery();
              while(rs.next()){
              usuarios=rs.getString(1);
              }
              
              }
           
              
        } catch (SQLException ex) {
            Logger.getLogger(iniciosesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;  
    }
    
    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
      
        String contrasenia=new String(txtcontrasena.getPassword());
        String usuario=txtusuario.getText();
        user=txtusuario.getText();
        if(Compatible(contrasenia, usuario)){
            try {
                JOptionPane.showMessageDialog(this, "Bienvenido al Sistema");
                ps=conn.prepareStatement("INSERT INTO `sanmatiasresort`.`bitacora_acceso`(`codigo_usuario`,`fecha_acceso`,`fecha_salida`) VALUES(?,now(),?);");
                ps.setString(1,usuario);
                ps.setString(2,"2021-11-3 00:00:00");
                ps.executeUpdate();
                
                
                menu m= new menu();
                m.setVisible(true);
                
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(iniciosesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
          JOptionPane.showMessageDialog(this, "Error al ingresar al sistema"); 
         contador++;
         if(Validacion(contador)==false){
         System.exit(0);
         }else{
             txtusuario.setText("");
             txtcontrasena.setText("");
             txtusuario.grabFocus();
         }
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void lblusuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblusuario1MouseClicked
        //Recuperación de Contraseña
        adminAuth rc=new adminAuth();
        rc.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_lblusuario1MouseClicked

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
    if(txtusuario.getText().length()==10){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtcontrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontrasenaKeyTyped
       if(txtcontrasena.getText().length()==10){
            evt.consume();
        } 
    }//GEN-LAST:event_txtcontrasenaKeyTyped
    
    public boolean Validacion(int intentos){
        if(intentos==3){
        JOptionPane.showMessageDialog(this,"Contraseña o Usuario erroneos (3/3)");
        return false;
        
        }else{
            return true;
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciosesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciosesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lbliniciosesion;
    private javax.swing.JLabel lblolvidastetucontrasena;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblusuario1;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
