/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author eu
 */
public class TelaTri extends javax.swing.JFrame {

    /**
     * Creates new form TelaTri
     */
    public TelaTri() {
        initComponents();
        
        panRes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sliA = new javax.swing.JSlider();
        sliB = new javax.swing.JSlider();
        sliC = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        panRes = new javax.swing.JPanel();
        lblSta = new javax.swing.JLabel();
        lblTip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipos de Triângulo");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Segmento A:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Segmento B:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Segmento C:");

        sliA.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sliA.setMaximum(50);
        sliA.setValue(0);
        sliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliAStateChanged(evt);
            }
        });

        sliB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sliB.setMaximum(50);
        sliB.setValue(0);
        sliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliBStateChanged(evt);
            }
        });

        sliC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sliC.setMaximum(50);
        sliC.setValue(0);
        sliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCStateChanged(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblA.setForeground(new java.awt.Color(102, 0, 0));
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblB.setForeground(new java.awt.Color(102, 0, 0));
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblC.setForeground(new java.awt.Color(102, 0, 0));
        lblC.setText("0");

        btnVer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVer.setForeground(new java.awt.Color(0, 51, 51));
        btnVer.setText("Verificar");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        lblSta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblSta.setForeground(new java.awt.Color(0, 0, 102));
        lblSta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSta.setText(" ");

        lblTip.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblTip.setForeground(new java.awt.Color(0, 0, 102));
        lblTip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTip.setText(" ");

        javax.swing.GroupLayout panResLayout = new javax.swing.GroupLayout(panRes);
        panRes.setLayout(panResLayout);
        panResLayout.setHorizontalGroup(
            panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTip, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panResLayout.setVerticalGroup(
            panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblSta)
                .addGap(18, 18, 18)
                .addComponent(lblTip)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(sliC, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblC, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sliA, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sliA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sliB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sliC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC))
                .addGap(34, 34, 34)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliAStateChanged
        lblA.setText(Integer.toString(sliA.getValue()));
    }//GEN-LAST:event_sliAStateChanged

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliBStateChanged
        lblB.setText(Integer.toString(sliB.getValue()));
    }//GEN-LAST:event_sliBStateChanged

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCStateChanged
        lblC.setText(Integer.toString(sliC.getValue()));
    }//GEN-LAST:event_sliCStateChanged

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        int a = sliA.getValue();
        int b = sliB.getValue();
        int c = sliC.getValue();
        
        if(a < b + c && b < a + c && c < a + b) {
            lblSta.setText("Formam um Triângulo!");
            
            if(a == b && b == c) {
                lblTip.setText("Equilátero!");
            }
            else if(a != b && b != c && c != a) {
                lblTip.setText("Escaleno!");
            }
            else {
                lblTip.setText("Isósceles!");
            }
        }
        else {
            lblSta.setText("Não Formam um Triângulo!");
            lblTip.setText(" ");
        }
        
        panRes.setVisible(true);
    }//GEN-LAST:event_btnVerActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblSta;
    private javax.swing.JLabel lblTip;
    private javax.swing.JPanel panRes;
    private javax.swing.JSlider sliA;
    private javax.swing.JSlider sliB;
    private javax.swing.JSlider sliC;
    // End of variables declaration//GEN-END:variables
}
