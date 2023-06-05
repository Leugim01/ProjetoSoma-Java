
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Miguel
 */
public class From1 extends javax.swing.JFrame {

    /**
     * Creates new form From1
     */
    public From1() {
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

        BotaoLimpar = new javax.swing.JButton();
        BotaoCalcular = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        boxtotal = new javax.swing.JTextField();
        boxnum1 = new javax.swing.JTextField();
        boxnum2 = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        num01 = new javax.swing.JLabel();
        num02 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProjetoSoma - by Miguel Gomes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 168, 53));

        BotaoCalcular.setText("Calcular");
        BotaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 168, 53));

        total.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total.setText("Total");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        boxtotal.setEditable(false);
        boxtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(boxtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 170, 40));

        boxnum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        boxnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxnum1ActionPerformed(evt);
            }
        });
        getContentPane().add(boxnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, 40));

        boxnum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(boxnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 40));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Projeto Soma");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        num01.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        num01.setText("Num1");
        getContentPane().add(num01, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        num02.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        num02.setText("Num2");
        getContentPane().add(num02, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxnum1ActionPerformed

    }//GEN-LAST:event_boxnum1ActionPerformed

    private void BotaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCalcularActionPerformed
      //Receber valores
      //Var - Tipo - Valor
      double v1, v2, total;
      
      v1 = Double.parseDouble(boxnum1.getText());
      v2 =Double.parseDouble(boxnum2.getText());
      
      
      //Fazer o calculo
      
      total = v1 + v2;
      
      // Exibir o resultado
      boxtotal.setText(String.valueOf(total));
      
      
    }//GEN-LAST:event_BotaoCalcularActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        //botão limpar;
        boxnum1.setText(null); 
        boxnum2.setText(null);
        boxtotal.setText(null);
        
        boxnum1.requestFocus(); 
        
    }//GEN-LAST:event_BotaoLimparActionPerformed

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
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCalcular;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField boxnum1;
    private javax.swing.JTextField boxnum2;
    private javax.swing.JTextField boxtotal;
    private javax.swing.JLabel num01;
    private javax.swing.JLabel num02;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
