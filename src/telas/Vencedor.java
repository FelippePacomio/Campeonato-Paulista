package telas;

import campeonato.Placar;
import java.util.ArrayList;
import java.util.Collections;
import campeonato.Time;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Vencedor extends javax.swing.JFrame {

    ArrayList<Time> times;
    ImageIcon atleticosorocaba, botafogo, cotia, corinthians, ferroviaria, audax, guarani, interlimeira,
            ituano, marilia, mirassol, oeste, palmeiras, pontepreta, bragantino, santoandre, santos, saobernardo, saocaetano,
            saopaulo, piracicaba, aguasanta;

    public Vencedor() throws IOException {
        lerEscudos();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        wallpaperjLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 153));
        jScrollPane1.setForeground(new java.awt.Color(51, 0, 153));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setHorizontalScrollBar(null);

        jLayeredPane1.setBackground(new java.awt.Color(255, 0, 51));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1280, 800));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wallpaperjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wallpaperjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pxfuel2.jpg"))); // NOI18N
        wallpaperjLabel.setText("\n");
        wallpaperjLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wallpaperjLabel.setPreferredSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setLayer(wallpaperjLabel, -1);
        jLayeredPane1.add(wallpaperjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 770));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 1280, 50));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Paulistão_sicred_2023 (1).png"))); // NOI18N
        jLayeredPane1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 64));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trophy.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 170, 150));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel1");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 200, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/golden-volumetric-3d-text-of-the-inscription-congratulations-isolated-cut-out-png.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel4");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 200, -1));

        jButton1.setBackground(new java.awt.Color(144, 69, 5));
        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAIR >");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 730, 120, 30));

        jScrollPane1.setViewportView(jLayeredPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lerEscudos() throws IOException {
        BufferedImage img = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Atlético_Sorocaba-SP.png"));
        BufferedImage img2 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Botafogo-SP.png"));
        BufferedImage img3 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Corinthians-BRA.png"));
        BufferedImage img4 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Ferroviária-SP.png"));
        BufferedImage img5 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Grêmio_Osasco_Audax-SP.png"));
        BufferedImage img6 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Guarani-SP.png"));
        BufferedImage img7 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Inter de Limeira-SP HD.png"));
        BufferedImage img8 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Ituano.png"));
        BufferedImage img9 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Marília HD_SP.png"));
        BufferedImage img10 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Mirassol-SP HD.png"));
        BufferedImage img11 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Oeste-SP.png"));
        BufferedImage img12 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Palmeiras-BRA.png"));
        BufferedImage img13 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Ponte Preta HD-SP.png"));
        BufferedImage img14 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Red Bull Bragantino (HD).png"));
        BufferedImage img15 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Santo André-SP HD.png"));
        BufferedImage img16 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Santos-SP.png"));
        BufferedImage img17 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\São Bernardo-SP HD.png"));
        BufferedImage img18 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\São Caetano-BRA.png"));
        BufferedImage img19 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\São Paulo_SP.png"));
        BufferedImage img20 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\XV de Piracicaba-SP HD.png"));
        BufferedImage img21 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Água Santa-SP.png"));
        BufferedImage img22 = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Cotia-SP.png"));
        atleticosorocaba = new ImageIcon(img);
        botafogo = new ImageIcon(img2);
        cotia = new ImageIcon(img22);
        corinthians = new ImageIcon(img3);
        ferroviaria = new ImageIcon(img4);
        audax = new ImageIcon(img5);
        guarani = new ImageIcon(img6);
        interlimeira = new ImageIcon(img7);
        ituano = new ImageIcon(img8);
        marilia = new ImageIcon(img9);
        mirassol = new ImageIcon(img10);
        oeste = new ImageIcon(img11);
        palmeiras = new ImageIcon(img12);
        pontepreta = new ImageIcon(img13);
        bragantino = new ImageIcon(img14);
        santoandre = new ImageIcon(img15);
        santos = new ImageIcon(img16);
        saobernardo = new ImageIcon(img17);
        saocaetano = new ImageIcon(img18);
        saopaulo = new ImageIcon(img19);
        piracicaba = new ImageIcon(img20);
        aguasanta = new ImageIcon(img21);
        criarTimes();
    }

    private void criarTimes() throws IOException {
        times = new ArrayList();
        times.add(new Time("Atlético Sorocaba", atleticosorocaba));
        times.add(new Time("Botafogo-SP", botafogo));
        times.add(new Time("Cotia", cotia));
        times.add(new Time("Corinthians", corinthians));
        times.add(new Time("Ferroviária", ferroviaria));
        times.add(new Time("Audax", audax));
        times.add(new Time("Guarani", guarani));
        times.add(new Time("Inter de Limeira", interlimeira));
        times.add(new Time("Ituano", ituano));
        times.add(new Time("Marília-SP", marilia));
        times.add(new Time("Mirassol", mirassol));
        times.add(new Time("Oeste", oeste));
        times.add(new Time("Palmeiras", palmeiras));
        times.add(new Time("Ponte Preta", pontepreta));
        times.add(new Time("Red Bull Bragantino", bragantino));
        times.add(new Time("Santo André", santoandre));
        times.add(new Time("Santos", santos));
        times.add(new Time("São Bernardo", saobernardo));
        times.add(new Time("São Caetano", saocaetano));
        times.add(new Time("São Paulo", saopaulo));
        times.add(new Time("XV de Piracicaba", piracicaba));
        times.add(new Time("Água Santa", aguasanta));
        Collections.shuffle(times);
    }

    public void timeVencedor(ArrayList<Placar> placares, ArrayList<Time> times) throws IOException {

        jLabel6.setText(times.get(0).getVencedor());
        jLabel3.setIcon(times.get(0).getEscudo());
        jLabel3.setText("");
         jLabel5.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Vencedor().setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(Vencedor.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel wallpaperjLabel;
    // End of variables declaration//GEN-END:variables
}
