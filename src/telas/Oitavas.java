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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        wallpaperjLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(255, 0, 51));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wallpaperjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wallpaperjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpaper.jpg"))); // NOI18N
        wallpaperjLabel.setText("\n");
        wallpaperjLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wallpaperjLabel.setPreferredSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setLayer(wallpaperjLabel, -1);
        jLayeredPane1.add(wallpaperjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 690));

        jPanel1.setBackground(new java.awt.Color(87, 87, 87));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setInheritsPopupMenu(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 410, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("X");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 28, 200, -1));

        jLabel26.setText("jLabel26");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel12.setBackground(new java.awt.Color(255, 102, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 80));

        jPanel2.setBackground(new java.awt.Color(87, 87, 87));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("jLabel1");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel3.setInheritsPopupMenu(false);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 230, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("jLabel2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 8, -1, -1));

        jLabel27.setText("jLabel27");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, -1, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel27.setBackground(new java.awt.Color(255, 102, 0));
        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("X");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );

        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1280, 80));

        jPanel3.setBackground(new java.awt.Color(87, 87, 87));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("jLabel1");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.setInheritsPopupMenu(false);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("jLabel2");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 8, -1, -1));

        jLabel28.setText("jLabel28");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, -1, -1));

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel28.setBackground(new java.awt.Color(255, 102, 0));
        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("X");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19))
        );

        jPanel3.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1280, 80));

        jPanel4.setBackground(new java.awt.Color(87, 87, 87));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("jLabel1");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setInheritsPopupMenu(false);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 250, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("jLabel2");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 8, -1, -1));

        jLabel29.setText("jLabel29");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, -1, -1));

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel29.setBackground(new java.awt.Color(255, 102, 0));
        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("X");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1280, 80));

        jPanel5.setBackground(new java.awt.Color(87, 87, 87));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("jLabel1");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel9.setInheritsPopupMenu(false);
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("jLabel2");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 8, -1, -1));

        jLabel30.setText("jLabel30");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, -1, -1));

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel30.setBackground(new java.awt.Color(255, 102, 0));
        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("X");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1280, 80));

        jPanel6.setBackground(new java.awt.Color(87, 87, 87));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("jLabel1");
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel11.setInheritsPopupMenu(false);
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 240, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("jLabel2");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 8, -1, -1));

        jLabel31.setText("jLabel31");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, -1, -1));

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel31.setBackground(new java.awt.Color(255, 102, 0));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("X");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel22))
        );

        jPanel6.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1280, 80));

        jPanel7.setBackground(new java.awt.Color(87, 87, 87));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("jLabel1");
        jLabel13.setToolTipText("");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel13.setInheritsPopupMenu(false);
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 230, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("jLabel2");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 8, -1, -1));

        jLabel32.setText("jLabel32");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, -1, -1));

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel32.setBackground(new java.awt.Color(255, 102, 0));
        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("X");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23))
        );

        jPanel7.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1280, 80));

        jPanel8.setBackground(new java.awt.Color(87, 87, 87));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("jLabel1");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel15.setInheritsPopupMenu(false);
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 220, -1));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("jLabel2");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 8, -1, -1));

        jLabel33.setText("jLabel33");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, -1, -1));

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel33.setBackground(new java.awt.Color(255, 102, 0));
        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("X");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24))
        );

        jPanel8.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jLayeredPane1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1280, 80));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("AVANÇAR >");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 120, 30));

        jLayeredPane1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1280, 50));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel wallpaperjLabel;
    // End of variables declaration//GEN-END:variables
}
