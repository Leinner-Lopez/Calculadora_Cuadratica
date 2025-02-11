package Ventanas;

import Clases.GCoeficientes;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Ingresar = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        Ta = new javax.swing.JTextField();
        Tb = new javax.swing.JTextField();
        Tc = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));

        Panel1.setBackground(new java.awt.Color(153, 153, 255));
        Panel1.setForeground(new java.awt.Color(255, 0, 0));
        Panel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ingresar.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(0, 0, 0));
        Ingresar.setText("Ingresa los valores requeridos:");
        Panel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 138, 455, 41));

        b.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(0, 0, 0));
        b.setText("Ingresa b:");
        Panel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 326, -1, 33));

        c.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        c.setForeground(new java.awt.Color(0, 0, 0));
        c.setText("Ingresa c:");
        Panel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 430, -1, 33));

        a.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(0, 0, 0));
        a.setText("Ingresa a:");
        Panel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 222, -1, 33));

        Ta.setBackground(new java.awt.Color(204, 204, 255));
        Ta.setForeground(new java.awt.Color(0, 0, 0));
        Ta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaActionPerformed(evt);
            }
        });
        Panel1.add(Ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 261, 101, -1));

        Tb.setBackground(new java.awt.Color(204, 204, 255));
        Tb.setForeground(new java.awt.Color(0, 0, 0));
        Tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbActionPerformed(evt);
            }
        });
        Panel1.add(Tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 370, 103, -1));

        Tc.setBackground(new java.awt.Color(204, 204, 255));
        Tc.setForeground(new java.awt.Color(0, 0, 0));
        Tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcActionPerformed(evt);
            }
        });
        Panel1.add(Tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 469, 102, -1));

        Confirmar.setBackground(new java.awt.Color(0, 0, 0));
        Confirmar.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar.setText("Continuar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        Panel1.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 174, 60));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 174, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOLa/Calculadora_1.png"))); // NOI18N
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        if (Ta.getText().equals("0")) { //Si a = 0 entonces no pasa a resolver la ecuacion cuadratica 
            new VentanaE().setVisible(true);
            this.dispose();
        } else {// Pasa a la ventana 3 para iniciar a solucionar la ecuacion
            GCoeficientes G = new GCoeficientes(Double.parseDouble(Ta.getText()), Double.parseDouble(Tb.getText()), Double.parseDouble(Tc.getText()));
            new Ventana3(G).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void TaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaActionPerformed

    }//GEN-LAST:event_TaActionPerformed

    private void TbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TbActionPerformed

    private void TcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ta.setText("");
        Tb.setText("");
        Tc.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Ingresar;
    private javax.swing.JPanel Panel1;
    public javax.swing.JTextField Ta;
    private javax.swing.JTextField Tb;
    private javax.swing.JTextField Tc;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
