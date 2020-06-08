/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ClienteDao;
import dao.ProdutoDao;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Produto;
import model.Usuario;

/**
 *
 * @author S.I
 */
public class Tela_Cad_Produto extends javax.swing.JFrame {

    Produto mod = new Produto();
    ProdutoDao cadastro = new ProdutoDao();
    dao.Conectar conectar = new dao.Conectar();

    int flag = 0;

    public Tela_Cad_Produto() {
        conectar.conexao();
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

        JlabelProduto = new javax.swing.JLabel();
        Painel_Tela_Cad_Produto = new javax.swing.JPanel();
        Nome_Tela_Cod = new javax.swing.JLabel();
        JTexFieldPesquisar = new javax.swing.JTextField();
        JButtonBuscar = new javax.swing.JButton();
        JButtonNovo = new javax.swing.JButton();
        JButtonSalvar = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        jLabelValorFornece = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelNomeFabr = new javax.swing.JLabel();
        jLabeldataFab = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelQtd_Estoque = new javax.swing.JLabel();
        jLabeCnpj = new javax.swing.JLabel();
        jLabelValidade = new javax.swing.JLabel();
        jLabelIdNomeProduto = new javax.swing.JLabel();
        jTextFieldQtd_Estoque = new javax.swing.JTextField();
        jFormattedTextFieldVlrFornecedor = new javax.swing.JFormattedTextField();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldIdNomeProduto = new javax.swing.JTextField();
        JComboBoxCategoria = new javax.swing.JComboBox();
        jFormattedTextFieldCnpj = new javax.swing.JFormattedTextField();
        jTextFieldNomeFabr = new javax.swing.JTextField();
        jFormattedTextFieldValidade = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jTextFielddescricao = new javax.swing.JTextField();
        jLabelValorVenda = new javax.swing.JLabel();
        jFormattedTextFieldVlrVenda = new javax.swing.JFormattedTextField();
        Nome_Tela_Mat = new javax.swing.JLabel();
        jTextFieldMatUsuario = new javax.swing.JTextField();
        Labelfundo = new javax.swing.JLabel();
        jLabelfundotitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlabelProduto.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JlabelProduto.setForeground(new java.awt.Color(255, 255, 255));
        JlabelProduto.setText("Cadastro de Produto");
        getContentPane().add(JlabelProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        Painel_Tela_Cad_Produto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Painel_Tela_Cad_Produto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome_Tela_Cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nome_Tela_Cod.setText("Cod");
        Painel_Tela_Cad_Produto.add(Nome_Tela_Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));
        Painel_Tela_Cad_Produto.add(JTexFieldPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 350, 31));

        JButtonBuscar.setText("Buscar");
        JButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Produto.add(JButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 107, 31));

        JButtonNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonNovo.setText("Novo");
        JButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonNovoActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Produto.add(JButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 84, 33));

        JButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonSalvar.setText("Salvar");
        JButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalvarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Produto.add(JButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 84, 33));

        JButtonAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonAlterar.setText("Alterar");
        JButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAlterarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Produto.add(JButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 84, 35));

        JButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Produto.add(JButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 84, 35));

        jLabelValorFornece.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelValorFornece.setText("Vlr.Fornecedor");
        Painel_Tela_Cad_Produto.add(jLabelValorFornece, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jLabelCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCategoria.setText("Categoria");
        Painel_Tela_Cad_Produto.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabelNomeFabr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomeFabr.setText("Nome Fabricante");
        Painel_Tela_Cad_Produto.add(jLabelNomeFabr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabeldataFab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeldataFab.setText("Data Fabricação");
        Painel_Tela_Cad_Produto.add(jLabeldataFab, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, -1));

        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescricao.setText("Descrição");
        Painel_Tela_Cad_Produto.add(jLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabelQtd_Estoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQtd_Estoque.setText("Qtd Estoque");
        Painel_Tela_Cad_Produto.add(jLabelQtd_Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 100, -1));

        jLabeCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeCnpj.setText("Cnpj");
        Painel_Tela_Cad_Produto.add(jLabeCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabelValidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelValidade.setText("Validade");
        Painel_Tela_Cad_Produto.add(jLabelValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, 20));

        jLabelIdNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdNomeProduto.setText("Nome Produto");
        Painel_Tela_Cad_Produto.add(jLabelIdNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));
        Painel_Tela_Cad_Produto.add(jTextFieldQtd_Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, 30));

        jFormattedTextFieldVlrFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        Painel_Tela_Cad_Produto.add(jFormattedTextFieldVlrFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 180, 30));
        Painel_Tela_Cad_Produto.add(jTextFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, 30));

        jTextFieldIdNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdNomeProdutoActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Produto.add(jTextFieldIdNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 400, 30));

        JComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ração", "Petisco", "Higiene", "Medicamento", "Brinquedo" }));
        Painel_Tela_Cad_Produto.add(JComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 80, 31));

        try {
            jFormattedTextFieldCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Painel_Tela_Cad_Produto.add(jFormattedTextFieldCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 180, 30));
        Painel_Tela_Cad_Produto.add(jTextFieldNomeFabr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 490, 30));

        try {
            jFormattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Painel_Tela_Cad_Produto.add(jFormattedTextFieldValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 120, 30));

        jLabel1.setText("Nome do Produto");
        Painel_Tela_Cad_Produto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Painel_Tela_Cad_Produto.add(jFormattedTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 140, 30));

        jTextFielddescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddescricaoActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Produto.add(jTextFielddescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 460, 30));

        jLabelValorVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelValorVenda.setText("Vlr.Venda");
        Painel_Tela_Cad_Produto.add(jLabelValorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jFormattedTextFieldVlrVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        Painel_Tela_Cad_Produto.add(jFormattedTextFieldVlrVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 180, 30));

        Nome_Tela_Mat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nome_Tela_Mat.setText("Mat_Usuario");
        Painel_Tela_Cad_Produto.add(Nome_Tela_Mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));
        Painel_Tela_Cad_Produto.add(jTextFieldMatUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 220, 30));

        Labelfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/user.jpg"))); // NOI18N
        Painel_Tela_Cad_Produto.add(Labelfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 950, 440));

        getContentPane().add(Painel_Tela_Cad_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 970, 460));

        jLabelfundotitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/azul.jpg"))); // NOI18N
        getContentPane().add(jLabelfundotitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 970, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNovoActionPerformed

        jTextFieldCod.setEnabled(true);
        jTextFieldIdNomeProduto.setEnabled(true);
        jTextFieldMatUsuario.setEnabled(true);
        jTextFieldNomeFabr.setEnabled(true);
        jTextFieldQtd_Estoque.setEnabled(true);
        jTextFielddescricao.setEnabled(true);
        jFormattedTextFieldCnpj.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        jFormattedTextFieldValidade.setEnabled(true);
        jFormattedTextFieldVlrFornecedor.setEnabled(true);
        jFormattedTextFieldVlrVenda.setEnabled(true);
        
        LimparCampos();
    }//GEN-LAST:event_JButtonNovoActionPerformed

    private void LimparCampos() {

        jTextFieldCod.setText("");
        jTextFieldIdNomeProduto.setText("");
        jTextFieldMatUsuario.setText("");
        jTextFieldNomeFabr.setText("");
        jTextFieldQtd_Estoque.setText("");
        jTextFielddescricao.setText("");
        jFormattedTextFieldCnpj.setText("");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldValidade.setText("");
        jFormattedTextFieldVlrFornecedor.setText("");
        jFormattedTextFieldVlrVenda.setText("");
        JTexFieldPesquisar.setText("");
    }

    private void JButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalvarActionPerformed

        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy"); 
        
        mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
        mod.setNome(jTextFieldIdNomeProduto.getText());
        mod.setDescricao(jTextFielddescricao.getText());
        mod.setData(jFormattedTextFieldData.getText());
        mod.setValidade(jFormattedTextFieldValidade.getText());
        mod.setFabricante(jTextFieldNomeFabr.getText());
        mod.setCnpj(jFormattedTextFieldCnpj.getText());
        mod.setEstoque(Double.parseDouble(jTextFieldQtd_Estoque.getText()));
        mod.setVlr_fornecedor(Double.parseDouble(jFormattedTextFieldVlrFornecedor.getText()));
        mod.setVlr_venda(Double.parseDouble(jFormattedTextFieldVlrVenda.getText()));
        mod.setMat_usuario(Integer.parseInt(jTextFieldMatUsuario.getText()));
        mod.setCategoria((String) JComboBoxCategoria.getSelectedItem());

        cadastro.Salvar(mod);
        LimparCampos();
    }//GEN-LAST:event_JButtonSalvarActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed
        jTextFieldCod.setEnabled(true);
        jTextFieldIdNomeProduto.setEnabled(true);
        jTextFieldMatUsuario.setEnabled(true);
        jTextFieldNomeFabr.setEnabled(true);
        jTextFieldQtd_Estoque.setEnabled(true);
        jTextFielddescricao.setEnabled(true);
        jFormattedTextFieldCnpj.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        jFormattedTextFieldValidade.setEnabled(true);
        jFormattedTextFieldVlrFornecedor.setEnabled(true);
        jFormattedTextFieldVlrVenda.setEnabled(true);
       
        ProdutoDao adao = new ProdutoDao();
        Produto a = new Produto();
        
        String cod = jTextFieldCod.getText();
        String produto = jTextFieldIdNomeProduto.getText();
        String usuario = jTextFieldMatUsuario.getText();
        String nome = jTextFieldNomeFabr.getText();
        String estoque = jTextFieldQtd_Estoque.getText();
        String descricao = jTextFielddescricao.getText();
        String cnpj = jFormattedTextFieldCnpj.getText();
        String data = jFormattedTextFieldData.getText();
        String validade = jFormattedTextFieldValidade.getText();
        String fornecedor = jFormattedTextFieldVlrFornecedor.getText();
        String venda = jFormattedTextFieldVlrVenda.getText();
        
       a.setCategoria(data);
       a.setCnpj(cnpj);
       a.setCodigo(flag);
       a.setData(data);
       a.setDescricao(descricao);
       a.setEstoque(Double.NaN);
       a.setFabricante(validade);
       a.setVlr_fornecedor(Double.MAX_VALUE);
       a.setVlr_venda(Double.MAX_VALUE);
       a.setMat_usuario(flag);
       a.setNome(nome);
 
        cadastro.Alterar(a);
        LimparCampos();
        
        
        
        
        
    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed
        LimparCampos();

    }//GEN-LAST:event_JButtonCancelarActionPerformed

    private void jTextFielddescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddescricaoActionPerformed

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed
       
        ProdutoDao proddao = new ProdutoDao();
        Produto a = new Produto();

        String busca = JTexFieldPesquisar.getText();
        String codigo = jTextFieldCod.getText();
        String categoria = (String) JComboBoxCategoria.getSelectedItem();
        String nome = jTextFieldIdNomeProduto.getText();
        String data = jFormattedTextFieldData.getText();
        String validade = jFormattedTextFieldValidade.getText();
        String fabricante = jTextFieldNomeFabr.getText();
        String cnpj = jFormattedTextFieldCnpj.getText();
        String qtd_estoque = jTextFieldQtd_Estoque.getText();
        String vlr_fornecedor = jFormattedTextFieldVlrFornecedor.getText();
        String vlr_venda = jFormattedTextFieldVlrVenda.getText();
        String mat_usu = jTextFieldMatUsuario.getText();
        String descricao = jTextFielddescricao.getText();
      
        a = proddao.Buscar(busca);
        
        if (a != null) {
            
            jTextFieldCod.setText(a.getCodigo().toString());
            JComboBoxCategoria.setSelectedItem(a.getCategoria());
            jTextFieldIdNomeProduto.setText(a.getNome());
            jFormattedTextFieldData.setText(a.getData());
            jFormattedTextFieldValidade.setText(a.getValidade());
            jTextFieldNomeFabr.setText(a.getFabricante());
            jFormattedTextFieldCnpj.setText(a.getCnpj());
            jTextFieldMatUsuario.setText(a.getMat_usuario().toString());
            jTextFielddescricao.setText(a.getDescricao());
            jTextFieldQtd_Estoque.setText(a.getEstoque().toString());
            jFormattedTextFieldVlrFornecedor.setText(a.getVlr_fornecedor().toString());
            jFormattedTextFieldVlrVenda.setText(a.getVlr_venda().toString());
          }
        else {
            JOptionPane.showMessageDialog(rootPane, "Produto Não Encontrado");
        }

    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void jTextFieldIdNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdNomeProdutoActionPerformed
        /*ProdutoDao pdao = new ProdutoDao();
        pdao.populaJTexField(jTextFieldIdNomeProduto);
        // TODO add your handling code here:*/
    }//GEN-LAST:event_jTextFieldIdNomeProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cad_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonNovo;
    private javax.swing.JButton JButtonSalvar;
    private javax.swing.JComboBox JComboBoxCategoria;
    private javax.swing.JTextField JTexFieldPesquisar;
    private javax.swing.JLabel JlabelProduto;
    private javax.swing.JLabel Labelfundo;
    private javax.swing.JLabel Nome_Tela_Cod;
    private javax.swing.JLabel Nome_Tela_Mat;
    private javax.swing.JPanel Painel_Tela_Cad_Produto;
    private javax.swing.JFormattedTextField jFormattedTextFieldCnpj;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldValidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldVlrFornecedor;
    private javax.swing.JFormattedTextField jFormattedTextFieldVlrVenda;
    private javax.swing.JLabel jLabeCnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelIdNomeProduto;
    private javax.swing.JLabel jLabelNomeFabr;
    private javax.swing.JLabel jLabelQtd_Estoque;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JLabel jLabelValorFornece;
    private javax.swing.JLabel jLabelValorVenda;
    private javax.swing.JLabel jLabeldataFab;
    private javax.swing.JLabel jLabelfundotitulo;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldIdNomeProduto;
    private javax.swing.JTextField jTextFieldMatUsuario;
    private javax.swing.JTextField jTextFieldNomeFabr;
    private javax.swing.JTextField jTextFieldQtd_Estoque;
    private javax.swing.JTextField jTextFielddescricao;
    // End of variables declaration//GEN-END:variables
}
