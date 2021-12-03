/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanmatiasresort;

import Clases.Conexion;
import Clases.CryptContra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class adminAuth extends javax.swing.JFrame {
    Conexion conn= new Conexion();
    Connection con= conn.conectar();
    CryptContra crypto=new CryptContra();
    PreparedStatement ps;
    ResultSet rs;
    int cont=0;
    public adminAuth() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblempleados = new javax.swing.JLabel();
        lblempleados1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblempleados2 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnEntrar1 = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblError1 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocirculo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio de Sesión Administrador");

        jPanel1.setBackground(new java.awt.Color(33, 126, 194));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocirculo.png"))); // NOI18N

        lblempleados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblempleados.setForeground(new java.awt.Color(255, 255, 255));
        lblempleados.setText("Contraseña");

        lblempleados1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblempleados1.setForeground(new java.awt.Color(255, 255, 255));
        lblempleados1.setText("ACCESO ADMIN");

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtusuario.setToolTipText("");
        txtusuario.setName(""); // NOI18N
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        lblempleados2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblempleados2.setForeground(new java.awt.Color(255, 255, 255));
        lblempleados2.setText("Usuario");

        txtcontra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraKeyTyped(evt);
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

        btnEntrar1.setBackground(new java.awt.Color(230, 203, 1));
        btnEntrar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar1.setText("Volver");
        btnEntrar1.setName("btnvolver"); // NOI18N
        btnEntrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrar1MouseClicked(evt);
            }
        });
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 0, 0));

        lblError1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblempleados, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblempleados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtusuario))
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblError1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(440, 440, 440)
                    .addComponent(lblempleados1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblempleados2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblempleados)
                .addGap(18, 18, 18)
                .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblError1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnEntrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(lblempleados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(353, 353, 353)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean Validacion(int intentos){
   if(intentos==3){
   JOptionPane.showMessageDialog(this,"Contraseña o Usuario erroneos (3/3)");
   return false;
   
   }else{
       return true;  
   }
}

public boolean Compatible(String p, String u){
    boolean respuesta=false; 
    String user="",password="", rol="";
    String query;
    String hashedquery=crypto.DIGESTION(p);
    query="SELECT nombre_usuario,contraseña_usuario,codigo_rol from usuarios where nombre_usuario = ? and contraseña_usuario=?; ";
    
    try {
        ps=con.prepareStatement(query);
          ps.setString(1, u);
          ps.setString(2, hashedquery);
          rs=ps.executeQuery();
          while(rs.next()){
              user=rs.getString(1);
              password=rs.getString(2);
              rol=rs.getString(3);
              System.out.println("password");
              if(u.equals(user)&& hashedquery.equals(password) && Integer.parseInt(rol)==1){
                 
                  respuesta=true;
              }else{
             respuesta=false;}
          
          }     
    } catch (SQLException ex) {
        Logger.getLogger(iniciosesion.class.getName()).log(Level.SEVERE, null, ex);
    }
    return respuesta;  
}
    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        if(txtcontra.getText().isEmpty() || txtusuario.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Lo siento, no dejes campos vacios");
        }else{
        String contrasenia=txtcontra.getText();
        String usuario=txtusuario.getText();
        if(Compatible(contrasenia, usuario)){
            JOptionPane.showMessageDialog(this, "Bienvenido al Control de Usuarios");
            recuperacioncontra m= new recuperacioncontra();
            m.setVisible(true);

            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Error al ingresar al sistema");
            cont++;
            if(Validacion(cont)==false){
                System.exit(0);
            }else{
                txtusuario.setText("");
                txtcontra.setText("");
                txtusuario.grabFocus();
            }
        }
        }

    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrar1MouseClicked
            iniciosesion is= new iniciosesion();
            is.setVisible(true);
            this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1MouseClicked

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
 
    }//GEN-LAST:event_btnEntrar1ActionPerformed

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped

        if(String.valueOf(txtusuario.getText()).length()==10){
        lblError.setText("El campo solo debe de tener 10 caracteres");
        evt.consume();
        }else{
            lblError.setText("");
        }
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtcontraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraKeyTyped
       if(txtcontra.getText().length()==10){
        lblError1.setText("El campo solo debe de tener 10 caracteres");
        evt.consume();
        }else{
            lblError1.setText("");
        }
    }//GEN-LAST:event_txtcontraKeyTyped

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
            java.util.logging.Logger.getLogger(adminAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminAuth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblempleados;
    private javax.swing.JLabel lblempleados1;
    private javax.swing.JLabel lblempleados2;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
