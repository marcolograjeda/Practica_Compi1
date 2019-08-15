/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.io.File;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author Junior
 */
public class GraficaBarra {
    public void graficar(String nombre, String titulo, String claveX, String claveY, ArchivoDatos archivo){
        try{
            DefaultCategoryDataset dataset; 
            JFreeChart graficaBarras;
            int width = 1000;    
            int height = 650;
            try {
                int contadorX = 0;
                int contadorY = 0;
                int cont = 0;
                boolean enX = false;
                boolean enY = false;
                dataset = new DefaultCategoryDataset();
                //puntosXY = grafica.getPuntosXY();
                for(Clave clave : archivo.claves){
                    if(clave.clave.equals(claveX)){
                        enX = true;
                        contadorX = cont;
                        if(enY){
                            break;
                        }
                    }
                    if(clave.clave.equals(claveY)){
                        enY = true;
                        contadorY = cont;
                        if(enX){
                            break;
                        }
                    }
                    cont++;
                }
                for(Registro registro: archivo.registros){
                    try{
                        Double valor = 0.0;
                        if(registro.datos.get(contadorY).tipo == 0){
                            valor += registro.datos.get(contadorY).num;
                        }else if(registro.datos.get(contadorY).tipo == 1){
                            valor = registro.datos.get(contadorY).decimal;
                        }
                        String val = registro.datos.get(contadorX).cadena;
                        dataset.addValue(valor, val, val);
                    }catch (Exception e){
                        System.out.println("Error al dibujar la grafica");
                    }
                }
                graficaBarras = ChartFactory.createBarChart(titulo, claveX, claveY, dataset, PlotOrientation.VERTICAL, true, true, false);
                nombre = nombre.replace("\"", "");
                File gBarras = new File(nombre+".PNG");
                ChartUtilities.saveChartAsPNG(gBarras, graficaBarras, width, height);
            } catch (Exception e) {
                System.err.println("Error al dibujar la grafica 1");
            }
        }catch (Exception e){
            
        }
    }
}
