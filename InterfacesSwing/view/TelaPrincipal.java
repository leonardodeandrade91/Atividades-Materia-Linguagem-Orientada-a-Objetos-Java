/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author eu
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itUsCad = new javax.swing.JMenuItem();
        itUsAlt = new javax.swing.JMenuItem();
        itUsExcl = new javax.swing.JMenuItem();
        itUsPesq = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itClCad = new javax.swing.JMenuItem();
        itClAlt = new javax.swing.JMenuItem();
        itClExcl = new javax.swing.JMenuItem();
        itClPesq = new javax.swing.JMenuItem();
        itSobr = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios.png")).getImage());
        setResizable(false);

        jMenu1.setText("Arquivo");

        itSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        itSair.setText("Sair");
        jMenu1.add(itSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuários");

        itUsCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        itUsCad.setText("Cadastrar");
        jMenu2.add(itUsCad);

        itUsAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_edit.png"))); // NOI18N
        itUsAlt.setText("Alterar");
        jMenu2.add(itUsAlt);

        itUsExcl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_delete.png"))); // NOI18N
        itUsExcl.setText("Excluir");
        jMenu2.add(itUsExcl);

        itUsPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        itUsPesq.setText("Pesquisar");
        jMenu2.add(itUsPesq);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Clientes");

        itClCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_add.png"))); // NOI18N
        itClCad.setText("Cadastrar");
        jMenu3.add(itClCad);

        itClAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_edit.png"))); // NOI18N
        itClAlt.setText("Alterar");
        jMenu3.add(itClAlt);

        itClExcl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_delete.png"))); // NOI18N
        itClExcl.setText("Excluir");
        jMenu3.add(itClExcl);

        itClPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        itClPesq.setText("Pesquisar");
        jMenu3.add(itClPesq);

        jMenuBar1.add(jMenu3);

        itSobr.setText("Sobre");
        jMenuBar1.add(itSobr);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itClAlt;
    private javax.swing.JMenuItem itClCad;
    private javax.swing.JMenuItem itClExcl;
    private javax.swing.JMenuItem itClPesq;
    private javax.swing.JMenuItem itSair;
    private javax.swing.JMenu itSobr;
    private javax.swing.JMenuItem itUsAlt;
    private javax.swing.JMenuItem itUsCad;
    private javax.swing.JMenuItem itUsExcl;
    private javax.swing.JMenuItem itUsPesq;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}