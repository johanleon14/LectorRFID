package modelo;

import vista.*;

public class CU {

    Main con;
    String url = "http://candysoft.000webhostapp.com/";

    public CU() {
        con = new Main();
    }
//ACTUALIZA LAS TABLAS
    public void actualizarDatos(pPrincipal p2, pActualizar p3) {
        String nomb_tabla = p3.getPanelActualizarDB().getTitleAt(p3.getPanelActualizarDB().getSelectedIndex());
        String urlActual = url + "actualizar.php";
        //Aqui falta agregar los parametros a enviar para actualizar
        if (nomb_tabla.equals("Lector")) {
            con.send(url, nomb_tabla, urlActual);
        } else if (nomb_tabla.equals("persona")) {
            con.send(url, nomb_tabla, urlActual);
        } else if (nomb_tabla.equals("Rol")) {
            con.send(url, nomb_tabla, urlActual);
        } else if (nomb_tabla.equals("Tarjeta")) {
            con.send(url, nomb_tabla, urlActual);
        }
    }
  //ACTUALIZA los datos en la base de datos
     public void update(pPrincipal p2, pActualizar p3) {
        String nomb_tabla = p3.getPanelActualizarDB().getTitleAt(p3.getPanelActualizarDB().getSelectedIndex());
        String urlActual = url + "up_";
        //Aqui falta agregar los parametros a enviar para actualizar
        
        if (nomb_tabla.equals("Lector")) {
                 String codigolector = p3.getTxtLectorCodigo().getText();
                 String ubicacion = p3.getTxtLectorUbicacion().getText();
                 String params = "cod_lec;Ubicacion";
                 String txt = codigolector + ";" + ubicacion;
                 con.sendCRUD(urlActual+"lector.php", params, txt);
            
        } else if (nomb_tabla.equals("persona")) {
                 String cedula = p3.getTxtPersonaCedula().getText();
                 String nombre = p3.getTxtPersonaNombre().getText();
                 String apellido = p3.getTxtPersonaApellido().getText();
                 String params = "cedula;nombre;apellido";
                 String txt = cedula + ";" + nombre+ ";" + apellido;
                 con.sendCRUD(urlActual+"persona.php", params, txt);
                 
        } else if (nomb_tabla.equals("Rol")) {
                 String idrol = p3.getTxtRolID().getText();
                 String nombrerol = p3.getTxtRolRol().getSelectedItem().toString();
                 String facultad = p3.getTxtRolFacultad().getSelectedItem().toString();
                 String programa = p3.getTxtRolPrograma().getSelectedItem().toString();
                 String params = "idRol;NombreRol;Facultad;programa";
                 String txt = idrol + ";" + nombrerol+ ";" + facultad+ ";" + programa;
                 con.sendCRUD(urlActual+"rol.php", params, txt);
        } else if (nomb_tabla.equals("Tarjeta")) {
                 String codtarjeta = p3.getTxtTarjetaCodigo().getText();
                 String tipo = p3.getTxtTarjetaDispositivo().getSelectedItem().toString();
                 String estado = p3.getTxtTarjetaEstado().getSelectedItem().toString();
                 String params = "codTarjeta;tipo;estado";
                 String txt = codtarjeta + ";" + tipo+ ";" + estado;
                 con.sendCRUD(urlActual+"tarjeta.php", params, txt);
        }
    }
    

    public void limpiarCarjas(pActualizar p3) {
        p3.getTxtLectorCodigo();
        p3.getTxtLectorUbicacion();
        p3.getTxtPersonaCedula();
        p3.getTxtPersonaNombre();
        p3.getTxtPersonaApellido();
        p3.getTxtRolID();
        p3.getTxtRolRol();
        p3.getTxtRolPrograma();
        p3.getTxtRolFacultad();
        p3.getTxtTarjetaCodigo();
        p3.getTxtTarjetaDispositivo();
    }
}
