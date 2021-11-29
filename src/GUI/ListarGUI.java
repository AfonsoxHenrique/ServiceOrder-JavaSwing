/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClassesBasicas.ClassificacaoProblema;
import ClassesBasicas.Cliente;
import ClassesBasicas.Funcionario;
import ClassesBasicas.OrdemServico;
import Negocios.NegocioClassificacaoProblema;
import Negocios.NegocioCliente;
import Negocios.NegocioFuncionario;
import Negocios.NegocioOrdemServico;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ListarGUI extends javax.swing.JFrame 
{
    ArrayList<Cliente> respostaCliente = new ArrayList<>();
    ArrayList<Funcionario> respostaFuncionario = new ArrayList<>();
    ArrayList<ClassificacaoProblema> respostaClass = new ArrayList<>();
    ArrayList<OrdemServico> respostaOrdem = new ArrayList<>();   
   
    public void resetarTable()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Selecione o tipo de procura"});
        jTableListar.setModel(modelo);
    }
    public ListarGUI() {
        initComponents();
        jLabelInformarCPF.setVisible(false);
        jLabelNome.setVisible(false);
        jLabelRG.setVisible(false);
        jLabelSalario.setVisible(false);
        
        jButtonListarCPF.setVisible(false);
        jButtonListarTudo.setVisible(false);
        jButtonListarNome.setVisible(false);
        jButtonListarRG.setVisible(false);
        jButtonListarSalario.setVisible(false);
        
        jTextFieldProcurarCPF.setVisible(false);
        jTextFieldProcurarRG.setVisible(false);
        jTextFieldProcurarSalario.setVisible(false);
        jTextFieldNome.setVisible(false);
        
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordens de Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jCheckBoxCliente = new javax.swing.JCheckBox();
        jCheckBoxFuncionario = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxClassProblema = new javax.swing.JCheckBox();
        jButtonListarTudo = new javax.swing.JButton();
        jCheckBoxOrdemServico = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListar = new javax.swing.JTable();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonListarNome = new javax.swing.JButton();
        jLabelInformarCPF = new javax.swing.JLabel();
        jTextFieldProcurarCPF = new javax.swing.JTextField();
        jButtonListarCPF = new javax.swing.JButton();
        jLabelRG = new javax.swing.JLabel();
        jTextFieldProcurarRG = new javax.swing.JTextField();
        jButtonListarRG = new javax.swing.JButton();
        jLabelSalario = new javax.swing.JLabel();
        jTextFieldProcurarSalario = new javax.swing.JTextField();
        jButtonListarSalario = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCheckBoxCliente.setText("Cliente");
        jCheckBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxClienteActionPerformed(evt);
            }
        });

        jCheckBoxFuncionario.setText("Funcionário");
        jCheckBoxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFuncionarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Escolha o tipo de procura");

        jCheckBoxClassProblema.setText("Classificação do Problema");
        jCheckBoxClassProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxClassProblemaActionPerformed(evt);
            }
        });

        jButtonListarTudo.setText("Listar todos");
        jButtonListarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarTudoActionPerformed(evt);
            }
        });

        jCheckBoxOrdemServico.setText("Ordem de Serviço");
        jCheckBoxOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOrdemServicoActionPerformed(evt);
            }
        });

        jTableListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cliente", "Funcionário"
            }
        ));
        jTableListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListarMousePressed(evt);
            }
        });
        jTableListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableListarKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListar);

        jLabelNome.setText("Informar Nome");

        jButtonListarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonListarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarNomeActionPerformed(evt);
            }
        });

        jLabelInformarCPF.setText("Informar CPF");

        jButtonListarCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonListarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCPFActionPerformed(evt);
            }
        });

        jLabelRG.setText("Informar RG");

        jButtonListarRG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonListarRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarRGActionPerformed(evt);
            }
        });

        jLabelSalario.setText("Procurar por Salário");

        jButtonListarSalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonListarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInformarCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldProcurarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarCPF)
                        .addGap(14, 14, 14)
                        .addComponent(jLabelRG)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldProcurarRG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListarRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldProcurarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jButtonListarSalario)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNome)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonListarNome)
                    .addComponent(jButtonListarCPF)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelInformarCPF)
                        .addComponent(jTextFieldProcurarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonListarRG)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRG)
                        .addComponent(jTextFieldProcurarRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonListarSalario)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSalario)
                        .addComponent(jTextFieldProcurarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxClassProblema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxOrdemServico)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonListarTudo)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxCliente)
                    .addComponent(jCheckBoxFuncionario)
                    .addComponent(jCheckBoxClassProblema)
                    .addComponent(jCheckBoxOrdemServico))
                .addGap(18, 18, 18)
                .addComponent(jButtonListarTudo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCPFActionPerformed
        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();
        ClassificacaoProblema classProblema = new ClassificacaoProblema();
        OrdemServico ordemServico = new OrdemServico();       
        try 
        {
            
            if (jCheckBoxCliente.isSelected() == true) 
            {
                try 
                {                                                                                                  
                    NegocioCliente negocioClienteCpf = new NegocioCliente();
                    cliente.setCpf(jTextFieldProcurarCPF.getText()); 
                    cliente.setNome(jTextFieldNome.getText());
                    cliente.setRg(jTextFieldProcurarRG.getText());
                    this.respostaCliente = negocioClienteCpf.listarClientes(cliente);
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});
                    
                    for (Cliente c : this.respostaCliente) 
                    {
                        modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getRg()});
                    }
                    jTableListar.setModel(modelo);
                                        
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } 
            else 
            {
                if (jCheckBoxFuncionario.isSelected() == true) 
                {
                    try 
                    {
                        NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
                        funcionario.setCpf(jTextFieldProcurarCPF.getText());
                        funcionario.setNome(jTextFieldNome.getText());
                        funcionario.setRg(jTextFieldProcurarRG.getText());
                        this.respostaFuncionario = negocioFuncionario.listarFuncionario(funcionario);
                        DefaultTableModel modelo = new DefaultTableModel();
                        modelo.setColumnIdentifiers(new Object[]{"Matrícula", "Nome", "CPF", "RG", "Salário"});

                        for (Funcionario f : this.respostaFuncionario) 
                        {
                            modelo.addRow(new Object[]{f.getMatricula(), f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
                        }

                        jTableListar.setModel(modelo);
                    } 
                    catch (Exception e) 
                    {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else
                {
                    if(jCheckBoxClassProblema.isSelected() == true)
                    {
                        try
                        {
                            if(jTextFieldProcurarCPF.getText().equals(""))
                            {
                                return;
                            }
                            classProblema.setCod_ClassProblema(Integer.parseInt(jTextFieldProcurarCPF.getText()));
                            NegocioClassificacaoProblema negocioClass = new NegocioClassificacaoProblema();
                            this.respostaClass = negocioClass.listarClassProblema(classProblema);
                            DefaultTableModel modelo = new DefaultTableModel();
                            modelo.setColumnIdentifiers(new Object[]{"Código", "Descrição", "Nome"});
                            for (ClassificacaoProblema classProblema1 : this.respostaClass) 
                            {
                                modelo.addRow(new Object[]{classProblema1.getCod_ClassProblema(), classProblema1.getDescricao(), classProblema1.getNomeClassProblema()});                            
                            }
                            jTableListar.setModel(modelo);
                        }
                            catch (Exception e)
                            {
                                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
                            }
                    }
                    else
                    {
                        if(jCheckBoxOrdemServico.isSelected() == true)
                        {
                            try
                            {
                                ordemServico.getCliente().setNome(jTextFieldNome.getText());
                                ordemServico.getCliente().setCpf(jTextFieldProcurarCPF.getText());
                                ordemServico.getFuncionario().setNome(jTextFieldProcurarRG.getText());
                                NegocioOrdemServico negocioOrdem = new NegocioOrdemServico();
                                this.respostaOrdem = negocioOrdem.listarOrdemServico(ordemServico);
                                DefaultTableModel modelo = new DefaultTableModel();
                                String sta = OrdemServico.CANCELADA;
                                modelo.setColumnIdentifiers(new Object[]{"Status","Cliente", "CPF do Cliente", "Funcionario", "Data de Cadastro", "Codigo"});
                                for (OrdemServico os : this.respostaOrdem) 
                                {
                                    modelo.addRow(new Object[]{os.getStatusOrdemServico(), os.getCliente().getNome(), os.getCliente().getCpf(), os.getFuncionario().getNome(), os.getDataCadastro(), os.getClassificacaoProblema().getNomeClassProblema()});
                                }
                                jTableListar.setModel(modelo);
                            }
                            catch (Exception e)
                            {
                                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonListarCPFActionPerformed

    private void jCheckBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxClienteActionPerformed
        if (jCheckBoxCliente.isSelected() == true) 
        {
            jCheckBoxFuncionario.setVisible(false);
            jCheckBoxClassProblema.setVisible(false);
            jCheckBoxOrdemServico.setVisible(false);
            jLabelInformarCPF.setVisible(true);
            jButtonListarCPF.setVisible(true);
            jLabelInformarCPF.setText("CPF");
            jButtonListarTudo.setVisible(true);
            jTextFieldProcurarCPF.setVisible(true);
            jButtonListarNome.setVisible(true);
            jButtonListarRG.setVisible(true);
            jTextFieldProcurarCPF.setVisible(true);
            jTextFieldProcurarRG.setVisible(true);
            jTextFieldNome.setVisible(true);
            jLabelNome.setVisible(true);
            jLabelRG.setVisible(true);
        }
        if (jCheckBoxCliente.isSelected() == false) 
        {
            jTextFieldProcurarCPF.setVisible(false);
            jButtonListarNome.setVisible(false);
            jButtonListarRG.setVisible(false);
            jTextFieldProcurarCPF.setVisible(false);
            jTextFieldProcurarRG.setVisible(false);
            jTextFieldNome.setVisible(false);
            jLabelNome.setVisible(false);
            jLabelRG.setVisible(false);       
            jCheckBoxFuncionario.setVisible(true);
            jCheckBoxOrdemServico.setVisible(true);
            jCheckBoxClassProblema.setVisible(true);
            resetarTable();
            jTextFieldProcurarCPF.setVisible(false);
            jLabelInformarCPF.setVisible(false);
            jButtonListarCPF.setVisible(false);
            jButtonListarTudo.setVisible(false);
            
        }
    }//GEN-LAST:event_jCheckBoxClienteActionPerformed

    private void jCheckBoxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFuncionarioActionPerformed
        if (jCheckBoxFuncionario.isSelected() == true) {
            jCheckBoxCliente.setVisible(false);
            jCheckBoxOrdemServico.setVisible(false);
            jCheckBoxClassProblema.setVisible(false);
            
            jLabelInformarCPF.setVisible(true);
            jLabelNome.setVisible(true);
            jLabelRG.setVisible(true);
            jLabelSalario.setVisible(true);
            
            jButtonListarCPF.setVisible(true);
            jButtonListarRG.setVisible(true);
            jButtonListarNome.setVisible(true);
            
            jButtonListarTudo.setVisible(true);
            jButtonListarSalario.setVisible(true);
            
            jTextFieldProcurarCPF.setVisible(true);
            jTextFieldProcurarRG.setVisible(true);
            jTextFieldNome.setVisible(true);
            jTextFieldProcurarSalario.setVisible(true);
        }
        if (jCheckBoxFuncionario.isSelected() == false) {
            jCheckBoxCliente.setVisible(true);
            jCheckBoxOrdemServico.setVisible(true);
            jCheckBoxClassProblema.setVisible(true);
            jLabelInformarCPF.setVisible(false);
            
            jButtonListarCPF.setVisible(false);
            jButtonListarTudo.setVisible(false);
            
            jTextFieldProcurarCPF.setVisible(false);
            jTextFieldProcurarRG.setVisible(false);
            jTextFieldNome.setVisible(false);
            jTextFieldProcurarSalario.setVisible(false);
            
            jLabelInformarCPF.setVisible(false);
            jLabelNome.setVisible(false);
            jLabelRG.setVisible(false);
            jLabelSalario.setVisible(false);
            
            jButtonListarCPF.setVisible(false);
            jButtonListarRG.setVisible(false);
            jButtonListarNome.setVisible(false);
            jButtonListarSalario.setVisible(false);
            
            resetarTable();
        }
    }//GEN-LAST:event_jCheckBoxFuncionarioActionPerformed

    private void jCheckBoxClassProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxClassProblemaActionPerformed
        if(jCheckBoxClassProblema.isSelected() == true)
        {
            jCheckBoxCliente.setVisible(false);
            jCheckBoxOrdemServico.setVisible(false);
            jCheckBoxFuncionario.setVisible(false);
            jLabelInformarCPF.setVisible(true);
            jButtonListarCPF.setVisible(true);
            jLabelInformarCPF.setText("Código");
            jButtonListarTudo.setVisible(true);
            jTextFieldProcurarCPF.setVisible(true);
            jLabelNome.setVisible(true);
            jLabelNome.setText("Nome");
            jTextFieldNome.setVisible(true);
            jButtonListarNome.setVisible(true);
            jLabelRG.setVisible(true);
            jLabelRG.setText("Descrição");
            jTextFieldProcurarRG.setVisible(true);
            jButtonListarRG.setVisible(true);
        }
        if(jCheckBoxClassProblema.isSelected() == false)
        {
            jCheckBoxCliente.setVisible(true);
            jCheckBoxFuncionario.setVisible(true);
            jCheckBoxOrdemServico.setVisible(true);
            jLabelInformarCPF.setVisible(false);
            jButtonListarCPF.setVisible(false);
            jButtonListarTudo.setVisible(false);
            jTextFieldProcurarCPF.setVisible(false);
            jLabelNome.setVisible(false);
            jTextFieldNome.setVisible(false);
            jButtonListarNome.setVisible(false);
            jLabelRG.setVisible(false);
            jTextFieldProcurarRG.setVisible(false);
            jButtonListarRG.setVisible(false);
            resetarTable();
        }
    }//GEN-LAST:event_jCheckBoxClassProblemaActionPerformed

    private void jButtonListarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarTudoActionPerformed
        if (jCheckBoxCliente.isSelected() == true)
        {
            try
            {
                Cliente cliente = new Cliente();
                NegocioCliente negocioCliente = new NegocioCliente();
                this.respostaCliente = negocioCliente.listarClientes(cliente);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[] {"Nome", "CPF", "RG"});
                
                for (Cliente c : this.respostaCliente) 
                {
                    modelo.addRow(new Object []{ c.getNome(), c.getCpf(), c.getRg()});
                }
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        if (jCheckBoxFuncionario.isSelected() == true)
        {
            try
            {
                Funcionario funcionario = new Funcionario();
                NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
                this.respostaFuncionario = negocioFuncionario.listarFuncionario(funcionario);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Matrícula", "Nome", "CPF", "RG", "Salário"});

                for (Funcionario f : this.respostaFuncionario) 
                {
                    modelo.addRow(new Object[]{f.getMatricula(), f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
                }
                
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }            
        }
        if (jCheckBoxClassProblema.isSelected() == true)
        {
            try
            {
                ClassificacaoProblema classProblema = new ClassificacaoProblema();
                NegocioClassificacaoProblema negocioClass = new NegocioClassificacaoProblema();
                this.respostaClass = negocioClass.listarClassProblema(classProblema);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[] {"Nome", "Código", "Descrição"});
                
                for (ClassificacaoProblema cl : this.respostaClass) 
                {
                    modelo.addRow(new Object[]{cl.getNomeClassProblema(), cl.getCod_ClassProblema(), cl.getDescricao()});
                }
                
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        if (jCheckBoxOrdemServico.isSelected() == true)
        {
            try
            {
                OrdemServico ordemServico = new OrdemServico();
                NegocioOrdemServico negocioOrdem = new NegocioOrdemServico();
                this.respostaOrdem = negocioOrdem.listarOrdemServico(ordemServico);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Status","Cliente", "CPF do Cliente", "Funcionario", "Data de Cadastro", "Codigo"});
                for (OrdemServico os : this.respostaOrdem) 
                {
                    modelo.addRow(new Object[]{os.getStatusOrdemServico(), os.getCliente().getNome(), os.getCliente().getCpf(), os.getFuncionario().getNome(), os.getDataCadastro(), os.getClassificacaoProblema().getNomeClassProblema()});
                }
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonListarTudoActionPerformed

    private void jCheckBoxOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOrdemServicoActionPerformed

        if (jCheckBoxOrdemServico.isSelected() == true)
        {
            jCheckBoxCliente.setVisible(false);
            jCheckBoxClassProblema.setVisible(false);
            jCheckBoxFuncionario.setVisible(false);
            jLabelInformarCPF.setVisible(true);
            jButtonListarCPF.setVisible(true);
            jLabelInformarCPF.setText("CPF do Cliente");
            jLabelNome.setVisible(true);
            jLabelNome.setText("Cliente");
            jTextFieldNome.setVisible(true);
            jLabelRG.setVisible(true);
            jLabelRG.setText("Funcionário");
            jTextFieldProcurarRG.setVisible(true);
            jButtonListarRG.setVisible(true);
            jButtonListarNome.setVisible(true);
            jButtonListarTudo.setVisible(true);
            jTextFieldProcurarCPF.setVisible(true);
        }
        if (jCheckBoxOrdemServico.isSelected() == false) {
            
            jCheckBoxCliente.setVisible(true);
            jCheckBoxFuncionario.setVisible(true);
            jCheckBoxClassProblema.setVisible(true);
            jCheckBoxFuncionario.setVisible(true);
            jLabelInformarCPF.setVisible(false);
            jButtonListarCPF.setVisible(false);
            jButtonListarTudo.setVisible(false);
            jTextFieldProcurarCPF.setVisible(false);
            resetarTable();
        }
    }//GEN-LAST:event_jCheckBoxOrdemServicoActionPerformed

    private void jTableListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarMouseClicked
      
    }//GEN-LAST:event_jTableListarMouseClicked

    private void jTableListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarMousePressed
        jTableListar.editingCanceled(null);
        jTableListar.editingStopped(null);  
    }//GEN-LAST:event_jTableListarMousePressed

    private void jTableListarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListarKeyTyped
        jTableListar.editingCanceled(null);
        jTableListar.editingStopped(null);
    }//GEN-LAST:event_jTableListarKeyTyped

    private void jButtonListarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarNomeActionPerformed
        if(jCheckBoxCliente.isSelected() == true)
        {
            try
            {
                Cliente cliente = new Cliente();
                NegocioCliente negocioCliente = new NegocioCliente();
                cliente.setNome(jTextFieldNome.getText());  
                cliente.setCpf(jTextFieldProcurarCPF.getText());
                cliente.setRg(jTextFieldProcurarRG.getText());
                this.respostaCliente = negocioCliente.listarClientes(cliente);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});

                for (Cliente c : this.respostaCliente) 
                {
                    modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getRg()});
                }

                jTableListar.setModel(modelo);
            }

            catch(Exception  e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        if(jCheckBoxFuncionario.isSelected() == true)
        {
            try
            {
                Funcionario funcionario = new Funcionario();
                NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
                funcionario.setRg(jTextFieldProcurarRG.getText());        
                funcionario.setNome(jTextFieldNome.getText());
                funcionario.setCpf(jTextFieldProcurarCPF.getText());
                this.respostaFuncionario = negocioFuncionario.listarFuncionario(funcionario);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Matrícula","Nome", "CPF", "RG", "Salário"});

                for (Funcionario f : this.respostaFuncionario) 
                {
                    modelo.addRow(new Object[]{f.getMatricula(), f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
                }

                jTableListar.setModel(modelo);
            }
            catch(Exception  e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxClassProblema.isSelected() == true)
        {
            try
            {
                ClassificacaoProblema classProblema = new ClassificacaoProblema();
                classProblema.setNomeClassProblema(jTextFieldNome.getText());
                classProblema.setDescricao(jTextFieldProcurarRG.getText());
                NegocioClassificacaoProblema negocioClass = new NegocioClassificacaoProblema();
                this.respostaClass = negocioClass.listarClassProblema(classProblema);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Código", "Descrição", "Nome"});
                for (ClassificacaoProblema classProblema1 : this.respostaClass) 
                {
                    modelo.addRow(new Object[]{classProblema1.getCod_ClassProblema(), classProblema1.getDescricao(), classProblema1.getNomeClassProblema()});                            
                }
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxOrdemServico.isSelected() == true)
        {
            try
            {
                OrdemServico ordemServico = new OrdemServico();
                ordemServico.getCliente().setNome(jTextFieldNome.getText());
                ordemServico.getCliente().setCpf(jTextFieldProcurarCPF.getText());
                ordemServico.getFuncionario().setNome(jTextFieldProcurarRG.getText());
                NegocioOrdemServico negocioOrdem = new NegocioOrdemServico();
                this.respostaOrdem = negocioOrdem.listarOrdemServico(ordemServico);
                DefaultTableModel modelo = new DefaultTableModel();
                String sta = OrdemServico.CANCELADA;
                modelo.setColumnIdentifiers(new Object[]{"Status","Cliente", "CPF do Cliente", "Funcionario", "Data de Cadastro", "Codigo"});
                for (OrdemServico os : this.respostaOrdem) 
                {
                    modelo.addRow(new Object[]{os.getStatusOrdemServico(), os.getCliente().getNome(), os.getCliente().getCpf(), os.getFuncionario().getNome(), os.getDataCadastro(), os.getClassificacaoProblema().getNomeClassProblema()});
                }
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonListarNomeActionPerformed

    private void jButtonListarRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarRGActionPerformed
        if(jCheckBoxCliente.isSelected() == true)
        {
            try
            {
                Cliente cliente = new Cliente();
                NegocioCliente negocioCliente = new NegocioCliente();
                cliente.setRg(jTextFieldProcurarRG.getText());        
                cliente.setNome(jTextFieldNome.getText());
                cliente.setCpf(jTextFieldProcurarCPF.getText());
                this.respostaCliente = negocioCliente.listarClientes(cliente);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});

                for (Cliente c : this.respostaCliente) 
                {
                    modelo.addRow(new Object[]{c.getNome(), c.getCpf(), c.getRg()});
                }

                jTableListar.setModel(modelo);
            }
            catch(Exception  e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxFuncionario.isSelected() == true)
        {
            try
            {
                Funcionario funcionario = new Funcionario();
                NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
                funcionario.setRg(jTextFieldProcurarRG.getText());        
                funcionario.setNome(jTextFieldNome.getText());
                funcionario.setCpf(jTextFieldProcurarCPF.getText());
                this.respostaFuncionario = negocioFuncionario.listarFuncionario(funcionario);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Matrícula","Nome", "CPF", "RG", "Salário"});

                for (Funcionario f : this.respostaFuncionario) 
                {
                    modelo.addRow(new Object[]{f.getMatricula(), f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
                }

                jTableListar.setModel(modelo);
            }
            catch(Exception  e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxClassProblema.isSelected() == true)
        {
            try
            {
                ClassificacaoProblema classProblema = new ClassificacaoProblema();
                classProblema.setNomeClassProblema(jTextFieldNome.getText());
                classProblema.setDescricao(jTextFieldProcurarRG.getText());
                NegocioClassificacaoProblema negocioClass = new NegocioClassificacaoProblema();
                this.respostaClass = negocioClass.listarClassProblema(classProblema);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Código", "Descrição", "Nome"});
                for (ClassificacaoProblema classProblema1 : this.respostaClass) 
                {
                    modelo.addRow(new Object[]{classProblema1.getCod_ClassProblema(), classProblema1.getDescricao(), classProblema1.getNomeClassProblema()});                            
                }
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxOrdemServico.isSelected() == true)
        {
            try
            {
                OrdemServico ordemServico = new OrdemServico();
                ordemServico.getCliente().setNome(jTextFieldNome.getText());
                ordemServico.getCliente().setCpf(jTextFieldProcurarCPF.getText());
                ordemServico.getFuncionario().setNome(jTextFieldProcurarRG.getText());
                NegocioOrdemServico negocioOrdem = new NegocioOrdemServico();
                this.respostaOrdem = negocioOrdem.listarOrdemServico(ordemServico);
                DefaultTableModel modelo = new DefaultTableModel();
                String sta = OrdemServico.CANCELADA;
                modelo.setColumnIdentifiers(new Object[]{"Status","Cliente", "CPF do Cliente", "Funcionario", "Data de Cadastro", "Codigo"});
                for (OrdemServico os : this.respostaOrdem) 
                {
                    modelo.addRow(new Object[]{os.getStatusOrdemServico(), os.getCliente().getNome(), os.getCliente().getCpf(), os.getFuncionario().getNome(), os.getDataCadastro(), os.getClassificacaoProblema().getNomeClassProblema()});
                }
                jTableListar.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonListarRGActionPerformed

    private void jButtonListarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarSalarioActionPerformed
        if(jCheckBoxFuncionario.isSelected() == true)
        {
            try
            {
                Funcionario funcionario = new Funcionario();
                NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
                funcionario.setSalario(Double.parseDouble(jTextFieldProcurarSalario.getText()));
                this.respostaFuncionario = negocioFuncionario.listarFuncionario(funcionario);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Matrícula","Nome", "CPF", "RG", "Salário"});

                for (Funcionario f : this.respostaFuncionario) 
                {
                    modelo.addRow(new Object[]{f.getMatricula(), f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
                }

                jTableListar.setModel(modelo);
            }
            catch(Exception  e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonListarSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(ListarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarGUI().setVisible(true);               
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonListarCPF;
    private javax.swing.JButton jButtonListarNome;
    private javax.swing.JButton jButtonListarRG;
    private javax.swing.JButton jButtonListarSalario;
    private javax.swing.JButton jButtonListarTudo;
    private javax.swing.JCheckBox jCheckBoxClassProblema;
    private javax.swing.JCheckBox jCheckBoxCliente;
    private javax.swing.JCheckBox jCheckBoxFuncionario;
    private javax.swing.JCheckBox jCheckBoxOrdemServico;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInformarCPF;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListar;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldProcurarCPF;
    private javax.swing.JTextField jTextFieldProcurarRG;
    private javax.swing.JTextField jTextFieldProcurarSalario;
    // End of variables declaration//GEN-END:variables

}
