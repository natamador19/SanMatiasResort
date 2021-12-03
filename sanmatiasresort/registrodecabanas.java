/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanmatiasresort;

import Clases.Conexion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Juanfer Siu
 */
public class registrodecabanas extends javax.swing.JFrame {

    Conexion conn=new Conexion();
    Connection c=conn.conectar();
    ResultSet rs;
    PreparedStatement st; 
    private TableRowSorter trsFiltro;
    String codigo; 

    
    public registrodecabanas() {
        initComponents();
        mostrarTabla();
    }

        public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        rs=conn.LlenarTabla("select * from cabañas where estado_cabaña= 'ACT'");
        modelo.setColumnIdentifiers(new Object []{"Código", "Cabaña","Cantidad de Personas","Precio"});
        try{
            while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("codigo_cabaña"), rs.getString("descripcion_cabaña"), rs.getString("capacidad_cabaña"), rs.getString("precio_cabaña")});
            }
            tablacabana.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
     }
        public void Filtro(){
        int columna =1;
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtcabanafiltrar.getText(), columna));
    }
        public void LimpiarDatos(){
     
        txtcabana.setText("");
        txtcantidadpersona.setText("");
        txtprecio.setText("");
        
    }
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panelprincipal = new javax.swing.JPanel();
        lblcabanas = new javax.swing.JLabel();
        btnbuscarcabana = new javax.swing.JButton();
        lblcantidadpersonas = new javax.swing.JLabel();
        lblnombrecabana = new javax.swing.JLabel();
        txtcantidadpersona = new javax.swing.JTextField();
        txtcabana = new javax.swing.JTextField();
        lblprecio = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        lblcabanafiltrar = new javax.swing.JLabel();
        txtcabanafiltrar = new javax.swing.JTextField();
        btnvolvercabanas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacabana = new javax.swing.JTable();
        btnagregarcabana = new javax.swing.JButton();
        btneliminarcabana = new javax.swing.JButton();
        btnmodificarcabana = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblnom = new javax.swing.JLabel();
        lblpre = new javax.swing.JLabel();
        lblpre1 = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();

        jButton5.setText("Reservación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(32, 126, 193));

        panelprincipal.setBackground(new java.awt.Color(33, 126, 194));
        panelprincipal.setForeground(new java.awt.Color(33, 126, 194));

        lblcabanas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblcabanas.setForeground(new java.awt.Color(255, 255, 255));
        lblcabanas.setText("CABAÑAS");

        btnbuscarcabana.setBackground(new java.awt.Color(230, 203, 1));
        btnbuscarcabana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnbuscarcabana.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarcabana.setText("Buscar");
        btnbuscarcabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcabanaActionPerformed(evt);
            }
        });

        lblcantidadpersonas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcantidadpersonas.setForeground(new java.awt.Color(255, 255, 255));
        lblcantidadpersonas.setText("Cantidad de Personas");

        lblnombrecabana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblnombrecabana.setForeground(new java.awt.Color(255, 255, 255));
        lblnombrecabana.setText("Nombre de la Cabaña");

        txtcantidadpersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadpersonaKeyTyped(evt);
            }
        });

        txtcabana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcabanaKeyTyped(evt);
            }
        });

        lblprecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblprecio.setForeground(new java.awt.Color(255, 255, 255));
        lblprecio.setText("Precio");

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        lblcabanafiltrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcabanafiltrar.setForeground(new java.awt.Color(255, 255, 255));
        lblcabanafiltrar.setText("Nombre de la Cabaña");

        txtcabanafiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcabanafiltrarKeyTyped(evt);
            }
        });

        btnvolvercabanas.setBackground(new java.awt.Color(230, 203, 1));
        btnvolvercabanas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnvolvercabanas.setForeground(new java.awt.Color(255, 255, 255));
        btnvolvercabanas.setText("Volver");
        btnvolvercabanas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvolvercabanasMouseClicked(evt);
            }
        });
        btnvolvercabanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolvercabanasActionPerformed(evt);
            }
        });

        tablacabana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablacabana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacabanaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacabana);

        btnagregarcabana.setBackground(new java.awt.Color(30, 150, 56));
        btnagregarcabana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnagregarcabana.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarcabana.setText("Agregar");
        btnagregarcabana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregarcabanaMouseClicked(evt);
            }
        });
        btnagregarcabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarcabanaActionPerformed(evt);
            }
        });

        btneliminarcabana.setBackground(new java.awt.Color(236, 29, 29));
        btneliminarcabana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminarcabana.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarcabana.setText("Eliminar");
        btneliminarcabana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarcabanaMouseClicked(evt);
            }
        });
        btneliminarcabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarcabanaActionPerformed(evt);
            }
        });

        btnmodificarcabana.setBackground(new java.awt.Color(230, 203, 1));
        btnmodificarcabana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnmodificarcabana.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificarcabana.setText("Modificar");
        btnmodificarcabana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmodificarcabanaMouseClicked(evt);
            }
        });
        btnmodificarcabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarcabanaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(32, 126, 193));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocirculo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );

        lblnombre.setForeground(new java.awt.Color(255, 51, 51));

        lblnom.setForeground(new java.awt.Color(255, 51, 51));

        lblpre.setForeground(new java.awt.Color(255, 51, 51));

        lblpre1.setForeground(new java.awt.Color(255, 51, 51));

        lblcantidad.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombrecabana)
                            .addComponent(lblcabanas)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblcantidadpersonas)
                                    .addComponent(lblprecio)
                                    .addComponent(txtcantidadpersona, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(txtprecio)
                                    .addComponent(txtcabana)
                                    .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(105, 105, 105)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnagregarcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminarcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmodificarcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnbuscarcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcabanafiltrar)
                                    .addComponent(txtcabanafiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblnom, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(325, 325, 325))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(323, 323, 323))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btnvolvercabanas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelprincipalLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(lblpre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1101, 1101, 1101)))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(129, 129, 129)
                        .addComponent(btnvolvercabanas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblcabanas)
                        .addGap(18, 18, 18)
                        .addComponent(lblnombrecabana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnagregarcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcantidadpersonas))
                            .addComponent(btnmodificarcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminarcabana, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(txtcantidadpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(lblprecio)
                        .addGap(22, 22, 22)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblpre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblcabanafiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcabanafiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscarcabana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnom, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(276, 276, 276))
            .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelprincipalLayout.createSequentialGroup()
                    .addGap(405, 405, 405)
                    .addComponent(lblpre1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(632, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 814, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnbuscarcabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcabanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarcabanaActionPerformed

    private void btnvolvercabanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolvercabanasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolvercabanasActionPerformed

    private void btnagregarcabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarcabanaActionPerformed
       String strRespuesta="";
        try { 
            st= c.prepareStatement("Call INSERT_CABAÑAS(?,?,?)");
            st.setString(1, (txtcabana.getText()));
            st.setInt(2, Integer.parseInt(txtcantidadpersona.getText()));
            st.setFloat(3, Float.parseFloat(txtprecio.getText()));
            //st.setString(4, "ACT");

             strRespuesta=Clases.Utilidades.strPreguntaSiNo("Desea Ingresar la Cabaña");
            if (strRespuesta=="Si"){
            st.executeUpdate();
             JOptionPane.showMessageDialog(null,"Se Ingreso el registro correctamente!!");
             mostrarTabla();
             LimpiarDatos();
           } 
           else{
                JOptionPane.showMessageDialog(null,"Registro No Ingresado");
           }
        } catch (SQLException ex) {
            Logger.getLogger(registrodecabanas.class.getName()).log(Level.SEVERE, null, ex);
    } 
       
    }//GEN-LAST:event_btnagregarcabanaActionPerformed

    private void btneliminarcabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarcabanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarcabanaActionPerformed

    private void btnmodificarcabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarcabanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarcabanaActionPerformed

    private void btnvolvercabanasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvolvercabanasMouseClicked
        
       mantenimientos MAN = new mantenimientos();
        MAN.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolvercabanasMouseClicked

    private void txtcabanaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcabanaKeyTyped
       if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
                     lblnombre.setText("El campo no admite números");}  else {
                    lblnombre.setText("");
                    }
                 
                 if(txtcabana.getText().length()==10){
                     evt.consume();
                 }
    }//GEN-LAST:event_txtcabanaKeyTyped

    private void txtcantidadpersonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadpersonaKeyTyped
       if (!Character.isDigit(evt.getKeyChar())
                ) {
                evt.consume();
                 lblcantidad.setText("El campo no admite letras");}  else {
                    lblcantidad.setText("");
                }  
                        
        if(txtprecio.getText().length()==5){
            evt.consume();
        }
    }//GEN-LAST:event_txtcantidadpersonaKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
         if (!Character.isDigit(evt.getKeyChar())
                ) {
                evt.consume();
                 lblpre.setText("El campo no admite letras");}  else {
                    lblpre.setText("");
                }  
                        
        if(txtprecio.getText().length()==5){
            evt.consume();
        }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void tablacabanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacabanaMouseClicked
    int seleccion = tablacabana.rowAtPoint(evt.getPoint());
        codigo= String.valueOf(tablacabana.getValueAt(seleccion, 0));
        txtcabana.setText(String.valueOf(tablacabana.getValueAt(seleccion, 1)));
        txtcantidadpersona.setText(String.valueOf(tablacabana.getValueAt(seleccion, 2)));
        txtprecio.setText(String.valueOf(tablacabana.getValueAt(seleccion,3 )));
    }//GEN-LAST:event_tablacabanaMouseClicked

    private void txtcabanafiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcabanafiltrarKeyTyped
        txtcabanafiltrar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtcabanafiltrar.getText());
                txtcabanafiltrar.setText(cadena);
               Filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablacabana.getModel());
        tablacabana.setRowSorter(trsFiltro);
        
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
              lblnom.setText("El campo no admite números");}  else {
                    lblnom.setText("");
                    }
                 
                 if(txtcabana.getText().length()==10){
                     evt.consume();
                 }
    }//GEN-LAST:event_txtcabanafiltrarKeyTyped

    private void btneliminarcabanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarcabanaMouseClicked
    String strRespuesta="";
        try {
            st = c.prepareStatement("Call PROCEDIMIENTOS_VARIOS(?,?,?)");
           st.setString(1, "cabañas");
           st.setString(2, "DEL");
           st.setInt(3, Integer.parseInt(codigo));
             strRespuesta=Clases.Utilidades.strPreguntaSiNo("Desea Eliminar la Cabaña");
            if (strRespuesta=="Si"){
            st.executeUpdate();
             JOptionPane.showMessageDialog(null,"Se elimino el dato correctamente!!");
             mostrarTabla();
             LimpiarDatos();
           } 
           else{
                JOptionPane.showMessageDialog(null,"Registro No Eliminado");
           }
        } catch (SQLException ex) {
            Logger.getLogger(registrodecabanas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarcabanaMouseClicked

    private void btnmodificarcabanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarcabanaMouseClicked
       String strRespuesta="";
        try {
            //st = c.prepareStatement("update cabañas set descripcion_cabaña = ?, capacidad_cabaña=?, precio_cabaña=? where codigo_cabaña=?");
            st = c.prepareStatement("CALL UPDATE_CABAÑAS (?,?,?,?)");
            st.setInt(1, Integer.parseInt(codigo));
            st.setString(2, txtcabana.getText());
            st.setInt(3, Integer.parseInt(txtcantidadpersona.getText()));
            st.setDouble(4, Double.parseDouble(txtprecio.getText()));
            
             strRespuesta=Clases.Utilidades.strPreguntaSiNo("Desea Modificar la Cabaña");
           if (strRespuesta=="Si"){
            st.executeUpdate();
             JOptionPane.showMessageDialog(null,"Se Modifico el dato correctamente!!");
             mostrarTabla();
             LimpiarDatos();
           } 
           else{
                JOptionPane.showMessageDialog(null,"Registro No Modificado");
           }
        } catch (SQLException ex) {
            Logger.getLogger(registrodecabanas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarcabanaMouseClicked

    private void btnagregarcabanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarcabanaMouseClicked
       String strRespuesta="";
        try { 
            st= c.prepareStatement("Call INSERT_CABAÑAS(?,?,?)");
            st.setString(1, (txtcabana.getText()));
            st.setInt(2, Integer.parseInt(txtcantidadpersona.getText()));
            st.setFloat(3, Float.parseFloat(txtprecio.getText()));
            //st.setString(4, "ACT");

             strRespuesta=Clases.Utilidades.strPreguntaSiNo("Desea Ingresar la Cabaña");
            if (strRespuesta=="Si"){
            st.executeUpdate();
             JOptionPane.showMessageDialog(null,"Se Ingreso el registro correctamente!!");
             mostrarTabla();
             LimpiarDatos();
           } 
           else{
                JOptionPane.showMessageDialog(null,"Registro No Ingresado");
           }
        } catch (SQLException ex) {
            Logger.getLogger(registrodecabanas.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_btnagregarcabanaMouseClicked

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
            java.util.logging.Logger.getLogger(registrodecabanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrodecabanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrodecabanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrodecabanas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new registrodecabanas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarcabana;
    private javax.swing.JButton btnbuscarcabana;
    private javax.swing.JButton btneliminarcabana;
    private javax.swing.JButton btnmodificarcabana;
    private javax.swing.JButton btnvolvercabanas;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcabanafiltrar;
    private javax.swing.JLabel lblcabanas;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblcantidadpersonas;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombrecabana;
    private javax.swing.JLabel lblpre;
    private javax.swing.JLabel lblpre1;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JTable tablacabana;
    private javax.swing.JTextField txtcabana;
    private javax.swing.JTextField txtcabanafiltrar;
    private javax.swing.JTextField txtcantidadpersona;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
