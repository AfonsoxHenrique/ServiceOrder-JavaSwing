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
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author aluno
 */
public class CriarOrdemGUI extends javax.swing.JFrame {
    
    ArrayList<Cliente> respostaCliente = new ArrayList<>();
    ArrayList<Funcionario> respostaFuncionario = new ArrayList<>();
    ArrayList<ClassificacaoProblema> respostaClassProblema = new ArrayList<>();
     ArrayList<OrdemServico> respostaOrdem = new ArrayList<>();
    /**
     * Creates new form CriarOrdemGUI
     */
    public void ListarTable()
    {
        try
        {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"SELECIONE O TIPO DE PROCURA"});                            
            jTable1.setModel(modelo);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void BotaoProcurar()
    {
        if(jCheckBoxCliente.isSelected() == true)
        {
            try
            {
                Cliente cliente = new Cliente();
                cliente.setNome(jTextFieldProcurarNome.getText());
                cliente.setCpf(jTextFieldProcurarCPF.getText());
                cliente.setRg(jTextFieldProcurarRG.getText());
                NegocioCliente negocioCliente = new NegocioCliente();
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
        }
        if(jCheckBoxFuncionario.isSelected() == true)
        {
            try
            {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(jTextFieldProcurarNome.getText());
                funcionario.setCpf(jTextFieldProcurarCPF.getText());
                funcionario.setRg(jTextFieldProcurarRG.getText());
                NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
                this.respostaFuncionario = negocioFuncionario.listarFuncionario(funcionario);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Matrícula","Nome", "CPF", "RG"});
                
                for (Funcionario f : this.respostaFuncionario) 
                {
                    modelo.addRow(new Object[]{f.getMatricula(), f.getNome(), f.getCpf(), f.getRg()});
                }
                jTable1.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxClassificação.isSelected() == true)
        {
            try
            {
                ClassificacaoProblema classProblema = new ClassificacaoProblema();
                classProblema.setDescricao(jTextFieldProcurarCPF.getText());
                classProblema.setNomeClassProblema(jTextFieldProcurarNome.getText());
                NegocioClassificacaoProblema negocioClass = new NegocioClassificacaoProblema();
                this.respostaClassProblema = negocioClass.listarClassProblema(classProblema);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Nome", "Descrição"});
                
                for (ClassificacaoProblema cl : this.respostaClassProblema) 
                {
                    modelo.addRow(new Object[]{cl.getNomeClassProblema(), cl.getDescricao()});
                }
                jTable1.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public CriarOrdemGUI() 
    {
        initComponents();
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        jTextAreaDescricaoProblema.setWrapStyleWord(true);
        jTextAreaDescricaoProblema.setLineWrap(true);
        ListarTable();
        jPanelListar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0)));
        jPanelDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0)));
        getContentPane().setBackground(Color.pink);
        jPanelListar.setBackground(Color.pink);
        jPanelDados.setBackground(Color.pink);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jTextFieldDataAtual.setText(formato.format(new Date(System.currentTimeMillis())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricaoProblema = new javax.swing.JTextArea();
        jPanelListar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldProcurarNome = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldProcurarCPF = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jTextFieldProcurarRG = new javax.swing.JTextField();
        jButtonProcurarNome = new javax.swing.JButton();
        jButtonProcurarCPF = new javax.swing.JButton();
        jButtonProcurarRG = new javax.swing.JButton();
        jCheckBoxCliente = new javax.swing.JCheckBox();
        jCheckBoxFuncionario = new javax.swing.JCheckBox();
        jCheckBoxClassificação = new javax.swing.JCheckBox();
        jPanelDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCPFCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMatriculaFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCodigoClassificacao = new javax.swing.JTextField();
        jTextFieldDataAtual = new javax.swing.JTextField();
        try
        {
            javax.swing.text.MaskFormatter data = new MaskFormatter("##/##/####");
            jTextFieldDataAtual = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        jSeparator3 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Descrição do Problema");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTextAreaDescricaoProblema.setColumns(20);
        jTextAreaDescricaoProblema.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextAreaDescricaoProblema.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescricaoProblema);

        jPanelListar.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

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
        ));
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

        jLabelNome.setText("Nome");

        jTextFieldProcurarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarNomeKeyTyped(evt);
            }
        });

        jLabelCPF.setText("CPF");

        jTextFieldProcurarCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarCPFKeyTyped(evt);
            }
        });

        jLabelRG.setText("RG");

        jTextFieldProcurarRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarRGKeyTyped(evt);
            }
        });

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

        jButtonProcurarRG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Ícones/lupa (2).png"))); // NOI18N
        jButtonProcurarRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarRGActionPerformed(evt);
            }
        });

        jCheckBoxCliente.setText("Clientes");
        jCheckBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxClienteActionPerformed(evt);
            }
        });

        jCheckBoxFuncionario.setText("Funcionários");
        jCheckBoxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFuncionarioActionPerformed(evt);
            }
        });

        jCheckBoxClassificação.setText("Classificação");
        jCheckBoxClassificação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxClassificaçãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListarLayout = new javax.swing.GroupLayout(jPanelListar);
        jPanelListar.setLayout(jPanelListarLayout);
        jPanelListarLayout.setHorizontalGroup(
            jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListarLayout.createSequentialGroup()
                        .addComponent(jLabelRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProcurarRG, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProcurarRG))
                    .addGroup(jPanelListarLayout.createSequentialGroup()
                        .addComponent(jLabelCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProcurarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProcurarCPF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListarLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jTextFieldProcurarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProcurarNome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListarLayout.createSequentialGroup()
                        .addComponent(jCheckBoxCliente)
                        .addGap(78, 78, 78)
                        .addComponent(jCheckBoxFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxClassificação)))
                .addContainerGap())
        );
        jPanelListarLayout.setVerticalGroup(
            jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxCliente)
                    .addComponent(jCheckBoxFuncionario)
                    .addComponent(jCheckBoxClassificação))
                .addGap(18, 18, 18)
                .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addGroup(jPanelListarLayout.createSequentialGroup()
                        .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonProcurarNome)
                            .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldProcurarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNome)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCPF)
                                .addComponent(jTextFieldProcurarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonProcurarCPF))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonProcurarRG)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldProcurarRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelRG)))))
                .addGap(4, 4, 4))
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel1.setText("Data");

        jLabel3.setText("CPF Cliente");

        jTextFieldCPFCliente.setEditable(false);

        jLabel4.setText("Matrícula");

        jTextFieldMatriculaFuncionario.setEditable(false);

        jLabel5.setText("Código");

        jTextFieldCodigoClassificacao.setEditable(false);

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldMatriculaFuncionario)
                        .addComponent(jTextFieldCodigoClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMatriculaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCodigoClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 189, 189))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 281, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrar)
                .addContainerGap())
        );

        jPanelListar.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
      
        try 
        {
            if(jTextFieldMatriculaFuncionario.getText().equals("") || jTextFieldCodigoClassificacao.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Selecione todos os dados necessarios", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            OrdemServico ordemServico = new OrdemServico();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataCadastro = new java.sql.Date (formato.parse(jTextFieldDataAtual.getText()).getTime());
            ordemServico.setDataCadastro(dataCadastro);
            ordemServico.getCliente().setCpf(jTextFieldCPFCliente.getText());
            ordemServico.setDescricaoProblema(jTextAreaDescricaoProblema.getText());
            ordemServico.getFuncionario().setMatricula(Integer.parseInt(jTextFieldMatriculaFuncionario.getText()));
            ordemServico.getClassificacaoProblema().setCod_ClassProblema(Integer.parseInt(jTextFieldCodigoClassificacao.getText()));

            NegocioOrdemServico negocioServico = new NegocioOrdemServico();
            negocioServico.cadastrarOrdemServico(ordemServico);
            JOptionPane.showMessageDialog(this, "Ordem de Serviço cadastrada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldProcurarCPF.setText("");
            jTextFieldProcurarRG.setText("");
            jTextFieldCPFCliente.setText("");
            jTextFieldMatriculaFuncionario.setText("");
            jTextFieldProcurarNome.setText("");
            jTextFieldCodigoClassificacao.setText(""); 
            jTextAreaDescricaoProblema.setText("");
            jCheckBoxCliente.setSelected(false);
            jCheckBoxFuncionario.setSelected(false);
            jCheckBoxClassificação.setSelected(false);
            jCheckBoxCliente.setEnabled(true);
            jCheckBoxFuncionario.setEnabled(true);
            jCheckBoxClassificação.setEnabled(true);
       } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jCheckBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxClienteActionPerformed
        if(jCheckBoxCliente.isSelected() == true)
        {
            try
            {
                jCheckBoxFuncionario.setEnabled(false);
                jCheckBoxClassificação.setEnabled(false);
                Cliente cliente = new Cliente();
                NegocioCliente negocioCliente = new NegocioCliente();
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
        }
        if(jCheckBoxCliente.isSelected() == false)
        {
            jCheckBoxClassificação.setEnabled(true);
            jCheckBoxFuncionario.setEnabled(true);
            ListarTable();
        }
    }//GEN-LAST:event_jCheckBoxClienteActionPerformed

    private void jCheckBoxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFuncionarioActionPerformed
        if(jCheckBoxFuncionario.isSelected() == true)
        {
            try
            {
                jCheckBoxCliente.setEnabled(false);
                jCheckBoxClassificação.setEnabled(false);
                Funcionario funcionario = new Funcionario();
                NegocioFuncionario negocioFuncionario = new NegocioFuncionario();
                this.respostaFuncionario = negocioFuncionario.listarFuncionario(funcionario);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Nome", "CPF", "RG"});
                
                for (Funcionario f : this.respostaFuncionario) 
                {
                    modelo.addRow(new Object[]{f.getNome(), f.getCpf(), f.getRg()});
                }
                jTable1.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxFuncionario.isSelected() == false)
        {
            jCheckBoxClassificação.setEnabled(true);
            jCheckBoxCliente.setEnabled(true);
            ListarTable();
        }
    }//GEN-LAST:event_jCheckBoxFuncionarioActionPerformed

    private void jCheckBoxClassificaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxClassificaçãoActionPerformed
        if(jCheckBoxClassificação.isSelected() == true)
        {
            try
            {
                jLabelRG.setVisible(false);
                jButtonProcurarRG.setEnabled(false);
                jTextFieldProcurarRG.setEnabled(false);
                jCheckBoxCliente.setEnabled(false);
                jCheckBoxFuncionario.setEnabled(false);
                jLabelNome.setText("Descrição");
                jLabelCPF.setText("Nome");
                ClassificacaoProblema classProblema = new ClassificacaoProblema();
                NegocioClassificacaoProblema negocioClass = new NegocioClassificacaoProblema();
                this.respostaClassProblema = negocioClass.listarClassProblema(classProblema);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.setColumnIdentifiers(new Object[]{"Nome", "Descrição"});
                for (ClassificacaoProblema cl : this.respostaClassProblema) 
                {
                    modelo.addRow(new Object[]{cl.getNomeClassProblema(), cl.getDescricao()});
                }
                jTable1.setModel(modelo);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(jCheckBoxClassificação.isSelected() == false)
        {
            jLabelRG.setVisible(true);
            jButtonProcurarRG.setEnabled(true);
            jTextFieldProcurarRG.setEnabled(true);
            jLabelNome.setText("Nome");
            jLabelCPF.setText("CPF");
            jCheckBoxCliente.setEnabled(true);
            jCheckBoxFuncionario.setEnabled(true);
            ListarTable();
        }
    }//GEN-LAST:event_jCheckBoxClassificaçãoActionPerformed

    private void jButtonProcurarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarNomeActionPerformed
        BotaoProcurar();
        jTable1.getFocusListeners();
    }//GEN-LAST:event_jButtonProcurarNomeActionPerformed

    private void jButtonProcurarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarCPFActionPerformed
        BotaoProcurar();
    }//GEN-LAST:event_jButtonProcurarCPFActionPerformed

    private void jButtonProcurarRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarRGActionPerformed
        BotaoProcurar();
    }//GEN-LAST:event_jButtonProcurarRGActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        MouseEvent e = evt;
        int click = e.getClickCount();
        int index = jTable1.getSelectedRow();
        if(click == 2)
        {
            if(jCheckBoxCliente.isSelected() == true)
            {
                Cliente cliente = this.respostaCliente.get(index);
                jTextFieldCPFCliente.setText(cliente.getCpf());
            }
            if(jCheckBoxFuncionario.isSelected() == true)
            {
                Funcionario funcionario = this.respostaFuncionario.get(index);
                jTextFieldMatriculaFuncionario.setText(String.valueOf(funcionario.getMatricula()));
            }
            if(jCheckBoxClassificação.isSelected() == true)
            {
                ClassificacaoProblema classProblema = this.respostaClassProblema.get(index);
                jTextFieldCodigoClassificacao.setText(String.valueOf(classProblema.getCod_ClassProblema()));
            }
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

    private void jTextFieldProcurarCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarCPFKeyTyped
        String caracteres = "0123456789";
        if(!caracteres.contains(evt.getKeyChar() + ""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldProcurarCPFKeyTyped

    private void jTextFieldProcurarRGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarRGKeyTyped
        String caracteres = "0123456789";
        if(!caracteres.contains(evt.getKeyChar() + ""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldProcurarRGKeyTyped

    private void jTextFieldProcurarNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarNomeKeyTyped
        String caracteres = "0123456789+-.*/+=§º~(){}[]&%$#@!|:;><,•◘○♦♣♠♥☻☺?";
        
        if(caracteres.contains(evt.getKeyChar() + ""))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldProcurarNomeKeyTyped

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
            java.util.logging.Logger.getLogger(CriarOrdemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarOrdemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarOrdemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarOrdemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarOrdemGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonProcurarCPF;
    private javax.swing.JButton jButtonProcurarNome;
    private javax.swing.JButton jButtonProcurarRG;
    private javax.swing.JCheckBox jCheckBoxClassificação;
    private javax.swing.JCheckBox jCheckBoxCliente;
    private javax.swing.JCheckBox jCheckBoxFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDescricaoProblema;
    private javax.swing.JTextField jTextFieldCPFCliente;
    private javax.swing.JTextField jTextFieldCodigoClassificacao;
    private javax.swing.JTextField jTextFieldDataAtual;
    private javax.swing.JTextField jTextFieldMatriculaFuncionario;
    private javax.swing.JTextField jTextFieldProcurarCPF;
    private javax.swing.JTextField jTextFieldProcurarNome;
    private javax.swing.JTextField jTextFieldProcurarRG;
    // End of variables declaration//GEN-END:variables
}
