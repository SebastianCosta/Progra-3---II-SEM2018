/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency.capaPresentacion.Principal;

import javax.swing.JTable;
import tecemergency.capaLogica.Logica.GestionPacientes;
import tecemergency.capaLogica.Logica.Patient;
import tecemergency.capaLogica.estructuras.Lista;
import tecemergency.capaLogica.estructuras.NodoD;
import tecemergencyl.capaLogica.utils.ModeladorTablas;

/**
 *
 * @author sebas
 */
public class Principal extends javax.swing.JDialog {
    VentanaConfig ventConfig;
    GestionPacientes listaPacientes;

    public GestionPacientes getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(GestionPacientes listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
    
    

    /**
     * Creates new form VentPrincipal
     */
    public Principal(java.awt.Dialog parent, boolean modal, VentanaConfig ventConfig) {
        super(parent, modal);
        initComponents();
        this.ventConfig = ventConfig;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        buttonGroupTipoPadecimiento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonInfartoPaciente = new javax.swing.JRadioButton();
        jRadioButtonPérdidasangrePaciente = new javax.swing.JRadioButton();
        jRadioButtonPartoPaciente = new javax.swing.JRadioButton();
        jRadioButtonEstomacalPaciente = new javax.swing.JRadioButton();
        jTextFieldNombrePaciente = new javax.swing.JTextField();
        jTextFieldNacimientoPaciente = new javax.swing.JTextField();
        jTextFieldDetallePadePaciente = new javax.swing.JTextField();
        jButtonRegistrarsePaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaEspera = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonQuebraduraPaciente = new javax.swing.JRadioButton();
        jRadioButtonOtroPaciente = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePacientesUrgencias = new javax.swing.JTable();
        jButtonAtenderUrgencias = new javax.swing.JButton();
        jButtonLiberarAtenderUrgencias = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePacientesEmergencias = new javax.swing.JTable();
        jButtonAtenderEmergencias = new javax.swing.JButton();
        jButtonLiberarAtenderEmergencias = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableEgresos = new javax.swing.JTable();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 75)); // NOI18N
        jLabel1.setText("TEC Emergencias");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Registro de Ingresos:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setText("Detalles de padecimiento:");

        jLabel6.setText("Tipo de padecimiento:");

        buttonGroupTipoPadecimiento.add(jRadioButtonInfartoPaciente);
        jRadioButtonInfartoPaciente.setText("Infarto");

        buttonGroupTipoPadecimiento.add(jRadioButtonPérdidasangrePaciente);
        jRadioButtonPérdidasangrePaciente.setText("Pérdida sangre por herida");

        buttonGroupTipoPadecimiento.add(jRadioButtonPartoPaciente);
        jRadioButtonPartoPaciente.setText("Parto");

        buttonGroupTipoPadecimiento.add(jRadioButtonEstomacalPaciente);
        jRadioButtonEstomacalPaciente.setText("Dolor estomacal");

        jTextFieldDetallePadePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDetallePadePacienteActionPerformed(evt);
            }
        });

        jButtonRegistrarsePaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRegistrarsePaciente.setText("Registrarse");
        jButtonRegistrarsePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarsePacienteActionPerformed(evt);
            }
        });

        jTableListaEspera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableListaEspera);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Pacientes registrados( Lista de Espera)");

        buttonGroupTipoPadecimiento.add(jRadioButtonQuebraduraPaciente);
        jRadioButtonQuebraduraPaciente.setText("Quebradura");

        buttonGroupTipoPadecimiento.add(jRadioButtonOtroPaciente);
        jRadioButtonOtroPaciente.setText("Otro");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setText("Módulo de Urgencias:");

        jTablePacientesUrgencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablePacientesUrgencias);

        jButtonAtenderUrgencias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAtenderUrgencias.setText("Atender");

        jButtonLiberarAtenderUrgencias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLiberarAtenderUrgencias.setText("Liberar y atender");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel9.setText("Módulo de Emergencias:");

        jTablePacientesEmergencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTablePacientesEmergencias);

        jButtonAtenderEmergencias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAtenderEmergencias.setText("Atender");

        jButtonLiberarAtenderEmergencias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLiberarAtenderEmergencias.setText("Liberar y atender");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Administración:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel11.setText("Módulo de Egresos:");

        jTableEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTableEgresos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(227, 227, 227)
                        .addComponent(jLabel8)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldNacimientoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldDetallePadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButtonInfartoPaciente)
                                .addGap(44, 44, 44)
                                .addComponent(jRadioButtonPartoPaciente)
                                .addGap(56, 56, 56)
                                .addComponent(jRadioButtonPérdidasangrePaciente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButtonEstomacalPaciente)
                                .addGap(2, 2, 2)
                                .addComponent(jRadioButtonQuebraduraPaciente)
                                .addGap(24, 24, 24)
                                .addComponent(jRadioButtonOtroPaciente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButtonRegistrarsePaciente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAtenderUrgencias, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButtonLiberarAtenderUrgencias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAtenderEmergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonLiberarAtenderEmergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(jTextFieldNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAtenderUrgencias)
                            .addComponent(jButtonLiberarAtenderUrgencias))
                        .addGap(79, 79, 79)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAtenderEmergencias)
                            .addComponent(jButtonLiberarAtenderEmergencias)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(jTextFieldNacimientoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldDetallePadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonInfartoPaciente)
                            .addComponent(jRadioButtonPartoPaciente)
                            .addComponent(jRadioButtonPérdidasangrePaciente))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEstomacalPaciente)
                            .addComponent(jRadioButtonQuebraduraPaciente)
                            .addComponent(jRadioButtonOtroPaciente))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegistrarsePaciente)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDetallePadePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDetallePadePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDetallePadePacienteActionPerformed

    private void jButtonRegistrarsePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarsePacienteActionPerformed
        String enfermedad = null;
        if (jRadioButtonEstomacalPaciente.isSelected()){
            enfermedad = "dolor estomacal";
        }
        if (jRadioButtonInfartoPaciente.isSelected()){
            enfermedad = "infarto";
        }
        if (jRadioButtonOtroPaciente.isSelected()){
            enfermedad = "otro";
        }
        if (jRadioButtonPartoPaciente.isSelected()){
            enfermedad = "parto";
        }if (jRadioButtonPérdidasangrePaciente.isSelected()){
            enfermedad = "perdida";
        }if (jRadioButtonQuebraduraPaciente.isSelected()){
            enfermedad = "quebradura";
        }
        System.out.println(enfermedad);
        this.actualizarTabla();
    }//GEN-LAST:event_jButtonRegistrarsePacienteActionPerformed

    public JTable getjTableListaEspera() {
        return jTableListaEspera;
    }
    
    
    
    public void actualizarTabla() {
        if (this.listaPacientes.getListaEspera().esVacia()) {
            ModeladorTablas.vaciarTabla(jTableListaEspera);
        } else {
            ModeladorTablas.vaciarTabla(jTableListaEspera);
            Object[] filaNueva;
            NodoD<Patient> temp = this.listaPacientes.getListaEspera().getCabeza();
            for (int i = 0; i < this.listaPacientes.getListaEspera().getTamano(); i++) {
                filaNueva = new Object[]{temp.getElemento().getNombre(),temp.getElemento().getFicha()};
                ModeladorTablas.nuevaFila(jTableListaEspera, filaNueva);
                temp = temp.getSiguiente();
            }

        }
    }

   

    public void setjTableListaEspera(JTable jTableListaEspera) {
        this.jTableListaEspera = jTableListaEspera;
    }

    public JTable getjTablePacientesEmergencias() {
        return jTablePacientesEmergencias;
    }

    public void setjTablePacientesEmergencias(JTable jTablePacientesEmergencias) {
        this.jTablePacientesEmergencias = jTablePacientesEmergencias;
    }

    public JTable getjTablePacientesUrgencias() {
        return jTablePacientesUrgencias;
    }

    public void setjTablePacientesUrgencias(JTable jTablePacientesUrgencias) {
        this.jTablePacientesUrgencias = jTablePacientesUrgencias;
    }

    public JTable getjTableEgresos() {
        return jTableEgresos;
    }

    public void setjTableEgresos(JTable jTableEgresos) {
        this.jTableEgresos = jTableEgresos;
    }

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoPadecimiento;
    private javax.swing.JButton jButtonAtenderEmergencias;
    private javax.swing.JButton jButtonAtenderUrgencias;
    private javax.swing.JButton jButtonLiberarAtenderEmergencias;
    private javax.swing.JButton jButtonLiberarAtenderUrgencias;
    private javax.swing.JButton jButtonRegistrarsePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonEstomacalPaciente;
    private javax.swing.JRadioButton jRadioButtonInfartoPaciente;
    private javax.swing.JRadioButton jRadioButtonOtroPaciente;
    private javax.swing.JRadioButton jRadioButtonPartoPaciente;
    private javax.swing.JRadioButton jRadioButtonPérdidasangrePaciente;
    private javax.swing.JRadioButton jRadioButtonQuebraduraPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableEgresos;
    private javax.swing.JTable jTableListaEspera;
    private javax.swing.JTable jTablePacientesEmergencias;
    private javax.swing.JTable jTablePacientesUrgencias;
    private javax.swing.JTextField jTextFieldDetallePadePaciente;
    private javax.swing.JTextField jTextFieldNacimientoPaciente;
    private javax.swing.JTextField jTextFieldNombrePaciente;
    // End of variables declaration//GEN-END:variables
}