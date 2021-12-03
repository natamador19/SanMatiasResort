/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanmatiasresort;

import Clases.Conexion;
import Clases.CryptContra;
import Clases.Utilidades;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class usuarios extends javax.swing.JFrame {
    
    Conexion cn=new Conexion();
    CryptContra crypt = new CryptContra();
    Utilidades utilities = new Utilidades();
    Connection c = cn.conectar(); 
    PreparedStatement st ; 
    ResultSet rs;
    private TableRowSorter trsFiltro; 
    String codigo;
    int codigo_e;
    String empleado;
    
    public usuarios() {
        initComponents();
        mostrarTabla();
        cmbEmpleado.setModel(cn.obtenerEmpleados());
        cmbrol.addItem("Seleccione una opción");
        cmbrol.addItem("Administrador");
        cmbrol.addItem("público");
        btnmodificarusuario.setEnabled(false);
        btneliminarusuario.setEnabled(false);
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelprincipal = new javax.swing.JPanel();
        lblusuarios = new javax.swing.JLabel();
        btnbuscarusuario = new javax.swing.JButton();
        lblcontrasenausuario = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        txtusuarios = new javax.swing.JTextField();
        lblrol = new javax.swing.JLabel();
        lblusuariofiltrar = new javax.swing.JLabel();
        txtempleadofiltrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        btnagregarusuario = new javax.swing.JButton();
        btneliminarusuario = new javax.swing.JButton();
        btnmodificarusuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnvolverusuario = new javax.swing.JButton();
        txtconfirmarcontra = new javax.swing.JPasswordField();
        lblcontrasenausuario1 = new javax.swing.JLabel();
        txtcontrasenausuario = new javax.swing.JPasswordField();
        lbluser = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        lblconfirpass = new javax.swing.JLabel();
        lblrool = new javax.swing.JLabel();
        lblempleado = new javax.swing.JLabel();
        lblrol1 = new javax.swing.JLabel();
        cmbEmpleado = new javax.swing.JComboBox<>();
        cmbrol = new javax.swing.JComboBox<>();

        jButton5.setText("Reservación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(33, 126, 194));

        panelprincipal.setBackground(new java.awt.Color(33, 126, 194));
        panelprincipal.setForeground(new java.awt.Color(33, 126, 194));

        lblusuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblusuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblusuarios.setText("USUARIOS");

        btnbuscarusuario.setBackground(new java.awt.Color(230, 203, 1));
        btnbuscarusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnbuscarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarusuario.setText("Buscar");
        btnbuscarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarusuarioActionPerformed(evt);
            }
        });

        lblcontrasenausuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcontrasenausuario.setForeground(new java.awt.Color(255, 255, 255));
        lblcontrasenausuario.setText("Contraseña de Usuario");

        lblusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setText("Nombre del Usuario");

        txtusuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuariosKeyTyped(evt);
            }
        });

        lblrol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblrol.setForeground(new java.awt.Color(255, 255, 255));
        lblrol.setText("Rol");

        lblusuariofiltrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblusuariofiltrar.setForeground(new java.awt.Color(255, 255, 255));
        lblusuariofiltrar.setText("Usuarios");

        txtempleadofiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtempleadofiltrarKeyTyped(evt);
            }
        });

        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tablausuarios.setEnabled(false);
        tablausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuarios);

        btnagregarusuario.setBackground(new java.awt.Color(30, 150, 56));
        btnagregarusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnagregarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarusuario.setText("Agregar");
        btnagregarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarusuarioActionPerformed(evt);
            }
        });

        btneliminarusuario.setBackground(new java.awt.Color(236, 29, 29));
        btneliminarusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarusuario.setText("Eliminar");
        btneliminarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarusuarioActionPerformed(evt);
            }
        });

        btnmodificarusuario.setBackground(new java.awt.Color(230, 203, 1));
        btnmodificarusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnmodificarusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificarusuario.setText("Modificar");
        btnmodificarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarusuarioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(32, 126, 193));

        btnvolverusuario.setBackground(new java.awt.Color(230, 203, 1));
        btnvolverusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnvolverusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnvolverusuario.setText("Volver");
        btnvolverusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverusuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(btnvolverusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnvolverusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        txtconfirmarcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconfirmarcontraKeyTyped(evt);
            }
        });

        lblcontrasenausuario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcontrasenausuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblcontrasenausuario1.setText("Confirmar Contraseña");

        txtcontrasenausuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontrasenausuarioKeyTyped(evt);
            }
        });

        lbluser.setForeground(new java.awt.Color(255, 51, 51));

        lblpass.setForeground(new java.awt.Color(255, 51, 51));
        lblpass.setMaximumSize(new java.awt.Dimension(0, 10));
        lblpass.setMinimumSize(new java.awt.Dimension(0, 10));

        lblconfirpass.setForeground(new java.awt.Color(255, 51, 51));

        lblrol1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblrol1.setForeground(new java.awt.Color(255, 255, 255));
        lblrol1.setText("Empleado");

        cmbEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmpleadoActionPerformed(evt);
            }
        });

        cmbrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbrolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblempleado)
                            .addComponent(lblrool)
                            .addComponent(lblusuarios))
                        .addContainerGap())
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblusuario)
                                    .addComponent(lblcontrasenausuario)
                                    .addComponent(txtusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontrasenausuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnmodificarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnagregarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcontrasenausuario1)
                            .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtconfirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblrol)
                                    .addComponent(lblconfirpass, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblrol1)
                                    .addComponent(cmbEmpleado, 0, 213, Short.MAX_VALUE)
                                    .addComponent(cmbrol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(182, 182, 182))))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblusuariofiltrar)
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addComponent(txtempleadofiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnbuscarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblusuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcontrasenausuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcontrasenausuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblcontrasenausuario1))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblusuariofiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnagregarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtempleadofiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnbuscarusuario))
                                .addGap(18, 18, 18)
                                .addComponent(btnmodificarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btneliminarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconfirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblconfirpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblrol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbrol, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblrol1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblrool))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(175, 175, 175)
                .addComponent(lblempleado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        rs=cn.LlenarTabla("SELECT nombre_usuario, contraseña_usuario, codigo_empleado, codigo_rol FROM usuarios WHERE estado_usuario='ACT'");
        modelo.setColumnIdentifiers(new Object []{"Usuario","Contraseña","ID Empleado", "ID Rol"});
        try{
            while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("nombre_usuario"), rs.getString("contraseña_usuario"),  rs.getString("codigo_empleado") ,  rs.getInt("codigo_rol")});
            }
            tablausuarios.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void Filtro()
    {
        int columna = 0;
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + txtempleadofiltrar.getText(), columna));
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    public void LimpiarDatos()
    {
        txtusuarios.setText(null);
        txtcontrasenausuario.setText(null);
        txtconfirmarcontra.setText(null);
       cmbEmpleado.setSelectedIndex(0);
        cmbrol.setSelectedIndex(0);
    }
    
    
    private void btnmodificarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarusuarioActionPerformed
        String strRespuesta="";
        
        String hashedpass = crypt.DIGESTION(txtcontrasenausuario.getText());
        
            if(hashedpass.equals(txtconfirmarcontra.getText()))
            {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, verifiquelas de nuevo.");
                txtcontrasenausuario.setText(null);
                txtconfirmarcontra.setText(null);
                
            }
            else
            {
                try
                {
                    st = c.prepareStatement("call sanmatiasresort.UPDATE_USUARIO(?,?,?);");
                    st.setString(1, hashedpass);
                    st.setInt(2, cmbrol.getSelectedIndex());
                    st.setString(3, txtusuarios.getText());

                    strRespuesta = Clases.Utilidades.strPreguntaSiNo("¿Desea ingresar el usuario?");

                    if(strRespuesta=="Si")
                    {
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Se ingreso correctamente el usuario!");
                        mostrarTabla();
                        LimpiarDatos();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Registro no ingresado");
                    }
                }
                catch(SQLException ex)
                {
                    Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
   
    }//GEN-LAST:event_btnmodificarusuarioActionPerformed

    private void btneliminarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarusuarioActionPerformed
        
        String strRespuesta="";
        try 
        {
                st = c.prepareStatement("UPDATE usuarios SET estado_usuario = 'INA' WHERE nombre_usuario=?");
                st.setString(1, txtusuarios.getText());
                 strRespuesta=Clases.Utilidades.strPreguntaSiNo("Desea Eliminar la Cabaña");
            if (strRespuesta=="Si")
            {
                st.executeUpdate();
                JOptionPane.showMessageDialog(null,"Se elimino el dato correctamente!!");
                mostrarTabla();
                LimpiarDatos();
            } 
           else
            {
                JOptionPane.showMessageDialog(null,"Registro No Eliminado");
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btneliminarusuarioActionPerformed

    private void btnagregarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarusuarioActionPerformed
 
        String hashedpass = crypt.DIGESTION(new String(txtcontrasenausuario.getPassword())); 
        String strRespuesta = "";
        
        if(txtusuarios.getText().isEmpty() || txtcontrasenausuario.getPassword().toString().isEmpty() || txtconfirmarcontra.getText().isEmpty() || cmbEmpleado.getSelectedIndex()==0 || cmbrol.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Favor, no dejar campos vacios");
            
        }
        else
        {
            if(hashedpass.equals(txtconfirmarcontra.getText()))
            {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, verifiquelas de nuevo.");
                txtcontrasenausuario.setText(null);
                txtconfirmarcontra.setText(null);
               
                
            }
            
            else
            {
                try
                {
                    st=c.prepareStatement("select codigo_empleado FROM empleados where nombre_empleado=?");
                    st.setString(1,cmbEmpleado.getSelectedItem().toString());
                    rs=st.executeQuery();
                    while(rs.next()){
                    codigo_e=rs.getInt(1);
                            }
                    
                    String usuario="", user="";
                    st=c.prepareStatement("select nombre_usuario from usuarios where codigo_empleado=?");
                    st.setInt(1, codigo_e);
                    rs=st.executeQuery();
                    
                    if(rs.next()){
                        usuario=rs.getString("nombre_usuario");
                    }
                     st=c.prepareStatement("select nombre_usuario from usuarios where nombre_usuario=?");
                    st.setString(1, txtusuarios.getText().toString());
                    rs=st.executeQuery();
                    if(rs.next()){
                    user=rs.getString("nombre_usuario");
                    }
                    
                    if(usuario.equals("")){
                        if(user.equals("")){
                        strRespuesta = Clases.Utilidades.strPreguntaSiNo("¿Desea ingresar el usuario?");
                        if(strRespuesta=="Si"){
                        
                        st=c.prepareStatement("call sanmatiasresort.INSERT_USUARIOS(?,?,?,?)");
                        st.setString(1, (txtusuarios.getText()));
                        st.setString(2, hashedpass);
                        st.setInt(3, codigo_e);
                        st.setInt(4, cmbrol.getSelectedIndex());
                       
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Se ingreso correctamente el usuario!");
                        mostrarTabla();
                        LimpiarDatos();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Registro no ingresado");
                    }}else{
                            JOptionPane.showMessageDialog(null,"Lo siento ese usuario ya existe");
                        }
                    }else{
                         JOptionPane.showMessageDialog(null, "No puede asignarle más de un usuario a un empleado");
                         
                    
                    }


                   
                    

                    
                }
                catch(SQLException ex)
                {
                    Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
            
        
    }//GEN-LAST:event_btnagregarusuarioActionPerformed

    private void btnvolverusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverusuarioActionPerformed
        seguridad s = new seguridad();
        s.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverusuarioActionPerformed

    private void btnbuscarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarusuarioActionPerformed

    private void txtempleadofiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtempleadofiltrarKeyTyped
        
        txtempleadofiltrar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena=(txtempleadofiltrar.getText());
                txtempleadofiltrar.setText(cadena);
                
                Filtro();
            }
        });
        
        trsFiltro = new TableRowSorter(tablausuarios.getModel());
        tablausuarios.setRowSorter(trsFiltro);
        
    }//GEN-LAST:event_txtempleadofiltrarKeyTyped

    private void tablausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuariosMouseClicked
      int seleccion = tablausuarios.rowAtPoint(evt.getPoint());
      btnmodificarusuario.setEnabled(true);
      btneliminarusuario.setEnabled(true);
        try {
            st=c.prepareStatement("select nombre_empleado FROM empleados where codigo_empleado=?");
            st.setString(1,String.valueOf(tablausuarios.getValueAt(seleccion,2)));
            rs=st.executeQuery();
            while(rs.next()){
                empleado=rs.getString(1);
            }
            
            txtusuarios.setText(String.valueOf(tablausuarios.getValueAt(seleccion, 0)));
            txtcontrasenausuario.setText(String.valueOf(tablausuarios.getValueAt(seleccion, 1)));
            txtconfirmarcontra.setText(String.valueOf(tablausuarios.getValueAt(seleccion, 1)));
            cmbEmpleado.setSelectedItem(empleado);
            System.out.println(tablausuarios.getValueAt(seleccion, 3));
            cmbrol.setSelectedIndex((int)tablausuarios.getValueAt(seleccion, 3));
            

            
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_tablausuariosMouseClicked

    private void txtcontrasenausuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontrasenausuarioKeyTyped
        String pass = txtcontrasenausuario.getText().toString();
        
        if(utilities.isPasswordValid(pass))
        {
            lblpass.setText("");
        }
        else
        {
            lblpass.setText("*La contraseña debe de contener: 1 Mayuscula, 2 numeros");
        }
        
        if(txtcontrasenausuario.getText().length()>10)
        {
            evt.consume();
            lblpass.setText("*La contraseña debe de contener minimo 10 caracteres");
        }
    }//GEN-LAST:event_txtcontrasenausuarioKeyTyped

    private void txtusuariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuariosKeyTyped
        if(!(evt.getKeyChar() == KeyEvent.VK_SPACE)
                    && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE))
        {
            lbluser.setText("");
        }
        else
        {
            lbluser.setText("Campo Necesario");
        }
        
        if(txtusuarios.getText().length()==20)
        {
            evt.consume();
            lbluser.setText("El usuario solo puede contener 20 caracter");
        }
    }//GEN-LAST:event_txtusuariosKeyTyped

    private void txtconfirmarcontraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmarcontraKeyTyped
        
        if(txtconfirmarcontra.getText().isEmpty())
        {
            lblconfirpass.setText("*Campo Necesario");
        }
        else
        {
            lblconfirpass.setText("");
        }
        
        if(txtconfirmarcontra.getText().length()>10)
        {
            evt.consume();
            lblconfirpass.setText("*La contraseña debe de contener minimo 10 caracteres");
        }
    }//GEN-LAST:event_txtconfirmarcontraKeyTyped

    private void cmbEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmpleadoActionPerformed

    private void cmbrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbrolActionPerformed

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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarusuario;
    private javax.swing.JButton btnbuscarusuario;
    private javax.swing.JButton btneliminarusuario;
    private javax.swing.JButton btnmodificarusuario;
    private javax.swing.JButton btnvolverusuario;
    private javax.swing.JComboBox<String> cmbEmpleado;
    private javax.swing.JComboBox<String> cmbrol;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblconfirpass;
    private javax.swing.JLabel lblcontrasenausuario;
    private javax.swing.JLabel lblcontrasenausuario1;
    private javax.swing.JLabel lblempleado;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblrol;
    private javax.swing.JLabel lblrol1;
    private javax.swing.JLabel lblrool;
    private javax.swing.JLabel lbluser;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblusuariofiltrar;
    private javax.swing.JLabel lblusuarios;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JPasswordField txtconfirmarcontra;
    private javax.swing.JPasswordField txtcontrasenausuario;
    private javax.swing.JTextField txtempleadofiltrar;
    private javax.swing.JTextField txtusuarios;
    // End of variables declaration//GEN-END:variables
}
