/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.vistas;

import caritas.controlador.ControladorFamilia;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Familia extends javax.swing.JDialog {

    private String refUsuario;
    private String refAyuda;
    private DefaultTableModel dtm;
    private Frame parent;
    private ResultSet resultSet;

    /**
     * Creates new form Familia
     *
     * @param parent
     * @param modal
     */
    public Familia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Creates new form Familia
     *
     * @param parent
     * @param modal
     * @param refUsuario
     */
    public Familia(java.awt.Frame parent, boolean modal, String refUsuario) {
        super(parent, modal);
        initComponents();
        this.refUsuario = refUsuario;
        this.parent = parent;
        this.setLocationRelativeTo(null);
        this.setTitle("Caritas - Familiares");
        dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(new Object[]{"Referencia", "Nombre", "Apellidos", "Edad", "Observaciones", "Télefono"});
        setFamiliares();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtRefFamiliar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtObservaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFamiliares = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setText("Referencia");
        jPanel1.add(jLabel1);

        jtRefFamiliar.setEditable(false);
        jPanel1.add(jtRefFamiliar);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jPanel1.add(jtNombre);

        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3);
        jPanel1.add(jtApellidos);

        jLabel4.setText("Edad");
        jPanel1.add(jLabel4);
        jPanel1.add(jtEdad);

        jLabel5.setText("Observaciones");
        jPanel1.add(jLabel5);
        jPanel1.add(jtObservaciones);

        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6);
        jPanel1.add(jtTelefono);

        jtFamiliares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtFamiliares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFamiliaresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtFamiliares);

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbBorrar)
                    .addComponent(jbCancelar)
                    .addComponent(jbLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtFamiliaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFamiliaresMouseClicked
        this.refAyuda = dtm.getValueAt(jtFamiliares.getSelectedRow(), 0).toString();
        setFamiliar(this.refAyuda);
    }//GEN-LAST:event_jtFamiliaresMouseClicked

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        caritas.modelo.Familiar f = new caritas.modelo.Familiar();
        f.setRefUsuario(refUsuario);
        f.setNombre(jtNombre.getText());
        f.setApellidos(jtApellidos.getText());
        f.setEdad(jtEdad.getText());
        f.setObservaciones(jtObservaciones.getText());
        f.setTelefono(jtTelefono.getText());

        if (ControladorFamilia.getInstance().addFamiliar(f)) {
            JOptionPane.showMessageDialog(this, "Familiar agregado con éxito");
            setFamiliares();
            cleanJTextField();
        } else {
            JOptionPane.showMessageDialog(this, "El familiar no se ha podido agregar");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        if (this.refAyuda != null && JOptionPane.showConfirmDialog(parent, "El familiar va a ser eliminado y no podrá recuperarlo.\n¿Está seguro?") == 0) {
            if (ControladorFamilia.getInstance().deleteFamiliar(refUsuario, refAyuda)) {
                JOptionPane.showMessageDialog(this, "Familiar borrado de la base de datos.");
                setFamiliares();
                cleanJTextField();
            } else {
                JOptionPane.showMessageDialog(this, "El familiar no encontrado en la base de datos.");
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        caritas.modelo.Familiar f = new caritas.modelo.Familiar();
        f.setRefUsuario(refUsuario);
        f.setRefFamiliar(jtRefFamiliar.getText());
        f.setNombre(jtNombre.getText());
        f.setApellidos(jtApellidos.getText());
        f.setEdad(jtEdad.getText());
        f.setObservaciones(jtObservaciones.getText());
        f.setTelefono(jtTelefono.getText());

        if (ControladorFamilia.getInstance().updateFamiliar(f)) {
            JOptionPane.showMessageDialog(this, "Familiar modificado con éxito");
            setFamiliares();
        } else {
            JOptionPane.showMessageDialog(this, "El familiar no se ha podido modificar");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        cleanJTextField();
    }//GEN-LAST:event_jbLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Familia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Familia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Familia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Familia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Familia dialog = new Familia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jtApellidos;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTable jtFamiliares;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtObservaciones;
    private javax.swing.JTextField jtRefFamiliar;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    private void setFamiliares() {
        try {
            dtm.setNumRows(0);
            resultSet = ControladorFamilia.getInstance().getFamiliares(refUsuario);
            while (resultSet.next()) {
                dtm.addRow(new Object[]{
                    resultSet.getString("id_familiar"),
                    resultSet.getString("nombre"),
                    resultSet.getString("apellidos"),
                    resultSet.getString("edad"),
                    resultSet.getString("observaciones"),
                    resultSet.getString("telefono")});
            }
            jtFamiliares.setModel(dtm);
        } catch (SQLException e) {
           
        }
    }

    private void setFamiliar(String refFamiliar) {
        try {
            dtm.setNumRows(0);
            resultSet = ControladorFamilia.getInstance().getFamiliar(this.refUsuario, refFamiliar);
            while (resultSet.next()) {
                jtRefFamiliar.setText(resultSet.getString("id_familiar"));
                jtNombre.setText(resultSet.getString("nombre"));
                jtApellidos.setText(resultSet.getString("apellidos"));
                jtEdad.setText(resultSet.getString("edad"));
                jtObservaciones.setText(resultSet.getString("observaciones"));
                jtTelefono.setText(resultSet.getString("telefono"));
            }
            jtFamiliares.setModel(dtm);
        } catch (SQLException e) {

        }
    }

    private void cleanJTextField() {
        jtRefFamiliar.setText("");
        jtNombre.setText("");
        jtApellidos.setText("");
        jtEdad.setText("");
        jtObservaciones.setText("");
        jtTelefono.setText("");
    }
}