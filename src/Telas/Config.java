package Telas;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class Config extends javax.swing.JFrame {
    public Config() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//123456.png"))); // Define Icone
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_1 = new javax.swing.JPanel();
        Panel_2 = new javax.swing.JPanel();
        TextoMenu = new javax.swing.JLabel();
        Underline = new javax.swing.JLabel();
        ButInicio = new javax.swing.JLabel();
        ButConfig = new javax.swing.JLabel();
        ButTxtConfig = new javax.swing.JLabel();
        ButCarro = new javax.swing.JLabel();
        ButCasa = new javax.swing.JLabel();
        ButCar = new javax.swing.JLabel();
        ButClientes = new javax.swing.JLabel();
        ButClient = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TXT_Inicio = new javax.swing.JLabel();
        TextoBemV = new javax.swing.JLabel();
        TextoCor = new javax.swing.JLabel();
        gif = new javax.swing.JLabel();
        Txt_modelos = new javax.swing.JLabel();
        TXT_clique = new javax.swing.JLabel();
        marcad = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_2.setBackground(new java.awt.Color(50, 0, 60));
        Panel_2.setPreferredSize(new java.awt.Dimension(200, 550));
        Panel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoMenu.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TextoMenu.setForeground(new java.awt.Color(255, 255, 255));
        TextoMenu.setText("Menu");
        Panel_2.add(TextoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 130, 40));

        Underline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Underline.setForeground(new java.awt.Color(255, 255, 255));
        Underline.setText("______________________");
        Panel_2.add(Underline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        ButInicio.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButInicio.setForeground(new java.awt.Color(255, 255, 255));
        ButInicio.setText("- In??cio");
        ButInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButInicioMouseClicked(evt);
            }
        });
        Panel_2.add(ButInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 108, 110, 60));

        ButConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Config.png"))); // NOI18N
        ButConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButConfigMouseClicked(evt);
            }
        });
        Panel_2.add(ButConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 60, 50));

        ButTxtConfig.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        ButTxtConfig.setForeground(new java.awt.Color(255, 255, 255));
        ButTxtConfig.setText("- Configura????es");
        ButTxtConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButTxtConfigMouseClicked(evt);
            }
        });
        Panel_2.add(ButTxtConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 405, 110, 60));

        ButCarro.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButCarro.setForeground(new java.awt.Color(255, 255, 255));
        ButCarro.setText("- Carros");
        ButCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCarroMouseClicked(evt);
            }
        });
        Panel_2.add(ButCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 205, 110, 60));

        ButCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/In??cio.png"))); // NOI18N
        ButCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCasaMouseClicked(evt);
            }
        });
        Panel_2.add(ButCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 50));

        ButCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sedan.png"))); // NOI18N
        ButCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCarMouseClicked(evt);
            }
        });
        Panel_2.add(ButCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 50));

        ButClientes.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButClientes.setForeground(new java.awt.Color(255, 255, 255));
        ButClientes.setText("- Clientes");
        ButClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButClientesMouseClicked(evt);
            }
        });
        Panel_2.add(ButClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 305, 110, 60));

        ButClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes.png"))); // NOI18N
        ButClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButClientMouseClicked(evt);
            }
        });
        Panel_2.add(ButClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 50));

        Panel_1.add(Panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        jPanel1.setBackground(new java.awt.Color(64, 10, 90));
        jPanel1.setForeground(new java.awt.Color(64, 10, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_Inicio.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TXT_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        TXT_Inicio.setText("In??cio.");
        jPanel1.add(TXT_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 90));

        Panel_1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 710, 150));

        TextoBemV.setBackground(new java.awt.Color(50, 0, 60));
        TextoBemV.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        TextoBemV.setForeground(new java.awt.Color(50, 0, 60));
        TextoBemV.setText("Bem-Vindo(a) ao Menu");
        Panel_1.add(TextoBemV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 510, 68));

        TextoCor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-heart-30.png"))); // NOI18N
        Panel_1.add(TextoCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 6, 140, 80));

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carro fund.gif"))); // NOI18N
        Panel_1.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 480, 210));

        Txt_modelos.setBackground(new java.awt.Color(50, 0, 60));
        Txt_modelos.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Txt_modelos.setForeground(new java.awt.Color(50, 0, 60));
        Txt_modelos.setText("Modelos:");
        Panel_1.add(Txt_modelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 150, 70));

        TXT_clique.setBackground(new java.awt.Color(64, 10, 90));
        TXT_clique.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        TXT_clique.setForeground(new java.awt.Color(64, 10, 90));
        TXT_clique.setText("> Clique aqui");
        TXT_clique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXT_cliqueMouseClicked(evt);
            }
        });
        Panel_1.add(TXT_clique, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 170, 70));

        marcad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MarcaDagua.png"))); // NOI18N
        Panel_1.add(marcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -190, 630, 290));

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cancel-48.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Panel_1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButInicioMouseClicked
        MenuInicial minhaTela= new MenuInicial();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButInicioMouseClicked

    private void ButConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButConfigMouseClicked
        Config minhaTela= new Config();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButConfigMouseClicked

    private void ButTxtConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButTxtConfigMouseClicked
        Config minhaTela= new Config();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButTxtConfigMouseClicked

    private void ButCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCarroMouseClicked
        TelaCarros minhaTela= new TelaCarros();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCarroMouseClicked

    private void ButCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCasaMouseClicked
        MenuInicial minhaTela= new MenuInicial();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCasaMouseClicked

    private void ButCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCarMouseClicked
        TelaCarros minhaTela= new TelaCarros();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCarMouseClicked

    private void ButClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButClientesMouseClicked
        TelaClienteNova minhaTela= new TelaClienteNova();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButClientesMouseClicked

    private void ButClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButClientMouseClicked
        TelaClienteNova minhaTela= new TelaClienteNova();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButClientMouseClicked

    private void TXT_cliqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_cliqueMouseClicked
        TelaCarros minhaTela= new TelaCarros();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_TXT_cliqueMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        JOptionPane.showMessageDialog(null,"Locadora Midnight Winx Club agradece a sua visita", "Clube das Winx", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

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
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Config().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButCar;
    private javax.swing.JLabel ButCarro;
    private javax.swing.JLabel ButCasa;
    private javax.swing.JLabel ButClient;
    private javax.swing.JLabel ButClientes;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButTxtConfig;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Panel_1;
    private javax.swing.JPanel Panel_2;
    private javax.swing.JLabel TXT_Inicio;
    private javax.swing.JLabel TXT_clique;
    private javax.swing.JLabel TextoBemV;
    private javax.swing.JLabel TextoCor;
    private javax.swing.JLabel TextoMenu;
    private javax.swing.JLabel Txt_modelos;
    private javax.swing.JLabel Underline;
    private javax.swing.JLabel gif;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marcad;
    // End of variables declaration//GEN-END:variables
}
