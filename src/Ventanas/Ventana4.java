package Ventanas;
import Clases.GCoeficientes;
import java.awt.Font;

public class Ventana4 extends javax.swing.JFrame {
    private Double a,b,c;
    float aa,cc,bbb;
    double Dis;

    public Ventana4() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    GCoeficientes G;
    
    public Ventana4(GCoeficientes G) {
        this.G = G;
        initComponents();
        this.setLocationRelativeTo(this);
        this.a = G.getA();
        this.b = G.getB();
        this.c = G.getC();
        Soluciones();
    }
    public void Soluciones(){
        Reemplazar.setFont(new Font("Rockwell",1,36));
        Reemplazar.setText(b+"^2 - (4*"+a+"*"+c+")");
        Double bb = Math.pow(b, 2); // Elevamos b al cuadrado
        Double mult = 4*a*c; //Multiplicamos 4 * a * c
        Multiplicacion.setFont(new Font("Rockwell",1,36));
        Multiplicacion.setText(bb+" - ("+mult+")"); // Mostramos el proceso
        Dis = bb - mult; // Restamos el valor elevado al cuadrado y el valor de la multiplicacion
        Resultado.setFont(new Font("Rockwell",1,36));
        Resultado.setText(Dis+""); // Mostramos el Valor del discriminante
        if (Dis > 0){ // Mostramos si tiene soluciones o no
            Solucion.setFont(new Font("Rockwell",1,36));
            Solucion.setText("La ecuacion tiene dos soluciones"); 
        }else if(Dis == 0){
            Solucion.setFont(new Font("Rockwell",1,36));
            Solucion.setText("La ecuacion tiene una solucion");
        }else{
            Solucion.setFont(new Font("Rockwell",1,36));
            Solucion.setText("La ecuacion no tiene solucion");
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Formula = new javax.swing.JLabel();
        Reemplazar = new javax.swing.JLabel();
        Multiplicacion = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        Solucion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 159, 159));
        jPanel1.setForeground(new java.awt.Color(152, 245, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Formula.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        Formula.setForeground(new java.awt.Color(255, 0, 0));
        Formula.setText("b^2 - 4ac");
        jPanel1.add(Formula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 198, 36));

        Reemplazar.setBackground(new java.awt.Color(0, 0, 0));
        Reemplazar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Reemplazar.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Reemplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 400, 40));

        Multiplicacion.setBackground(new java.awt.Color(0, 0, 0));
        Multiplicacion.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Multiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 300, 34));

        Resultado.setBackground(new java.awt.Color(0, 0, 0));
        Resultado.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Resultado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 193, 37));

        Solucion.setBackground(new java.awt.Color(0, 0, 0));
        Solucion.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Solucion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Solucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 580, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 153, 44));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOLa/Calculadora (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Dis >= 0){
           new Ventana5(G,Dis).setVisible(true);
           this.dispose();
        }else{
            new VentanaG(G).setVisible(true);
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Formula;
    private javax.swing.JLabel Multiplicacion;
    private javax.swing.JLabel Reemplazar;
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel Solucion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
