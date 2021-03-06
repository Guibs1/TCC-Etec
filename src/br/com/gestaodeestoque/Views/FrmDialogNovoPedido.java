/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaodeestoque.Views;

import br.com.gestaodeestoque.Models.EstoqueModelo;
import br.com.gestaodeestoque.Models.FuncionarioModelo;
import br.com.gestaodeestoque.Models.ItensPedidosModelo;
import br.com.gestaodeestoque.Models.ProdutoModelo;
import br.com.gestaodeestoque.dao.EstoqueDAO;
import br.com.gestaodeestoque.dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guibs
 */
public class FrmDialogNovoPedido extends javax.swing.JDialog {

    /**
     * Creates new form FrmDialogNovoPedido
     */
    public FrmDialogNovoPedido(java.awt.Frame parent, boolean modal, FuncionarioModelo funcionarioatual) {
        super(parent, modal);
        initComponents();
        listDePesquisa.setVisible(false);
        listDePesquisaDescricao12.setVisible(false);
        funcionariomodelo = funcionarioatual;
    }
    int l = 0;
    ProdutoModelo produtomodeloall;
    static FuncionarioModelo funcionariomodelo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDeProdutos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtValorUni = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        listDePesquisaDescricao12 = new javax.swing.JList();
        txtNomeProd = new javax.swing.JTextField();
        listDePesquisa = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnProxTela = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 71, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel8.setText("Itens ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel9.setText("Total");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        txtTotal.setEnabled(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 160, 30));

        tabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor Uni.", "Quantidade", "Desconto", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaDeProdutos);
        if (tabelaDeProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaDeProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 270, 280));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Produto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel5.setText("Quantidade");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel6.setText("Valor Unitário");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, -1));

        txtValorUni.setEnabled(false);
        jPanel2.add(txtValorUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, 30));

        txtSubTotal.setEnabled(false);
        jPanel2.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 30));

        listDePesquisaDescricao12.setBorder(new javax.swing.border.MatteBorder(null));
        listDePesquisaDescricao12.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        listDePesquisaDescricao12.setEnabled(false);
        listDePesquisaDescricao12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDePesquisaDescricao12MouseClicked(evt);
            }
        });
        jPanel2.add(listDePesquisaDescricao12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        txtNomeProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeProdKeyReleased(evt);
            }
        });
        jPanel2.add(txtNomeProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 270, 30));

        listDePesquisa.setBorder(new javax.swing.border.MatteBorder(null));
        listDePesquisa.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        listDePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDePesquisaMouseClicked(evt);
            }
        });
        jPanel2.add(listDePesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, -1));

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        jLabel10.setText("Subtotal");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        btnProxTela.setText("Continuar");
        btnProxTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxTelaActionPerformed(evt);
            }
        });
        jPanel2.add(btnProxTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        btnVoltar.setText("Fechar");
        jPanel2.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtdKeyReleased(evt);
            }
        });
        jPanel2.add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 110, 30));

        jLabel7.setText("Desconto");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescontoKeyReleased(evt);
            }
        });
        jPanel2.add(txtDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(903, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void ListarProdutoList() {
        try {

            ProdutoDAO novodao = new ProdutoDAO();
            String campo = "produto_nome";
            List<ProdutoModelo> listadeprodutos = novodao.buscarProdutoPorNome(campo, txtNomeProd);

            DefaultListModel lista = new DefaultListModel();
            lista.removeAllElements();

            DefaultListModel lista2 = new DefaultListModel();
            lista2.removeAllElements();

            for (ProdutoModelo prodModel : listadeprodutos) {
                lista.addElement(prodModel);
                lista2.addElement(prodModel.getDescricaoProduto());
            }
            listDePesquisa.setModel(lista);
            listDePesquisaDescricao12.setModel(lista2);

        } catch (Exception e) {
            throw new RuntimeException("Ops, ocorreu um erro ao listar os Produtos no ComboBox" + e);
        }
    }
    private void listDePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDePesquisaMouseClicked
        // TODO add your handling code here:
        //        //COMPLETAR OS CAMPOS PRINCIPAIS
        ProdutoModelo produtomodelo = (ProdutoModelo) listDePesquisa.getSelectedValue();
//        txtNomeProd.setText(listDePesquisa.getSelectedValuesList().toString().replace("[", "").replace("]", ""));
        produtomodeloall= produtomodelo;
        txtNomeProd.setText(produtomodelo.toString());
        txtValorUni.setText(String.valueOf(produtomodelo.getPrecoVenda()));

        if (txtQtd.getText().equals("")) {
            txtSubTotal.setText("");
        } else if (Integer.parseInt(txtQtd.getText()) > 0) {
            txtSubTotal.setText(String.valueOf(Double.parseDouble(txtValorUni.getText()) * Integer.parseInt(txtQtd.getText())));
        }

        listDePesquisa.setVisible(false);
        listDePesquisaDescricao12.setVisible(false);

        // PREPARAR O OBJ PARA COMPLETAR A TABELA
        //        int selecionado = listDePesquisa.getSelectedIndex();
    }//GEN-LAST:event_listDePesquisaMouseClicked

    private void txtNomeProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdKeyReleased
        // TODO add your handling code here:

        if (txtNomeProd.getText().equals("")) {
            listDePesquisa.setVisible(false);
            listDePesquisaDescricao12.setVisible(false);

        } else {
            ListarProdutoList();
            listDePesquisa.setVisible(true);
            listDePesquisaDescricao12.setVisible(true);

        }
    }//GEN-LAST:event_txtNomeProdKeyReleased

    private void listDePesquisaDescricao12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDePesquisaDescricao12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listDePesquisaDescricao12MouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        if (txtQtd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos importantes vazios! Insira valores para continuar.");
        } else {
            double desconto = 0, valordodesconto, subtotal;
            subtotal = Double.parseDouble(txtSubTotal.getText());
            if (txtDesconto.getText().equals("0") || txtDesconto.getText().equals("")) {
            } else {
                desconto = Double.parseDouble(txtDesconto.getText());
                desconto = desconto / 100;
                valordodesconto = Double.parseDouble(txtSubTotal.getText()) * desconto;
                subtotal = Double.parseDouble(txtSubTotal.getText()) - valordodesconto;
            }

            DefaultTableModel tabela = (DefaultTableModel) tabelaDeProdutos.getModel();

            tabela.addRow(new Object[]{
                produtomodeloall,
                Double.parseDouble(txtValorUni.getText()),
                Integer.parseInt(txtQtd.getText()),
                desconto,
                subtotal
            });

            if (l == 0) {
                txtTotal.setText(tabelaDeProdutos.getValueAt(l, 4).toString());
                l++;
            } else {
                txtTotal.setText(String.valueOf(Double.parseDouble(txtTotal.getText()) + Double.parseDouble(tabelaDeProdutos.getValueAt(l, 4).toString())));
                l++;
            }
        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtQtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdKeyReleased
        // TODO add your handling code here:
        int i = 0;
        if (txtQtd.getText().equals("")) {
            txtSubTotal.setText("");
        } else if (Integer.parseInt(txtQtd.getText()) > i) {
            txtSubTotal.setText(String.valueOf(Double.parseDouble(txtValorUni.getText()) * Integer.parseInt(txtQtd.getText())));
        }
    }//GEN-LAST:event_txtQtdKeyReleased

    private void btnProxTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxTelaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        List<ItensPedidosModelo> listaitenspedidosmodelo = new ArrayList<ItensPedidosModelo>();
        //adicionar todos os itens da tabela no modelo. "list provavelmente"
        //CADASTRAR OS ITENS DA TABELA
        for (int l = 0; l < tabelaDeProdutos.getRowCount(); l++) {

            ProdutoModelo produto = (ProdutoModelo) tabelaDeProdutos.getValueAt(l, 0);
            ItensPedidosModelo itensmodelo = new ItensPedidosModelo();
            itensmodelo.setProduto(produto);
            itensmodelo.setItem_pedido_valor_unitario((double) tabelaDeProdutos.getValueAt(l, 1));
            itensmodelo.setItem_pedido_qtd(Integer.parseInt(tabelaDeProdutos.getValueAt(l, 2).toString()));
            itensmodelo.setItem_pedido_valor_desconto(Double.parseDouble(tabelaDeProdutos.getValueAt(l, 3).toString()));
            itensmodelo.setItem_pedido_valor_subtotal(Double.parseDouble(tabelaDeProdutos.getValueAt(l, 4).toString()));

            listaitenspedidosmodelo.add(itensmodelo);
        }

        FinalizarPedido finalizarpedidos = new FinalizarPedido(new javax.swing.JFrame(), true, listaitenspedidosmodelo, funcionariomodelo, Double.parseDouble(txtTotal.getText()));
        finalizarpedidos.setVisible(true);

    }//GEN-LAST:event_btnProxTelaActionPerformed

    private void txtDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyReleased
        // TODO add your handling code here:
        if (!txtDesconto.getText().equals(String.valueOf(0)) || !txtDesconto.getText().equals("")) {
            double desconto = Double.parseDouble(txtDesconto.getText()), valordodesconto, subtotal;
            desconto = desconto / 100;
            valordodesconto = Double.parseDouble(txtSubTotal.getText()) * desconto;
            txtSubTotal.setText(String.valueOf(Double.parseDouble(txtSubTotal.getText()) - valordodesconto));
        }

    }//GEN-LAST:event_txtDescontoKeyReleased

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
            java.util.logging.Logger.getLogger(FrmDialogNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDialogNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDialogNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDialogNovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDialogNovoPedido dialog = new FrmDialogNovoPedido(new javax.swing.JFrame(), true, funcionariomodelo);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnProxTela;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listDePesquisa;
    private javax.swing.JList listDePesquisaDescricao12;
    private javax.swing.JTable tabelaDeProdutos;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorUni;
    // End of variables declaration//GEN-END:variables
}
