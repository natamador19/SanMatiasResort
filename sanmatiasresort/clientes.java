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

public class clientes extends javax.swing.JFrame {
        Conexion cn = new Conexion();
        Connection c = cn.conectar();
        PreparedStatement ps;
        ResultSet rs;
        Statement st;
        DefaultTableModel dtm;
        Utilidades util = new Utilidades();
        String codigo;
        private TableRowSorter trsFiltro;
    
    public clientes() {
        initComponents();
        btnmodificarcliente.setEnabled(false);
        btneliminarcliente.setEnabled(false);
        
        this.setLocationRelativeTo(null);
        mostrarTabla();
    }

     public void limpiardatos(){
        txtnombrecliente.setText(null);
        txtidcliente.setText(null);
        txtrtncliente.setText(null);
        txtcorreocliente.setText(null);
        txttelefono1cliente.setText(null);
        txtdireccioncliente.setText(null);
    }
    
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        rs = cn.LlenarTabla("SELECT * FROM clientes WHERE estado_cliente='ACT'");
        modelo.setColumnIdentifiers(new Object[]{
            "Código",
            "Nombre Completo",
            "DNI",
            "RTN",
            "Email",
            "Teléfono",
            "Dirección",
        });
        try{
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("codigo_cliente"),
                    rs.getString("nombre_cliente"),
                    rs.getString("dni_cliente"),
                    rs.getString("rtn_cliente"),
                    rs.getString("email_cliente"),
                    rs.getString("tel_cliente"),
                    rs.getString("direccion_cliente"),
                });
            }
            tablaclientes.setModel(modelo);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
     public void Filter(){
           int columna=1;
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)"+txtnombreclientefiltrar.getText(), columna));
       }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panelprincipal = new javax.swing.JPanel();
        lblclientes = new javax.swing.JLabel();
        lblidcliente = new javax.swing.JLabel();
        lblnombrecliente = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        txtnombrecliente = new javax.swing.JTextField();
        lblrtn = new javax.swing.JLabel();
        txtrtncliente = new javax.swing.JTextField();
        btnvolverclientes = new javax.swing.JButton();
        btnagregarcliente = new javax.swing.JButton();
        btneliminarcliente = new javax.swing.JButton();
        btnmodificarcliente = new javax.swing.JButton();
        lblcorreoelectronico = new javax.swing.JLabel();
        txtcorreocliente = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        txtdireccioncliente = new javax.swing.JTextField();
        lbltelefono1cliente = new javax.swing.JLabel();
        txttelefono1cliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        lblnombreclientefiltrar = new javax.swing.JLabel();
        txtnombreclientefiltrar = new javax.swing.JTextField();
        lblErrorN = new javax.swing.JLabel();
        lblErrorR = new javax.swing.JLabel();
        lblErrorT = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblErrorI = new javax.swing.JLabel();

        jButton5.setText("Reservación");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(33, 126, 194));

        panelprincipal.setBackground(new java.awt.Color(33, 126, 194));
        panelprincipal.setForeground(new java.awt.Color(33, 126, 194));

        lblclientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblclientes.setForeground(new java.awt.Color(255, 255, 255));
        lblclientes.setText("CLIENTES");

        lblidcliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblidcliente.setForeground(new java.awt.Color(255, 255, 255));
        lblidcliente.setText("No ID");

        lblnombrecliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblnombrecliente.setForeground(new java.awt.Color(255, 255, 255));
        lblnombrecliente.setText("Nombre del Cliente");

        txtidcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidclienteKeyTyped(evt);
            }
        });

        txtnombrecliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreclienteKeyTyped(evt);
            }
        });

        lblrtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblrtn.setForeground(new java.awt.Color(255, 255, 255));
        lblrtn.setText("RTN");

        txtrtncliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrtnclienteKeyTyped(evt);
            }
        });

        btnvolverclientes.setBackground(new java.awt.Color(230, 203, 1));
        btnvolverclientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnvolverclientes.setForeground(new java.awt.Color(255, 255, 255));
        btnvolverclientes.setText("Volver");
        btnvolverclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverclientesActionPerformed(evt);
            }
        });

        btnagregarcliente.setBackground(new java.awt.Color(30, 150, 56));
        btnagregarcliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnagregarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarcliente.setText("Agregar");
        btnagregarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarclienteActionPerformed(evt);
            }
        });

        btneliminarcliente.setBackground(new java.awt.Color(236, 29, 29));
        btneliminarcliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarcliente.setText("Eliminar");
        btneliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarclienteActionPerformed(evt);
            }
        });

        btnmodificarcliente.setBackground(new java.awt.Color(230, 203, 1));
        btnmodificarcliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnmodificarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificarcliente.setText("Modificar");
        btnmodificarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarclienteActionPerformed(evt);
            }
        });

        lblcorreoelectronico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcorreoelectronico.setForeground(new java.awt.Color(255, 255, 255));
        lblcorreoelectronico.setText("Correo Electrónico");

        txtcorreocliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoclienteKeyTyped(evt);
            }
        });

        lbldireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbldireccion.setForeground(new java.awt.Color(255, 255, 255));
        lbldireccion.setText("Dirección");

        lbltelefono1cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbltelefono1cliente.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefono1cliente.setText("Telefono ");

        txttelefono1cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefono1clienteKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(32, 126, 193));

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaclientes.setEnabled(false);
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        lblnombreclientefiltrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblnombreclientefiltrar.setForeground(new java.awt.Color(255, 255, 255));
        lblnombreclientefiltrar.setText("Nombre del Cliente");

        txtnombreclientefiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreclientefiltrarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombreclientefiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombreclientefiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblnombreclientefiltrar)
                .addGap(9, 9, 9)
                .addComponent(txtnombreclientefiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblErrorN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorN.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorR.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorT.setForeground(new java.awt.Color(255, 0, 0));

        lblError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorI.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(txtcorreocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono1cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltelefono1cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblErrorT, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblcorreoelectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(lblnombrecliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addComponent(lblErrorN, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblidcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblErrorI, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblrtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtrtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnagregarcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmodificarcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminarcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorR, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnvolverclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnombrecliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(btnagregarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnmodificarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btneliminarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(462, 462, 462))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErrorN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblErrorI, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblrtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtrtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblErrorR, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcorreoelectronico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcorreocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltelefono1cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono1cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnvolverclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(464, 464, 464)))
                .addContainerGap())
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
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnvolverclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverclientesActionPerformed
        mantenimientos mnt = new mantenimientos();
        mnt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnvolverclientesActionPerformed

    private void btnagregarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarclienteActionPerformed
        String strRespuesta="";
        try{
           ps=c.prepareStatement("Call INSERT_CLIENTES(?,?,?,?,?,?)");
           ps.setString(1, txtnombrecliente.getText());
           ps.setString(2, txtidcliente.getText());
           ps.setString(3, txtrtncliente.getText());
           ps.setString(4, txtcorreocliente.getText());
           ps.setString(5, txttelefono1cliente.getText());
           ps.setString(6, txtdireccioncliente.getText());
           
           strRespuesta = util.strPreguntaSiNo("¿Desea Ingresar el Cliente?");
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
    }//GEN-LAST:event_btnagregarclienteActionPerformed

    private void btneliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarclienteActionPerformed
        btnagregarcliente.setEnabled(true);
        btneliminarcliente.setEnabled(false);
        btnmodificarcliente.setEnabled(false);
        String strRespuesta = "";
        
        try{
            ps=c.prepareStatement("CALL PROCEDIMIENTOS_VARIOS (?,?,?)");
            ps.setString(1, "clientes");
            ps.setString(2, "DEL");
            ps.setInt(3, Integer.parseInt(codigo));
            
            strRespuesta = util.strPreguntaSiNo("¿Desea eliminar este Cliente?");
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
         
    }//GEN-LAST:event_btneliminarclienteActionPerformed

    private void btnmodificarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarclienteActionPerformed
        btnagregarcliente.setEnabled(true);
        btneliminarcliente.setEnabled(false);
        btnmodificarcliente.setEnabled(false);
        String strRespuesta = "";
        
        try{
            ps= c.prepareStatement("CALL UPDATE_CLIENTES (?,?,?,?,?,?,?)");
            ps.setString(1,txtnombrecliente.getText());
            ps.setString(2, txtidcliente.getText());
            ps.setString(3, txtrtncliente.getText());
            ps.setString(4, txtcorreocliente.getText());
            ps.setString(5, txttelefono1cliente.getText());
            ps.setString(6, txtdireccioncliente.getText());
            ps.setInt(7, Integer.parseInt(codigo));
            
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
    }//GEN-LAST:event_btnmodificarclienteActionPerformed

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
       int contadorcolumna = tablaclientes.getRowCount();
        if(contadorcolumna == -1){
            JOptionPane.showMessageDialog(null, "Ingrese datos para poder visualizarlos");
        }else{
            btnagregarcliente.setEnabled(false);
            btneliminarcliente.setEnabled(true);
            btnmodificarcliente.setEnabled(true); 
            
            int seleccion = tablaclientes.rowAtPoint(evt.getPoint());
            codigo=String.valueOf(tablaclientes.getValueAt(seleccion, 0));
            txtnombrecliente.setText(String.valueOf(tablaclientes.getValueAt(seleccion,1)));
            txtidcliente.setText(String.valueOf(tablaclientes.getValueAt(seleccion,2)));
            txtrtncliente.setText(String.valueOf(tablaclientes.getValueAt(seleccion,3)));
            txtcorreocliente.setText(String.valueOf(tablaclientes.getValueAt(seleccion, 4)));
            txttelefono1cliente.setText(String.valueOf(tablaclientes.getValueAt(seleccion,5)));
            txtdireccioncliente.setText(String.valueOf(tablaclientes.getValueAt(seleccion,6)));

        }
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void txtnombreclientefiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreclientefiltrarKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
                    lblError.setText("*El campo no admite números");}  else {
                    lblError.setText("");
                }
          if(txtnombreclientefiltrar.getText().length()==100){
          evt.consume();
          } 
        
        txtnombreclientefiltrar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtnombreclientefiltrar.getText());
                txtnombreclientefiltrar.setText(cadena);
                Filter();
            }
        });
        trsFiltro = new TableRowSorter(tablaclientes.getModel());
        tablaclientes.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtnombreclientefiltrarKeyTyped

    private void txtcorreoclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoclienteKeyTyped
        util.isEmail((txtcorreocliente.getText()));
    }//GEN-LAST:event_txtcorreoclienteKeyTyped

    private void txtnombreclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreclienteKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
                    lblErrorN.setText("*El campo no admite números");}  else {
                    lblErrorN.setText("");
                }
          if(txtnombreclientefiltrar.getText().length()==100){
          evt.consume();
          }
    }//GEN-LAST:event_txtnombreclienteKeyTyped

    private void txtidclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidclienteKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
                 {
                evt.consume();
                 lblErrorI.setText("*El campo no admite letras");
                 }  
                else {
                    lblErrorI.setText("");
                    }
        
        if(txtidcliente.getText().length()==13){
          evt.consume();
          lblErrorI.setText("*Solo puede escribir 14 números");
        }else {
          lblErrorI.setText("");
        }

    }//GEN-LAST:event_txtidclienteKeyTyped

    private void txtrtnclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrtnclienteKeyTyped
        if (!Character.isDigit(evt.getKeyChar()))
                 {
                evt.consume();
                 lblErrorR.setText("*El campo no admite letras");
                 }  
                else {
                    lblErrorR.setText("");
                    }
        
        if(txtrtncliente.getText().length()==14){
          evt.consume();
          lblErrorR.setText("*Solo puede escribir 14 números");
        }else {
          lblErrorR.setText("");
        }

    }//GEN-LAST:event_txtrtnclienteKeyTyped

    private void txttelefono1clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefono1clienteKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
                 lblErrorT.setText("*El campo no admite letras");
        } else {
            lblErrorT.setText("");
        }
        
        if(txttelefono1cliente.getText().length()==16){
          evt.consume();
          lblErrorT.setText("*Solo puede escribir 16 números");
        }else {
          lblErrorT.setText("");
        }
    
        

    }//GEN-LAST:event_txttelefono1clienteKeyTyped

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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarcliente;
    private javax.swing.JButton btneliminarcliente;
    private javax.swing.JButton btnmodificarcliente;
    private javax.swing.JButton btnvolverclientes;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblErrorI;
    private javax.swing.JLabel lblErrorN;
    private javax.swing.JLabel lblErrorR;
    private javax.swing.JLabel lblErrorT;
    private javax.swing.JLabel lblclientes;
    private javax.swing.JLabel lblcorreoelectronico;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblidcliente;
    private javax.swing.JLabel lblnombrecliente;
    private javax.swing.JLabel lblnombreclientefiltrar;
    private javax.swing.JLabel lblrtn;
    private javax.swing.JLabel lbltelefono1cliente;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTextField txtcorreocliente;
    private javax.swing.JTextField txtdireccioncliente;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtnombrecliente;
    private javax.swing.JTextField txtnombreclientefiltrar;
    private javax.swing.JTextField txtrtncliente;
    private javax.swing.JTextField txttelefono1cliente;
    // End of variables declaration//GEN-END:variables
}
