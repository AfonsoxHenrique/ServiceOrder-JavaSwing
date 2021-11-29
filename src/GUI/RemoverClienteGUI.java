/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClassesBasicas.Cliente;
import Negocios.NegocioCliente;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class RemoverClienteGUI extends javax.swing.JFrame {

    /**
     * Creates new form RemoverCliente
     */
    ArrayList<Cliente> respostaCliente;

    public void ListarCliente() {
        try {
            Cliente cliente = new Cliente();
            NegocioCliente negocioCliente = new NegocioCliente();
            this.respostaCliente = negocioCliente.listarClientes(cliente);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});
            for (Cliente c : this.respostaCliente) {
                modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getRg()});
            }
            jTable1.setEditingColumn(3);
            jTable1.setModel(modelo);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public RemoverClienteGUI() {
        initComponents();
        this.respostaCliente = new ArrayList<>();
        ListarCliente();
        setLocationRelativeTo(this);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0)));
        jPanel1.setBackground(Color.pink);
        getContentPane().setBackground(Color.pink);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldPesquisarRG = new javax.swing.JTextField();
        jButtonProcurarRG = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesquisarNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPesquisarCPF = new javax.swing.JTextField();
        jButtonProcurarNome = new javax.swing.JButton();
        jButtonProcurarCPF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonProcurarRG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonProcurarRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarRGActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jButtonProcurarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonProcurarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarNomeActionPerformed(evt);
            }
        });

        jButtonProcurarCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonProcurarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarCPFActionPerformed(evt);
            }
        });

        jLabel4.setText("RG");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProcurarNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProcurarCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisarRG, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProcurarRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonProcurarCPF)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonProcurarNome)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))
                    .addComponent(jButtonProcurarRG)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldPesquisarRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        new MenuGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        MouseEvent e = evt;
        int index = jTable1.getSelectedRow();
        int click = e.getClickCount();
        try 
        {
            if (click == 2) 
            {
                if (index >= 0) 
                {
                    Cliente cliente = this.respostaCliente.get(index);
                    String mensagem = "Deseja remover este cliente?\nCliente: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nRG: " + cliente.getRg();
                    int resultado = JOptionPane.showConfirmDialog(this, mensagem, "Remover cliente", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resultado == JOptionPane.YES_OPTION) {

                        NegocioCliente negocioCliente = new NegocioCliente();
                        negocioCliente.removerCliente(cliente);
                        ListarCliente();
                        JOptionPane.showMessageDialog(this, "Cliente removido", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }                     
                }
            }
        } catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        jTable1.editingCanceled(null);
        jTable1.editingStopped(null);
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        jTable1.editingCanceled(null);
        jTable1.editingStopped(null);
    }//GEN-LAST:event_jTable1KeyTyped

    private void jButtonProcurarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarNomeActionPerformed
        try
        {
            Cliente cliente = new Cliente();
            NegocioCliente negocioCliente = new NegocioCliente();
            cliente.setNome(jTextFieldPesquisarNome.getText());  
            cliente.setCpf(jTextFieldPesquisarCPF.getText());
            cliente.setRg(jTextFieldPesquisarRG.getText());
            this.respostaCliente = negocioCliente.listarClientes(cliente);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});

            for (Cliente c : this.respostaCliente) 
            {
                modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getRg()});
            }

            jTable1.setModel(modelo);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonProcurarNomeActionPerformed

    private void jButtonProcurarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarCPFActionPerformed
        try
        {
            Cliente cliente = new Cliente();
            NegocioCliente negocioCliente = new NegocioCliente();
            cliente.setCpf(jTextFieldPesquisarCPF.getText());   
            cliente.setRg(jTextFieldPesquisarRG.getText());    
            cliente.setNome(jTextFieldPesquisarNome.getText());                                                           
            this.respostaCliente = negocioCliente.listarClientes(cliente);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});

            for (Cliente c : this.respostaCliente) 
            {
                modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getRg()});
            }

            jTable1.setModel(modelo);
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonProcurarCPFActionPerformed

    private void jButtonProcurarRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarRGActionPerformed
        try
        {
            Cliente cliente = new Cliente();
            NegocioCliente negocioCliente = new NegocioCliente();
            cliente.setRg(jTextFieldPesquisarRG.getText());  
            cliente.setCpf(jTextFieldPesquisarCPF.getText());
            cliente.setNome(jTextFieldPesquisarNome.getText());
            this.respostaCliente = negocioCliente.listarClientes(cliente);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});

            for (Cliente c : this.respostaCliente) 
            {
                modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getRg()});
            }

            jTable1.setModel(modelo);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonProcurarRGActionPerformed

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
            java.util.logging.Logger.getLogger(RemoverClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonProcurarCPF;
    private javax.swing.JButton jButtonProcurarNome;
    private javax.swing.JButton jButtonProcurarRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldPesquisarCPF;
    private javax.swing.JTextField jTextFieldPesquisarNome;
    private javax.swing.JTextField jTextFieldPesquisarRG;
    // End of variables declaration//GEN-END:variables
}
