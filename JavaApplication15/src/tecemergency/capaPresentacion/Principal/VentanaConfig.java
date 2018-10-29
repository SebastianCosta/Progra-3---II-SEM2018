/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency.capaPresentacion.Principal;

import tecemergency.capaLogica.Logica.GestionEmergencias;
import tecemergency.capaLogica.Logica.GestionPacientes;
import tecemergency.capaLogica.Logica.GestionUrgencias;
import tecemergencyl.capaLogica.utils.ModeladorTablas;

/**
 *
 * @author sebas
 */
public class VentanaConfig extends javax.swing.JDialog {

    /**
     * Creates new form VentanaConfig
     */
    public VentanaConfig(java.awt.Frame parent, boolean modal) {
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

        buttonGroupUrgencias = new javax.swing.ButtonGroup();
        buttonGroupEmergencias = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtextfieldCantidadVentanillasUrgencias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtextfieldCantidadVentanillasEmergencias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonUrgenciasCola = new javax.swing.JRadioButton();
        jRadioButtonUrgenciasHeap = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonEmergenciasCola = new javax.swing.JRadioButton();
        jRadioButtonEmergenciasHeap = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtextfieldTiempoMin = new javax.swing.JTextField();
        jtextfieldTiempoMax = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Configuración");

        jLabel2.setText("Cantidad de Ventanillas para Módulo de pacientes de urgencias:");

        jLabel3.setText("Cantidad de Ventanillas para Módulo de pacientes de emergencias:");

        jLabel4.setText("Manejo de Módulo de Urgencias:");

        buttonGroupUrgencias.add(jRadioButtonUrgenciasCola);
        jRadioButtonUrgenciasCola.setText("Cola de Prioridad");
        jRadioButtonUrgenciasCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUrgenciasColaActionPerformed(evt);
            }
        });

        buttonGroupUrgencias.add(jRadioButtonUrgenciasHeap);
        jRadioButtonUrgenciasHeap.setText("Heap");

        jLabel5.setText("Manejo de Módulo de Emergencias):");

        buttonGroupEmergencias.add(jRadioButtonEmergenciasCola);
        jRadioButtonEmergenciasCola.setText("Cola de Prioridad");

        buttonGroupEmergencias.add(jRadioButtonEmergenciasHeap);
        jRadioButtonEmergenciasHeap.setText("Heap");

        jLabel6.setText("Tiempo mínimo:");

        jLabel7.setText("Atención de la cola:");

        jLabel8.setText("Tiempo máximo:");

        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtextfieldCantidadVentanillasUrgencias, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jtextfieldCantidadVentanillasEmergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jRadioButtonUrgenciasCola)
                                .addGap(35, 35, 35)
                                .addComponent(jRadioButtonUrgenciasHeap))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jRadioButtonEmergenciasCola)
                                .addGap(35, 35, 35)
                                .addComponent(jRadioButtonEmergenciasHeap))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtextfieldTiempoMin, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jtextfieldTiempoMax)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextfieldCantidadVentanillasUrgencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonUrgenciasCola)
                    .addComponent(jRadioButtonUrgenciasHeap))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextfieldCantidadVentanillasEmergencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEmergenciasCola)
                    .addComponent(jRadioButtonEmergenciasHeap))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtextfieldTiempoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtextfieldTiempoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonIniciar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
       ////////////////instancias///////////////////////////////////////////////////////////////
       Principal principal = new Principal(this, rootPaneCheckingEnabled,this);
       GestionPacientes pacientes = new GestionPacientes();
       principal.setListaPacientes(pacientes);
       int cantidadUrg = Integer.parseInt(jtextfieldCantidadVentanillasUrgencias.getText());
       int cantidadEmer = Integer.parseInt(jtextfieldCantidadVentanillasEmergencias.getText());
       ////////////////////////////////////////////////////////////////////////////////////////
       
       ////////////////////Se crean los modulos///////////////////////////////////////
       //crea el heap o cola para Modulo de Urgencias
       if(jRadioButtonUrgenciasCola.isSelected()){
           GestionUrgencias urgencias = new GestionUrgencias("Cola",cantidadUrg);
           principal.setUrgencias(urgencias);
       }if (jRadioButtonUrgenciasHeap.isSelected()){
           GestionUrgencias urgencias2 = new GestionUrgencias("Heap",cantidadUrg);
           principal.setUrgencias(urgencias2);
       }
       
       //crea el heap o cola para Modulo de Emergencias
       if(jRadioButtonEmergenciasCola.isSelected()){
           GestionEmergencias emergencias = new GestionEmergencias("Cola",cantidadEmer);
           principal.setEmergencias(emergencias);
       }if (jRadioButtonEmergenciasHeap.isSelected()){
           GestionEmergencias emergencias2 = new GestionEmergencias("Heap",cantidadEmer);
           principal.setEmergencias(emergencias2);
       }
       /////////////////////////////////////////////////////////////////////////////////////////////////
       
       ////////////////////////actualiza Las Tablas////////////////////////////////////////////////////////////////////
       Object[] columnasListaEspera = new Object[] {"Nombre","Tipo de Padecimiento"};        
       principal.getjTableListaEspera().setModel(ModeladorTablas.generarModeloDeTabla(2, columnasListaEspera));
       principal.getjTableListaEspera().setAutoCreateRowSorter(false);
       principal.actualizarTabla();
       
       Object[] columnasUrgencias = new Object[] {"Nombre","Número","Estado"};        
       principal.getjTablePacientesUrgencias().setModel(ModeladorTablas.generarModeloDeTabla(3, columnasUrgencias));
       principal.getjTablePacientesUrgencias().setAutoCreateRowSorter(false);
       principal.actualizarTablaUrgencias();
       
       Object[] columnasEmergencias= new Object[] {"Nombre","Número","Estado"};        
       principal.getjTablePacientesEmergencias().setModel(ModeladorTablas.generarModeloDeTabla(3, columnasEmergencias));
       principal.getjTablePacientesEmergencias().setAutoCreateRowSorter(false);
       principal.actualizarTablaEmergencias();
       //////////////////////////fin de tabla lista espera/////////////////////////////////////////////////////////////
       
       ///////Abre la ventana Principal//////////////////////////////////////////////////////////////////////////////////
       principal.setVisible(true);
       principal.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jRadioButtonUrgenciasColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUrgenciasColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonUrgenciasColaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaConfig dialog = new VentanaConfig(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEmergencias;
    private javax.swing.ButtonGroup buttonGroupUrgencias;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonEmergenciasCola;
    private javax.swing.JRadioButton jRadioButtonEmergenciasHeap;
    private javax.swing.JRadioButton jRadioButtonUrgenciasCola;
    private javax.swing.JRadioButton jRadioButtonUrgenciasHeap;
    private javax.swing.JTextField jtextfieldCantidadVentanillasEmergencias;
    private javax.swing.JTextField jtextfieldCantidadVentanillasUrgencias;
    private javax.swing.JTextField jtextfieldTiempoMax;
    private javax.swing.JTextField jtextfieldTiempoMin;
    // End of variables declaration//GEN-END:variables
}
