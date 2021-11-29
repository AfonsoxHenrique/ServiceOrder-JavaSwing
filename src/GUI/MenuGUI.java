/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Dados.DadosOrdemServico;
import Dados.DadosCliente;
import Dados.DadosFuncionario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Afonso
 */
public class MenuGUI extends javax.swing.JFrame {
    
    public void ContarOrdem()
    {
        try
        {
            int resultado;
            DadosOrdemServico dadosOrdem = new DadosOrdemServico();
            resultado = dadosOrdem.contarOrdemServico(null);
            
            if (resultado > 1)
            {
                jLabelContadorOrdem.setText("Criamos " + resultado + " Ordens de Serviços");
            }
            else
            {
                jLabelContadorOrdem.setText("Criamos " + resultado + " Ordens de Serviço");
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void ContarCliente()
    {
        try
        {
            int resultado;
            DadosCliente dadosCliente = new DadosCliente();
            resultado = dadosCliente.contadorCliente(null);
            
            if(resultado > 1)
            {
               jLabelContadorCliente.setText("Temos " + resultado + " clientes"); 
            }
            else
            {
                jLabelContadorCliente.setText("Temos " + resultado + " cliente"); 
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void ContarFuncionario()
    {
        try
        {
            int resultado;
            DadosFuncionario dadosFuncionario = new DadosFuncionario();
            resultado = dadosFuncionario.contarFuncionario(null);
            
            if(resultado > 1)
            {
                jLabelContarFuncionario.setText("Temos " + resultado + " funcionários");
            }
            else
            {
                jLabelContarFuncionario.setText("Temos " + resultado + " funcionário");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public MenuGUI() 
    {
        initComponents();
        ContarOrdem();
        ContarCliente();
        ContarFuncionario();
        setLocationRelativeTo(this);     
        jMenuBarAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0)));
        jMenuBarAcoes.setBackground(Color.CYAN);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabelContadorOrdem = new javax.swing.JLabel();
        jLabelContadorCliente = new javax.swing.JLabel();
        jLabelContarFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarAcoes = new javax.swing.JMenuBar();
        jMenuCadastrarCliente = new javax.swing.JMenu();
        jMenuItemCadastrarCLiente = new javax.swing.JMenuItem();
        jMenuItemEditarCliente = new javax.swing.JMenuItem();
        jMenuItemRemoverCliente = new javax.swing.JMenuItem();
        jMenuItemListar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemCadastrarFuncionario = new javax.swing.JMenuItem();
        jMenuItemEditarFuncionario = new javax.swing.JMenuItem();
        jMenuItemRemoverFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCriarClassificacao = new javax.swing.JMenuItem();
        jMenuItemEditarClassificacao = new javax.swing.JMenuItem();
        jMenuItemRemoverClassificacao = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemCriarOrdem = new javax.swing.JMenuItem();
        jMenuItemEditarOrdem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu9.setText("File");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar5.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar5.add(jMenu12);

        jMenu13.setText("File");
        jMenuBar6.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar6.add(jMenu14);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelContadorOrdem.setBackground(new java.awt.Color(140, 202, 255));
        jLabelContadorOrdem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelContadorOrdem.setForeground(new java.awt.Color(33, 80, 255));
        jLabelContadorOrdem.setText("jLabel1");
        getContentPane().add(jLabelContadorOrdem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        jLabelContadorCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelContadorCliente.setForeground(new java.awt.Color(33, 80, 255));
        jLabelContadorCliente.setText("jLabel1");
        getContentPane().add(jLabelContadorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jLabelContarFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelContarFuncionario.setForeground(new java.awt.Color(33, 80, 255));
        jLabelContarFuncionario.setText("jLabel1");
        getContentPane().add(jLabelContarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/telamenu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        jMenuBarAcoes.setBackground(new java.awt.Color(51, 255, 51));
        jMenuBarAcoes.setBorder(null);

        jMenuCadastrarCliente.setBorder(null);
        jMenuCadastrarCliente.setText("Cliente  |");
        jMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarClienteActionPerformed(evt);
            }
        });

        jMenuItemCadastrarCLiente.setText("Cadastrar cliente");
        jMenuItemCadastrarCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarCLienteActionPerformed(evt);
            }
        });
        jMenuCadastrarCliente.add(jMenuItemCadastrarCLiente);

        jMenuItemEditarCliente.setText("Editar cliente");
        jMenuItemEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarClienteActionPerformed(evt);
            }
        });
        jMenuCadastrarCliente.add(jMenuItemEditarCliente);

        jMenuItemRemoverCliente.setText("Remover cliente");
        jMenuItemRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoverClienteActionPerformed(evt);
            }
        });
        jMenuCadastrarCliente.add(jMenuItemRemoverCliente);

        jMenuItemListar.setText("Listar cliente");
        jMenuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarActionPerformed(evt);
            }
        });
        jMenuCadastrarCliente.add(jMenuItemListar);

        jMenuBarAcoes.add(jMenuCadastrarCliente);

        jMenu5.setText("  Funcionario  |");

        jMenuItemCadastrarFuncionario.setText("Cadastrar funcionário");
        jMenuItemCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemCadastrarFuncionario);

        jMenuItemEditarFuncionario.setText("Editar funcionário");
        jMenuItemEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemEditarFuncionario);

        jMenuItemRemoverFuncionario.setText("Remover funcionário");
        jMenuItemRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoverFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemRemoverFuncionario);

        jMenuBarAcoes.add(jMenu5);

        jMenu2.setText("  Classificação do Problema  |");

        jMenuItemCriarClassificacao.setText("Criar classificação");
        jMenuItemCriarClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriarClassificacaoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCriarClassificacao);

        jMenuItemEditarClassificacao.setText("Editar classificação");
        jMenuItemEditarClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarClassificacaoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEditarClassificacao);

        jMenuItemRemoverClassificacao.setText("Remover classificação");
        jMenuItemRemoverClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoverClassificacaoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRemoverClassificacao);

        jMenuBarAcoes.add(jMenu2);

        jMenu6.setText("  Ordem Serviço |");

        jMenuItemCriarOrdem.setText("Criar ordem");
        jMenuItemCriarOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriarOrdemActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemCriarOrdem);

        jMenuItemEditarOrdem.setText("Editar ordem");
        jMenuItemEditarOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarOrdemActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemEditarOrdem);

        jMenuItem1.setText("Excluir ordem");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBarAcoes.add(jMenu6);

        setJMenuBar(jMenuBarAcoes);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarCLienteActionPerformed
        new CadastrarClienteGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemCadastrarCLienteActionPerformed

    private void jMenuItemEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarClienteActionPerformed
        new EditarClienteGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarClienteActionPerformed

    private void jMenuItemRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoverClienteActionPerformed
        new RemoverClienteGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemRemoverClienteActionPerformed

    private void jMenuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarActionPerformed
       new ListarGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemListarActionPerformed

    private void jMenuItemCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarFuncionarioActionPerformed
        new CadastrarFuncionarioGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastrarFuncionarioActionPerformed

    private void jMenuItemRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoverFuncionarioActionPerformed
        new RemoverFuncionarioGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemRemoverFuncionarioActionPerformed

    private void jMenuItemEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarFuncionarioActionPerformed
        new EditarFuncionarioGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarFuncionarioActionPerformed

    private void jMenuItemCriarClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriarClassificacaoActionPerformed
        new CriarClassProblemaGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemCriarClassificacaoActionPerformed

    private void jMenuItemEditarClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarClassificacaoActionPerformed
        new EditarClassProblemaGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarClassificacaoActionPerformed

    private void jMenuItemRemoverClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoverClassificacaoActionPerformed
        new RemoverClassProblemaGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemRemoverClassificacaoActionPerformed

    private void jMenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastrarClienteActionPerformed

    private void jMenuItemEditarOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarOrdemActionPerformed
        new EditarOrdemGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemEditarOrdemActionPerformed

    private void jMenuItemCriarOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriarOrdemActionPerformed
        new CriarOrdemGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItemCriarOrdemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new RemoverOrdemGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelContadorCliente;
    private javax.swing.JLabel jLabelContadorOrdem;
    private javax.swing.JLabel jLabelContarFuncionario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBarAcoes;
    private javax.swing.JMenu jMenuCadastrarCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadastrarCLiente;
    private javax.swing.JMenuItem jMenuItemCadastrarFuncionario;
    private javax.swing.JMenuItem jMenuItemCriarClassificacao;
    private javax.swing.JMenuItem jMenuItemCriarOrdem;
    private javax.swing.JMenuItem jMenuItemEditarClassificacao;
    private javax.swing.JMenuItem jMenuItemEditarCliente;
    private javax.swing.JMenuItem jMenuItemEditarFuncionario;
    private javax.swing.JMenuItem jMenuItemEditarOrdem;
    private javax.swing.JMenuItem jMenuItemListar;
    private javax.swing.JMenuItem jMenuItemRemoverClassificacao;
    private javax.swing.JMenuItem jMenuItemRemoverCliente;
    private javax.swing.JMenuItem jMenuItemRemoverFuncionario;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
