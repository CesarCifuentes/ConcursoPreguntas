/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursopreguntas.vistas;

/**
 *
 * @author Baloo
 */
public class JFCategoriaMate extends javax.swing.JFrame {

    /**
     * Creates new form JFCategoriaMate
     */
    public JFCategoriaMate() {
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

        bntPrincipiante = new javax.swing.JButton();
        bntIntermedio = new javax.swing.JButton();
        bntAvanzado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntPrincipiante.setText("Principiante");
        bntPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPrincipianteActionPerformed(evt);
            }
        });

        bntIntermedio.setText("Intermedio");
        bntIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIntermedioActionPerformed(evt);
            }
        });

        bntAvanzado.setText("Avanzado");
        bntAvanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvanzadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntPrincipiante)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bntAvanzado)
                        .addComponent(bntIntermedio)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(bntPrincipiante)
                .addGap(18, 18, 18)
                .addComponent(bntIntermedio)
                .addGap(18, 18, 18)
                .addComponent(bntAvanzado)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPrincipianteActionPerformed
        // TODO add your handling code here:
        JDCategoriaMatePrincipiante MatePrincipiante=new JDCategoriaMatePrincipiante();
        MatePrincipiante.setVisible(true);
    }//GEN-LAST:event_bntPrincipianteActionPerformed

    private void bntAvanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvanzadoActionPerformed
        // TODO add your handling code here:
        JDCategoriaMateAvanzada MateAvanzado=new JDCategoriaMateAvanzada();
        MateAvanzado.setVisible(true);
    }//GEN-LAST:event_bntAvanzadoActionPerformed

    private void bntIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIntermedioActionPerformed
        // TODO add your handling code here:
        JDCategoriaMateIntermedio MateIntermedio=new JDCategoriaMateIntermedio();
        MateIntermedio.setVisible(true);
    }//GEN-LAST:event_bntIntermedioActionPerformed

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
            java.util.logging.Logger.getLogger(JFCategoriaMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCategoriaMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCategoriaMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCategoriaMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCategoriaMate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAvanzado;
    private javax.swing.JButton bntIntermedio;
    private javax.swing.JButton bntPrincipiante;
    // End of variables declaration//GEN-END:variables
}
