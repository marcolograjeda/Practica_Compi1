/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadorbarras;

import analizadores.Lexico_Reportes;
import analizadores.parser;
import clases.ArchivoDatos;
import clases.Token;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Junior
 */
public class Vista extends javax.swing.JFrame {
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        pestañasPane = new javax.swing.JTabbedPane();
        btnCompilar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnGuardarComo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica - 201700327");
        setResizable(false);

        txtConsola.setBackground(new java.awt.Color(0, 0, 0));
        txtConsola.setColumns(20);
        txtConsola.setForeground(new java.awt.Color(255, 255, 255));
        txtConsola.setRows(5);
        jScrollPane1.setViewportView(txtConsola);

        btnCompilar.setText("Compilar");
        btnCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompilarMouseClicked(evt);
            }
        });
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        btnAbrir.setText("Abrir");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(btnAbrir);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(btnGuardar);

        btnGuardarComo.setText("Guardar Como");
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(btnGuardarComo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        jMenuItem1.setText("Léxicos");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Sintácticos");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Semánticos");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pestañasPane)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCompilar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestañasPane, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompilar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        
        try {
            String texto = "";
            String linea = "";
            JFileChooser abrir = new JFileChooser();
            File file = new File("F:\\Universidad\\USAC\\2019\\2 Semestre\\Compi 1\\Practica_Compi1\\GraficadorBarras");
            abrir.setCurrentDirectory(file);
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos", "dat", "rep");
            abrir.setFileFilter(filtro);
            File seleccion;
            if (abrir.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                JPanel panel = new JPanel();//Crea panel
                panel.setBounds(0, 0, 300, 400);
                panel.setLayout(null);
                JTextArea txtArea = new JTextArea();//Crear textArea
                txtArea.setBounds(5, 0, 310, 300);
                JScrollBar barras = new JScrollBar();
                barras.setBounds(0, 0, 375, 340);
                barras.add(txtArea);
                panel.add(txtArea);//Agregar el txtArea al panel
                seleccion = abrir.getSelectedFile();
                System.out.println(seleccion.getPath());
                txtArea.setToolTipText(seleccion.getPath());//Guardar nombre del archivo que se abrió en el tooltip del txtArea
                System.out.println(seleccion.getName());
                int i = seleccion.getName().lastIndexOf(".");
                if(seleccion.getName().substring(i+1).equals("dat")){
                    System.out.println("Tipo 1");
                    panel.setToolTipText("1");
                }else{
                    panel.setToolTipText("0");
                    System.out.println("Tipó 2");
                }
                FileReader lector = new FileReader(seleccion);
                BufferedReader buf = new BufferedReader(lector);
                System.out.println(panel.getToolTipText());
                while ((linea = buf.readLine()) != null) {
                    //linea = btuf.readLine();
                    System.out.println(linea);
                    texto += linea+"\n";
                }
                System.out.println(texto);
                txtArea.setText(texto);
                buf.close();
                pestañasPane.add(seleccion.getName(),panel);
            }
            //System.out.println("You chose to open this file: "
              //      + abrir.getSelectedFile().getName());
        } catch (Exception e) {
            System.out.println("No escogio archivo ");
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // TODO add your handling code here:
        System.out.println("Compilar");        
        int ind = pestañasPane.getSelectedIndex();
        JPanel panelito = (JPanel)pestañasPane.getComponent(ind);
        JTextArea txt = (JTextArea)panelito.getComponent(0);
        System.out.println(txt.getText());
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        int ind = pestañasPane.getSelectedIndex();
        JPanel panelito = (JPanel)pestañasPane.getComponent(ind);
        JTextArea txt = (JTextArea)panelito.getComponent(0);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(txt.getToolTipText(), false));
            writer.write(txt.getText());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Guarde");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccion = new JFileChooser();
        if(seleccion.showSaveDialog(seleccion) == JFileChooser.APPROVE_OPTION){
            File archivo = new File(seleccion.getCurrentDirectory() + "\\" + seleccion.getSelectedFile().getName());
            int ind = pestañasPane.getSelectedIndex();
            JPanel panelito = (JPanel)pestañasPane.getComponent(ind);
            JTextArea txt = (JTextArea)panelito.getComponent(0);
            txt.setToolTipText(seleccion.getCurrentDirectory() + "\\" + seleccion.getSelectedFile().getName());
            
            panelito.setName(seleccion.getName());
            try {
                PrintWriter salida = new PrintWriter(archivo);
                salida.print(txt.getText());
                salida.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompilarMouseClicked
        // TODO add your handling code here:
        graficadorbarras.GraficadorBarras.erroresLexicos = new ArrayList();
        graficadorbarras.GraficadorBarras.erroresSintacticos = new ArrayList();
        graficadorbarras.GraficadorBarras.erroresSemanticos = new ArrayList();
        int ind = pestañasPane.getSelectedIndex();
        JPanel panelito = (JPanel)pestañasPane.getComponent(ind);
        JTextArea txt = (JTextArea)panelito.getComponent(0);
        //AnalizarDatos analizar = new AnalizarDatos();
        //ArchivoDatos revisar = analizar.analisis(txt.getText());
        try{
            StringReader read = new StringReader(txt.getText());
            Lexico_Reportes lexico = new Lexico_Reportes(read);
            parser sintactico = new parser(lexico);
            sintactico.parse();
        }catch(Exception e){
            System.out.println(e);
        }
        for(Token x:graficadorbarras.GraficadorBarras.erroresLexicos){
            System.out.println("Error lexico "+x.token);
        }
        for(Token x:graficadorbarras.GraficadorBarras.erroresSintacticos){
            System.out.println("Error sintactico "+x.token);
        }
        for(String x:graficadorbarras.GraficadorBarras.erroresSemanticos){
            System.out.println(x);
        }
    }//GEN-LAST:event_btnCompilarMouseClicked

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnGuardarComo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane pestañasPane;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables
}
