package vista;

import javax.swing.*;

public class pActualizar extends javax.swing.JFrame {

    /**
     * Creates new form actualizarNBA
     */
    public pActualizar() {
        initComponents();
    }

    public JTabbedPane getPanelActualizarDB() {
        return PanelActualizarDB;
    }
    public JButton getBtnAceptar() {
        return btnActualizar;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JTextField getTxtLectorCodigo() {
        return txtLectorCodigo;
    }

    public JTextField getTxtLectorUbicacion() {
        return txtLectorUbicacion;
    }

    public JTextField getTxtPersonaApellido() {
        return txtPersonaApellido;
    }

    public JTextField getTxtPersonaCedula() {
        return txtPersonaCedula;
    }

    public JTextField getTxtPersonaNombre() {
        return txtPersonaNombre;
    }

    public JComboBox<String> getTxtRolFacultad() {
        return txtRolFacultad;
    }

    public JComboBox<String> getTxtTarjetaEstado() {
        return txtTarjetaEstado;
    }

    public JTextField getTxtRolID() {
        return txtRolID;
    }

    public JComboBox<String> getTxtRolPrograma() {
        return txtRolPrograma;
    }

    public JComboBox<String> getTxtRolRol() {
        return txtRolRol;
    }

    public JTextField getTxtTarjetaCodigo() {
        return txtTarjetaCodigo;
    }

    public JComboBox<String> getTxtTarjetaDispositivo() {
        return txtTarjetaDispositivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelActualizarDB = new javax.swing.JTabbedPane();
        pnlLector = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txtLectorCodigo = new javax.swing.JTextField();
        txtLectorUbicacion = new javax.swing.JTextField();
        pnlPersona = new javax.swing.JPanel();
        lbl4 = new javax.swing.JLabel();
        txtPersonaCedula = new javax.swing.JTextField();
        lbl10 = new javax.swing.JLabel();
        txtPersonaNombre = new javax.swing.JTextField();
        lbl18 = new javax.swing.JLabel();
        txtPersonaApellido = new javax.swing.JTextField();
        pnlPersona2 = new javax.swing.JPanel();
        lbl21 = new javax.swing.JLabel();
        txtRolID = new javax.swing.JTextField();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        txtRolPrograma = new javax.swing.JComboBox<>();
        txtRolFacultad = new javax.swing.JComboBox<>();
        txtRolRol = new javax.swing.JComboBox<>();
        pnlPersona3 = new javax.swing.JPanel();
        lbl24 = new javax.swing.JLabel();
        txtTarjetaCodigo = new javax.swing.JTextField();
        lbl25 = new javax.swing.JLabel();
        txtTarjetaDispositivo = new javax.swing.JComboBox<>();
        lbl26 = new javax.swing.JLabel();
        txtTarjetaEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelActualizarDB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelActualizarDB.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PanelActualizarDBAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        pnlLector.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setText("Código:");
        pnlLector.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 70, -1));

        lbl2.setText("Ubicación:");
        pnlLector.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));
        pnlLector.add(txtLectorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 480, -1));
        pnlLector.add(txtLectorUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 480, -1));

        PanelActualizarDB.addTab("Lector", pnlLector);

        pnlPersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl4.setText("Cédula");
        pnlPersona.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 50, -1));
        pnlPersona.add(txtPersonaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 460, -1));

        lbl10.setText("Nombre:");
        pnlPersona.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 50, 30));
        pnlPersona.add(txtPersonaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 460, -1));

        lbl18.setText("Apellido:");
        pnlPersona.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 20));
        pnlPersona.add(txtPersonaApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 460, -1));

        PanelActualizarDB.addTab("persona", pnlPersona);

        pnlPersona2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl21.setText("ID Rol:");
        pnlPersona2.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 90, -1));
        pnlPersona2.add(txtRolID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 460, -1));

        lbl22.setText("Seleccione Rol:");
        pnlPersona2.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        lbl23.setText("Programa:");
        pnlPersona2.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));

        lbl27.setText("Facultad:");
        pnlPersona2.add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));

        txtRolPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura en Educacion Fisica y Deporte", "Licenciatura en Educacion Infantil", "Ingenieria Agroindustrial", "Ingenieria de Sistemas", "Ingenieria agronomica", "Ingenieria Electronica", "Contaduria Publica", "Enfermeria", "Economia", "Mercadeo" }));
        pnlPersona2.add(txtRolPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 460, -1));

        txtRolFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciencias Agropecuarias y Recursos Naturales", "Ciencias Humanas y de la Educacion", "Ciencias Basicas e Ingenierias", "Ciencias Economicas", "Ciencias de la Salud" }));
        pnlPersona2.add(txtRolFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 460, -1));

        txtRolRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente", "Administrativo", "Invitado" }));
        pnlPersona2.add(txtRolRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 460, -1));

        PanelActualizarDB.addTab("Rol", pnlPersona2);

        pnlPersona3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl24.setText("Código:");
        pnlPersona3.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 90, -1));
        pnlPersona3.add(txtTarjetaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 460, -1));

        lbl25.setText("Estado:");
        pnlPersona3.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 30));

        txtTarjetaDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Llavero" }));
        pnlPersona3.add(txtTarjetaDispositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 460, -1));

        lbl26.setText("Tipo Dispositivo:");
        pnlPersona3.add(lbl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 90, 30));

        txtTarjetaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        pnlPersona3.add(txtTarjetaEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 460, -1));

        PanelActualizarDB.addTab("Tarjeta", pnlPersona3);

        jPanel1.add(PanelActualizarDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Actualizar datos RFID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 440, 40));

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 60));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnActualizar.setText("Aceptar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelActualizarDBAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PanelActualizarDBAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelActualizarDBAncestorAdded

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
            java.util.logging.Logger.getLogger(pActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanelActualizarDB;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl4;
    private javax.swing.JPanel pnlLector;
    private javax.swing.JPanel pnlPersona;
    private javax.swing.JPanel pnlPersona2;
    private javax.swing.JPanel pnlPersona3;
    private javax.swing.JTextField txtLectorCodigo;
    private javax.swing.JTextField txtLectorUbicacion;
    private javax.swing.JTextField txtPersonaApellido;
    private javax.swing.JTextField txtPersonaCedula;
    private javax.swing.JTextField txtPersonaNombre;
    private javax.swing.JComboBox<String> txtRolFacultad;
    private javax.swing.JTextField txtRolID;
    private javax.swing.JComboBox<String> txtRolPrograma;
    private javax.swing.JComboBox<String> txtRolRol;
    private javax.swing.JTextField txtTarjetaCodigo;
    private javax.swing.JComboBox<String> txtTarjetaDispositivo;
    private javax.swing.JComboBox<String> txtTarjetaEstado;
    // End of variables declaration//GEN-END:variables
}
