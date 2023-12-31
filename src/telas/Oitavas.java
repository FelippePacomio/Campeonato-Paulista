package telas;

import campeonato.Placar;
import java.util.ArrayList;
import java.util.Collections;
import campeonato.Time;
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

    Quartas quartas = new Quartas();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        wallpaperjLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        time1jLabel = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
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
        wallpaperjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pxfuel.jpg"))); // NOI18N
        wallpaperjLabel.setText("\n");
        wallpaperjLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        wallpaperjLabel.setPreferredSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setLayer(wallpaperjLabel, -1);
        jLayeredPane1.add(wallpaperjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 770));

        jPanel1.setBackground(new java.awt.Color(87, 87, 87));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setInheritsPopupMenu(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 410, -1));

        jLabel26.setText("jLabel26");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel10.setBackground(new java.awt.Color(51, 0, 153));
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

        jPanel11.setBackground(new java.awt.Color(51, 0, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("X");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel35.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 0, 153));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText("PN");
        jPanel68.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel64.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 0, 153));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("PN");
        jPanel68.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel65.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 0, 153));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("PN");
        jPanel68.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel1.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1280, 80));

        jPanel2.setBackground(new java.awt.Color(87, 87, 87));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setText("jLabel27");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("jLabel34");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel13.setBackground(new java.awt.Color(51, 0, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        time1jLabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        time1jLabel.setForeground(new java.awt.Color(255, 255, 255));
        time1jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time1jLabel.setText("jLabel1");
        time1jLabel.setToolTipText("");
        time1jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        time1jLabel.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(time1jLabel))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel20.setBackground(new java.awt.Color(51, 0, 153));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel2");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jPanel2.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 153));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("X");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel44.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 0, 153));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("PN");
        jPanel62.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel46.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 0, 153));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("PN");
        jPanel62.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel47.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 0, 153));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("PN");
        jPanel62.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel2.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1280, 80));

        jPanel3.setBackground(new java.awt.Color(87, 87, 87));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("jLabel28");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("jLabel25");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel21.setBackground(new java.awt.Color(51, 0, 153));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel40.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("jLabel40");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel40))
        );

        jPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel14.setBackground(new java.awt.Color(51, 0, 153));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel1");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 0, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("X");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel45.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 0, 153));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("PN");
        jPanel60.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel43.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 0, 153));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("PN");
        jPanel60.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel44.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 0, 153));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("PN");
        jPanel60.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel3.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1280, 80));

        jPanel4.setBackground(new java.awt.Color(87, 87, 87));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("jLabel29");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("jLabel39");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel15.setBackground(new java.awt.Color(51, 0, 153));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel1");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel22.setBackground(new java.awt.Color(51, 0, 153));
        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel2");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jPanel4.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 0, 153));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("X");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel57.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jPanel67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 0, 153));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText("PN");
        jPanel67.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel61.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 0, 153));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("PN");
        jPanel67.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel62.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 0, 153));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("PN");
        jPanel67.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel4.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1280, 80));

        jPanel5.setBackground(new java.awt.Color(87, 87, 87));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setText("jLabel30");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("jLabel38");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel16.setBackground(new java.awt.Color(51, 0, 153));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel1");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel23.setBackground(new java.awt.Color(51, 0, 153));
        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("jLabel2");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jPanel5.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 0, 153));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("X");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel46.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 0, 153));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel57.setText("PN");
        jPanel66.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel58.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 0, 153));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("PN");
        jPanel66.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel59.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 0, 153));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("PN");
        jPanel66.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel5.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1280, 80));

        jPanel6.setBackground(new java.awt.Color(87, 87, 87));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("jLabel31");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("jLabel37");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel17.setBackground(new java.awt.Color(51, 0, 153));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("jLabel1");
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel24.setBackground(new java.awt.Color(51, 0, 153));
        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("jLabel2");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jPanel6.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("X");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel47.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 0, 153));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel54.setText("PN");
        jPanel65.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel55.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 0, 153));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("PN");
        jPanel65.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel56.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 0, 153));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("PN");
        jPanel65.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel6.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1280, 80));

        jPanel7.setBackground(new java.awt.Color(87, 87, 87));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("jLabel1");
        jLabel13.setToolTipText("");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setInheritsPopupMenu(false);
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 410, -1));

        jLabel32.setText("jLabel32");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("jLabel36");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel18.setBackground(new java.awt.Color(51, 0, 153));
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

        jPanel25.setBackground(new java.awt.Color(51, 0, 153));
        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel2");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14))
        );

        jPanel7.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 0, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("X");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel48.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 0, 153));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("PN");
        jPanel64.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel52.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 0, 153));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("PN");
        jPanel64.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel53.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 0, 153));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("PN");
        jPanel64.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel7.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1280, 80));

        jPanel8.setBackground(new java.awt.Color(87, 87, 87));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("jLabel33");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("jLabel35");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 7, -1, -1));

        jPanel19.setBackground(new java.awt.Color(51, 0, 153));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("jLabel1");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel15.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        jPanel8.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 28, 410, 25));

        jPanel26.setBackground(new java.awt.Color(51, 0, 153));
        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("jLabel2");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16))
        );

        jPanel8.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 28, 450, 25));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 0, 153));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("X");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 28, 230, 25));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 48, 450, 8));

        jPanel49.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 48, 233, 8));

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 410, 8));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 0, 153));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("PN");
        jPanel63.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jLabel49.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 0, 153));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("PN");
        jPanel63.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jLabel50.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 0, 153));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("PN");
        jPanel63.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        jPanel8.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 60, 110, 22));

        jLayeredPane1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1280, 80));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 1280, 50));

        jPanel58.setOpaque(false);
        jPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Paulistão_sicred_2023 (1).png"))); // NOI18N
        jPanel58.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 64));

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel58.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 312, 4));

        jPanel59.setBackground(new java.awt.Color(51, 0, 153));
        jPanel59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel59.setForeground(new java.awt.Color(51, 0, 153));

        jLabel6.setBackground(new java.awt.Color(255, 102, 0));
        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("OITAVAS DE FINAL");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel58.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLayeredPane1.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 80));

        jButton1.setBackground(new java.awt.Color(51, 0, 153));
        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AVANÇAR >");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 730, 120, 30));

        jScrollPane1.setViewportView(jLayeredPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        quartas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

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

    private void timeAleatorio() throws IOException {
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
        jLabel3.setIcon(times.get(indicesSelecionados.get(1)).getEmblema());
        jLabel3.setText("");
        jLabel2.setText(times.get(indicesSelecionados.get(1)).getNome());
        jLabel27.setIcon(times.get(indicesSelecionados.get(2)).getEmblema());
        jLabel27.setText("");
        time1jLabel.setText(times.get(indicesSelecionados.get(2)).getNome());
        jLabel34.setIcon(times.get(indicesSelecionados.get(3)).getEmblema());
        jLabel34.setText("");
        jLabel4.setText(times.get(indicesSelecionados.get(3)).getNome());
        jLabel28.setIcon(times.get(indicesSelecionados.get(4)).getEmblema());
        jLabel28.setText("");
        jLabel5.setText(times.get(indicesSelecionados.get(4)).getNome());
        jLabel25.setIcon(times.get(indicesSelecionados.get(5)).getEmblema());
        jLabel25.setText("");
        jLabel40.setText(times.get(indicesSelecionados.get(5)).getNome());
        jLabel29.setIcon(times.get(indicesSelecionados.get(6)).getEmblema());
        jLabel29.setText("");
        jLabel7.setText(times.get(indicesSelecionados.get(6)).getNome());
        jLabel39.setIcon(times.get(indicesSelecionados.get(7)).getEmblema());
        jLabel39.setText("");
        jLabel8.setText(times.get(indicesSelecionados.get(7)).getNome());
        jLabel30.setIcon(times.get(indicesSelecionados.get(8)).getEmblema());
        jLabel30.setText("");
        jLabel9.setText(times.get(indicesSelecionados.get(8)).getNome());
        jLabel38.setIcon(times.get(indicesSelecionados.get(9)).getEmblema());
        jLabel38.setText("");
        jLabel10.setText(times.get(indicesSelecionados.get(9)).getNome());
        jLabel31.setIcon(times.get(indicesSelecionados.get(10)).getEmblema());
        jLabel31.setText("");
        jLabel11.setText(times.get(indicesSelecionados.get(10)).getNome());
        jLabel37.setIcon(times.get(indicesSelecionados.get(11)).getEmblema());
        jLabel37.setText("");
        jLabel12.setText(times.get(indicesSelecionados.get(11)).getNome());
        jLabel32.setIcon(times.get(indicesSelecionados.get(12)).getEmblema());
        jLabel32.setText("");
        jLabel13.setText(times.get(indicesSelecionados.get(12)).getNome());
        jLabel36.setIcon(times.get(indicesSelecionados.get(13)).getEmblema());
        jLabel36.setText("");
        jLabel14.setText(times.get(indicesSelecionados.get(13)).getNome());
        jLabel33.setIcon(times.get(indicesSelecionados.get(14)).getEmblema());
        jLabel33.setText("");
        jLabel15.setText(times.get(indicesSelecionados.get(14)).getNome());
        jLabel35.setIcon(times.get(indicesSelecionados.get(15)).getEmblema());
        jLabel35.setText("");
        jLabel16.setText(times.get(indicesSelecionados.get(15)).getNome());
        placarAleatorio();
    }

    public void placarAleatorio() throws IOException {

        int escolha = 0;
        ArrayList<Placar> placares = new ArrayList<Placar>();
        for (int i = 0; i < 8; i++) {
            Placar placar = new Placar();
            placares.add(placar);
        }
        jLabel17.setText(String.valueOf(placares.get(0).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(0).getPlacarCasa()));
        jLabel18.setText(String.valueOf(placares.get(1).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(1).getPlacarCasa()));
        jLabel19.setText(String.valueOf(placares.get(2).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(2).getPlacarCasa()));
        jLabel20.setText(String.valueOf(placares.get(3).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(3).getPlacarCasa()));
        jLabel21.setText(String.valueOf(placares.get(4).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(4).getPlacarCasa()));
        jLabel22.setText(String.valueOf(placares.get(5).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(5).getPlacarCasa()));
        jLabel23.setText(String.valueOf(placares.get(6).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(6).getPlacarCasa()));
        jLabel24.setText(String.valueOf(placares.get(7).getPlacarVisitante()) + "    x    " + String.valueOf(placares.get(7).getPlacarCasa()));
        jPanel60.setVisible(false);
        jPanel62.setVisible(false);
        jPanel63.setVisible(false);
        jPanel64.setVisible(false);
        jPanel65.setVisible(false);
        jPanel66.setVisible(false);
        jPanel67.setVisible(false);
        jPanel68.setVisible(false);
        placarPenaltis(placares, escolha);
    }

    public void placarPenaltis(ArrayList<Placar> placares, int escolha) throws IOException {
        Random random = new Random();
        ArrayList<Time> times = new ArrayList<Time>();
        for (int i = 0; i < 8; i++) {
            Time time = new Time();
            times.add(time);
        }
        if (placares.get(0).getPlacarVisitante() == placares.get(0).getPlacarCasa()) {
            jPanel68.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel63.setText("5");
                    jLabel65.setText("4");
                    times.get(0).setVencedor(jLabel1.getText());
                    times.get(0).setEscudo(jLabel26.getIcon());
                    break;
                case 2:
                    jLabel63.setText("4");
                    jLabel65.setText("5");
                    times.get(0).setVencedor(jLabel2.getText());
                    times.get(0).setEscudo(jLabel3.getIcon());
                    break;
                case 3:
                    jLabel63.setText("6");
                    jLabel65.setText("5");
                    times.get(0).setVencedor(jLabel1.getText());
                    times.get(0).setEscudo(jLabel26.getIcon());
                    break;
                case 4:
                    jLabel63.setText("5");
                    jLabel65.setText("6");
                    times.get(0).setVencedor(jLabel2.getText());
                    times.get(0).setEscudo(jLabel3.getIcon());
                    break;
                case 5:
                    jLabel63.setText("4");
                    jLabel65.setText("3");
                    times.get(0).setVencedor(jLabel1.getText());
                    times.get(0).setEscudo(jLabel26.getIcon());
                    break;
                case 6:
                    jLabel63.setText("3");
                    jLabel65.setText("4");
                    times.get(0).setVencedor(jLabel2.getText());
                    times.get(0).setEscudo(jLabel3.getIcon());
                    break;
                case 7:
                    jLabel63.setText("7");
                    jLabel65.setText("6");
                    times.get(0).setVencedor(jLabel1.getText());
                    times.get(0).setEscudo(jLabel26.getIcon());
                    break;
                case 8:
                    jLabel63.setText("6");
                    jLabel65.setText("7");
                    times.get(0).setVencedor(jLabel2.getText());
                    times.get(0).setEscudo(jLabel3.getIcon());
                    break;
                case 9:
                    jLabel63.setText("3");
                    jLabel65.setText("0");
                    times.get(0).setVencedor(jLabel1.getText());
                    times.get(0).setEscudo(jLabel26.getIcon());
                    break;
                case 10:
                    jLabel63.setText("0");
                    jLabel65.setText("3");
                    times.get(0).setVencedor(jLabel2.getText());
                    times.get(0).setEscudo(jLabel3.getIcon());
                    break;
            }

        }

        if (placares.get(1).getPlacarVisitante() == placares.get(1).getPlacarCasa()) {
            jPanel62.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel45.setText("5");
                    jLabel47.setText("4");
                    times.get(1).setVencedor(time1jLabel.getText());
                    times.get(1).setEscudo(jLabel27.getIcon());
                    break;
                case 2:
                    jLabel45.setText("4");
                    jLabel47.setText("5");
                    times.get(1).setVencedor(jLabel4.getText());
                    times.get(1).setEscudo(jLabel34.getIcon());
                    break;
                case 3:
                    jLabel45.setText("6");
                    jLabel47.setText("5");
                    times.get(1).setVencedor(time1jLabel.getText());
                    times.get(1).setEscudo(jLabel27.getIcon());
                    break;
                case 4:
                    jLabel45.setText("5");
                    jLabel47.setText("6");
                    times.get(1).setVencedor(jLabel4.getText());
                    times.get(1).setEscudo(jLabel34.getIcon());
                    break;
                case 5:
                    jLabel45.setText("4");
                    jLabel47.setText("3");
                    times.get(1).setVencedor(time1jLabel.getText());
                    times.get(1).setEscudo(jLabel27.getIcon());
                    break;
                case 6:
                    jLabel45.setText("3");
                    jLabel47.setText("4");
                    times.get(1).setVencedor(jLabel4.getText());
                    times.get(1).setEscudo(jLabel34.getIcon());
                    break;
                case 7:
                    jLabel45.setText("7");
                    jLabel47.setText("6");
                    times.get(1).setVencedor(time1jLabel.getText());
                    times.get(1).setEscudo(jLabel27.getIcon());
                    break;
                case 8:
                    jLabel45.setText("6");
                    jLabel47.setText("7");
                    times.get(1).setVencedor(jLabel4.getText());
                    times.get(1).setEscudo(jLabel34.getIcon());
                    break;
                case 9:
                    jLabel45.setText("3");
                    jLabel47.setText("0");
                    times.get(1).setVencedor(time1jLabel.getText());
                    times.get(1).setEscudo(jLabel27.getIcon());
                    break;
                case 10:
                    jLabel45.setText("0");
                    jLabel47.setText("3");
                    times.get(1).setVencedor(jLabel4.getText());
                    times.get(1).setEscudo(jLabel34.getIcon());
                    break;
            }
        }

        if (placares.get(2).getPlacarVisitante() == placares.get(2).getPlacarCasa()) {
            jPanel60.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel42.setText("5");
                    jLabel44.setText("4");
                    times.get(2).setVencedor(jLabel5.getText());
                    times.get(2).setEscudo(jLabel28.getIcon());
                    break;
                case 2:
                    jLabel42.setText("4");
                    jLabel44.setText("5");
                    times.get(2).setVencedor(jLabel40.getText());
                    times.get(2).setEscudo(jLabel25.getIcon());
                    break;
                case 3:
                    jLabel42.setText("6");
                    jLabel44.setText("5");
                    times.get(2).setVencedor(jLabel5.getText());
                    times.get(2).setEscudo(jLabel28.getIcon());
                    break;
                case 4:
                    jLabel42.setText("5");
                    jLabel44.setText("6");
                    times.get(2).setVencedor(jLabel40.getText());
                    times.get(2).setEscudo(jLabel25.getIcon());
                    break;
                case 5:
                    jLabel42.setText("4");
                    jLabel44.setText("3");
                    times.get(2).setVencedor(jLabel5.getText());
                    times.get(2).setEscudo(jLabel28.getIcon());
                    break;
                case 6:
                    jLabel42.setText("3");
                    jLabel44.setText("4");
                    times.get(2).setVencedor(jLabel40.getText());
                    times.get(2).setEscudo(jLabel25.getIcon());
                    break;
                case 7:
                    jLabel42.setText("7");
                    jLabel44.setText("6");
                    times.get(2).setVencedor(jLabel5.getText());
                    times.get(2).setEscudo(jLabel28.getIcon());
                    break;
                case 8:
                    jLabel42.setText("6");
                    jLabel44.setText("7");
                    times.get(2).setVencedor(jLabel40.getText());
                    times.get(2).setEscudo(jLabel25.getIcon());
                    break;
                case 9:
                    jLabel42.setText("3");
                    jLabel44.setText("0");
                    times.get(2).setVencedor(jLabel5.getText());
                    times.get(2).setEscudo(jLabel28.getIcon());
                    break;
                case 10:
                    jLabel42.setText("0");
                    jLabel44.setText("3");
                    times.get(2).setVencedor(jLabel40.getText());
                    times.get(2).setEscudo(jLabel25.getIcon());
                    break;
            }
        }

        if (placares.get(3).getPlacarVisitante() == placares.get(3).getPlacarCasa()) {
            jPanel67.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel60.setText("5");
                    jLabel62.setText("4");
                    times.get(3).setVencedor(jLabel7.getText());
                    times.get(3).setEscudo(jLabel29.getIcon());
                    break;
                case 2:
                    jLabel60.setText("4");
                    jLabel62.setText("5");
                    times.get(3).setVencedor(jLabel8.getText());
                    times.get(3).setEscudo(jLabel39.getIcon());
                    break;
                case 3:
                    jLabel60.setText("6");
                    jLabel62.setText("5");
                    times.get(3).setVencedor(jLabel7.getText());
                    times.get(3).setEscudo(jLabel29.getIcon());
                    break;
                case 4:
                    jLabel60.setText("5");
                    jLabel62.setText("6");
                    times.get(3).setVencedor(jLabel8.getText());
                    times.get(3).setEscudo(jLabel39.getIcon());
                    break;
                case 5:
                    jLabel60.setText("4");
                    jLabel62.setText("3");
                    times.get(3).setVencedor(jLabel7.getText());
                    times.get(3).setEscudo(jLabel29.getIcon());
                    break;
                case 6:
                    jLabel60.setText("3");
                    jLabel62.setText("4");
                    times.get(3).setVencedor(jLabel8.getText());
                    times.get(3).setEscudo(jLabel39.getIcon());
                    break;
                case 7:
                    jLabel60.setText("7");
                    jLabel62.setText("6");
                    times.get(3).setVencedor(jLabel7.getText());
                    times.get(3).setEscudo(jLabel29.getIcon());
                    break;
                case 8:
                    jLabel60.setText("6");
                    jLabel62.setText("7");
                    times.get(3).setVencedor(jLabel8.getText());
                    times.get(3).setEscudo(jLabel39.getIcon());
                    break;
                case 9:
                    jLabel60.setText("3");
                    jLabel62.setText("0");
                    times.get(3).setVencedor(jLabel7.getText());
                    times.get(3).setEscudo(jLabel29.getIcon());
                    break;
                case 10:
                    jLabel60.setText("0");
                    jLabel62.setText("3");
                    times.get(3).setVencedor(jLabel8.getText());
                    times.get(3).setEscudo(jLabel39.getIcon());
                    break;
            }
        }

        if (placares.get(4).getPlacarVisitante() == placares.get(4).getPlacarCasa()) {
            jPanel66.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel57.setText("5");
                    jLabel59.setText("4");
                    times.get(4).setVencedor(jLabel9.getText());
                    times.get(4).setEscudo(jLabel30.getIcon());
                    break;
                case 2:
                    jLabel57.setText("4");
                    jLabel59.setText("5");
                    times.get(4).setVencedor(jLabel10.getText());
                    times.get(4).setEscudo(jLabel38.getIcon());
                    break;
                case 3:
                    jLabel57.setText("6");
                    jLabel59.setText("5");
                    times.get(4).setVencedor(jLabel9.getText());
                    times.get(4).setEscudo(jLabel30.getIcon());
                    break;
                case 4:
                    jLabel57.setText("5");
                    jLabel59.setText("6");
                    times.get(4).setVencedor(jLabel10.getText());
                    times.get(4).setEscudo(jLabel38.getIcon());
                    break;
                case 5:
                    jLabel57.setText("4");
                    jLabel59.setText("3");
                    times.get(4).setVencedor(jLabel9.getText());
                    times.get(4).setEscudo(jLabel30.getIcon());
                    break;
                case 6:
                    jLabel57.setText("3");
                    jLabel59.setText("4");
                    times.get(4).setVencedor(jLabel10.getText());
                    times.get(4).setEscudo(jLabel38.getIcon());
                    break;
                case 7:
                    jLabel57.setText("7");
                    jLabel59.setText("6");
                    times.get(4).setVencedor(jLabel9.getText());
                    times.get(4).setEscudo(jLabel30.getIcon());
                    break;
                case 8:
                    jLabel57.setText("6");
                    jLabel59.setText("7");
                    times.get(4).setVencedor(jLabel10.getText());
                    times.get(4).setEscudo(jLabel38.getIcon());
                    break;
                case 9:
                    jLabel57.setText("3");
                    jLabel59.setText("0");
                    times.get(4).setVencedor(jLabel9.getText());
                    times.get(4).setEscudo(jLabel30.getIcon());
                    break;
                case 10:
                    jLabel57.setText("0");
                    jLabel59.setText("3");
                    times.get(4).setVencedor(jLabel10.getText());
                    times.get(4).setEscudo(jLabel38.getIcon());
                    break;
            }
        }

        if (placares.get(5).getPlacarVisitante() == placares.get(5).getPlacarCasa()) {
            jPanel65.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel54.setText("5");
                    jLabel56.setText("4");
                    times.get(5).setVencedor(jLabel11.getText());
                    times.get(5).setEscudo(jLabel31.getIcon());
                    break;
                case 2:
                    jLabel54.setText("4");
                    jLabel56.setText("5");
                    times.get(5).setVencedor(jLabel12.getText());
                    times.get(5).setEscudo(jLabel37.getIcon());
                    break;
                case 3:
                    jLabel54.setText("6");
                    jLabel56.setText("5");
                    times.get(5).setVencedor(jLabel11.getText());
                    times.get(5).setEscudo(jLabel31.getIcon());

                    break;
                case 4:
                    jLabel54.setText("5");
                    jLabel56.setText("6");
                    times.get(5).setVencedor(jLabel12.getText());
                    times.get(5).setEscudo(jLabel37.getIcon());
                    break;
                case 5:
                    jLabel54.setText("4");
                    jLabel56.setText("3");
                    times.get(5).setVencedor(jLabel11.getText());
                    times.get(5).setEscudo(jLabel31.getIcon());
                    break;
                case 6:
                    jLabel54.setText("3");
                    jLabel56.setText("4");
                    times.get(5).setVencedor(jLabel12.getText());
                    times.get(5).setEscudo(jLabel37.getIcon());
                    break;
                case 7:
                    jLabel54.setText("7");
                    jLabel56.setText("6");
                    times.get(5).setVencedor(jLabel11.getText());
                    times.get(5).setEscudo(jLabel31.getIcon());
                    break;
                case 8:
                    jLabel54.setText("6");
                    jLabel56.setText("7");
                    times.get(5).setVencedor(jLabel12.getText());
                    times.get(5).setEscudo(jLabel37.getIcon());
                    break;
                case 9:
                    jLabel54.setText("3");
                    jLabel56.setText("0");
                    times.get(5).setVencedor(jLabel11.getText());
                    times.get(5).setEscudo(jLabel31.getIcon());
                    break;
                case 10:
                    jLabel54.setText("0");
                    jLabel56.setText("3");
                    times.get(5).setVencedor(jLabel12.getText());
                    times.get(5).setEscudo(jLabel37.getIcon());
                    break;
            }
        }

        if (placares.get(6).getPlacarVisitante() == placares.get(6).getPlacarCasa()) {
            jPanel64.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel51.setText("5");
                    jLabel53.setText("4");
                    times.get(6).setVencedor(jLabel13.getText());
                    times.get(6).setEscudo(jLabel32.getIcon());
                    break;
                case 2:
                    jLabel51.setText("4");
                    jLabel53.setText("5");
                    times.get(6).setVencedor(jLabel14.getText());
                    times.get(6).setEscudo(jLabel36.getIcon());
                    break;
                case 3:
                    jLabel51.setText("6");
                    jLabel53.setText("5");
                    times.get(6).setVencedor(jLabel13.getText());
                    times.get(6).setEscudo(jLabel32.getIcon());
                    break;
                case 4:
                    jLabel51.setText("5");
                    jLabel53.setText("6");
                    times.get(6).setVencedor(jLabel14.getText());
                    times.get(6).setEscudo(jLabel36.getIcon());
                    break;
                case 5:
                    jLabel51.setText("4");
                    jLabel53.setText("3");
                    times.get(6).setVencedor(jLabel13.getText());
                    times.get(6).setEscudo(jLabel32.getIcon());
                    break;
                case 6:
                    jLabel51.setText("3");
                    jLabel53.setText("4");
                    times.get(6).setVencedor(jLabel14.getText());
                    times.get(6).setEscudo(jLabel36.getIcon());
                    break;
                case 7:
                    jLabel51.setText("7");
                    jLabel53.setText("6");
                    times.get(6).setVencedor(jLabel13.getText());
                    times.get(6).setEscudo(jLabel32.getIcon());
                    break;
                case 8:
                    jLabel51.setText("6");
                    jLabel53.setText("7");
                    times.get(6).setVencedor(jLabel14.getText());
                    times.get(6).setEscudo(jLabel36.getIcon());
                    break;
                case 9:
                    jLabel51.setText("3");
                    jLabel53.setText("0");
                    times.get(6).setVencedor(jLabel13.getText());
                    times.get(6).setEscudo(jLabel32.getIcon());
                    break;
                case 10:
                    jLabel51.setText("0");
                    jLabel53.setText("3");
                    times.get(6).setVencedor(jLabel14.getText());
                    times.get(6).setEscudo(jLabel36.getIcon());
                    break;
            }
        }

        if (placares.get(7).getPlacarVisitante() == placares.get(7).getPlacarCasa()) {
            jPanel63.setVisible(true);
            escolha = random.nextInt(9) + 1;

            switch (escolha) {
                case 1:
                    jLabel48.setText("5");
                    jLabel50.setText("4");
                    times.get(7).setVencedor(jLabel15.getText());
                    times.get(7).setEscudo(jLabel33.getIcon());
                    break;
                case 2:
                    jLabel48.setText("4");
                    jLabel50.setText("5");
                    times.get(7).setVencedor(jLabel16.getText());
                    times.get(7).setEscudo(jLabel35.getIcon());
                    break;
                case 3:
                    jLabel48.setText("6");
                    jLabel50.setText("5");
                    times.get(7).setVencedor(jLabel15.getText());
                    times.get(7).setEscudo(jLabel33.getIcon());
                    break;
                case 4:
                    jLabel48.setText("5");
                    jLabel50.setText("6");
                    times.get(7).setVencedor(jLabel16.getText());
                    times.get(7).setEscudo(jLabel35.getIcon());
                    break;
                case 5:
                    jLabel48.setText("4");
                    jLabel50.setText("3");
                    times.get(7).setVencedor(jLabel15.getText());
                    times.get(7).setEscudo(jLabel33.getIcon());
                    break;
                case 6:
                    jLabel48.setText("3");
                    jLabel50.setText("4");
                    times.get(7).setVencedor(jLabel16.getText());
                    times.get(7).setEscudo(jLabel35.getIcon());
                    break;
                case 7:
                    jLabel48.setText("7");
                    jLabel50.setText("6");
                    times.get(7).setVencedor(jLabel15.getText());
                    times.get(7).setEscudo(jLabel33.getIcon());
                    break;
                case 8:
                    jLabel48.setText("6");
                    jLabel50.setText("7");
                    times.get(7).setVencedor(jLabel16.getText());
                    times.get(7).setEscudo(jLabel35.getIcon());
                    break;
                case 9:
                    jLabel48.setText("3");
                    jLabel50.setText("0");
                    times.get(7).setVencedor(jLabel15.getText());
                    times.get(7).setEscudo(jLabel33.getIcon());
                    break;
                case 10:
                    jLabel48.setText("0");
                    jLabel50.setText("3");
                    times.get(7).setVencedor(jLabel16.getText());
                    times.get(7).setEscudo(jLabel35.getIcon());
                    break;

            }

        } else {
        }
        timeVencedor(placares, times);

    }

    public void timeVencedor(ArrayList<Placar> placares, ArrayList<Time> times) throws IOException {
        if (placares.get(0).getPlacarVisitante() > placares.get(0).getPlacarCasa()) {
            times.get(0).setVencedor(jLabel1.getText());
            times.get(0).setEscudo(jLabel26.getIcon());
        } else if (placares.get(0).getPlacarVisitante() < placares.get(0).getPlacarCasa()) {
            times.get(0).setVencedor(jLabel2.getText());
            times.get(0).setEscudo(jLabel3.getIcon());
        }
        if (placares.get(1).getPlacarVisitante() > placares.get(1).getPlacarCasa()) {
            times.get(1).setVencedor(time1jLabel.getText());
            times.get(1).setEscudo(jLabel27.getIcon());
        } else if (placares.get(1).getPlacarVisitante() < placares.get(1).getPlacarCasa()) {
            times.get(1).setVencedor(jLabel4.getText());
            times.get(1).setEscudo(jLabel34.getIcon());
        }
        if (placares.get(2).getPlacarVisitante() > placares.get(2).getPlacarCasa()) {
            times.get(2).setVencedor(jLabel5.getText());
            times.get(2).setEscudo(jLabel28.getIcon());
        } else if (placares.get(2).getPlacarVisitante() < placares.get(2).getPlacarCasa()) {
            times.get(2).setVencedor(jLabel40.getText());
            times.get(2).setEscudo(jLabel25.getIcon());
        }
        if (placares.get(3).getPlacarVisitante() > placares.get(3).getPlacarCasa()) {
            times.get(3).setVencedor(jLabel7.getText());
            times.get(3).setEscudo(jLabel29.getIcon());
        } else if (placares.get(3).getPlacarVisitante() < placares.get(3).getPlacarCasa()) {
            times.get(3).setVencedor(jLabel8.getText());
             times.get(3).setEscudo(jLabel39.getIcon());
        }
        if (placares.get(4).getPlacarVisitante() > placares.get(4).getPlacarCasa()) {
            times.get(4).setVencedor(jLabel9.getText());
             times.get(4).setEscudo(jLabel30.getIcon());
        } else if (placares.get(4).getPlacarVisitante() < placares.get(4).getPlacarCasa()) {
            times.get(4).setVencedor(jLabel10.getText());
            times.get(4).setEscudo(jLabel38.getIcon());
        }
        if (placares.get(5).getPlacarVisitante() > placares.get(5).getPlacarCasa()) {
            times.get(5).setVencedor(jLabel11.getText());
            times.get(5).setEscudo(jLabel31.getIcon());
        } else if (placares.get(5).getPlacarVisitante() < placares.get(5).getPlacarCasa()) {
            times.get(5).setVencedor(jLabel12.getText());
            times.get(5).setEscudo(jLabel37.getIcon());
        }
        if (placares.get(6).getPlacarVisitante() > placares.get(6).getPlacarCasa()) {
            times.get(6).setVencedor(jLabel13.getText());
            times.get(6).setEscudo(jLabel32.getIcon());
        } else if (placares.get(6).getPlacarVisitante() < placares.get(6).getPlacarCasa()) {
            times.get(6).setVencedor(jLabel14.getText());
            times.get(6).setEscudo(jLabel36.getIcon());
        }
        if (placares.get(7).getPlacarVisitante() > placares.get(7).getPlacarCasa()) {
            times.get(7).setVencedor(jLabel15.getText());
            times.get(7).setEscudo(jLabel33.getIcon());
        } else if (placares.get(7).getPlacarVisitante() < placares.get(7).getPlacarCasa()) {
            times.get(7).setVencedor(jLabel16.getText());
            times.get(7).setEscudo(jLabel35.getIcon());
        }
        quartas.vencedoresOitavas(placares, times);
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
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
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
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel time1jLabel;
    private javax.swing.JLabel wallpaperjLabel;
    // End of variables declaration//GEN-END:variables
}
