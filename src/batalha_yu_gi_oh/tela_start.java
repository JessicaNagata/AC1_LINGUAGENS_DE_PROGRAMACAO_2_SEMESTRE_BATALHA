package batalha_yu_gi_oh;

import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tela_start extends javax.swing.JFrame {

    public tela_start() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        b_start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_Yu_Gi_Oh.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(10, -40, 1280, 590);

        b_start.setBackground(new java.awt.Color(255, 216, 73));
        b_start.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        b_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao_start.gif"))); // NOI18N
        b_start.setBorder(null);
        b_start.setBorderPainted(false);
        b_start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_start.setOpaque(false);
        b_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_startActionPerformed(evt);
            }
        });
        jPanel1.add(b_start);
        b_start.setBounds(510, 530, 210, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_startActionPerformed
        dispose();
        tela_batalha batalha = new tela_batalha();
        batalha.setVisible(true);
    }//GEN-LAST:event_b_startActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_start;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
