
package vista;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class pAsistencia extends javax.swing.JFrame {

    /**
     * Creates new form pAsistencia
     */
    public pAsistencia() {
        initComponents();
    }

    public JButton getBtnDescargar() {
        return btnDescargar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JTable getTblAsistencia() {
        return tblAsistencia;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public JTextField getTxtHoraFin() {
        return txtHoraFin;
    }

    public JTextField getTxtHoraIni() {
        return txtHoraIni;
    }

    public JComboBox<String> getTxtUbicacion() {
        return txtUbicacion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsistencia = new javax.swing.JTable();
        txtHoraFin = new javax.swing.JTextField();
        txtHoraIni = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDescargar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Ubicacion", "Fecha"
            }
        ));
        tblAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblAsistencia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAsistencia.getTableHeader().setResizingAllowed(false);
        tblAsistencia.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAsistencia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 690, 200));

        txtHoraFin.setText("12:00");
        jPanel1.add(txtHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 110, 30));

        txtHoraIni.setText("10:00");
        jPanel1.add(txtHoraIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 110, 30));

        txtFecha.setText("2019-08-16");
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 30));

        txtUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KFC", "DOLLAR CITY", "KOAJ", "OLIMPICA", "ROYAL FILMS", "PUMA", "LEONISA" }));
        jPanel1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 140, 30));

        jLabel1.setText("Ubicación: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 140, 20));

        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jLabel3.setText("Hora Inicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 20));

        jLabel4.setText("Hora Final:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, 20));

        btnDescargar.setText("Descargar Asistencia");
        btnDescargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDescargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 160, 40));

        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 90, 40));

        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(pAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAsistencia;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraIni;
    private javax.swing.JComboBox<String> txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
