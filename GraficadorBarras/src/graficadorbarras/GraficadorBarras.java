/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadorbarras;

import clases.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Junior
 */
public class GraficadorBarras {
    public static ArchivoDatos datos = new ArchivoDatos();
    public static ArrayList<Token> erroresLexicos = new ArrayList();
    public static ArrayList<Token> erroresSintacticos = new ArrayList();
    public static ArrayList<String> erroresSemanticos = new ArrayList();
    public static HashMap<String, Object> variables = new HashMap();
    public static String textoConsola = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vista vista = new Vista();
        vista.show();
    }
    
}
