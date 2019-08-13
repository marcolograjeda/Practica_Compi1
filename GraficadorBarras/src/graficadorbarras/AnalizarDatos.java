/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadorbarras;

import java.io.File;
import java.io.StringReader;
import analizadores_datos.*;
import clases.ArchivoDatos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
/**
 *
 * @author Junior
 */
public class AnalizarDatos {
    public ArchivoDatos analisis(String ruta){
        try{
            ruta = ruta.replace("\\","\\\\");
            ruta = ruta.replace("\"", "");
            System.out.println(ruta);
            //FileInputStream abrir = new FileInputStream(ruta);
            File abrir = new File(ruta);
            FileReader leer = new FileReader(abrir);
            BufferedReader buf = new BufferedReader(leer);
            String texto = "";
            String linea = "";
            while ((linea = buf.readLine()) != null) {
                texto += linea+"\n";
            }
            GraficadorBarras.datos = new ArchivoDatos();
            //StringReader read = new StringReader(txtContenedor.getText());
            Reader lectura = new StringReader(texto);
            Lexico_Datos lexico = new Lexico_Datos(lectura);
            parser sintactico = new parser(lexico);
            sintactico.parse();
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        return GraficadorBarras.datos;
    }
}
