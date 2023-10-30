/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontBoaLeitura;

import br.ufmt.ic.alg3.ap2.dao.impl.LivroDaoImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author enzob
 */
public class CadastroLivro extends javax.swing.JFrame {
    

    /**
     * Creates new form CadastroLivro
     */
    public CadastroLivro() {
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

        jLabel1 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        textTitulo = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        textAutor = new javax.swing.JTextField();
        labelEditora = new javax.swing.JLabel();
        textEditora = new javax.swing.JTextField();
        ConfirmBTN = new javax.swing.JButton();
        labelEditora1 = new javax.swing.JLabel();
        textPreco = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(440, 440));
        setPreferredSize(new java.awt.Dimension(440, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cadastro Livro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, 60));

        labelTitulo.setText("Título:");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 90, 40));

        textTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTituloActionPerformed(evt);
            }
        });
        getContentPane().add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 240, 30));

        labelAutor.setText("Autor:");
        getContentPane().add(labelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 90, 40));
        getContentPane().add(textAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 240, 30));

        labelEditora.setText("Editora:");
        getContentPane().add(labelEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 70, 30));
        getContentPane().add(textEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 240, 30));

        ConfirmBTN.setText("Adicionar");
        ConfirmBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 140, 40));

        labelEditora1.setText("Preço:");
        getContentPane().add(labelEditora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 70, 30));
        getContentPane().add(textPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTituloActionPerformed

    private void ConfirmBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBTNActionPerformed
        LivroDaoImpl saveLivro = new LivroDaoImpl();
        String precoTexto = textPreco.getText();
        double preco = Double.parseDouble(precoTexto);
    saveLivro.salvar(textTitulo.getText(), textAutor.getText(), textEditora.getText(), preco);
    JOptionPane.showMessageDialog(null, "Livro Cadastrado com Sucesso!");
    CadastroLivro.this.dispose();
    }//GEN-LAST:event_ConfirmBTNActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelEditora;
    private javax.swing.JLabel labelEditora1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textAutor;
    private javax.swing.JTextField textEditora;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}
