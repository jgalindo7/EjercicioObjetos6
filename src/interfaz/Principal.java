/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.Cafetera;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Cafetera C;
    public Principal() {
        initComponents();
    cmdAjustarCafet.setEnabled(false);
    cmdCrearCafet.setEnabled(true);
    cmdLlenarCafet.setEnabled(false);
    cmdServirCafet.setEnabled(false);
    cmdMostrarCantidad.setEnabled(false);
    cmdAgregarCafet.setEnabled(false);
    cmdVaciarCafet.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdServirCafet = new javax.swing.JButton();
        cmdAgregarCafet = new javax.swing.JButton();
        cmdAjustarCafet = new javax.swing.JButton();
        cmdCrearCafet = new javax.swing.JButton();
        cmdVaciarCafet = new javax.swing.JButton();
        cmdMostrarCantidad = new javax.swing.JButton();
        cmdLlenarCafet = new javax.swing.JButton();
        txtCapacidadAct = new javax.swing.JTextField();
        txtCapacidadMx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Oxygen", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cafetera party");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdServirCafet.setForeground(new java.awt.Color(153, 0, 153));
        cmdServirCafet.setText("Servir Cafe");
        cmdServirCafet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdServirCafetActionPerformed(evt);
            }
        });
        jPanel2.add(cmdServirCafet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        cmdAgregarCafet.setForeground(new java.awt.Color(255, 0, 0));
        cmdAgregarCafet.setText("Agregar Cafe");
        cmdAgregarCafet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarCafetActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAgregarCafet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cmdAjustarCafet.setForeground(new java.awt.Color(255, 0, 0));
        cmdAjustarCafet.setText("Ajustar cantidad ");
        cmdAjustarCafet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAjustarCafetActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAjustarCafet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        cmdCrearCafet.setForeground(new java.awt.Color(153, 0, 153));
        cmdCrearCafet.setText("Crear cafetera");
        cmdCrearCafet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearCafetActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrearCafet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cmdVaciarCafet.setForeground(new java.awt.Color(37, 20, 226));
        cmdVaciarCafet.setText("Vaciar Cafetera");
        cmdVaciarCafet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVaciarCafetActionPerformed(evt);
            }
        });
        jPanel2.add(cmdVaciarCafet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        cmdMostrarCantidad.setForeground(new java.awt.Color(61, 27, 27));
        cmdMostrarCantidad.setText("Mostrar cantidad de cafe");
        cmdMostrarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarCantidadActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostrarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cmdLlenarCafet.setForeground(new java.awt.Color(51, 20, 233));
        cmdLlenarCafet.setText("Llenar cafetera");
        cmdLlenarCafet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarCafetActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenarCafet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 240, 180));
        jPanel1.add(txtCapacidadAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, -1));
        jPanel1.add(txtCapacidadMx, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, -1));

        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Capacidad Actual");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 253, 0));
        jLabel3.setText("Capaciadad Maxima");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarCafetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarCafetActionPerformed
      double aux;
      
      aux=Double.parseDouble(JOptionPane.showInputDialog("digite la cantidad de cafe que desea agregar"));
        C.Añadir((int)aux);
    
    cmdAjustarCafet.setEnabled(false);
    cmdCrearCafet.setEnabled(false);
    cmdLlenarCafet.setEnabled(true);
    cmdServirCafet.setEnabled(false);
    cmdMostrarCantidad.setEnabled(true);
    cmdAgregarCafet.setEnabled(true);
    cmdVaciarCafet.setEnabled(true);
        
         
    }//GEN-LAST:event_cmdAgregarCafetActionPerformed

    private void cmdMostrarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarCantidadActionPerformed
      
        String aux;
        aux = C.Mostrar();
        
        JOptionPane.showMessageDialog(this,aux);
    cmdAjustarCafet.setEnabled(true);
    cmdCrearCafet.setEnabled (false);
    cmdLlenarCafet.setEnabled (true);
    cmdServirCafet.setEnabled (false);
    cmdMostrarCantidad.setEnabled (true);
    cmdAgregarCafet.setEnabled (true);
    cmdVaciarCafet.setEnabled (true);
        
    }//GEN-LAST:event_cmdMostrarCantidadActionPerformed

    private void cmdServirCafetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdServirCafetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdServirCafetActionPerformed

    private void cmdAjustarCafetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAjustarCafetActionPerformed
        int cantidad_maxima,cantidad_actual;
        
        if(txtCapacidadAct.getText().trim().isEmpty()){
            JOptionPane.showConfirmDialog(this,"digite la capacidad actual de la cafetera, por favor","Error",JOptionPane.ERROR_MESSAGE);
        txtCapacidadAct.requestFocusInWindow();
        }
        else{
            cantidad_actual=Integer.parseInt(txtCapacidadAct.getText());
            cantidad_maxima=Integer.parseInt(txtCapacidadMx.getText());
            
        if(cantidad_actual > cantidad_maxima){
            C = new Cafetera (cantidad_actual,cantidad_maxima);
            JOptionPane.showMessageDialog(this,"capacidad ajustada");
        }
        else{
            C = new Cafetera();
        }
            }
    cmdAjustarCafet.setEnabled(false);
    cmdCrearCafet.setEnabled(false);
    cmdLlenarCafet.setEnabled(false);
    cmdServirCafet.setEnabled(false);
    cmdMostrarCantidad.setEnabled(true);
    cmdAgregarCafet.setEnabled(false);
    cmdVaciarCafet.setEnabled(true);
    }//GEN-LAST:event_cmdAjustarCafetActionPerformed

    private void cmdLlenarCafetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarCafetActionPerformed
        int aux;
        
        aux = Integer.parseInt(txtCapacidadAct.getText());
        C.llenar(aux);
        JOptionPane.showMessageDialog(this,"La cafetera esta llena");
        
    cmdAjustarCafet.setEnabled(false);
    cmdCrearCafet.setEnabled(false);
    cmdLlenarCafet.setEnabled(false);
    cmdServirCafet.setEnabled(false);
    cmdMostrarCantidad.setEnabled(true);
    cmdAgregarCafet.setEnabled(false);
    cmdVaciarCafet.setEnabled(true);
        
    }//GEN-LAST:event_cmdLlenarCafetActionPerformed

    private void cmdCrearCafetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearCafetActionPerformed
     
        int CapacidadAct,CapacidadMx;
        
        CapacidadAct=Integer.parseInt(txtCapacidadAct.getText());
        CapacidadMx=Integer.parseInt(txtCapacidadMx.getText());
        
        C = new Cafetera(CapacidadAct,CapacidadMx);
        
        JOptionPane.showMessageDialog(this,"Cafetera creada exitosamente");
        
        if(CapacidadAct > CapacidadMx){
            cmdAjustarCafet.setEnabled(true);
            
        }
    cmdCrearCafet.setEnabled(false);
    cmdLlenarCafet.setEnabled(true);
    cmdServirCafet.setEnabled(false);
    cmdMostrarCantidad.setEnabled(true);
    cmdAgregarCafet.setEnabled(true);
    cmdVaciarCafet.setEnabled(true);
    }//GEN-LAST:event_cmdCrearCafetActionPerformed

    private void cmdVaciarCafetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVaciarCafetActionPerformed
        
        C.vaciar();
        JOptionPane.showConfirmDialog(this,"la cafetera esta vacia");
        
    cmdAjustarCafet.setEnabled(false);
    cmdCrearCafet.setEnabled(true);
    cmdLlenarCafet.setEnabled(false);
    cmdServirCafet.setEnabled(false);
    cmdMostrarCantidad.setEnabled(true);
    cmdAgregarCafet.setEnabled(false);
    cmdVaciarCafet.setEnabled(false);
        
    }//GEN-LAST:event_cmdVaciarCafetActionPerformed

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
    private javax.swing.JButton cmdAgregarCafet;
    private javax.swing.JButton cmdAjustarCafet;
    private javax.swing.JButton cmdCrearCafet;
    private javax.swing.JButton cmdLlenarCafet;
    private javax.swing.JButton cmdMostrarCantidad;
    private javax.swing.JButton cmdServirCafet;
    private javax.swing.JButton cmdVaciarCafet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCapacidadAct;
    private javax.swing.JTextField txtCapacidadMx;
    // End of variables declaration//GEN-END:variables
}
