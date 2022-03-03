package nominaempleado;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
ListaEmpleado lista = new ListaEmpleado(10);

    public Menu() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        txtNSS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FormatoCombo = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtVentasBrutas = new javax.swing.JTextField();
        txtLimpiar = new javax.swing.JButton();
        btnVizualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminarUltimo = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtKm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsueldoBase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su primer nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese su apellido paterno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, -1));

        txtSalida.setBackground(new java.awt.Color(255, 255, 204));
        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSalida.setRows(5);
        txtSalida.setText("\n");
        jScrollPane2.setViewportView(txtSalida);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 450, 430));

        txtNSS.setBackground(new java.awt.Color(255, 255, 255));
        txtNSS.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(txtNSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese su NSS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOMINAS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel7)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 50));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Empleado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        FormatoCombo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        FormatoCombo.setForeground(new java.awt.Color(0, 0, 0));
        FormatoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~Seleccionar~", "Comision", "Base", "Chofer", " " }));
        FormatoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatoComboActionPerformed(evt);
            }
        });
        jPanel1.add(FormatoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 130, -1));

        btnAgregar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ventas por semana");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtVentasBrutas.setBackground(new java.awt.Color(255, 255, 255));
        txtVentasBrutas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtVentasBrutas.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtVentasBrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, -1));

        txtLimpiar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        txtLimpiar.setText("Limpiar Panatalla");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(txtLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        btnVizualizar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnVizualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnVizualizar.setText("Vizualizar");
        btnVizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVizualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVizualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        btnSalir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, -1, -1));

        btnEliminarUltimo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnEliminarUltimo.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarUltimo.setLabel("Eliminar la ultima nomina");
        btnEliminarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        btnEliminarTodo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnEliminarTodo.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarTodo.setText("Eliminar todo");
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 130, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ingrese los kilometros ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        txtKm.setBackground(new java.awt.Color(255, 255, 255));
        txtKm.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtKm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 130, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese su sueldo base");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        txtsueldoBase.setBackground(new java.awt.Color(255, 255, 255));
        txtsueldoBase.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtsueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 120, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoEmpleado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.txtNombre.requestFocus();
        String primerNombre = txtNombre.getText();
        String apellidoPaterno = txtApellido.getText();
        String NSS = txtNSS.getText();
        String sueldoBase = txtsueldoBase.getText(); 
        Double SueldoBase = Double.valueOf(sueldoBase);
        String TipoEmpleado = (String)FormatoCombo.getSelectedItem();
        String Km = txtKm.getText();
        Double KM = Double.valueOf(Km);
        String VentasBrutas = txtVentasBrutas.getText();
        Double ventasBrutas = Double.valueOf(VentasBrutas);
        switch (TipoEmpleado){
            case "comision":
            lista.add(new EmpleadoPorComision(TipoEmpleado,primerNombre, apellidoPaterno,NSS,ventasBrutas,SueldoBase,KM));
            break;
            case "Base":
            lista.add(new EmpleadoBase(TipoEmpleado,primerNombre,apellidoPaterno,NSS,ventasBrutas,SueldoBase,KM));
            break;
            case "Chofer":
            lista.add(new EmpleadoChofer(TipoEmpleado,primerNombre,apellidoPaterno,NSS,ventasBrutas,SueldoBase,KM));
            break;
        }
        JOptionPane.showMessageDialog(null, "Registro Agregado");
        //Borrar contenido de los cuadros de texto
        this.txtNombre.setText(null);
        this.txtApellido.setText(null);
        this.txtNSS.setText(null);
        this.txtVentasBrutas.setText(null);
        this.txtKm.setText(null);
        this.txtsueldoBase.setText(null);
        this.txtNombre.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void FormatoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormatoComboActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        this.txtSalida.setText(null);
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void btnVizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVizualizarActionPerformed
       txtSalida.append(lista.toString());
    }//GEN-LAST:event_btnVizualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       int resp = JOptionPane.showConfirmDialog(null,"Esta seguro de que desea Salir?",
              "Alerta!", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
      
      if(resp == JOptionPane.YES_OPTION )
          System.exit(0);
      if(resp == JOptionPane.NO_OPTION)  
        JOptionPane.showMessageDialog(null,"cancelado","cancelando...", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        int resp = JOptionPane.showConfirmDialog(null,"Esta seguro de que desea eliminar todo?",
              "Alerta!", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
      
      if(resp == JOptionPane.YES_OPTION )
          lista.Eliminar();
      if(resp == JOptionPane.NO_OPTION)  
        JOptionPane.showMessageDialog(null,"cancelado","cancelando...", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnEliminarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUltimoActionPerformed
       lista.borrar();
    }//GEN-LAST:event_btnEliminarUltimoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FormatoCombo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnEliminarUltimo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVizualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtKm;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtNSS;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtVentasBrutas;
    private javax.swing.JTextField txtsueldoBase;
    // End of variables declaration//GEN-END:variables
}
