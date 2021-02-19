package modelo;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;
import vista.*;

public class logica {

    Main con;
    String url = "http://candysoft.000webhostapp.com/";

    public logica() {
        con = new Main();
    }

    public void llenarTabla(pPrincipal p2) {
        String nomb_tabla = p2.getMenuTabla().getSelectedValue();
        DefaultTableModel tn = new DefaultTableModel();
        con.send(url + "actualizar.php", "tabla", nomb_tabla);
        if (nomb_tabla.equals("Lector")) {
            tn.addColumn("Codigo");
            tn.addColumn("Ubicacion");
        } else if (nomb_tabla.equals("persona")) {
            tn.addColumn("Cédula");
            tn.addColumn("Nombre");
            tn.addColumn("Apellido");

        } else if (nomb_tabla.equals("Rfid")) {
            tn.addColumn("ID");
            tn.addColumn("Fecha");
            tn.addColumn("Cédula");
            tn.addColumn("Código Lector");

        } else if (nomb_tabla.equals("Rol")) {
            tn.addColumn("ID");
            tn.addColumn("Nombre");
            tn.addColumn("Facultad");
            tn.addColumn("Programa");
            tn.addColumn("Cédula");
        } else if (nomb_tabla.equals("Tarjeta")) {
            tn.addColumn("Código");
            tn.addColumn("Tipo");
            tn.addColumn("Estado");
            tn.addColumn("Cédula");
        }
        int numColumn = con.columnas;
        int numFilas = con.filas;
        String[][] contenido = con.contenido;
        boolean verif = true;
        int j = 0;
        int i = 0;
        String nuevaFila[] = new String[numColumn];
        tn.addRow(new Object[]{nuevaFila});
        try {
            while (verif) {
//(String[]) con.consulta("select * from " + nomb_tabla + " where upper(cast(" + ColumnaElegida + " as text)) like upper('%" + filtro + "%');").get(i);
                tn.setValueAt(contenido[i][j], i, j);
                j++;
                if (j == numColumn) {
                    tn.addRow(new Object[]{nuevaFila});
                    if (i == numFilas) {
                        verif = false;
                    }
                    i++;
                    j = 0;
                }
            }
        } catch (Exception e) {
        }
        if (numFilas > 1) {
            tn.removeRow(numFilas);
        }
        p2.getTblRedes().setModel(tn);
    }

    public void activarPanelCard(pPrincipal p2, pActualizar p3) {
        String nomb_tabla = p2.getMenuTabla().getSelectedValue();
        for (int i = 0; i < p3.getPanelActualizarDB().getTabCount(); i++) {
            if (p3.getPanelActualizarDB().getTitleAt(i).equalsIgnoreCase(nomb_tabla)) {
                p3.getPanelActualizarDB().setEnabledAt(i, true);
                p3.getPanelActualizarDB().setSelectedIndex(i);
            } else {
                p3.getPanelActualizarDB().setEnabledAt(i, false);
            }
        }
    }

    public void actualizar(pPrincipal p2, pActualizar p3) {
        activarPanelCard(p2, p3);
        int select = p2.getTblRedes().getSelectedRow();
        String nomb_tabla = p2.getMenuTabla().getSelectedValue();
        if (select >= 0) {
            DefaultTableModel Tabla = (DefaultTableModel) p2.getTblRedes().getModel();
            if (nomb_tabla.equals("Lector")) {
                p3.getTxtLectorCodigo().setText(Tabla.getValueAt(select, 0).toString());
                p3.getTxtLectorUbicacion().setText(Tabla.getValueAt(select, 1).toString());
                p3.getTxtLectorCodigo().setEditable(false);
            } else if (nomb_tabla.equals("persona")) {
                p3.getTxtPersonaCedula().setText(Tabla.getValueAt(select, 0).toString());
                p3.getTxtPersonaNombre().setText(Tabla.getValueAt(select, 1).toString());
                p3.getTxtPersonaApellido().setText(Tabla.getValueAt(select, 2).toString());
                p3.getTxtPersonaCedula().setEditable(false);
            } else if (nomb_tabla.equals("Rol")) {
                p3.getTxtRolID().setText(Tabla.getValueAt(select, 0).toString());
                p3.getTxtRolRol().setSelectedItem(Tabla.getValueAt(select, 1).toString());
                p3.getTxtRolFacultad().setSelectedItem(Tabla.getValueAt(select, 2).toString());
                p3.getTxtRolPrograma().setSelectedItem(Tabla.getValueAt(select, 3).toString());
                p3.getTxtRolID().setEditable(false);
            } else if (nomb_tabla.equals("Tarjeta")) {
                p3.getTxtTarjetaCodigo().setText(Tabla.getValueAt(select, 0).toString());
                p3.getTxtTarjetaDispositivo().setSelectedItem(Tabla.getValueAt(select, 1).toString());
                p3.getTxtTarjetaCodigo().setEditable(false);
            }
            if (nomb_tabla.equals("Rfid")) {
                JOptionPane.showMessageDialog(p3, "El RFID no puede ser modificado");
            } else {
                p2.setVisible(false);
                p3.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(p3, "No ha seleccionado ningun dato a Actualizar");
        }

    }

    public void cambioinsertar(pPrincipal p2, pInsertar p4) {
        String nomb_tabla = p2.getMenuTabla().getSelectedValue();
        if (nomb_tabla.equals("Lector")) {

            p4.getPanelActualizarDB().setEnabledAt(0, true);
            p4.getPanelActualizarDB().setEnabledAt(1, false);

        } else {
            p4.getPanelActualizarDB().setEnabledAt(1, true);
            p4.getPanelActualizarDB().setEnabledAt(0, false);
            p4.getPanelActualizarDB().setSelectedIndex(1);

        }
        p4.setVisible(true);
        p2.setVisible(false);
    }

    public void insertarDato(pInsertar p4) {

        if (p4.getPanelActualizarDB().getTitleAt(p4.getPanelActualizarDB().getSelectedIndex()).equals("Lector")) {
            String codlec = p4.getTxtLectorCodigo().getText();
            String ubicacion = p4.getTxtLectorUbicacion().getText();

            String params = "cod_lec;ubicacion";
            String txt = codlec + ";" + ubicacion;
            con.sendCRUD(url + "php/inlector.php", params, txt);
        } else {
            String cedula = p4.getTxtCedula().getText();
            String nombre = p4.getTxtNombre().getText();
            String apellido = p4.getTxtApellido().getText();
            String codtar = p4.getTxtCodtar().getText();
            String tipo = p4.getTxtDispositivo().getSelectedItem().toString();
            String rol = p4.getTxtRol().getSelectedItem().toString();
            String facultad = p4.getTxtFacultad().getSelectedItem().toString();
            String programa = p4.getTxtPrograma().getSelectedItem().toString();

            String params = "cedula;nombreper;apellido;codtar;tipo;nombrol;facultad;programa";
            String txt = cedula + ";" + nombre + ";" + apellido + ";" + codtar + ";" + tipo + ";" + rol + ";" + facultad + ";" + programa;
            con.sendCRUD(url + "php/inpersona.php", params, txt);

        }

    }

    public void eliminarDato(pPrincipal p2) {
        if (p2.getTblRedes().getSelectedRowCount() > 0) {
            int decision = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar el registro?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (decision == 0) {
                String nomb_Tabla = p2.getMenuTabla().getSelectedValue();
                int select = p2.getTblRedes().getSelectedRow();
                DefaultTableModel Tabla = (DefaultTableModel) p2.getTblRedes().getModel();
                String codigo1 = "";
                if (nomb_Tabla.equals("Lector") || nomb_Tabla.equals("persona") || nomb_Tabla.equals("Tarjeta") || nomb_Tabla.equals("Rol")) {
                    codigo1 = Tabla.getValueAt(select, 0).toString();
                    String params = "codigo;tabla";
                    String txt = codigo1 + ";" + nomb_Tabla;
                    con.sendCRUD(url + "php/delete.php", params, txt);
                    llenarTabla(p2);
                }

            }
        } else {
            JOptionPane.showMessageDialog(p2, "Debe seleccionar una fila para eliminar");
        }
    }

    public void buscarAsistencia(pAsistencia p5) {
        String fecha = p5.getTxtFecha().getText();
        String HoraIni = p5.getTxtHoraIni().getText();
        String HoraFin = p5.getTxtHoraFin().getText();
        String Ubicacion = p5.getTxtUbicacion().getSelectedItem().toString();
        String params = "fecha;hora_ini;hora_fin;con_ubicacion";
        String txt = fecha + ";" + HoraIni + ";" + HoraFin + ";" + Ubicacion;
        con.send(url + "exportar.php", params, txt);
        DefaultTableModel tn = (DefaultTableModel) p5.getTblAsistencia().getModel();

        int numColumn = con.columnas;
        int numFilas = con.filas;
        for (int i = 0; i < tn.getRowCount(); i++) {
            tn.removeRow(i);
        }
        //tn.addRow(new Object[p5.getTblAsistencia().getColumnCount()]);
        String[][] contenido = con.contenido;
        boolean verif = true;
        int j = 0;
        int i = 0;
        String nuevaFila[] = new String[numColumn];
        tn.addRow(new Object[]{nuevaFila});
        try {
            while (verif) {
                tn.setValueAt(contenido[i][j], i, j);
                j++;
                if (j == numColumn) {
                    tn.addRow(new Object[]{nuevaFila});
                    if (i == numFilas) {
                        verif = false;
                    }
                    i++;
                    j = 0;
                }
            }
        } catch (Exception e) {
        }
        
            
                
            
            for (int k = 0; k < tn.getRowCount(); k++) {
                for (int l = 0; l < tn.getColumnCount(); l++) {
                    if (!tn.getValueAt(k, l).equals("")) {
                        if (tn.getValueAt(k, l).toString().contains("java")) {
                            tn.removeRow(k);
                           break;
                        }
                    }
                }
            }

        
        try {
            tn.removeRow(numFilas);
        } catch (Exception e) {
        }
        p5.getTblAsistencia().setModel(tn);
    }

    public void exportarAsistencia(pAsistencia p5) {
        exportar ex = new exportar();
        try {
            ex.exportarExcel(p5.getTblAsistencia());
        } catch (Exception e) {
        }
    }
}
