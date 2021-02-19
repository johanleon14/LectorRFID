package controlador;

import java.awt.event.*;
import javax.swing.event.*;
import modelo.*;
import vista.*;

public class controlClases implements ActionListener, KeyListener, ListSelectionListener {

    logica l1;
    CU l2;
    pLogin p1;
    pPrincipal p2;
    pActualizar p3;
    pInsertar p4;
    pAsistencia p5;

    public controlClases(logica l1, CU l2, pLogin p1, pPrincipal p2, pActualizar p3, pInsertar p4, pAsistencia p5) {
        this.l1 = l1;
        this.l2 = l2;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p1.getBtnIngresar().addActionListener(this);
        this.p2.getBtnInsertar().addActionListener(this);
        this.p2.getBtnActualizar().addActionListener(this);
        this.p2.getBtnEliminar().addActionListener(this);
        this.p2.getMenuTabla().addListSelectionListener(this);
        this.p2.getBtnCerrarSesion().addActionListener(this);
        this.p2.getBtnAsistencia().addActionListener(this);
        this.p3.getBtnAceptar().addActionListener(this);
        this.p3.getBtnVolver().addActionListener(this);
        this.p4.getBtnAceptar().addActionListener(this);
        this.p4.getBtnVolver().addActionListener(this);
        this.p5.getBtnVolver().addActionListener(this);
        this.p5.getBtnBuscar().addActionListener(this);
        this.p5.getBtnDescargar().addActionListener(this);
        
    }

    public void inicializar() {
        p1.setTitle("Login sin Usuario");
        p1.setLocationRelativeTo(null);
        p1.setSize(293, 377);
        p2.setTitle("Información que Cura");
        p2.setLocationRelativeTo(null);
        p2.setSize(970, 580);
        p3.setTitle("Actualizar");
        p3.setLocationRelativeTo(null);
        p3.setSize(698, 380);
        p4.setTitle("Insertar");
        p4.setLocationRelativeTo(null);
        p4.setSize(698, 380);
        p5.setTitle("Asistencia");
        p5.setLocationRelativeTo(null);
        p5.setSize(736, 420);
        p2.getMenuTabla().setSelectedIndex(0);
        l1.llenarTabla(p2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == p1.getBtnIngresar()) {
            p1.setVisible(false);
            p2.setVisible(true);
        }
        if (ae.getSource() == p2.getBtnCerrarSesion()) {
            p2.setVisible(false);
            p1.setVisible(true);
        }
        if (ae.getSource() == p2.getBtnInsertar()) {
            l1.cambioinsertar(p2, p4);
            
        }
        if (ae.getSource() == p2.getBtnActualizar()) {
            l1.actualizar(p2, p3);
        }
        if (ae.getSource() == p2.getBtnEliminar()) {
            l1.eliminarDato(p2);
        }
        if (ae.getSource() == p3.getBtnVolver()) {
            
            p3.setVisible(false);
            p2.setVisible(true);
        }
        if (ae.getSource() == p3.getBtnAceptar()) {
            l2.update(p2, p3);
            l1.llenarTabla(p2);
            
        }
        if (ae.getSource() == p2.getBtnAsistencia()) {
            p2.setVisible(false);
            p5.setVisible(true);
        }
        if (ae.getSource() == p5.getBtnVolver()) {
            p5.setVisible(false);
            p2.setVisible(true);
        }
        if (ae.getSource() == p5.getBtnBuscar()) {
            l1.buscarAsistencia(p5);
        }
        if (ae.getSource() == p5.getBtnDescargar()) {
            l1.exportarAsistencia(p5);
        }
         if (ae.getSource() == p4.getBtnVolver()) {
            p4.setVisible(false);
            p2.setVisible(true);
        }
         if (ae.getSource() == p4.getBtnAceptar()) {
            l1.insertarDato(p4);
            l1.llenarTabla(p2);
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        if (lse.getSource() == p2.getMenuTabla()) {
            l1.llenarTabla(p2);
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
