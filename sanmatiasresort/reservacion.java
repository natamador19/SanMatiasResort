/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanmatiasresort;

import Clases.Conexion;
import Clases.Utilidades;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
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
public class reservacion extends javax.swing.JFrame {
    Utilidades utils = new Utilidades();
    Conexion con= new Conexion();
    Connection conn = con.conectar();
    String codigo; 
    String dni_cliente,fecha_llegada, fecha_salida; 
    int codigo_cabaña;
    ResultSet rs;
    PreparedStatement ps;
    Utilidades util = new Utilidades();
    
    
    private TableRowSorter trsFiltro;
    public reservacion() {
        initComponents();
        btneliminar.setEnabled(false);
        mostrarTabla();
        lblfecha.setText(util.FechaActual());
    }
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        rs = con.LlenarTabla("SELECT A.codigo_reservacion, C.dni_cliente, B.codigo_cabaña, A.fecha_llegada, A.fecha_salida FROM reservaciones as A\n" +
                             "join detalle_reservaciones as B on A.codigo_reservacion=B.codigo_reservacion\n" +
                             "join clientes as C on A.codigo_cliente=A.codigo_cliente\n" +
                             "where YEAR(A.fecha_llegada)=2021");
        modelo.setColumnIdentifiers(new Object[]{
            "Código",
            "DNI Cliente",
            "Cabaña",
            "Fecha Llegada",
            "Fecha Salida",
            
        });
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("codigo_reservacion"),
                    rs.getString("dni_cliente"),
                    rs.getInt("codigo_cabaña"),
                    rs.getString("fecha_llegada"),
                    rs.getString("fecha_salida"),
                });
            }
            tablareservacion.setModel(modelo);
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    
    
    public void Filter(){
           int columna=0;
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtcodigofiltrar.getText(), columna));
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panelprincipal = new javax.swing.JPanel();
        lblreservacion = new javax.swing.JLabel();
        btnbuscarreservacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablareservacion = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        lbldiallegadareservacion = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        txtcodigofiltrar = new javax.swing.JTextField();
        lblreservacionfiltrar = new javax.swing.JLabel();
        btnvolverreservacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton5.setText("Reservación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(33, 126, 194));

        panelprincipal.setBackground(new java.awt.Color(33, 126, 194));
        panelprincipal.setForeground(new java.awt.Color(33, 126, 194));

        lblreservacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblreservacion.setForeground(new java.awt.Color(255, 255, 255));
        lblreservacion.setText("RESERVACIÓN");

        btnbuscarreservacion.setBackground(new java.awt.Color(230, 203, 1));
        btnbuscarreservacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnbuscarreservacion.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarreservacion.setText("Buscar");
        btnbuscarreservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarreservacionActionPerformed(evt);
            }
        });

        tablareservacion.setModel(new javax.swing.table.DefaultTableModel(
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
        tablareservacion.setEnabled(false);
        tablareservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablareservacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablareservacion);

        btneliminar.setBackground(new java.awt.Color(236, 29, 29));
        btneliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lbldiallegadareservacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbldiallegadareservacion.setForeground(new java.awt.Color(255, 255, 255));
        lbldiallegadareservacion.setText("Código Reservación");

        txtcodigo.setEnabled(false);

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(255, 255, 255));
        lblfecha.setText("Fecha/Hora");

        txtcodigofiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigofiltrarActionPerformed(evt);
            }
        });
        txtcodigofiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigofiltrarKeyTyped(evt);
            }
        });

        lblreservacionfiltrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblreservacionfiltrar.setForeground(new java.awt.Color(255, 255, 255));
        lblreservacionfiltrar.setText("Reservación");

        btnvolverreservacion.setBackground(new java.awt.Color(230, 203, 1));
        btnvolverreservacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnvolverreservacion.setForeground(new java.awt.Color(255, 255, 255));
        btnvolverreservacion.setText("Volver");
        btnvolverreservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvolverreservacionMouseClicked(evt);
            }
        });
        btnvolverreservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverreservacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocirculo.png"))); // NOI18N

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldiallegadareservacion)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigofiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblreservacion))
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscarreservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblreservacionfiltrar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(btnvolverreservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addComponent(lblfecha)
                        .addGap(322, 322, 322))))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblreservacion)
                    .addComponent(lblfecha))
                .addGap(26, 26, 26)
                .addComponent(lbldiallegadareservacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117)
                        .addComponent(btnvolverreservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(lblreservacionfiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigofiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscarreservacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnbuscarreservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarreservacionActionPerformed
        
    }//GEN-LAST:event_btnbuscarreservacionActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnvolverreservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverreservacionActionPerformed
        menu m= new menu();
        m.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverreservacionActionPerformed

    private void txtcodigofiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigofiltrarActionPerformed
        

        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigofiltrarActionPerformed

    private void btnvolverreservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvolverreservacionMouseClicked
        menu m = new menu();
        m.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverreservacionMouseClicked

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked
       
        try {
             ps= conn.prepareStatement("INSERT INTO `sanmatiasresort`.`bitacora_reservaciones`\n" +
                    "(\n" +
                    "`cambio`,\n" +
                    "`fecha_cambio`,\n" +
                    "`codigo_reservacion`,\n" +
                    "`dni_cliente`,\n" +
                    "`fecha_llegada`,\n" +
                    "`fecha_salida`,\n" +
                    "`codigo_cabaña`)\n" +
                    "VALUES\n" +
                    "(\n" +
                    "'CANCEL',\n" +
                    "now(),\n" +
                    "?,\n" +
                    "?,\n" +
                    "?,\n" +
                    "?,\n" +
                    "?);");
            
            ps.setString(1,codigo);
            ps.setString(2, dni_cliente);
            ps.setString(3, fecha_llegada);
            ps.setString(4,fecha_salida);
            ps.setInt(5, codigo_cabaña);
           String strRespuesta; 
            strRespuesta = util.strPreguntaSiNo("¿Desea eliminar la reservacion");
           if(strRespuesta=="Si"){
               ps.executeUpdate();
               
               ps=conn.prepareStatement("DELETE FROM detalle_reservaciones where codigo_reservacion=?;");
               ps.setString(1,txtcodigo.getText());
               ps.executeUpdate();
               
               ps=conn.prepareStatement( "DELETE FROM reservaciones where codigo_reservacion=?;");
                ps.setString(1,txtcodigo.getText());
               ps.executeUpdate();
               mostrarTabla();
               
               txtcodigo.setText("");
               txtcodigofiltrar.setText("");
               txtcodigofiltrar.grabFocus();
               JOptionPane.showMessageDialog(null, "Se cancelo correctamente la reservacion");
           }else{
               JOptionPane.showConfirmDialog(null, "Registro NO modificados");
           }
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(reservacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarMouseClicked

    private void tablareservacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablareservacionMouseClicked
 int contadorcolumna = tablareservacion.getRowCount();
  int seleccion = tablareservacion.rowAtPoint(evt.getPoint());
 if(contadorcolumna == -1){
            JOptionPane.showMessageDialog(null, "Ingrese datos para poder visualizarlos");
        }else{
     btneliminar.setEnabled(true);
    txtcodigo.setText(String.valueOf(tablareservacion.getValueAt(seleccion,0)));
    codigo=String.valueOf(tablareservacion.getValueAt(seleccion,0));
    dni_cliente= String.valueOf(tablareservacion.getValueAt(seleccion,1));
    codigo_cabaña=(int)(tablareservacion.getValueAt(seleccion,2));
    fecha_llegada=String.valueOf(tablareservacion.getValueAt(seleccion, 3));
    fecha_salida=String.valueOf(tablareservacion.getValueAt(seleccion, 4));
 }
        // TODO add your handling code here:
    }//GEN-LAST:event_tablareservacionMouseClicked

    private void txtcodigofiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigofiltrarKeyTyped
           txtcodigofiltrar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtcodigofiltrar.getText());
                txtcodigofiltrar.setText(cadena);
               Filter();
            }
        });
           trsFiltro = new TableRowSorter(tablareservacion.getModel());
           tablareservacion.setRowSorter(trsFiltro);

        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigofiltrarKeyTyped

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
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarreservacion;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnvolverreservacion;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldiallegadareservacion;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblreservacion;
    private javax.swing.JLabel lblreservacionfiltrar;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JTable tablareservacion;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigofiltrar;
    // End of variables declaration//GEN-END:variables
}
