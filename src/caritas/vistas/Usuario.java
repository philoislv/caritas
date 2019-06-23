/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caritas.vistas;

import caritas.controlador.ControladorUsuario;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Usuario extends javax.swing.JDialog {

    private String refUsuario;
    private Ayuda ayuda;
    private Familia familia;
    private Frame parent;
    private ResultSet resultSet;

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     */
    public Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        setTitle("Caritas - Datos del usuario");
    }

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     * @param refUsuario
     */
    public Usuario(java.awt.Frame parent, boolean modal, String refUsuario) {
        super(parent, modal);
        initComponents();
        this.refUsuario = refUsuario;
        this.parent = parent;
        setUsuario(this.refUsuario);
        setTitle("Caritas - Alta del usuario");
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
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtNIF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtMovil = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfNac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfAlta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jcSituacionLaboral = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcEstadoCivil = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jtIngresos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtHijos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbAlta = new javax.swing.JButton();
        jbAyudas = new javax.swing.JButton();
        jbFamiliares = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1);
        jPanel1.add(jtNombre);

        jLabel2.setText("Apellidos");
        jPanel1.add(jLabel2);
        jPanel1.add(jtApellidos);

        jLabel3.setText("NIF");
        jPanel1.add(jLabel3);
        jPanel1.add(jtNIF);

        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4);
        jPanel1.add(jtTelefono);

        jLabel5.setText("Móvil");
        jPanel1.add(jLabel5);
        jPanel1.add(jtMovil);

        jLabel6.setText("Domicilio");
        jPanel1.add(jLabel6);
        jPanel1.add(jtDomicilio);

        jLabel7.setText("Fecha de nacimiento");
        jPanel1.add(jLabel7);
        jPanel1.add(jtfNac);

        jLabel8.setText("Fecha de alta");
        jPanel1.add(jLabel8);
        jPanel1.add(jtfAlta);

        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jLabel9.setText("Situación laboral");
        jPanel3.add(jLabel9);

        jcSituacionLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paro", "Trabajando" }));
        jPanel3.add(jcSituacionLaboral);

        jLabel10.setText("Estado civil");
        jPanel3.add(jLabel10);

        jcEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Viudo", "Separado" }));
        jPanel3.add(jcEstadoCivil);

        jLabel11.setText("Ingresos");
        jPanel3.add(jLabel11);
        jPanel3.add(jtIngresos);

        jLabel12.setText("Número de hijos");
        jPanel3.add(jLabel12);
        jPanel3.add(jtHijos);

        jLabel13.setText("Observaciones");
        jPanel3.add(jLabel13);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbAlta.setText("Alta");
        jbAlta.setEnabled(false);
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbAyudas.setText("Ayudas");
        jbAyudas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAyudasActionPerformed(evt);
            }
        });

        jbFamiliares.setText("Familiares");
        jbFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFamiliaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAyudas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFamiliares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbAlta)
                    .addComponent(jbAyudas)
                    .addComponent(jbFamiliares))
                .addContainerGap())
        );

        jtObservaciones.setColumns(20);
        jtObservaciones.setRows(5);
        jScrollPane1.setViewportView(jtObservaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        caritas.modelo.Usuario u = new caritas.modelo.Usuario();
        u.setRef(refUsuario);
        u.setNombre(jtNombre.getText());
        u.setApellidos(jtApellidos.getText());
        u.setDni(jtNIF.getText());
        u.setTelefono(jtTelefono.getText());
        u.setMovil(jtMovil.getText());
        u.setDomicilio(jtMovil.getText());
        u.setFechaNac(jtfNac.getText());
        u.setFechaAlt(jtfAlta.getText());
        u.setSituacionLaboral(jcSituacionLaboral.getSelectedItem().toString());
        u.setEstadoCivil(jcEstadoCivil.getSelectedItem().toString());
        u.setIngresos(jtIngresos.getText());
        u.setHijos(jtHijos.getText());
        u.setObservaciones(jtObservaciones.getText());

        if (ControladorUsuario.getInstance().updateUsuario(u)) {
            JOptionPane.showMessageDialog(this, "Usuario modificado con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no se ha podido modificar");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        String nif = jtNIF.getText();
        if (JOptionPane.showConfirmDialog(parent, "El usuario va a ser eliminado y no podrá recuperarlo.\n¿Está seguro?") == 0) {
            if (ControladorUsuario.getInstance().deleteUsuario(nif)) {
                JOptionPane.showMessageDialog(this, "Usuario borrado de la base de datos.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado en la base de datos.");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        caritas.modelo.Usuario u = new caritas.modelo.Usuario();
        u.setNombre(jtNombre.getText());
        u.setApellidos(jtApellidos.getText());
        u.setDni(jtNIF.getText());
        u.setTelefono(jtTelefono.getText());
        u.setMovil(jtMovil.getText());
        u.setDomicilio(jtMovil.getText());
        u.setFechaNac(jtfNac.getText());
        u.setFechaAlt(jtfAlta.getText());
        u.setSituacionLaboral(jcSituacionLaboral.getSelectedItem().toString());
        u.setEstadoCivil(jcEstadoCivil.getSelectedItem().toString());
        u.setIngresos(jtIngresos.getText());
        u.setHijos(jtHijos.getText());
        u.setObservaciones(jtObservaciones.getText());

        if (ControladorUsuario.getInstance().addUsuario(u)) {
            JOptionPane.showMessageDialog(this, "Usuario agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no se ha podido agregar");
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbAyudasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAyudasActionPerformed
        ayuda = null;
        if (ayuda == null) {
            ayuda = new Ayuda(this.parent, true, refUsuario);
        }
        ayuda.setVisible(true);
    }//GEN-LAST:event_jbAyudasActionPerformed

    private void jbFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFamiliaresActionPerformed
        familia = null;
        if (familia == null) {
            familia = new Familia(this.parent, true, refUsuario);
        }
        familia.setVisible(true);
    }//GEN-LAST:event_jbFamiliaresActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuario dialog = new Usuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbAlta;
    private javax.swing.JButton jbAyudas;
    private javax.swing.JButton jbCancelar;
    public javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbFamiliares;
    public javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcEstadoCivil;
    private javax.swing.JComboBox<String> jcSituacionLaboral;
    private javax.swing.JTextField jtApellidos;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtHijos;
    private javax.swing.JTextField jtIngresos;
    private javax.swing.JTextField jtMovil;
    private javax.swing.JTextField jtNIF;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextArea jtObservaciones;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtfAlta;
    private javax.swing.JTextField jtfNac;
    // End of variables declaration//GEN-END:variables

    private void setUsuario(String refUsuario) {
        try {
            resultSet = ControladorUsuario.getInstance().getUsuario(refUsuario);
            while (resultSet.next()) {
                jtNombre.setText(resultSet.getString("nombre"));
                jtApellidos.setText(resultSet.getString("apellidos"));
                jtNIF.setText(resultSet.getString("dni"));
                jtTelefono.setText(resultSet.getString("telefono"));
                jtMovil.setText(resultSet.getString("movil"));
                jtDomicilio.setText(resultSet.getString("domicilio"));
                jtfNac.setText(resultSet.getString("fechanac"));
                jtfAlta.setText(resultSet.getString("fechaalt"));
                String sSituacionLaboral = resultSet.getString("situacionlaboral");
                if (sSituacionLaboral.equalsIgnoreCase("paro")) {
                    jcSituacionLaboral.setSelectedIndex(0);
                } else {
                    jcSituacionLaboral.setSelectedIndex(1);
                }
                String sEstadoCivil = resultSet.getString("estadocivil");
                if (sEstadoCivil.equalsIgnoreCase("soltero")) {
                    jcEstadoCivil.setSelectedIndex(0);
                } else if (sEstadoCivil.equalsIgnoreCase("casado")) {
                    jcEstadoCivil.setSelectedIndex(1);
                } else if (sEstadoCivil.equalsIgnoreCase("viudo")) {
                    jcEstadoCivil.setSelectedIndex(2);
                } else {
                    jcEstadoCivil.setSelectedIndex(3);
                }
                jtIngresos.setText(resultSet.getString("ingresos"));
                jtHijos.setText(resultSet.getString("hijos"));
                jtObservaciones.setText(resultSet.getString("observaciones"));
            }
        } catch (SQLException e) {
        }
    }

}
