package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.json.JSONArray;

import org.json.JSONObject;

public class Main {

    int filas;
    int columnas;
    String[][] contenido;

    public void send(String url2, String nParametro, String txt) {
        String temp = "";
        try {
            URL url = new URL(url2);
            Map<String, Object> params = new LinkedHashMap<>();

            //params.put("uid", "75 3a 52 d3");
            StringBuilder postData = new StringBuilder();
            if (url2.contains("exportar")) {
                String[] nParam = nParametro.split(";");
                String[] txtM = txt.split(";");
                for (int i = 0; i < nParam.length; i++) {
                    params.put(nParam[i], txtM[i]);
                }
            } else {
                params.put(nParametro, txt);
            }
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()),
                        "UTF-8"));
            }
            byte[] postDataBytes = postData.toString().getBytes("UTF-8");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length",
                    String.valueOf(postDataBytes.length));
            conn.setDoOutput(true);
            conn.getOutputStream().write(postDataBytes);

            Reader in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "UTF-8"));
            for (int c = in.read(); c != -1; c = in.read()) {
                //System.out.print((char) c);
                temp += (char) c;
            }
        } catch (Exception e) {
        }

        leerPeticion(temp);
    }

    public void sendCRUD(String url2, String nParametro, String txt) {
        String temp = "";
        try {
            URL url = new URL(url2);
            Map<String, Object> params = new LinkedHashMap<>();

            //params.put("uid", "75 3a 52 d3");
            StringBuilder postData = new StringBuilder();
            if (url2.contains("up_") || url2.contains("delete") || url2.contains("inpersona") || url2.contains("inlector")) {

                String[] nParam = nParametro.split(";");
                String[] txtM = txt.split(";");
                for (int i = 0; i < nParam.length; i++) {
                    //System.out.println(nParam[i]+" = "+ txtM[i]);
                    params.put(nParam[i], txtM[i]);
                }
            } else {
                params.put(nParametro, txt);
            }
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()),
                        "UTF-8"));
            }
            byte[] postDataBytes = postData.toString().getBytes("UTF-8");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length",
                    String.valueOf(postDataBytes.length));
            conn.setDoOutput(true);
            conn.getOutputStream().write(postDataBytes);
            Reader in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "UTF-8"));
            for (int c = in.read(); c != -1; c = in.read()) {
                //System.out.print((char) c);
                temp += (char) c;
            }
            if (temp.equals("exitoup")) {
                JOptionPane.showMessageDialog(null, "Se actualizó exitosamente");
            }
            if (temp.contains("exitode")) {
                JOptionPane.showMessageDialog(null, "Se eliminó exitosamente");
            }
            if (temp.equals("exitoinpersona")) {
                JOptionPane.showMessageDialog(null, "Se Registró exitosamente");
            }
            if (temp.equals("exitoinlector")) {
                JOptionPane.showMessageDialog(null, "Se Registró exitosamente");
            }
        } catch (Exception e) {
        }

    }

    public void leerPeticion(String cadenaJson) {
        try {
            // System.out.println(cadenaJson);
            if (cadenaJson.contains("vacio")) {
                // System.out.println("si entra");
                filas = 0;
                columnas = 0;
                contenido = new String[filas][columnas];
            } else {
                JSONArray objetoJson = new JSONArray(cadenaJson);
                filas = objetoJson.length();
                columnas = objetoJson.getJSONObject(0).length() / 2;
                contenido = new String[filas][columnas];

                for (int i = 0; i < objetoJson.length(); i++) {
                    for (int j = 0; j < columnas; j++) {
                        contenido[i][j] = objetoJson.getJSONObject(i).getString("" + j) + "";
                        //System.out.print(contenido[i][j] + "\t");
                    }
                }
            }

            /*JSONObject obj = objetoJson.getJSONObject(0);
            JSONArray aux = obj.names();
            for (int i = 0; i < obj.length(); i++) {
                if (!aux.getString(i).matches("[0-9].*")) {
                System.out.println(aux.getString(i));
                }
            }*/
        } catch (Exception e) {
            System.out.println("ERROR AL RECORRER JSON");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Main c = new Main();
        //String url = "http://candysoft.000webhostapp.com/actualizar.php";
        String url = "http://candysoft.000webhostapp.com/exportar.php";
        //c.send(url, "tabla", "Rol");
        c.send(url, "fecha;hora_ini;hora_fin;con_ubicacion", "2019-08-04;10:00;12:00;Salon de Redes");
    }

}
