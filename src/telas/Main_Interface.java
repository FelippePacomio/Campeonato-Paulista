package telas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main_Interface extends javax.swing.JFrame {

    public Main_Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnJogar = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 102, 0));
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(510, 500, 170, 50);

        btnJogar.setBackground(new java.awt.Color(204, 204, 204));
        btnJogar.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(255, 102, 0));
        btnJogar.setText("JOGAR");
        btnJogar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJogarMouseClicked(evt);
            }
        });
        getContentPane().add(btnJogar);
        btnJogar.setBounds(240, 500, 170, 50);

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paulistao.png"))); // NOI18N
        wallpaper.setText("jLabel1");
        wallpaper.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(wallpaper);
        wallpaper.setBounds(0, 0, 850, 600);

        setSize(new java.awt.Dimension(861, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogarMouseClicked
        try {
            new Oitavas().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Main_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnJogarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
