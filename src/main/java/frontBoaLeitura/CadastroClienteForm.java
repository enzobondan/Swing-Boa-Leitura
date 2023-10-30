/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontBoaLeitura;

import br.ufmt.ic.alg3.ap2.dao.impl.ClienteDaoImpl;
import database.Clientlist;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enzob
 */
public class CadastroClienteForm extends javax.swing.JFrame {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    CadastroClienteForm() {
        initComponents();
        atualizarTabela();
    }
   private void atualizarTabela() {
        ClienteDaoImpl update = new ClienteDaoImpl();
        List<Clientlist> clientes = update.Verificar();
        DefaultTableModel model = (DefaultTableModel) listaCliente.getModel();
        model.setRowCount(0); // Limpa a tabela antes de atualizá-la

        for (Clientlist cliente : clientes) {
            Object[] rowData = {
                cliente.getId(),
                cliente.getCpf(),
                cliente.getNome(),
                cliente.getEndereco(),
                cliente.getTelefone()
            };
            model.addRow(rowData); // Adiciona uma nova linha à tabela
        }
    }
                    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarCliente = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCliente = new javax.swing.JTable();
        AtualizarBTN = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarCliente.setText("Cadastrar");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 90, 40));

        deleteBTN.setText("Remover");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 90, 40));

        listaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "Nome", "Endereco", "Telefone"
            }
        ));
        listaCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(listaCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 430));

        AtualizarBTN.setText("Atualizar");
        AtualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AtualizarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        CadastroCliente newCliente = new CadastroCliente();
        newCliente.setVisible(true);
        
    }//GEN-LAST:event_cadastrarClienteActionPerformed
    private void listaClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaClienteAncestorAdded
        atualizarTabela();
    }//GEN-LAST:event_listaClienteAncestorAdded

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        int selectedRow = listaCliente.getSelectedRow();
                        if (selectedRow != -1) {
                            // Exiba uma caixa de diálogo de confirmação
                            int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o Cliente selecionado?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

                            if (resposta == JOptionPane.YES_OPTION) {
                                DefaultTableModel model = (DefaultTableModel) listaCliente.getModel();
                                int idClienteExcluir = (int) model.getValueAt(selectedRow, 0);

                                ClienteDaoImpl deleteDB = new ClienteDaoImpl();
                                boolean exclusaoBemSucedida = deleteDB.deletar(idClienteExcluir);

                                if (exclusaoBemSucedida) {
                                    // Remova a linha da tabela se a exclusão no banco de dados for bem-sucedida
                                    model.removeRow(selectedRow);
                                } else {
                                    // Lidere com a exclusão mal-sucedida, se necessário
                                    JOptionPane.showMessageDialog(null, "Exclusão mal-sucedida.", "Erro", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        } else {
                            // Exiba uma mensagem ao usuário informando que nenhuma linha foi selecionada.
                            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_AtualizarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroClienteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarBTN;
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaCliente;
    // End of variables declaration//GEN-END:variables
}
