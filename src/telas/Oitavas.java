package telas;

import java.util.ArrayList;
import java.util.Collections;
import campeonato.Time;

public class Oitavas extends javax.swing.JFrame {

    ArrayList<Time> times;

    public Oitavas() {
        times = new ArrayList();
        times.add(new Time("Atlético Sorocaba", "Atlético_Sorocaba-SP.png"));
        times.add(new Time("Botafogo-SP", "Botafogo-SP.png"));
        times.add(new Time("Cotia", "Cotia-SP.png"));
        times.add(new Time("Corinthians", "Corinthians-BRA.png"));
        times.add(new Time("Ferroviária", "Ferroviária-SP.png"));
        times.add(new Time("Audax", "Grêmio_Osasco_Audax-SP.png"));
        times.add(new Time("Guarani", "Guarani-SP.png"));
        times.add(new Time("Inter de Limeira", "Inter de Limeira-SP HD.png"));
        times.add(new Time("Ituano", "Ituano.png"));
        times.add(new Time("Marília-SP", "Marília HD_SP.png"));
        times.add(new Time("Mirassol", "Mirassol-SP HD.png"));
        times.add(new Time("Oeste", "Oeste-SP.png"));
        times.add(new Time("Palmeiras", "Palmeiras-BRA.png"));
        times.add(new Time("Ponte Preta", "Ponte Preta HD-SP.png"));
        times.add(new Time("Red Bull Bragantino", "Red Bull Bragantino (HD).png"));
        times.add(new Time("Santo André", "Santo André-SP HD.png"));
        times.add(new Time("Santos", "Santos-SP.png"));
        times.add(new Time("São Bernardo", "São Bernardo-SP HD.png"));
        times.add(new Time("São Caetano", "São Caetano-BRA.png"));
        times.add(new Time("São Paulo", "São Paulo_SP.png"));
        times.add(new Time("XV de Piracicaba", "XV de Piracicaba-SP HD.png"));
        times.add(new Time("Água Santa", "Água Santa-SP.png"));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(369, 369, 369))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oitavas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
