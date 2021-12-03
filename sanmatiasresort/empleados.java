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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Juanfer Siu
 */
public class empleados extends javax.swing.JFrame {
        Conexion cn = new Conexion();
        Connection c = cn.conectar();
        PreparedStatement ps;
        ResultSet rs;
        Statement st;
        DefaultTableModel dtm;
        Utilidades util = new Utilidades();
        String codigo;
        private TableRowSorter trsFiltro;
        
    public empleados() {
        initComponents();
        btnmodificarempleado.setEnabled(false);
        btneliminarempleado.setEnabled(false);
        
        this.setLocationRelativeTo(null);
        mostrarTabla();
    }   
    
    public void limpiardatos(){
        txtnombreempleado.setText(null);
        txtidempleado.setText(null);
        jdtChooserNacimiento.setCalendar(null);
        txtdireccionempleado.setText(null);
        txtcorreoempleado.setText(null);
        txttelefono1empleado.setText(null);
        jdtChooserContrato.setCalendar(null);
        jComboPuesto.setSelectedIndex(0);
    }
    
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        rs = cn.LlenarTabla("SELECT * FROM empleados WHERE estado_empleados='ACT'");
        modelo.setColumnIdentifiers(new Object[]{
            "Código",
            "Nombre Completo",
            "DNI",
            "Fecha de Nacimiento",
            "Dirección",
            "Email",
            "Teléfono",
            "Fecha de Contratación",
            "Puesto"
        });
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("codigo_empleado"),
                    rs.getString("nombre_empleado"),
                    rs.getString("dni_empleado"),
                    rs.getString("fecha_nacimiento_empleado"),
                    rs.getString("direccion_empleado"),
                    rs.getString("email_empleado"),
                    rs.getString("tel_empleado"),
                    rs.getString("fecha_contratacion_empleado"),
                    rs.getInt("codigo_puesto")
                });
            }
            tablaempleados.setModel(modelo);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
     public void Filter(){
           int columna=1;
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtnombreempleadofiltrar.getText(), columna));
       }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panelprincipal = new javax.swing.JPanel();
        lblempleados = new javax.swing.JLabel();
        btnbuscarempleado = new javax.swing.JButton();
        lblidempleado = new javax.swing.JLabel();
        lblnombreempleado = new javax.swing.JLabel();
        txtidempleado = new javax.swing.JTextField();
        txtnombreempleado = new javax.swing.JTextField();
        lblnacimientoempleado = new javax.swing.JLabel();
        lblnombreempleadofiltrar = new javax.swing.JLabel();
        txtnombreempleadofiltrar = new javax.swing.JTextField();
        btnvolverempleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();
        btnagregarempleado = new javax.swing.JButton();
        btneliminarempleado = new javax.swing.JButton();
        btnmodificarempleado = new javax.swing.JButton();
        lblcorreoelectronicoempleado = new javax.swing.JLabel();
        txtcorreoempleado = new javax.swing.JTextField();
        lbldireccionempleado = new javax.swing.JLabel();
        txtdireccionempleado = new javax.swing.JTextField();
        lbltelefono1empleado = new javax.swing.JLabel();
        txttelefono1empleado = new javax.swing.JTextField();
        lbltelefono2empleado = new javax.swing.JLabel();
        lblfechacontratacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdtChooserNacimiento = new com.toedter.calendar.JDateChooser();
        jdtChooserContrato = new com.toedter.calendar.JDateChooser();
        jComboPuesto = new javax.swing.JComboBox<>();
        lblErrorN = new javax.swing.JLabel();
        lblErrorT = new javax.swing.JLabel();
        lblErrorB = new javax.swing.JLabel();
        lblErrorI = new javax.swing.JLabel();

        jButton5.setText("Reservación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(33, 126, 194));

        panelprincipal.setBackground(new java.awt.Color(33, 126, 194));
        panelprincipal.setForeground(new java.awt.Color(255, 0, 0));

        lblempleados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblempleados.setForeground(new java.awt.Color(255, 255, 255));
        lblempleados.setText("EMPLEADOS");

        btnbuscarempleado.setBackground(new java.awt.Color(230, 203, 1));
        btnbuscarempleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnbuscarempleado.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarempleado.setText("Buscar");

        lblidempleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblidempleado.setForeground(new java.awt.Color(255, 255, 255));
        lblidempleado.setText("No ID");

        lblnombreempleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblnombreempleado.setForeground(new java.awt.Color(255, 255, 255));
        lblnombreempleado.setText("Nombre del Empleado");

        txtidempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidempleadoKeyTyped(evt);
            }
        });

        txtnombreempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreempleadoKeyTyped(evt);
            }
        });

        lblnacimientoempleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblnacimientoempleado.setForeground(new java.awt.Color(255, 255, 255));
        lblnacimientoempleado.setText("Fecha de nacimiento");

        lblnombreempleadofiltrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblnombreempleadofiltrar.setForeground(new java.awt.Color(255, 255, 255));
        lblnombreempleadofiltrar.setText("Nombre del Empleado");

        txtnombreempleadofiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreempleadofiltrarKeyTyped(evt);
            }
        });

        btnvolverempleado.setBackground(new java.awt.Color(230, 203, 1));
        btnvolverempleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnvolverempleado.setForeground(new java.awt.Color(255, 255, 255));
        btnvolverempleado.setText("Volver");
        btnvolverempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverempleadoActionPerformed(evt);
            }
        });

        tablaempleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaempleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaempleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaempleados);

        btnagregarempleado.setBackground(new java.awt.Color(30, 150, 56));
        btnagregarempleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnagregarempleado.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarempleado.setText("Agregar");
        btnagregarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarempleadoActionPerformed(evt);
            }
        });

        btneliminarempleado.setBackground(new java.awt.Color(236, 29, 29));
        btneliminarempleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminarempleado.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarempleado.setText("Eliminar");
        btneliminarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarempleadoActionPerformed(evt);
            }
        });

        btnmodificarempleado.setBackground(new java.awt.Color(230, 203, 1));
        btnmodificarempleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnmodificarempleado.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificarempleado.setText("Modificar");
        btnmodificarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarempleadoActionPerformed(evt);
            }
        });

        lblcorreoelectronicoempleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcorreoelectronicoempleado.setForeground(new java.awt.Color(255, 255, 255));
        lblcorreoelectronicoempleado.setText("Correo Electrónico");

        txtcorreoempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoempleadoKeyTyped(evt);
            }
        });

        lbldireccionempleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbldireccionempleado.setForeground(new java.awt.Color(255, 255, 255));
        lbldireccionempleado.setText("Dirección");

        lbltelefono1empleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbltelefono1empleado.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefono1empleado.setText("Telefono");

        txttelefono1empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefono1empleadoKeyTyped(evt);
            }
        });

        lbltelefono2empleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbltelefono2empleado.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefono2empleado.setText("Puesto");

        lblfechacontratacion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblfechacontratacion.setForeground(new java.awt.Color(255, 255, 255));
        lblfechacontratacion.setText("Fecha de Contratación");

        jPanel2.setBackground(new java.awt.Color(32, 126, 193));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocirculo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdtChooserNacimiento.setDateFormatString("yyyy-MM-dd");
        jdtChooserNacimiento.setMaxSelectableDate(new Date());

        jdtChooserContrato.setDateFormatString("yyyy-MM-dd");
        jdtChooserContrato.setMaxSelectableDate(new Date());

        jComboPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir un puesto", "Administrador", "Gerente", "Cajera" }));

        lblErrorN.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorT.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorB.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorI.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbldireccionempleado)
                                .addComponent(lblnombreempleadofiltrar)
                                .addComponent(txtdireccionempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblfechacontratacion)
                                .addComponent(lblnacimientoempleado)
                                .addComponent(jdtChooserNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdtChooserContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombreempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombreempleadofiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(lblErrorB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblErrorN, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblidempleado)
                                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblErrorI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnbuscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblcorreoelectronicoempleado)
                                        .addComponent(lbltelefono1empleado)
                                        .addComponent(txtcorreoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttelefono1empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbltelefono2empleado)
                                        .addComponent(jComboPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblErrorT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btneliminarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnmodificarempleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnagregarempleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(412, 412, 412))))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(btnvolverempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(103, 103, 103))))
                    .addComponent(lblnombreempleado))
                .addGap(34, 34, 34))
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblempleados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblempleados)
                .addGap(26, 26, 26)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnvolverempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidempleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnombreempleado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblErrorN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                .addComponent(txtcorreoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblnacimientoempleado)
                                            .addComponent(lblcorreoelectronicoempleado))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdtChooserNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(lbltelefono1empleado))
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addComponent(btnagregarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnmodificarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addComponent(lbldireccionempleado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdireccionempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(txttelefono1empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblErrorT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23)))
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltelefono2empleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblfechacontratacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdtChooserContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(lblnombreempleadofiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                .addComponent(txtnombreempleadofiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErrorB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbuscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnvolverempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverempleadoActionPerformed
        mantenimientos mnt = new mantenimientos();
        mnt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnvolverempleadoActionPerformed

    private void btnagregarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarempleadoActionPerformed
        String strRespuesta="";
        try{
           ps=c.prepareStatement("Call INSERT_EMPLEADOS(?,?,?,?,?,?,?,?)");
           ps.setString(1, txtnombreempleado.getText());
           ps.setString(2, txtidempleado.getText());
           ps.setString(3, ((JTextField)jdtChooserNacimiento.getDateEditor().getUiComponent()).getText());
           ps.setString(4, txtdireccionempleado.getText());
           ps.setString(5, txtcorreoempleado.getText());
           ps.setString(6, txttelefono1empleado.getText());
           ps.setString(7, ((JTextField)jdtChooserContrato.getDateEditor().getUiComponent()).getText());
           ps.setInt(8, jComboPuesto.getSelectedIndex());
           
           strRespuesta = util.strPreguntaSiNo("¿Desea Ingresar el Empleado?");
           if(strRespuesta=="Si"){
               ps.executeUpdate();
               mostrarTabla();
               limpiardatos();
               JOptionPane.showMessageDialog(null, "Registro ingresado exitosamente");
           }else{
               JOptionPane.showConfirmDialog(null, "Registro NO ingresado");
           }
        }catch(SQLException ex){
            Logger.getLogger(empleados.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnagregarempleadoActionPerformed

    private void btneliminarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarempleadoActionPerformed
        btnagregarempleado.setEnabled(true);
        btneliminarempleado.setEnabled(false);
        btnmodificarempleado.setEnabled(false);
        String strRespuesta = "";
        
        try{
            ps=c.prepareStatement("CALL PROCEDIMIENTOS_VARIOS (?,?,?)");
            ps.setString(1, "empleados");
            ps.setString(2, "DEL");
            ps.setInt(3, Integer.parseInt(codigo));
            
            strRespuesta = util.strPreguntaSiNo("¿Desea eliminar este empleado?");
            if(strRespuesta =="Si"){
                ps.executeUpdate();
                mostrarTabla();
                limpiardatos();
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "Registro NO eliminado");
            }
        }catch(SQLException ex){
            Logger.getLogger(empleados.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btneliminarempleadoActionPerformed

    private void btnmodificarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarempleadoActionPerformed
        btnagregarempleado.setEnabled(true);
        btneliminarempleado.setEnabled(false);
        btnmodificarempleado.setEnabled(false);
        String strRespuesta = "";
        
        try{
            ps= c.prepareStatement("CALL UPDATE_EMPLEADOS (?,?,?,?,?,?,?,?,?);");
            ps.setString(1,txtnombreempleado.getText());
            ps.setString(2, txtidempleado.getText());
            ps.setString(3, ((JTextField)jdtChooserNacimiento.getDateEditor().getUiComponent()).getText());
            ps.setString(4, txtdireccionempleado.getText());
            ps.setString(5, txtcorreoempleado.getText());
            ps.setString(6, txttelefono1empleado.getText());
            ps.setString(7, ((JTextField)jdtChooserContrato.getDateEditor().getUiComponent()).getText());
            ps.setInt(8, jComboPuesto.getSelectedIndex());
            ps.setInt(9, Integer.parseInt(codigo));
            
            strRespuesta=util.strPreguntaSiNo("¿Desea actualizar el empleado?");
            if(strRespuesta=="Si"){
                ps.executeUpdate();
                mostrarTabla();
                limpiardatos();
                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "Registro NO modificado ");
            }
        }catch(SQLException ex){
            Logger.getLogger(empleados.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnmodificarempleadoActionPerformed

    private void tablaempleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempleadosMouseClicked
        int contadorcolumna = tablaempleados.getRowCount();
        if(contadorcolumna == -1){
            JOptionPane.showMessageDialog(null, "Ingrese datos para poder visualizarlos");
        }else{
            btnagregarempleado.setEnabled(false);
            btneliminarempleado.setEnabled(true);
            btnmodificarempleado.setEnabled(true);
            
            try{
                DefaultTableModel model = (DefaultTableModel)tablaempleados.getModel();
                int index = tablaempleados.getSelectedRow();
                Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 3));
                jdtChooserNacimiento.setDate(date);
            }catch(ParseException ex){
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE,null,0);
            }
            
            try{
                DefaultTableModel model = (DefaultTableModel)tablaempleados.getModel();
                int index = tablaempleados.getSelectedRow();
                Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 7));
                jdtChooserContrato.setDate(date);
            }catch(ParseException ex){
                Logger.getLogger(empleados.class.getName()).log(Level.SEVERE,null,0);
            }
            
            int seleccion = tablaempleados.rowAtPoint(evt.getPoint());
            codigo=String.valueOf(tablaempleados.getValueAt(seleccion, 0));
            txtnombreempleado.setText(String.valueOf(tablaempleados.getValueAt(seleccion,1)));
            txtidempleado.setText(String.valueOf(tablaempleados.getValueAt(seleccion,2)));
            txtdireccionempleado.setText(String.valueOf(tablaempleados.getValueAt(seleccion,4)));
            txtcorreoempleado.setText(String.valueOf(tablaempleados.getValueAt(seleccion, 5)));
            txttelefono1empleado.setText(String.valueOf(tablaempleados.getValueAt(seleccion,6)));
            jComboPuesto.setSelectedIndex((int) tablaempleados.getValueAt(seleccion,8));
        }
    }//GEN-LAST:event_tablaempleadosMouseClicked

    private void txtnombreempleadofiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreempleadofiltrarKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
                    lblErrorB.setText("*El campo no admite números");}  else {
                    lblErrorB.setText("");
                }
          if(txtnombreempleadofiltrar.getText().length()==100){
          evt.consume();
          }

        txtnombreempleadofiltrar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtnombreempleadofiltrar.getText());
                txtnombreempleadofiltrar.setText(cadena);
                Filter();
            }
        });
        trsFiltro = new TableRowSorter(tablaempleados.getModel());
        tablaempleados.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtnombreempleadofiltrarKeyTyped

    private void txtcorreoempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoempleadoKeyTyped
        util.isEmail((txtcorreoempleado.getText()));
    }//GEN-LAST:event_txtcorreoempleadoKeyTyped

    private void txtnombreempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreempleadoKeyTyped
       if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
                    lblErrorN.setText("*El campo no admite números");}  else {
                    lblErrorN.setText("");
                }
          if(txtnombreempleado.getText().length()==50){
          evt.consume();
          lblErrorN.setText("*Solo puede escribir 50 letras");

          }
    }//GEN-LAST:event_txtnombreempleadoKeyTyped

    private void txtidempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidempleadoKeyTyped
         if (!Character.isDigit(evt.getKeyChar()))
                 {
                evt.consume();
                 lblErrorI.setText("*El campo no admite letras");
                 }  
                else {
                    lblErrorI.setText("");
                    }
              if(txtidempleado.getText().length()==13){
          evt.consume();
           lblErrorI.setText("*Solo puede escribir 13 numeros");
          }
     
          
    }//GEN-LAST:event_txtidempleadoKeyTyped

    private void txttelefono1empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefono1empleadoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
                 lblErrorT.setText("*El campo no admite letras");
        } else {
            lblErrorT.setText("");
        }
        
        if(txttelefono1empleado.getText().length()==16){
          evt.consume();
          lblErrorT.setText("*Solo puede escribir 16 números");
        }else {
          lblErrorT.setText("");
        }
    }//GEN-LAST:event_txttelefono1empleadoKeyTyped

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
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarempleado;
    private javax.swing.JButton btnbuscarempleado;
    private javax.swing.JButton btneliminarempleado;
    private javax.swing.JButton btnmodificarempleado;
    private javax.swing.JButton btnvolverempleado;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdtChooserContrato;
    private com.toedter.calendar.JDateChooser jdtChooserNacimiento;
    private javax.swing.JLabel lblErrorB;
    private javax.swing.JLabel lblErrorI;
    private javax.swing.JLabel lblErrorN;
    private javax.swing.JLabel lblErrorT;
    private javax.swing.JLabel lblcorreoelectronicoempleado;
    private javax.swing.JLabel lbldireccionempleado;
    private javax.swing.JLabel lblempleados;
    private javax.swing.JLabel lblfechacontratacion;
    private javax.swing.JLabel lblidempleado;
    private javax.swing.JLabel lblnacimientoempleado;
    private javax.swing.JLabel lblnombreempleado;
    private javax.swing.JLabel lblnombreempleadofiltrar;
    private javax.swing.JLabel lbltelefono1empleado;
    private javax.swing.JLabel lbltelefono2empleado;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JTable tablaempleados;
    private javax.swing.JTextField txtcorreoempleado;
    private javax.swing.JTextField txtdireccionempleado;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtnombreempleado;
    private javax.swing.JTextField txtnombreempleadofiltrar;
    private javax.swing.JTextField txttelefono1empleado;
    // End of variables declaration//GEN-END:variables
}
