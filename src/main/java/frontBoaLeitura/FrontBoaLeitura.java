/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontBoaLeitura;

/**
 *
 * @author enzob
 */
public class FrontBoaLeitura extends javax.swing.JFrame {

    /**
     * Creates new form FrontBoaLeitura
     */
    public FrontBoaLeitura() {
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

        textCadastro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cadastroBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(textCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 220, 60));

        cadastroBTN.setText("Cadastro");
        cadastroBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBTNActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCadastroActionPerformed

    private void cadastroBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBTNActionPerformed
        CadastroClienteForm cadastro = new CadastroClienteForm();
        cadastro.setVisible(true);
    }//GEN-LAST:event_cadastroBTNActionPerformed

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
            java.util.logging.Logger.getLogger(FrontBoaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontBoaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontBoaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontBoaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontBoaLeitura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textCadastro;
    // End of variables declaration//GEN-END:variables
}
