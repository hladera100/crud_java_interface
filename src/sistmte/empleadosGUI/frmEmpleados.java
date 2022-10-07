/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistmte.empleadosGUI;

import sistmte.empleadosDAL.conexion;
import java.sql.*;
import javax.swing.JTable;
import sistmte.empleadoBl.empleadosBL;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HALG
 */
public class frmEmpleados extends javax.swing.JFrame {
    DefaultTableModel model;
    
    /**
     * Creates new form frmEmpleados
     */
    public frmEmpleados() {
        initComponents();
        String[] titulos= {"ID","Nombre","Correo"};
        model = new DefaultTableModel(null,titulos);
        tblEmpleados.setModel(model);
        this.mostrarDatos();
        this.Clean();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistmte/recursos/mas.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistmte/recursos/lapiz.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistmte/recursos/borrar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistmte/recursos/cerrar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtid.setEditable(false);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre");

        jLabel3.setText("Correo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(22, 22, 22)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        
        conexion objConexion = new conexion();
        
        empleadosBL oEmpleados = recuperarDatosGui();
        
        String strSentenceInsert = String.format("delete from empleados where id=%d",oEmpleados.getID());
        
        objConexion.executeSQL(strSentenceInsert);
        this.mostrarDatos();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        conexion objConexion = new conexion();
        
        empleadosBL oEmpleados = recuperarDatosGui();
        
        String strSentenceInsert = String.format("insert into empleados (id, nombre, correo)" 
                + "VALUES (null, '%s', '%s')",  oEmpleados.getNombre(), oEmpleados.getCorreo());
        
        objConexion.executeSQL(strSentenceInsert);
        try {
            ResultSet resp = objConexion.consultarRegistros("Select * from empleados;");
            while (resp.next()){
                System.out.println(resp.getString("ID"));
                System.out.println(resp.getString("Nombre"));
                System.out.println(resp.getString("Correo"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        this.mostrarDatos();
        this.Clean();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1){
            JTable receptor = (JTable)evt.getSource();
           txtid.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
           txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
           txtCorreo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
        }
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true);
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
         conexion objConexion = new conexion();
        
        empleadosBL oEmpleados = recuperarDatosGui();
        
        String strSentenceInsert = String.format("Update empleados SET nombre='%s', "
                + "Correo='%s' where ID=%d", oEmpleados.getNombre(),oEmpleados.getCorreo(), oEmpleados.getID());
                
        
        objConexion.executeSQL(strSentenceInsert);
        try {
            ResultSet resp = objConexion.consultarRegistros("Select * from empleados;");
            while (resp.next()){
                System.out.println(resp.getString("ID"));
                System.out.println(resp.getString("Nombre"));
                System.out.println(resp.getString("Correo"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        this.mostrarDatos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.Clean();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void mostrarDatos(){
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
         conexion objConexion = new conexion();
         try {
            ResultSet resp = objConexion.consultarRegistros("Select * from empleados;");
            while (resp.next()){
                System.out.println(resp.getString("ID"));
                System.out.println(resp.getString("Nombre"));
                System.out.println(resp.getString("Correo"));
                Object[] oUsuario = {resp.getString("ID"), resp.getString("Nombre"), resp.getString("Correo")};
                
                model.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public empleadosBL recuperarDatosGui(){
        empleadosBL oEmpleados = new empleadosBL();
        
        int ID = (txtid.getText().isEmpty())?0: Integer.parseInt(txtid.getText());
        
        oEmpleados.setID(ID);
        oEmpleados.setNombre(txtNombre.getText());
        oEmpleados.setCorreo(txtCorreo.getText());
        return oEmpleados;
    }
    
    public void Clean(){
        txtid.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnBorrar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
