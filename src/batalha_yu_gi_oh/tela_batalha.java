package batalha_yu_gi_oh;

import javax.swing.JFrame;

public class tela_batalha extends javax.swing.JFrame {

    public tela_batalha() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_batalha = new javax.swing.JButton();
        versus = new javax.swing.JLabel();
        carta_virada = new javax.swing.JLabel();
        round = new javax.swing.JPanel();
        fogo2 = new javax.swing.JLabel();
        imagem_1 = new javax.swing.JPanel();
        player2_title = new javax.swing.JLabel();
        fogo1 = new javax.swing.JLabel();
        player1_title = new javax.swing.JLabel();
        cartas_1 = new javax.swing.JPanel();
        carta1 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        cartas_2 = new javax.swing.JPanel();
        carta5 = new javax.swing.JButton();
        carta6 = new javax.swing.JButton();
        carta7 = new javax.swing.JButton();
        carta8 = new javax.swing.JButton();
        vida_player2 = new javax.swing.JTextField();
        vida_player1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1287, 700));
        jPanel1.setLayout(null);

        b_batalha.setBorderPainted(false);
        b_batalha.setContentAreaFilled(false);
        b_batalha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_batalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_batalhaActionPerformed(evt);
            }
        });
        jPanel1.add(b_batalha);
        b_batalha.setBounds(530, 140, 380, 580);

        versus.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessi\\Downloads\\versus.png")); // NOI18N
        jPanel1.add(versus);
        versus.setBounds(600, 310, 260, 250);

        carta_virada.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessi\\Downloads\\carta-yu-gi-oh.png")); // NOI18N
        jPanel1.add(carta_virada);
        carta_virada.setBounds(520, 130, 405, 600);

        round.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout roundLayout = new javax.swing.GroupLayout(round);
        round.setLayout(roundLayout);
        roundLayout.setHorizontalGroup(
            roundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        roundLayout.setVerticalGroup(
            roundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel1.add(round);
        round.setBounds(860, 90, 400, 560);

        fogo2.setForeground(new java.awt.Color(0, 0, 0));
        fogo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessi\\Downloads\\fire-15.gif")); // NOI18N
        jPanel1.add(fogo2);
        fogo2.setBounds(710, 340, 800, 570);

        imagem_1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout imagem_1Layout = new javax.swing.GroupLayout(imagem_1);
        imagem_1.setLayout(imagem_1Layout);
        imagem_1Layout.setHorizontalGroup(
            imagem_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        imagem_1Layout.setVerticalGroup(
            imagem_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(imagem_1);
        imagem_1.setBounds(194, 94, 400, 550);

        player2_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/player_2.jpg"))); // NOI18N
        jPanel1.add(player2_title);
        player2_title.setBounds(990, -10, 200, 100);

        fogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fire-15.gif"))); // NOI18N
        jPanel1.add(fogo1);
        fogo1.setBounds(0, 340, 800, 570);

        player1_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/player_1.jpg"))); // NOI18N
        jPanel1.add(player1_title);
        player1_title.setBounds(240, -20, 230, 100);

        cartas_1.setBackground(new java.awt.Color(0, 0, 0));

        carta1.setBackground(new java.awt.Color(255, 204, 51));
        carta1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        carta1.setText("Elemental HERO Neos");
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });

        carta2.setBackground(new java.awt.Color(255, 204, 51));
        carta2.setText("Dragão Branco de Olhos Azuis");
        carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta2ActionPerformed(evt);
            }
        });

        carta3.setBackground(new java.awt.Color(255, 204, 51));
        carta3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        carta3.setText("Dark Magician");
        carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta3ActionPerformed(evt);
            }
        });

        carta4.setBackground(new java.awt.Color(255, 204, 51));
        carta4.setText("Battle Ox");
        carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartas_1Layout = new javax.swing.GroupLayout(cartas_1);
        cartas_1.setLayout(cartas_1Layout);
        cartas_1Layout.setHorizontalGroup(
            cartas_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartas_1Layout.createSequentialGroup()
                .addGroup(cartas_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cartas_1Layout.setVerticalGroup(
            cartas_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartas_1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(cartas_1);
        cartas_1.setBounds(0, 0, 190, 400);

        cartas_2.setBackground(new java.awt.Color(0, 0, 0));

        carta5.setBackground(new java.awt.Color(255, 102, 0));
        carta5.setText("Enraged Battle Ox");

        carta6.setBackground(new java.awt.Color(255, 102, 0));
        carta6.setText("Berlineth the Firestorm Vassal");
        carta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta6ActionPerformed(evt);
            }
        });

        carta7.setBackground(new java.awt.Color(255, 102, 0));
        carta7.setText("Gilford THE Legend");

        carta8.setBackground(new java.awt.Color(255, 102, 0));
        carta8.setText("Valkyrian Knight");

        javax.swing.GroupLayout cartas_2Layout = new javax.swing.GroupLayout(cartas_2);
        cartas_2.setLayout(cartas_2Layout);
        cartas_2Layout.setHorizontalGroup(
            cartas_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartas_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cartas_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carta8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cartas_2Layout.setVerticalGroup(
            cartas_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartas_2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(cartas_2);
        cartas_2.setBounds(1255, 0, 218, 400);

        vida_player2.setBackground(new java.awt.Color(0, 0, 0));
        vida_player2.setForeground(new java.awt.Color(255, 255, 255));
        vida_player2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vida_player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vida_player2ActionPerformed(evt);
            }
        });
        jPanel1.add(vida_player2);
        vida_player2.setBounds(860, 30, 100, 43);

        vida_player1.setBackground(new java.awt.Color(0, 0, 0));
        vida_player1.setForeground(new java.awt.Color(255, 255, 255));
        vida_player1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vida_player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vida_player1ActionPerformed(evt);
            }
        });
        jPanel1.add(vida_player1);
        vida_player1.setBounds(470, 30, 80, 43);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(660, 30, 120, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_batalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_batalhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_batalhaActionPerformed

    private void carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta3ActionPerformed
        cartas player1 = new cartas("Dark Magician", "Trevas", 7, 2500, 2100);
    }//GEN-LAST:event_carta3ActionPerformed

    private void carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta2ActionPerformed
        cartas player1 = new cartas("Dragão Branco de Olhos Azuis", "Luz", 8, 3000, 2500);
    }//GEN-LAST:event_carta2ActionPerformed

    private void carta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta6ActionPerformed

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
        cartas player1 = new cartas("Elemental HERO Neos", "Luz", 7, 2500, 2000);
        JFrame frame = new JFrame();
        imagem_1 imagem1 = frame.getContentPane();
    }//GEN-LAST:event_carta1ActionPerformed

    private void carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta4ActionPerformed
        cartas player1 = new cartas("Battle Ox", "Terra", 4, 1700, 1000);
    }//GEN-LAST:event_carta4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //contador
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void vida_player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vida_player2ActionPerformed
        // player2.vida
    }//GEN-LAST:event_vida_player2ActionPerformed

    private void vida_player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vida_player1ActionPerformed
        // player1.vida
    }//GEN-LAST:event_vida_player1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_batalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_batalha;
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta4;
    private javax.swing.JButton carta5;
    private javax.swing.JButton carta6;
    private javax.swing.JButton carta7;
    private javax.swing.JButton carta8;
    private javax.swing.JLabel carta_virada;
    private javax.swing.JPanel cartas_1;
    private javax.swing.JPanel cartas_2;
    private javax.swing.JLabel fogo1;
    private javax.swing.JLabel fogo2;
    private javax.swing.JPanel imagem_1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel player1_title;
    private javax.swing.JLabel player2_title;
    private javax.swing.JPanel round;
    private javax.swing.JLabel versus;
    private javax.swing.JTextField vida_player1;
    private javax.swing.JTextField vida_player2;
    // End of variables declaration//GEN-END:variables
}
