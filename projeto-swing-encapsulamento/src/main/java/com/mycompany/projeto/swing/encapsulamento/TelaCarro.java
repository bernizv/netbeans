/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.swing.encapsulamento;

/**
 *
 * @author NOLE201903
 */
public class TelaCarro extends javax.swing.JFrame {
    Carro car = new Carro();
    
    /**
     * Creates new form TelaCarro
     */
    public TelaCarro() {
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

        btLigar = new javax.swing.JButton();
        btAcelerar = new javax.swing.JButton();
        btFrear = new javax.swing.JButton();
        btDesligar = new javax.swing.JButton();
        lbCarro = new javax.swing.JLabel();
        lbKM = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        lbVelocidade = new javax.swing.JLabel();
        pbVelocidade = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLigar.setText("Ligar ");
        btLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLigarActionPerformed(evt);
            }
        });

        btAcelerar.setText("Acelerar");
        btAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcelerarActionPerformed(evt);
            }
        });

        btFrear.setText("Frear");
        btFrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFrearActionPerformed(evt);
            }
        });

        btDesligar.setText("Desligar");
        btDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesligarActionPerformed(evt);
            }
        });

        lbCarro.setText("Satus do Carro:");

        lbKM.setText("Velocidade Atual:");

        lbStatus.setForeground(new java.awt.Color(0, 204, 0));
        lbStatus.setText("Desligado");

        lbVelocidade.setForeground(new java.awt.Color(0, 204, 0));
        lbVelocidade.setText("0");

        pbVelocidade.setBackground(new java.awt.Color(255, 0, 0));
        pbVelocidade.setForeground(new java.awt.Color(255, 0, 0));
        pbVelocidade.setMaximum(120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbKM)
                                .addGap(18, 18, 18)
                                .addComponent(lbVelocidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCarro)
                                .addGap(18, 18, 18)
                                .addComponent(lbStatus))
                            .addComponent(pbVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btLigar)
                        .addGap(18, 18, 18)
                        .addComponent(btAcelerar)
                        .addGap(18, 18, 18)
                        .addComponent(btFrear)
                        .addGap(18, 18, 18)
                        .addComponent(btDesligar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLigar)
                    .addComponent(btAcelerar)
                    .addComponent(btFrear)
                    .addComponent(btDesligar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCarro)
                    .addComponent(lbStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKM)
                    .addComponent(lbVelocidade))
                .addGap(18, 18, 18)
                .addComponent(pbVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLigarActionPerformed
        car.ligar();
        
        lbVelocidade.setText(car.getVelocidadeFormatada());
        lbStatus.setText(car.getStatus().toString());
        pbVelocidade.setValue(car.getVelocidade().intValue());
    }//GEN-LAST:event_btLigarActionPerformed

    private void btAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcelerarActionPerformed
        car.acelerar();
        
        lbVelocidade.setText(car.getVelocidadeFormatada());
        lbStatus.setText(car.getStatus().toString());
        pbVelocidade.setValue(car.getVelocidade().intValue());
    }//GEN-LAST:event_btAcelerarActionPerformed

    private void btFrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFrearActionPerformed
        car.frear();
        
        lbVelocidade.setText(car.getVelocidadeFormatada());
        lbStatus.setText(car.getStatus().toString());
        pbVelocidade.setValue(car.getVelocidade().intValue());
    }//GEN-LAST:event_btFrearActionPerformed

    private void btDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesligarActionPerformed
        car.desligar();
        
        lbVelocidade.setText(car.getVelocidadeFormatada());
        lbStatus.setText(car.getStatus().toString());
        pbVelocidade.setValue(car.getVelocidade().intValue());
    }//GEN-LAST:event_btDesligarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcelerar;
    private javax.swing.JButton btDesligar;
    private javax.swing.JButton btFrear;
    private javax.swing.JButton btLigar;
    private javax.swing.JLabel lbCarro;
    private javax.swing.JLabel lbKM;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbVelocidade;
    private javax.swing.JProgressBar pbVelocidade;
    // End of variables declaration//GEN-END:variables
}
