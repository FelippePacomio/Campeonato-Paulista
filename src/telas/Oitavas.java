package telas;

import java.util.ArrayList;
import java.util.Collections;
import campeonato.Time;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Oitavas extends javax.swing.JFrame {

    ArrayList<Time> times;
    ImageIcon atleticosorocaba, botafogo, cotia, corinthians, ferroviaria, audax, guarani, interlimeira,
            ituano, marilia, mirassol, oeste, palmeiras, pontepreta, bragantino, santoandre, santos, saobernardo, saocaetano,
            saopaulo, piracicaba, aguasanta;

    public Oitavas() throws IOException {
        lerEscudos();
        initComponents();
        timeAleatorio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(10, 10));

        jPanel10.setBackground(new java.awt.Color(87, 87, 87));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("OITAVAS DE FINAL DO CAMPEONATO PAULISTA");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(jLabel25)
                .addContainerGap(435, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel25)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);

        jPanel1.setBackground(new java.awt.Color(87, 87, 87));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setInheritsPopupMenu(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("X");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel26.setText("jLabel26");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(87, 87, 87));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("jLabel1");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel3.setInheritsPopupMenu(false);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("jLabel2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("X");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel27.setText("jLabel27");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(87, 87, 87));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("jLabel1");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.setInheritsPopupMenu(false);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("jLabel2");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("X");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel28.setText("jLabel28");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(87, 87, 87));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("jLabel1");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setInheritsPopupMenu(false);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("jLabel2");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("X");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel29.setText("jLabel29");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(87, 87, 87));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("jLabel1");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel9.setInheritsPopupMenu(false);
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("jLabel2");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("X");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel30.setText("jLabel30");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(87, 87, 87));
        jPanel6.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("jLabel1");
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel11.setInheritsPopupMenu(false);
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("jLabel2");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("X");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel31.setText("jLabel31");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(87, 87, 87));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("jLabel1");
        jLabel13.setToolTipText("");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel13.setInheritsPopupMenu(false);
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("jLabel2");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("X");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel32.setText("jLabel32");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(87, 87, 87));
        jPanel8.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("jLabel1");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel15.setInheritsPopupMenu(false);
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 30, 120, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("jLabel2");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("X");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 33, -1, -1));

        jLabel33.setText("jLabel33");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 5, -1, -1));

        getContentPane().add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(87, 87, 87));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("AVANÇAR >");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 120, 30));

        getContentPane().add(jPanel9);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myInitComponents() {
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(10, 10));

        jPanel10.setBackground(new java.awt.Color(87, 87, 87));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("OITAVAS DE FINAL DO CAMPEONATO PAULISTA");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(426, 426, 426)
                                .addComponent(jLabel25)
                                .addContainerGap(435, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel25)
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);

        jPanel1.setBackground(new java.awt.Color(87, 87, 87));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("X");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 33, -1, -1));

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(87, 87, 87));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel2");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel3)
                                .addGap(438, 438, 438)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel18))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(87, 87, 87));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel1");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel2");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addGap(436, 436, 436)
                                .addComponent(jLabel6)
                                .addGap(150, 150, 150))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel19))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(87, 87, 87));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel1");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel2");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addGap(436, 436, 436)
                                .addComponent(jLabel8)
                                .addGap(150, 150, 150))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel20))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(87, 87, 87));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel1");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel2");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("X");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addGap(435, 435, 435)
                                .addComponent(jLabel10)
                                .addGap(150, 150, 150))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel21))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(87, 87, 87));
        jPanel6.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel2");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("X");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(435, 435, 435)
                                .addComponent(jLabel12)
                                .addGap(150, 150, 150))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel22))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(87, 87, 87));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel1");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel2");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("X");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(435, 435, 435)
                                .addComponent(jLabel14)
                                .addGap(150, 150, 150))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel23))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(87, 87, 87));
        jPanel8.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("jLabel1");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("jLabel2");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("X");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addGap(435, 435, 435)
                                .addComponent(jLabel16)
                                .addGap(150, 150, 150))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel24))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(87, 87, 87));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("AVANÇAR >");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(573, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(569, 569, 569))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9);

        pack();
        setLocationRelativeTo(null);
    }

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

    private void timeAleatorio() {
        Random random = new Random();
        List<Integer> indicesSelecionados = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            int indiceAleatorio;
            do {
                indiceAleatorio = random.nextInt(times.size());
            } while (indicesSelecionados.contains(indiceAleatorio));

            indicesSelecionados.add(indiceAleatorio);
        }

        jLabel26.setIcon(times.get(indicesSelecionados.get(0)).getEmblema());
        jLabel26.setText("");
        jLabel1.setText(times.get(indicesSelecionados.get(0)).getNome());
        jLabel2.setIcon(times.get(indicesSelecionados.get(1)).getEmblema());
        jLabel2.setText(times.get(indicesSelecionados.get(1)).getNome());
        jLabel27.setIcon(times.get(indicesSelecionados.get(2)).getEmblema());
        jLabel27.setText("");
        jLabel3.setText(times.get(indicesSelecionados.get(2)).getNome());
        jLabel4.setIcon(times.get(indicesSelecionados.get(3)).getEmblema());
        jLabel4.setText(times.get(indicesSelecionados.get(3)).getNome());
        jLabel28.setIcon(times.get(indicesSelecionados.get(4)).getEmblema());
        jLabel28.setText("");
        jLabel5.setText(times.get(indicesSelecionados.get(4)).getNome());
        jLabel6.setIcon(times.get(indicesSelecionados.get(5)).getEmblema());
        jLabel6.setText(times.get(indicesSelecionados.get(5)).getNome());
        jLabel29.setIcon(times.get(indicesSelecionados.get(6)).getEmblema());
        jLabel29.setText("");
        jLabel7.setText(times.get(indicesSelecionados.get(6)).getNome());
        jLabel8.setIcon(times.get(indicesSelecionados.get(7)).getEmblema());
        jLabel8.setText(times.get(indicesSelecionados.get(7)).getNome());
        jLabel30.setIcon(times.get(indicesSelecionados.get(8)).getEmblema());
        jLabel30.setText("");
        jLabel9.setText(times.get(indicesSelecionados.get(8)).getNome());
        jLabel10.setIcon(times.get(indicesSelecionados.get(9)).getEmblema());
        jLabel10.setText(times.get(indicesSelecionados.get(9)).getNome());
        jLabel31.setIcon(times.get(indicesSelecionados.get(10)).getEmblema());
        jLabel31.setText("");
        jLabel11.setText(times.get(indicesSelecionados.get(10)).getNome());
        jLabel12.setIcon(times.get(indicesSelecionados.get(11)).getEmblema());
        jLabel12.setText(times.get(indicesSelecionados.get(11)).getNome());
        jLabel32.setIcon(times.get(indicesSelecionados.get(12)).getEmblema());
        jLabel32.setText("");
        jLabel13.setText(times.get(indicesSelecionados.get(12)).getNome());
        jLabel14.setIcon(times.get(indicesSelecionados.get(13)).getEmblema());
        jLabel14.setText(times.get(indicesSelecionados.get(13)).getNome());
        jLabel33.setIcon(times.get(indicesSelecionados.get(14)).getEmblema());
        jLabel33.setText("");
        jLabel15.setText(times.get(indicesSelecionados.get(14)).getNome());
        jLabel16.setIcon(times.get(indicesSelecionados.get(15)).getEmblema());
        jLabel16.setText(times.get(indicesSelecionados.get(15)).getNome());
        placarAleatorio();
    }

    public void placarAleatorio() {
        Random random = new Random();
        List<Integer> placarVisitante = new ArrayList<>();
        List<Integer> placarCasa = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            placarVisitante.add(random.nextInt(6));
            placarCasa.add(random.nextInt(6));
        }
        jLabel17.setText(String.valueOf(placarVisitante.get(0)) + "    x    " + String.valueOf(placarCasa.get(0)));
        jLabel18.setText(String.valueOf(placarVisitante.get(1)) + "    x    " + String.valueOf(placarCasa.get(1)));
        jLabel19.setText(String.valueOf(placarVisitante.get(2)) + "    x    " + String.valueOf(placarCasa.get(2)));
        jLabel20.setText(String.valueOf(placarVisitante.get(3)) + "    x    " + String.valueOf(placarCasa.get(3)));
        jLabel21.setText(String.valueOf(placarVisitante.get(4)) + "    x    " + String.valueOf(placarCasa.get(4)));
        jLabel22.setText(String.valueOf(placarVisitante.get(5)) + "    x    " + String.valueOf(placarCasa.get(5)));
        jLabel23.setText(String.valueOf(placarVisitante.get(6)) + "    x    " + String.valueOf(placarCasa.get(6)));
        jLabel24.setText(String.valueOf(placarVisitante.get(7)) + "    x    " + String.valueOf(placarCasa.get(7)));

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Oitavas().setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(Oitavas.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
