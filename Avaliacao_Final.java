


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class Avaliacao_Final extends javax.swing.JFrame {
    /**
     * Creates new form Avaliacao_Final
     */
    public Avaliacao_Final() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTNumMatri = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTNota1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTNota2 = new javax.swing.JTextField();
        jRGraduacao = new javax.swing.JRadioButton();
        jRPos = new javax.swing.JRadioButton();
        jRDoutorado = new javax.swing.JRadioButton();
        jBMedia = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dados do aluno:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Número de Matrícula:");

        jTNumMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumMatriActionPerformed(evt);
            }
        });

        jLabel4.setText("Nota 1:");

        jLabel5.setText("Nota 2:");
        jLabel5.setToolTipText("");

        buttonGroup1.add(jRGraduacao);
        jRGraduacao.setText("Graduação");
        jRGraduacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRGraduacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRPos);
        jRPos.setText("Pós-Graduação");

        buttonGroup1.add(jRDoutorado);
        jRDoutorado.setText("Doutorado");
        jRDoutorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDoutoradoActionPerformed(evt);
            }
        });

        jBMedia.setText("Calcular Média");
        jBMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMediaActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNota2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTNota1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTNumMatri))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRGraduacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRDoutorado))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jBMedia)
                                .addGap(50, 50, 50)
                                .addComponent(jBSair))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jRPos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNumMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRGraduacao)
                    .addComponent(jRPos)
                    .addComponent(jRDoutorado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMedia)
                    .addComponent(jBLimpar)
                    .addComponent(jBSair))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRGraduacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRGraduacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRGraduacaoActionPerformed

    private void jRDoutoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDoutoradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRDoutoradoActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMediaActionPerformed
        // TODO add your handling code here:
    double num1;
    double num2;
    double media;
    String nome;
    String numerodematricula;
    nome = String.valueOf(jTNome.getText());
    numerodematricula = String.valueOf(jTNumMatri.getText());
    num1 = Double.parseDouble(jTNota1.getText());
    num2 = Double.parseDouble(jTNota2.getText());
    
   media = (num1 + num2)/2;
    
   if(jRGraduacao.isSelected()){
        if(media > 7){
        JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + " com número de matrícula" + numerodematricula  + " teve média " + media + " - Aprovado ");
    }
        else if(media > 5 && media <5){
            JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + " - Recuperação ");
        }
        else if(media < 5){
            JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + " - Reprovado ");
        }
    }
    if(jRPos.isSelected()){
        if(media > 6){
        JOptionPane.showMessageDialog(null, "O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + "- Aprovado ");
    }
        else if(media > 4 && media <4){
            JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + " - Recuperação ");
        }
        else if(media < 4){
            JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + " - Reprovado ");
        }
    }
     if(jRDoutorado.isSelected()){
         if(media > 5){
        JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + " - Aprovado ");
    }
        else if(media > 3 && media < 3){
            JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + " - Recuperação ");
        }
        else if(media < 3){
            JOptionPane.showMessageDialog(null, "O aluno(a) " + nome + "com número de matrícula" + numerodematricula  + " teve média " + media + " - Reprovado ");
        }
     }
    }//GEN-LAST:event_jBMediaActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        // TODO add your handling code here:
    jTNota1.setText(null);
    jTNota2.setText(null);
    jTNome.setText(null);
    jTNumMatri.setText(null);
    }//GEN-LAST:event_jBLimparActionPerformed

private void jTNumMatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumMatriActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTNumMatriActionPerformed

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
            java.util.logging.Logger.getLogger(Avaliacao_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Avaliacao_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Avaliacao_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avaliacao_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avaliacao_Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBMedia;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRDoutorado;
    private javax.swing.JRadioButton jRGraduacao;
    private javax.swing.JRadioButton jRPos;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNota1;
    private javax.swing.JTextField jTNota2;
    private javax.swing.JTextField jTNumMatri;
    // End of variables declaration//GEN-END:variables
}

