/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Fundacao_Times.java
 *
 * Created on 29/06/2022, 09:11:43
 */
package exercicio_8;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Fundacao_Times extends javax.swing.JFrame {

    /** Creates new form Fundacao_Times */
    public Fundacao_Times() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCBTimes = new javax.swing.JComboBox();
        jBVeja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Escolha seu time:");

        jCBTimes.setEditable(true);
        jCBTimes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Palmeiras", "Corinthians", "Santos", "São Paulo", "Botafogo", "Fluminense", "Vasco", "Flamengo", "Coritiba", "Atlético - MG", "Atlético - PR", "Cruzeiro", "Internacional", "Grêmio", "Sport" }));

        jBVeja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBVeja.setText("Veja a data de fundação do seu time.");
        jBVeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVejaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVeja)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBVeja)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jBVejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVejaActionPerformed
// TODO add your handling code here:
    switch(jCBTimes.getSelectedIndex()){
        case 0:
            JOptionPane.showMessageDialog(null, "26 de agosto de 1914."); break;
        case 1:
            JOptionPane.showMessageDialog(null, "01 de setembro de 1910."); break;
        case 2:
            JOptionPane.showMessageDialog(null, "14 de abril de 1912."); break;
        case 3:
            JOptionPane.showMessageDialog(null, "27 de janeiro de 1930."); break;
        case 4:
            JOptionPane.showMessageDialog(null, "01 de julho de 1894."); break;
        case 5:
            JOptionPane.showMessageDialog(null, "21 de julho de 1902."); break;
        case 6:
            JOptionPane.showMessageDialog(null, "21 de agosto de 1898."); break;
        case 7:
            JOptionPane.showMessageDialog(null, "17 de novembro de 1895."); break;
        case 8:
            JOptionPane.showMessageDialog(null, "12 de outubro de 1909."); break;
        case 9:
            JOptionPane.showMessageDialog(null, "25 de março de 1908."); break;
        case 10:
            JOptionPane.showMessageDialog(null, "26 de março de 1924."); break;
        case 11:
            JOptionPane.showMessageDialog(null, "02 de janeiro de 1921."); break;
        case 12:
            JOptionPane.showMessageDialog(null, "04 de abril de 1909."); break;
        case 13:
            JOptionPane.showMessageDialog(null, "15 de setembro de 1903."); break;
        case 14:
            JOptionPane.showMessageDialog(null, "13 de maio de 1905."); break;
        default:
            JOptionPane.showMessageDialog(null, "Esse não é um time válido."); break;
    }
}//GEN-LAST:event_jBVejaActionPerformed

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
            java.util.logging.Logger.getLogger(Fundacao_Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fundacao_Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fundacao_Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fundacao_Times.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Fundacao_Times().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVeja;
    private javax.swing.JComboBox jCBTimes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}