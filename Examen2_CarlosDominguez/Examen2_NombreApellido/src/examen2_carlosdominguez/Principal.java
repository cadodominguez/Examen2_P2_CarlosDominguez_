
package examen2_carlosdominguez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author claudiacortes
 */
public class Principal extends javax.swing.JFrame {
    static boolean encendido = false;
    static  ArrayList <Tortuga> tortugas = new ArrayList();
    static ArrayList <String> registro_W = new ArrayList();
    static int ganador = -1;
    static int NumCarrera=0;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jButton2.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpb_tortuga1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jpb_tortuga2 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jpb_tortuga3 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jpb_tortuga4 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        lbl_ganador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_guardarResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane1ComponentShown(evt);
            }
        });

        jLabel1.setText("Tortuga 1");

        jLabel2.setText("Tortuga 2");

        jLabel3.setText("Tortuga 3");

        jLabel4.setText("Tortuga 4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setText("Ganador");

        lbl_ganador.setText("jLabel6");

        jButton1.setText("Cargar archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar carrera");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jpb_tortuga3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jpb_tortuga2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpb_tortuga1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jpb_tortuga4, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(lbl_ganador)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(89, 89, 89)
                .addComponent(jButton2)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpb_tortuga1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpb_tortuga2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpb_tortuga3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpb_tortuga4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_ganador))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Simulador", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Carrera", "Ganador"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_guardarResultados.setText("Salvar Resultados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btn_guardarResultados)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_guardarResultados)
                .addGap(145, 145, 145))
        );

        jTabbedPane1.addTab("Resultados", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //cargar archivo
        ArrayList<String> pedazos_txt = new ArrayList();
        File Info_tortugas = new File("tortugas.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(Info_tortugas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                pedazos_txt.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        for (int i = 0; i < pedazos_txt.size(); i++) {
            String [] inicial = pedazos_txt.get(i).split(",");
            String [] secundario = inicial[3].replace("[","").replace("]","").split("-");
            String [] tercero = secundario[1].replace("{", "").replace("}", "").split(">");
            tortugas.add(new Tortuga(inicial[0],Integer.parseInt(inicial[1]),Integer.parseInt(inicial[2]),Integer.parseInt(secundario[0]),Integer.parseInt(tercero[0]),Integer.parseInt(tercero[1])));
        }
        System.out.println("Se cargo el archivo");
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //carrera
         Thread hilo = new Thread(() ->{
            int progreso=0;
            while (progreso <= 100 && !encendido) {
                    try {
                        Thread.sleep(tortugas.get(0).getMiliS());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    int progresoLocal = progreso;
                    progreso++;
                    SwingUtilities.invokeLater(() -> actualizar1(progresoLocal));
                    ganador(progreso,0);
            }
         });
         hilo.start();
         Thread hilo2 = new Thread(() ->{
            int progreso=0;
            while (progreso <= 100 && !encendido) {
                    try {
                        Thread.sleep(tortugas.get(1).getMiliS());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    int progresoLocal = progreso;
                    progreso++;
                    SwingUtilities.invokeLater(() -> actualizar2(progresoLocal));
                    ganador(progreso,1);
            }
         });
         hilo2.start();
         Thread hilo3 = new Thread(() ->{
            int progreso=0;
            while (progreso <= 100 && !encendido) {
                    try {
                        Thread.sleep(tortugas.get(2).getMiliS());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    int progresoLocal = progreso;
                    progreso++;
                    SwingUtilities.invokeLater(() -> actualizar3(progresoLocal));
                    ganador(progreso,2);
            }
         });
         hilo3.start();
         Thread hilo4= new Thread(() ->{
            int progreso=0;
            while (progreso <= 100 && !encendido) {
                    try {
                        Thread.sleep(tortugas.get(3).getMiliS());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    int progresoLocal = progreso;
                    progreso++;
                    SwingUtilities.invokeLater(() -> actualizar4(progresoLocal));
                    ganador(progreso,3);
            }
         });
         hilo4.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        //actualiza la tabla cada vez que se mueve algo
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (int i = 0; i < registro_W.size(); i++) {
            String [] pieza = registro_W.get(i).split(",");
            Object[] fila = {pieza[0], pieza[1]};
            model.addRow(fila);
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentShown
        
    }//GEN-LAST:event_jTabbedPane1ComponentShown
    
    /**
     * @param t1
     * @param args the command line arguments
     */
    public void actualizar1(int t1){
        jpb_tortuga1.setValue(t1);
    }
    public void actualizar2(int t1){
        jpb_tortuga2.setValue(t1);
    }
    public void actualizar3(int t1){
        jpb_tortuga3.setValue(t1);
    }
    public void actualizar4(int t1){
        jpb_tortuga4.setValue(t1);
    }
    public void ganador(int progress,int p){
        if (progress >= 100) {
            NumCarrera +=1;
            encendido = true;
            ganador = p;
            labelG(ganador);
            Tortuga ganadora = tortugas.get(p);
            ganadora.setWins(ganadora.getWins()+1);
            tortugas.set(p, ganadora);
            registro_W.add(NumCarrera+","+ganadora.getNombre());
        }
    }
    public void labelG (int pos){
        lbl_ganador.setText(" "+tortugas.get(pos).getNombre());
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardarResultados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JProgressBar jpb_tortuga1;
    private javax.swing.JProgressBar jpb_tortuga2;
    private javax.swing.JProgressBar jpb_tortuga3;
    private javax.swing.JProgressBar jpb_tortuga4;
    private javax.swing.JLabel lbl_ganador;
    // End of variables declaration//GEN-END:variables
}
