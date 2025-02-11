package Ventanas;

import Clases.GCoeficientes;
import java.awt.Font;

public class Ventana5 extends javax.swing.JFrame {

    private double a, b, c, bb ,dis;
    GCoeficientes G;

    public Ventana5() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public Ventana5(GCoeficientes G,double Dis) {
        this.G = G;
        initComponents();
        setLocationRelativeTo(this);
        a = G.getA();
        b = G.getB();
        c = G.getC();
        dis = Dis;
        ValoresX();
    }

    public void ValoresX() {
        Reemplazar.setFont(new Font("Rockwell", 1, 36));
        Reemplazar.setText("(-(" + b + ") +- √" + dis + ") / (2*" + a + ")"); // Reemplazamos los valores
        double raiz = Math.sqrt(dis); //  Le sacamos raiz al discriminante
        raiz = Math.round(raiz * 1000) / 1000d; // Reducimos el numero de decimales
        double mult = 2 * a; // Multiplicamos el denominador
        bb = -(b); // Cambiamos de signo a b
        RaizCuadrada.setFont(new Font("Rockwell", 1, 32));
        RaizCuadrada.setText("(" + bb + " +- " + raiz + ") / (" + mult + ")"); // Mostramos el proceso
        if (dis > 0) { // Si el disciminante es mayor a 0, mostramos las dos soluciones
            SolucionP(mult,raiz);
            SolucionN(mult,raiz);
        } else { // Si es igual a 0 mostraremos una solucion
            SolucionP(mult,raiz);
        }
    }

    public void SolucionP(double mult, double raiz) {
        mult = Math.round(mult * 1000) / 1000d;
        X1.setFont(new Font("Rockwell", 1, 32));
        X1.setText("X1= (" + bb + " +" + raiz + ") / (" + mult + ")"); // Empezamos a mostrar la solucion con el +
        double Suma = bb + raiz; // Sumamos b y la raiz
        Suma = Math.round(Suma * 1000) / 1000d;
        X12.setFont(new Font("Rockwell", 1, 32));
        X12.setText("X1= (" + Suma + ") / (" + mult + ")"); // Mostramos el Proceso
        double X1 = Suma / mult;
        X1 = Math.round(X1 * 1000) / 1000d;
        X13.setFont(new Font("Rockwell", 1, 32));
        X13.setText("X1= " + X1);
    }

    public void SolucionN(double mult, double raiz) {
        mult = Math.round(mult * 1000) / 1000d;
        X2.setFont(new Font("Rockwell", 1, 32));
        X2.setText("X2= (" + bb + " -(" + raiz + ")) / (" + mult + ")"); // Mostramos la solucion con el -
        double Resta = bb - raiz; //Restamos b y la raiz
        Resta = Math.round(Resta * 1000) / 1000d;
        X22.setFont(new Font("Rockwell", 1, 32));
        X22.setText("X2= (" + Resta + ") / (" + mult + ")"); // Mostramos el Proceso
        double X2 = Resta / mult;
        X2 = Math.round(X2 * 1000) / 1000d; // Dividimos y limitamos los decimales
        X23.setFont(new Font("Rockwell", 1, 32));
        X23.setText("X2= " + X2); // Mostramos los resultados
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ecuacion = new javax.swing.JLabel();
        Reemplazar = new javax.swing.JLabel();
        RaizCuadrada = new javax.swing.JLabel();
        X1 = new javax.swing.JLabel();
        X2 = new javax.swing.JLabel();
        X12 = new javax.swing.JLabel();
        X22 = new javax.swing.JLabel();
        X13 = new javax.swing.JLabel();
        X23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ecuacion.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        Ecuacion.setForeground(new java.awt.Color(0, 0, 0));
        Ecuacion.setText("(-(b) +- √b^2 - 4ac) / 2a");
        jPanel1.add(Ecuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 500, 54));

        Reemplazar.setBackground(new java.awt.Color(0, 0, 0));
        Reemplazar.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        Reemplazar.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Reemplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 560, 35));

        RaizCuadrada.setBackground(new java.awt.Color(0, 0, 0));
        RaizCuadrada.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        RaizCuadrada.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(RaizCuadrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 490, 43));

        X1.setBackground(new java.awt.Color(0, 0, 0));
        X1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        X1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(X1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 420, 51));

        X2.setBackground(new java.awt.Color(0, 0, 0));
        X2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        X2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(X2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 430, 48));

        X12.setBackground(new java.awt.Color(0, 0, 0));
        X12.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        X12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(X12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 330, 46));

        X22.setBackground(new java.awt.Color(0, 0, 0));
        X22.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        X22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(X22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 340, 39));

        X13.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        X13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(X13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 290, 40));

        X23.setBackground(new java.awt.Color(0, 0, 0));
        X23.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        X23.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(X23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 340, 41));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 160, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOLa/Calculadora (2).png"))); // NOI18N
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
        VentanaG u = new VentanaG(G);
        u.setVisible(true);
        this.dispose();  //Pasamos los valores de a, b y c a la graficadora
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
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ecuacion;
    private javax.swing.JLabel RaizCuadrada;
    private javax.swing.JLabel Reemplazar;
    private javax.swing.JLabel X1;
    private javax.swing.JLabel X12;
    private javax.swing.JLabel X13;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel X22;
    private javax.swing.JLabel X23;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
