package sanmatiasresort;

import Clases.Conexion;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class reportes extends javax.swing.JFrame {
        public String decision;
        public String Titulo;
        Conexion c = new Conexion();
        Connection cn = c.conectar();
        PreparedStatement ps;
        ResultSet rs;
        String qry;
    public reportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jdtChooserInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jdtChooserFinal = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 126, 194));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocirculo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reportería");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Inicio: ");

        jdtChooserInicio.setDateFormatString("yyyy-MM-dd");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Final:");

        jdtChooserFinal.setDateFormatString("yyyy-MM-dd");

        jButton1.setBackground(new java.awt.Color(30, 150, 56));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cabañas más alquiladas");
        jButton1.setActionCommand("Cabañas más alquiladas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CabañasActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(30, 150, 56));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ganancias");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GananciasActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exportar a Pdf");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(230, 231, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Atras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdtChooserInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdtChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jdtChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jdtChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
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

    private void CabañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CabañasActionPerformed
        decision= "cabaña"; 
        Titulo = "Cabañas Mas Alquiladas del "+((JTextField)jdtChooserInicio.getDateEditor().getUiComponent()).getText() +" al "+((JTextField)jdtChooserFinal.getDateEditor().getUiComponent()).getText()+""; 
        String Datos [][]= {}; 
        String cabecera[]= {"Codigo", "Cabaña ", "Veces Alquilada"}; 
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo = new DefaultTableModel(Datos, cabecera); 
        table.setModel(modelo);
        try { 
            qry = "SELECT C.codigo_cabaña, C.descripcion_cabaña, count(A.codigo_reservacion) as 'cantidad_alquilada' from reservaciones as A\n" +
                  "join detalle_reservaciones as B on A.codigo_reservacion=B.codigo_reservacion\n" +
                  "join cabañas as C on B.codigo_cabaña=c.codigo_cabaña \n" +
                  "where A.fecha_llegada between ? AND ? \n" +
                  "group by C.codigo_cabaña, C.descripcion_cabaña";
            ps = cn.prepareStatement(qry);
            ps.setString(1, ((JTextField)jdtChooserInicio.getDateEditor().getUiComponent()).getText());
            ps.setString(2, ((JTextField)jdtChooserFinal.getDateEditor().getUiComponent()).getText());
            
            rs= ps.executeQuery(); 
            
            while(rs.next()){
            modelo.addRow(new Object [] {rs.getString("codigo_cabaña"), rs.getString("descripcion_cabaña"),rs.getString("cantidad_alquilada")});
            }
            table.setModel(modelo);
           
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CabañasActionPerformed

    private void GananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GananciasActionPerformed
        try {
            decision= "ganancia"; 
            Titulo = "Ganancias  Por Cabañas del "+((JTextField)jdtChooserInicio.getDateEditor().getUiComponent()).getText()+" al "+((JTextField)jdtChooserFinal.getDateEditor().getUiComponent()).getText()+""; 
            qry = " select A.codigo_reservacion as 'codigo' ,Sum(B.precio_cabaña+B.costo_extra) As 'subtotal', Sum((B.precio_cabaña+B.costo_extra)*0.15) as 'isv', Sum((B.precio_cabaña+B.costo_extra)+ ((B.precio_cabaña+B.costo_extra)*0.15))\n" +
                  " as 'total' from reservaciones as A  join detalle_reservaciones as B on A.codigo_reservacion= B.codigo_reservacion\n" +
                  " where A.fecha_llegada between ? and ?\n" +
                  " group by A.codigo_reservacion";
            String datos [][]={};
            String cabecera []= {"Reservacion","Subtotal", "ISV" , "Total"};
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = new DefaultTableModel(datos, cabecera);
             
            ps = cn.prepareStatement(qry);
            ps.setString(1, ((JTextField)jdtChooserInicio.getDateEditor().getUiComponent()).getText());
            ps.setString(2, ((JTextField)jdtChooserFinal.getDateEditor().getUiComponent()).getText());
            rs = ps.executeQuery(); 
            
            while(rs.next()){
            modelo.addRow(new Object []{rs.getString("codigo"), rs.getString("subtotal"),rs.getString("isv") , rs.getString("total")});
            }
            table.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GananciasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try{
               
               Document doc= new Document();
               
               String ruta= System.getProperty("user.home");
               try {
                   if(decision.equals("ganancia")){
                       PdfWriter.getInstance(doc, new FileOutputStream(ruta +  "/Desktop/GananciasSanMatiasResort.pdf"));
                   }else{
                   PdfWriter.getInstance(doc, new FileOutputStream(ruta +  "/Desktop/CabañasSanMatiasResort.pdf"));}
               } catch (DocumentException ex) {
                   Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
               }
               Paragraph parrafo = new Paragraph();
               parrafo.setAlignment(Paragraph.ALIGN_CENTER);
              
               parrafo.setFont(FontFactory.getFont("Tahoma", 18,Font.BOLD,BaseColor.BLACK));
               parrafo.add("\n\n" +Titulo+" \n\n\n");
               
               doc.open();
             
               doc.add(parrafo);
               
                PdfPTable tabla = new PdfPTable(table.getColumnCount());
                 
                
               if(decision.equals("ganancia")){
                   tabla.addCell("Código Reservacion");
                   tabla.addCell("Subtotal");
                   tabla.addCell("ISV");
                   tabla.addCell("Total");
               }else{
                   tabla.addCell("Código");
                   tabla.addCell("Cabaña");
                   tabla.addCell("Cantidad");
               }
               
               
               try{
                   
                   ps = cn.prepareStatement(qry);
                   ps.setString(1, ((JTextField)jdtChooserInicio.getDateEditor().getUiComponent()).getText());
                   ps.setString(2, ((JTextField)jdtChooserFinal.getDateEditor().getUiComponent()).getText());
                   rs = ps.executeQuery();
                   
                   
                       while(rs.next()){
                          for (int i =1; i<=table.getColumnCount(); i++){
                           tabla.addCell(rs.getString(i));
                       }
                      
                   }
                    doc.add(tabla);
                    
                   
               }catch(SQLException e ){
                   System.out.println("Error en la conexion"+ e);
                   JOptionPane.showMessageDialog(null, e);
               }
               
               
               
               doc.close();
               JOptionPane.showMessageDialog(null,"Reporte Creado");
              
           }catch(FileNotFoundException ex ){
               Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
           } catch (BadElementException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu mn = new menu(); 
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdtChooserFinal;
    private com.toedter.calendar.JDateChooser jdtChooserInicio;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
