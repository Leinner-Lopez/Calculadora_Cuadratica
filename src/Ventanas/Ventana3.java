package Ventanas;

import Clases.GCoeficientes;
import java.awt.Color;
import java.awt.Font;

public class Ventana3 extends javax.swing.JFrame {

    double Y, X, mult;
    double a, b, c;

    GCoeficientes G;

    public Ventana3() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public Ventana3(GCoeficientes G) {
        this.G = G;
        initComponents();
        setLocationRelativeTo(this);
        a = G.getA();
        b = G.getB();
        c = G.getC();
        VerticeX();
        VerticeY();
        MostrarVertice();
    }

    public void VerticeX() {
        Reemplazar.setFont(new Font("Rockwell", 1, 36));
        Reemplazar.setText("X = -(" + b + "/2*" + a + ")"); // Imprimimos el procedimiento
        mult = 2 * a; // Hacemos la multiplicacion de el denominador
        Multiplicacion.setFont(new Font("Rockwell", 1, 32));
        Multiplicacion.setText("X = -(" + b + "/" + mult + ")"); // Mostramos el Proceso 
        X = -(b / mult); // Hacemos la division de los dos valores
        X = Math.round(X * 1000) / 1000d; // Limitamos la canitidad de decimales
        Division.setFont(new Font("Rockwell", 1, 32));
        Division.setText("X = " + X); //Mostramos el vertice en las coordenadas x
        VerticeY();
    }

    public void VerticeY() {
        EcuacionY.setFont(new Font("Rockwell", 1, 32));
        EcuacionY.setText("Y =" + a + "*(" + X + ")^2+" + b + "*" + X + "+" + c); // Mostramos los valores al reemplazar
        double Pot = Math.round(Math.pow(X, 2) * 1000) / 1000d; // Elevamos al cuadrado
        mult = b * X; // Multiplicamos b * el valor de X
        mult = Math.round(mult * 1000) / 1000d; // Limitamos los decimales
        Potencia.setFont(new Font("Rockwell", 1, 32));
        Potencia.setText("Y =" + a + "*" + Pot + "+(" + mult + "+" + c + ")"); // Mostramos el Proceso
        double mult2 = a * Pot; // Multiplicamos a * el valor de la potencia
        mult2 = Math.round(mult2 * 1000) / 1000d; // Limitamos la salida de decimales
        double Sum = mult + c; // Sumamos la multiplicacion y c
        Sum = Math.round(Sum * 1000) / 1000d; // Limitamos la salida de decimales
        MultSumas.setFont(new Font("Rockwell", 1, 32));
        MultSumas.setText("Y =" + mult2 + "+(" + Sum + ")"); // Mostramos el proceso
        Y = mult2 + Sum; // Sumamos la ultima multiplicacion por la suma antes hecha
        Y = Math.round(Y * 1000) / 1000d;
        SumFinal.setFont(new Font("Rockwell", 1, 32));
        SumFinal.setText("Y =" + Y); // Mostramos el Valor de Y
    }

    public void MostrarVertice() {
        V.setFont(new Font("Rockwell", 1, 32));
        V.setForeground(Color.red);
        V.setText("V = (" + X + "," + Y + ")"); // Mostramos el valor de vertice
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CoorX = new javax.swing.JLabel();
        EcuacionX = new javax.swing.JLabel();
        Reemplazar = new javax.swing.JLabel();
        Multiplicacion = new javax.swing.JLabel();
        Division = new javax.swing.JLabel();
        CoorY = new javax.swing.JLabel();
        EcuacionY = new javax.swing.JLabel();
        Potencia = new javax.swing.JLabel();
        MultSumas = new javax.swing.JLabel();
        SumFinal = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solucion");
        setLocation(new java.awt.Point(200, 100));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(152, 245, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CoorX.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        CoorX.setForeground(new java.awt.Color(255, 255, 255));
        CoorX.setText("Coor. X");
        jPanel1.add(CoorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 92, 176, -1));

        EcuacionX.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        EcuacionX.setForeground(new java.awt.Color(0, 0, 0));
        EcuacionX.setText("X = -(b/2a)");
        jPanel1.add(EcuacionX, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 41));

        Reemplazar.setBackground(new java.awt.Color(0, 0, 0));
        Reemplazar.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        Reemplazar.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Reemplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 290, 40));

        Multiplicacion.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        Multiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 240, 43));

        Division.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        Division.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 230, 46));

        CoorY.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        CoorY.setForeground(new java.awt.Color(255, 255, 255));
        CoorY.setText("Coor. Y");
        jPanel1.add(CoorY, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 176, -1));

        EcuacionY.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        EcuacionY.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(EcuacionY, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 510, 43));

        Potencia.setBackground(new java.awt.Color(0, 0, 0));
        Potencia.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        Potencia.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 480, 38));

        MultSumas.setBackground(new java.awt.Color(0, 0, 0));
        MultSumas.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        MultSumas.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(MultSumas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 410, 34));

        SumFinal.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        SumFinal.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SumFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 350, 34));

        V.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        V.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 320, 38));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 160, 47));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOLa/Calculadora (4).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));

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
        new Ventana4(G).setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CoorX;
    private javax.swing.JLabel CoorY;
    private javax.swing.JLabel Division;
    private javax.swing.JLabel EcuacionX;
    private javax.swing.JLabel EcuacionY;
    private javax.swing.JLabel MultSumas;
    private javax.swing.JLabel Multiplicacion;
    private javax.swing.JLabel Potencia;
    private javax.swing.JLabel Reemplazar;
    private javax.swing.JLabel SumFinal;
    private javax.swing.JLabel V;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
