/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.swing.heranca;

/**
 *
 * @author NOLE201903
 */
public class TelaPets extends javax.swing.JFrame {

    Pet bichinho;
    
    /**
     * Creates new form TelaPets
     */
    public TelaPets() {
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

        btDog = new javax.swing.JButton();
        btCat = new javax.swing.JButton();
        btBarulho = new javax.swing.JButton();
        lbNP = new javax.swing.JLabel();
        lbSom = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btDog.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btDog.setForeground(new java.awt.Color(0, 0, 0));
        btDog.setText("ADOTAR UM DOG");
        btDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDogActionPerformed(evt);
            }
        });

        btCat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCat.setForeground(new java.awt.Color(0, 0, 0));
        btCat.setText("ADOTAR UM CAT");
        btCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCatActionPerformed(evt);
            }
        });

        btBarulho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btBarulho.setForeground(new java.awt.Color(0, 0, 0));
        btBarulho.setText("PET FAZ BARULHO");
        btBarulho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBarulhoActionPerformed(evt);
            }
        });

        lbNP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNP.setForeground(new java.awt.Color(0, 0, 0));
        lbNP.setText("NOMES PROVÁVEIS:");

        lbSom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbSom.setForeground(new java.awt.Color(0, 0, 0));
        lbSom.setText("...");

        lbNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNP)
                        .addGap(18, 18, 18)
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btDog)
                        .addGap(38, 38, 38)
                        .addComponent(btCat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSom, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBarulho))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDog)
                    .addComponent(btCat))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNP)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btBarulho)
                .addGap(18, 18, 18)
                .addComponent(lbSom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDogActionPerformed
       
        //FAZENDO O "BICHINHO" SE TORNAR UM CACHORRO
        bichinho = new Cachorro();
        
        lbNome.setText(bichinho.getNomes());
        
    }//GEN-LAST:event_btDogActionPerformed

    private void btCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCatActionPerformed
        
        //FAZENDO O "BICHINHO" SE TORNAR UM GATO
        bichinho = new Gato();
        
        lbNome.setText(bichinho.getNomes());
    }//GEN-LAST:event_btCatActionPerformed

    private void btBarulhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBarulhoActionPerformed
        lbSom.setText(bichinho.getSom());
    }//GEN-LAST:event_btBarulhoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBarulho;
    private javax.swing.JButton btCat;
    private javax.swing.JButton btDog;
    private javax.swing.JLabel lbNP;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSom;
    // End of variables declaration//GEN-END:variables
}
