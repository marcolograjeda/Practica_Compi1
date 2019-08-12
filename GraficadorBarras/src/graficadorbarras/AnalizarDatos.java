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
import java.io.Reader;
/**
 *
 * @author Junior
 */
public class AnalizarDatos {
    public ArchivoDatos analisis(String texto){
        try{
            GraficadorBarras.datos = new ArchivoDatos();
            //StringReader read = new StringReader(txtContenedor.getText());
            Reader lectura = new StringReader(texto);
            Lexico_Datos lexico = new Lexico_Datos(lectura);
            parser sintactico = new parser(lexico);
            sintactico.parse();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return GraficadorBarras.datos;
    }
}
