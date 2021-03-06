package br.com.gestaodeestoque.Views;

import br.com.gestaodeestoque.Models.FuncionarioModelo;
import br.com.gestaodeestoque.dao.FuncionarioDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InternalFrmFuncionario extends javax.swing.JInternalFrame {

    //Centralizar Form
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }

    public InternalFrmFuncionario() {
        initComponents();
    }

    DefaultTableModel tabela;

    public DefaultTableModel ListarFuncionario() {
        //Listar
        try {
            FuncionarioDAO novodao = new FuncionarioDAO();
            List<FuncionarioModelo> listadeusuarios = novodao.listarFuncionarios();

            DefaultTableModel modelo = (DefaultTableModel) tabelaCadUsu.getModel();
            modelo.setNumRows(0);
            DefaultTableModel modelo1 = (DefaultTableModel) tabelaCadUsu1.getModel();
            modelo1.setNumRows(0);

            for (FuncionarioModelo usumodel : listadeusuarios) {
                modelo.addRow(new Object[]{
                    usumodel.getFuncionario_id(),
                    usumodel.getFuncionario_nome(),
                    usumodel.getFuncionario_email(),
                    usumodel.getFuncionario_login(),
                    usumodel.getFuncionario_celular()
                });
                modelo1.addRow(new Object[]{
                    usumodel.getFuncionario_id(),
                    usumodel.getFuncionario_nome(),
                    usumodel.getFuncionario_email(),
                    usumodel.getFuncionario_login(),
                    usumodel.getFuncionario_celular()
                });
            }
            return modelo1;
        } catch (Exception e) {
            throw new RuntimeException("Ops, ocorreu um erro ao listar os Funcionários: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnLimpar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCadNome = new javax.swing.JTextField();
        txtCadEmail = new javax.swing.JTextField();
        txtCadLogin = new javax.swing.JTextField();
        txtCadCel = new javax.swing.JFormattedTextField();
        txtCadSenha = new javax.swing.JPasswordField();
        txtCadSenha1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCadCod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblImagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadUsu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCadUsu1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        chkExibirT = new javax.swing.JCheckBox();
        txtProcura = new javax.swing.JTextField();
        cmbPropriedades = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Cadastro de Funcionário");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setFloatable(false);

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesteste/Funcionario/perfilComMaisinho2.png"))); // NOI18N
        btnLimpar.setText("Novo");
        btnLimpar.setFocusable(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLimpar);

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesteste/Funcionario/perfilComSalvar.al2.png"))); // NOI18N
        btnInserir.setText("Salvar");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInserir);

        btnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesteste/Funcionario/perfilComAtualizar.png"))); // NOI18N
        btnAlterar1.setText("Alterar");
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterar1);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesteste/Funcionario/perfilComExluir.al2.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluir);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel15.setText("|");
        jLabel15.setEnabled(false);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToolBar1.add(jLabel15);

        btnProcurar.setText("Procurar");
        btnProcurar.setFocusable(false);
        btnProcurar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProcurar);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Celular");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Login");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Senha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        txtCadNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCadNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 500, -1));
        jPanel1.add(txtCadEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 770, -1));
        jPanel1.add(txtCadLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 240, -1));

        try {
            txtCadCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCadCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 210, -1));
        jPanel1.add(txtCadSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 170, -1));
        jPanel1.add(txtCadSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 170, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Repita sua Senha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Código");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtCadCod.setEnabled(false);
        txtCadCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadCodActionPerformed(evt);
            }
        });
        jPanel1.add(txtCadCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, -1));

        jLabel8.setText("Perfil");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Vendedor", "Administrador" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 240, -1));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesteste/fundo_opaco.png"))); // NOI18N
        jPanel1.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 320));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaCadUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Email", "Login", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCadUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadUsuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadUsu);
        if (tabelaCadUsu.getColumnModel().getColumnCount() > 0) {
            tabelaCadUsu.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaCadUsu.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaCadUsu.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1008, 220));

        tabelaCadUsu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Email", "Login", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCadUsu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadUsu1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCadUsu1);
        if (tabelaCadUsu1.getColumnModel().getColumnCount() > 0) {
            tabelaCadUsu1.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaCadUsu1.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaCadUsu1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1008, 220));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Procurar por");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 20));

        chkExibirT.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        chkExibirT.setSelected(true);
        chkExibirT.setText("Exibir Todos");
        chkExibirT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkExibirTItemStateChanged(evt);
            }
        });
        jPanel2.add(chkExibirT, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));
        jPanel2.add(txtProcura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 252, -1));

        cmbPropriedades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "id", "email", "login", "celular" }));
        jPanel2.add(cmbPropriedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 75, -1));

        jTabbedPane1.addTab("Funcionários Cadastrados", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1040, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadNomeActionPerformed

    private void tabelaCadUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadUsuMouseClicked
        //Pegar dados da Tabela
        txtCadCod.setText(tabelaCadUsu.getValueAt(tabelaCadUsu.getSelectedRow(), 0).toString());
        txtCadNome.setText(tabelaCadUsu.getValueAt(tabelaCadUsu.getSelectedRow(), 1).toString());
        txtCadEmail.setText(tabelaCadUsu.getValueAt(tabelaCadUsu.getSelectedRow(), 2).toString());
        txtCadCel.setText(tabelaCadUsu.getValueAt(tabelaCadUsu.getSelectedRow(), 4).toString());
        txtCadLogin.setText(tabelaCadUsu.getValueAt(tabelaCadUsu.getSelectedRow(), 3).toString());
        txtCadSenha.setText(null);
        txtCadSenha1.setText(null);
    }//GEN-LAST:event_tabelaCadUsuMouseClicked

    private void txtCadCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadCodActionPerformed

    private void LimparDados() {
        txtCadCod.setText(null);
        txtCadNome.setText(null);
        txtCadEmail.setText(null);
        txtCadLogin.setText(null);
        txtCadCel.setText(null);
        txtCadSenha.setText(null);
        txtCadSenha1.setText(null);
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // limpar
        LimparDados();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        //cadastrar só O ESTOQUE E PEGAR O PROD OCM O NOME MAS NOS COD PELO ID
        String senha1, senha2;
        senha1 = txtCadSenha.getText();
        senha2 = txtCadSenha1.getText();

        //fazer um while para verificar
        if (txtCadNome.getText().equals("") || txtCadEmail.getText().equals("") || txtCadCel.getText().equals("")
                || txtCadLogin.getText().equals("") || txtCadSenha.equals("") || /*verificaçao da senha nao funciona*/ txtCadSenha.equals(null)) {
            if (txtCadNome.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Nome Invalido.");
            } else if (txtCadEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Email Invalido.");
            } else if (txtCadCel.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Celular Invalido.");
            } else if (txtCadLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Login Invalido.");
            } else if (txtCadSenha.equals("")) {
                JOptionPane.showMessageDialog(null, "Senha Invalido.");
            } else {
                JOptionPane.showMessageDialog(null, "Dados Invalidos.");
            }
        } else if (senha1.equals(senha2)) {
            try {
                FuncionarioModelo funcionariomodelo = new FuncionarioModelo();
                funcionariomodelo.setFuncionario_nome(txtCadNome.getText());
                funcionariomodelo.setFuncionario_email(txtCadEmail.getText());
                funcionariomodelo.setFuncionario_celular(txtCadCel.getText());
                funcionariomodelo.setFuncionario_login(txtCadLogin.getText());
                funcionariomodelo.setFuncionario_senha(txtCadSenha.getText());

                //metodo
                FuncionarioDAO dao = new FuncionarioDAO();
                dao.cadastraFuncionario(funcionariomodelo);

                JOptionPane.showMessageDialog(null, "Usuario cadastrado ");
                ListarFuncionario();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Ops, ocorreu um erro: " + e);
            }
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
        // alterar
        DefaultTableModel modelo = (DefaultTableModel) tabelaCadUsu.getModel();
        try {
            int linhas = modelo.getRowCount();
            for (int l = 0; l < linhas; l++) {
                int colunas = modelo.getColumnCount();
                for (int c = 0; c < colunas; c++) {

                    if (this.tabela.getValueAt(l, c).equals(modelo.getValueAt(l, c))) {
                    } else {

                        FuncionarioModelo funcionariomodelo = new FuncionarioModelo();
                        FuncionarioDAO funcionariodao = new FuncionarioDAO();
                        funcionariomodelo.setFuncionario_id(Integer.parseInt(tabelaCadUsu.getValueAt(l, 0).toString()));
                        switch (c) {
                            case 1:
                                funcionariomodelo.setFuncionario_nome(tabelaCadUsu.getValueAt(l, c).toString());
                                funcionariodao.alterarNomeUsuario(funcionariomodelo);
                                JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");
                                break;
                            case 2:
                                funcionariomodelo.setFuncionario_email(tabelaCadUsu.getValueAt(l, c).toString());
                                funcionariodao.alterarEmailUsuario(funcionariomodelo);
                                JOptionPane.showMessageDialog(null, "Email alterado com sucesso!");
                                break;
                            case 3:
                                funcionariomodelo.setFuncionario_login(tabelaCadUsu.getValueAt(l, c).toString());
                                funcionariodao.alterarLoginUsuario(funcionariomodelo);
                                JOptionPane.showMessageDialog(null, "Login alterado com sucesso!");
                                break;
                            case 4:
                                funcionariomodelo.setFuncionario_celular(tabelaCadUsu.getValueAt(l, c).toString());
                                funcionariodao.alterarCelularUsuario(funcionariomodelo);
                                JOptionPane.showMessageDialog(null, "Celular alterado com sucesso!");
                                break;
                        }

                    }

                }

            }
            ListarFuncionario();

//            //abrir form para escolher qual usuario deseja alterar
//            FuncionarioModelo funcionariomodelo = new FuncionarioModelo();
//            funcionariomodelo.setFuncionario_nome(txtCadNome.getText());
//            funcionariomodelo.setFuncionario_email(txtCadEmail.getText());
//            funcionariomodelo.setFuncionario_celular(txtCadCel.getText());
//            funcionariomodelo.setFuncionario_login(txtCadLogin.getText());
//            funcionariomodelo.setFuncionario_senha(txtCadSenha.getText());
//            funcionariomodelo.setFuncionario_id(Integer.parseInt(txtCadCod.getText()));
//
//            //metodo
//            FuncionarioDAO dao = new FuncionarioDAO();
//            dao.alterarUsuario(funcionariomodelo);
//
//            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
//            ListarFuncionario();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ops, ocorreu um erro ao alterar os dados do usuário: " + e);
        }
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // exclui
        try {
            FuncionarioModelo funcionariomodelo = new FuncionarioModelo();

            if (tabelaCadUsu.getSelectedRow() == -1) {

                JOptionPane.showMessageDialog(null, "Nenhum produto selecionado, por favor tente selecionar a tabela novamente.");
            } else {

                funcionariomodelo.setFuncionario_id(Integer.parseInt(tabelaCadUsu.getValueAt(tabelaCadUsu.getSelectedRow(), 0).toString()));

                FuncionarioDAO dao = new FuncionarioDAO();
                dao.excluirUsuario(funcionariomodelo);

                JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
                ListarFuncionario();
                LimparDados();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, ocorreu um erro ao excluir os dados: " + e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        tabela = ListarFuncionario();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        if (txtProcura.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vázio!");
        } else {
            try {
//                chkExibirT.setSelected(false);
                FuncionarioDAO dao = new FuncionarioDAO();
//                String tipodeSelect = cmbPropriedades.getSelectedItem().toString();
                String campo = "";
                switch (cmbPropriedades.getSelectedIndex()) {
                    case 0:
                        campo = "funcionario_nome";
                        break;
                    case 1:
                        campo = "funcionario_id";
                        break;
                    case 2:
                        campo = "funcionario_email";
                        break;
                    case 3:
                        campo = "funcionario_login";
                        break;
                    case 4:
                        campo = "funcionario_celular";
                        break;

                }
                List<FuncionarioModelo> listadefuncionarios = dao.procurarFuncionariosPor(campo, txtProcura);

                DefaultTableModel modelo = (DefaultTableModel) tabelaCadUsu.getModel();
                modelo.setNumRows(0);

                for (FuncionarioModelo usumodel : listadefuncionarios) {
                    modelo.addRow(new Object[]{
                        usumodel.getFuncionario_id(),
                        usumodel.getFuncionario_nome(),
                        usumodel.getFuncionario_email(),
                        usumodel.getFuncionario_login(),
                        usumodel.getFuncionario_celular()
                    });
                }
//                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado." + e);
            }
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void chkExibirTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkExibirTItemStateChanged
        // TODO add your handling code here:
        if (chkExibirT.isSelected() == false) {
            DefaultTableModel modelo = (DefaultTableModel) tabelaCadUsu.getModel();
            modelo.setNumRows(0);
        } else {
            ListarFuncionario();
            txtProcura.setText("");
        }
    }//GEN-LAST:event_chkExibirTItemStateChanged

    private void tabelaCadUsu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadUsu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCadUsu1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JCheckBox chkExibirT;
    private javax.swing.JComboBox<String> cmbPropriedades;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTable tabelaCadUsu;
    private javax.swing.JTable tabelaCadUsu1;
    private javax.swing.JFormattedTextField txtCadCel;
    private javax.swing.JTextField txtCadCod;
    private javax.swing.JTextField txtCadEmail;
    private javax.swing.JTextField txtCadLogin;
    private javax.swing.JTextField txtCadNome;
    private javax.swing.JPasswordField txtCadSenha;
    private javax.swing.JPasswordField txtCadSenha1;
    private javax.swing.JTextField txtProcura;
    // End of variables declaration//GEN-END:variables
}
