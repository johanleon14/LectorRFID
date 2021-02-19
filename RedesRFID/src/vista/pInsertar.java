package vista;

import javax.swing.*;

public class pInsertar extends javax.swing.JFrame {

    /**
     * Creates new form actualizarNBA
     */
    public pInsertar() {
        initComponents();
    }

    public JTabbedPane getPanelActualizarDB() {
        return PanelActualizarDB;
    }

    public JTextField getTxtLectorCodigo() {
        return txtLectorCodigo;
    }

    public JTextField getTxtLectorUbicacion() {
        return txtLectorUbicacion;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public JTextField getTxtCodtar() {
        return txtCodtar;
    }

    public JComboBox<String> getTxtDispositivo() {
        return txtDispositivo;
    }

    public JComboBox<String> getTxtFacultad() {
        return txtFacultad;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtPaisCod() {
        return txtLectorCodigo;
    }

    public JComboBox<String> getTxtPrograma() {
        return txtPrograma;
    }

    public JComboBox<String> getTxtRol() {
        return txtRol;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public JButton getBtnVolver() {
        return btnVolver;
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
        pnlJugadores = new javax.swing.JPanel();
        lbl6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lbl8 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        txtCodtar = new javax.swing.JTextField();
        lbl13 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrograma = new javax.swing.JComboBox<>();
        txtApellido = new javax.swing.JTextField();
        txtFacultad = new javax.swing.JComboBox<>();
        txtDispositivo = new javax.swing.JComboBox<>();
        txtRol = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelActualizarDB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlLector.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setText("Codigo");
        pnlLector.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, 70, 20));

        lbl2.setText("Ubicacion");
        pnlLector.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));
        pnlLector.add(txtLectorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 480, -1));
        pnlLector.add(txtLectorUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 480, -1));

        PanelActualizarDB.addTab("Lector", pnlLector);

        pnlJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlJugadores.setLayout(null);

        lbl6.setText("Cedula");
        pnlJugadores.add(lbl6);
        lbl6.setBounds(10, 21, 100, 20);
        pnlJugadores.add(txtCedula);
        txtCedula.setBounds(80, 20, 230, 20);

        lbl8.setText("Apellido:");
        pnlJugadores.add(lbl8);
        lbl8.setBounds(10, 50, 100, 20);

        lbl11.setText("Programa: ");
        pnlJugadores.add(lbl11);
        lbl11.setBounds(10, 110, 100, 20);

        lbl9.setText("Dispositivo: ");
        pnlJugadores.add(lbl9);
        lbl9.setBounds(10, 80, 100, 20);

        lbl14.setText("Facultad: ");
        pnlJugadores.add(lbl14);
        lbl14.setBounds(340, 110, 100, 20);

        lbl12.setText("Rol:");
        pnlJugadores.add(lbl12);
        lbl12.setBounds(340, 80, 100, 20);
        pnlJugadores.add(txtCodtar);
        txtCodtar.setBounds(420, 50, 200, 20);

        lbl13.setText("Cod Tarjeta: ");
        pnlJugadores.add(lbl13);
        lbl13.setBounds(340, 50, 100, 20);

        lbl7.setText("Nombre:");
        pnlJugadores.add(lbl7);
        lbl7.setBounds(340, 20, 100, 20);
        pnlJugadores.add(txtNombre);
        txtNombre.setBounds(420, 20, 200, 20);

        txtPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura en Educacion Fisica y Deporte", "Licenciatura en Educacion Infantil", "Ingenieria Agroindustrial", "Ingenieria de Sistemas", "Ingenieria agronomica", "Ingenieria Electronica", "Contaduria Publica", "Enfermeria", "Economia", "Mercadeo" }));
        pnlJugadores.add(txtPrograma);
        txtPrograma.setBounds(80, 110, 230, 20);
        pnlJugadores.add(txtApellido);
        txtApellido.setBounds(80, 50, 230, 20);

        txtFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciencias Agropecuarias y Recursos Naturales", "Ciencias Humanas y de la Educacion", "Ciencias Basicas e Ingenierias", "Ciencias Economicas", "Ciencias de la Salud" }));
        pnlJugadores.add(txtFacultad);
        txtFacultad.setBounds(420, 110, 200, 20);

        txtDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Llavero" }));
        pnlJugadores.add(txtDispositivo);
        txtDispositivo.setBounds(80, 80, 230, 20);

        txtRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente", "Administrativo", "Invitado" }));
        pnlJugadores.add(txtRol);
        txtRol.setBounds(420, 80, 200, 20);

        PanelActualizarDB.addTab("persona", pnlJugadores);

        jPanel1.add(PanelActualizarDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Insertar datos RFID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 440, 40));

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 60));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 150, 40));

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
            java.util.logging.Logger.getLogger(pInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new pInsertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanelActualizarDB;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JPanel pnlJugadores;
    private javax.swing.JPanel pnlLector;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodtar;
    private javax.swing.JComboBox<String> txtDispositivo;
    private javax.swing.JComboBox<String> txtFacultad;
    private javax.swing.JTextField txtLectorCodigo;
    private javax.swing.JTextField txtLectorUbicacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtPrograma;
    private javax.swing.JComboBox<String> txtRol;
    // End of variables declaration//GEN-END:variables
}
