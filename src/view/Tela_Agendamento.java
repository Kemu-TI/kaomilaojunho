/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AgendamentoDao;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Agendamento;

/**
 *
 * @author S.I
 */
public class Tela_Agendamento extends javax.swing.JFrame {

    Agendamento mod = new Agendamento();
    AgendamentoDao cadastro = new AgendamentoDao();
    dao.Conectar conectar = new dao.Conectar();
    dao.Conectar conex = new dao.Conectar();

    /**
     * Creates new form Tela_Agendamento
     */
    public Tela_Agendamento() {
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

        JlabelTipoAnimal = new javax.swing.JLabel();
        jTextFieldIdAnimal = new javax.swing.JTextField();
        jLabelIdAnimal = new javax.swing.JLabel();
        JComboBoxTipoAnimal = new javax.swing.JComboBox();
        jLabelCpf = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        JlabelTipoServiço = new javax.swing.JLabel();
        jLabeldataConsulta = new javax.swing.JLabel();
        jFormattedTextFieldHoraConsulta = new javax.swing.JFormattedTextField();
        JComboBoxTipoServiço = new javax.swing.JComboBox();
        jLabelHoraConsulta = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabelImgAgenda = new javax.swing.JLabel();
        jLabelNServico = new javax.swing.JLabel();
        JButtonNovo = new javax.swing.JButton();
        JButtonSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        JButtonAlterar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        jTextFieldN_Serviço = new javax.swing.JTextField();
        JTexFieldPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JlabelAgendamento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlabelTipoAnimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlabelTipoAnimal.setText("Tipo do Animal");
        getContentPane().add(JlabelTipoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));
        getContentPane().add(jTextFieldIdAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 30));

        jLabelIdAnimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdAnimal.setText("Id_Animal");
        getContentPane().add(jLabelIdAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        JComboBoxTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cachorro", "Gato", "Pássaros", " " }));
        getContentPane().add(JComboBoxTipoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 119, 31));

        jLabelCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCpf.setText("Cpf");
        getContentPane().add(jLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, 30));

        JlabelTipoServiço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlabelTipoServiço.setText("Tipo de Serviço");
        getContentPane().add(JlabelTipoServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabeldataConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeldataConsulta.setText("Data");
        getContentPane().add(jLabeldataConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 20));

        try {
            jFormattedTextFieldHoraConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldHoraConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 100, 30));

        JComboBoxTipoServiço.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banho", "Tosa", "Consulta", " " }));
        getContentPane().add(JComboBoxTipoServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 119, 31));

        jLabelHoraConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelHoraConsulta.setText("Hora");
        getContentPane().add(jLabelHoraConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, 20));

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 80, 30));

        jLabelImgAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/ésse.png"))); // NOI18N
        getContentPane().add(jLabelImgAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 140, 160));

        jLabelNServico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNServico.setText("Nº Serviço");
        getContentPane().add(jLabelNServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        JButtonNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonNovo.setText("Novo");
        JButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 84, 33));

        JButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonSalvar.setText("Salvar");
        JButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 84, 33));

        jLabel3.setText("Cpf");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 130, 30));

        JButtonAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonAlterar.setText("Alterar");
        JButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 84, 35));

        JButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 84, 34));
        getContentPane().add(jTextFieldN_Serviço, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 140, 30));
        getContentPane().add(JTexFieldPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 350, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/user.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 840, 400));

        JlabelAgendamento.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JlabelAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        JlabelAgendamento.setText("Agendamento");
        getContentPane().add(JlabelAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 270, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));
        getContentPane().add(jLabelFundoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 720, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
    
        
        jTextFieldN_Serviço.setEnabled(false);
        jTextFieldIdAnimal.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        JComboBoxTipoAnimal.setEnabled(true);
        JComboBoxTipoServiço.setEnabled(true);
        jFormattedTextFieldHoraConsulta.setEnabled(true);   
        JTexFieldPesquisar.setEnabled(true);

        AgendamentoDao agedao = new AgendamentoDao();
        Agendamento a = new Agendamento();

        String busca = JTexFieldPesquisar.getText();
        String servico = jTextFieldN_Serviço.getText();
        String id_animal = jTextFieldIdAnimal.getText();
        String cpf = jFormattedTextFieldCpf.getText();
        String data = jFormattedTextFieldData.getText();
        String tipo_animal = (String) JComboBoxTipoAnimal.getSelectedItem();
        String tipo_serv = (String) JComboBoxTipoServiço.getSelectedItem();
        String hora = jFormattedTextFieldHoraConsulta.getText();
        
        a = agedao.Buscar(busca);

        if (a != null) {
            
            jTextFieldN_Serviço.setText(a.getN_servico().toString());
            jTextFieldIdAnimal.setText(a.getId_animal().toString());
            jFormattedTextFieldCpf.setText(a.getCpf());
            jFormattedTextFieldData.setText(a.getData());
            JComboBoxTipoAnimal.setSelectedItem(a.getTipo());
            JComboBoxTipoServiço.setSelectedItem(a.getTiposervico());
            jFormattedTextFieldHoraConsulta.setText(a.getHora());
        
         
        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario Não Encontrado");
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void JButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNovoActionPerformed

        jTextFieldN_Serviço.setEnabled(true);
        jTextFieldIdAnimal.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jFormattedTextFieldData.setEditable(true);
        JComboBoxTipoAnimal.setEnabled(true);
        JComboBoxTipoServiço.setEnabled(true);
        jFormattedTextFieldHoraConsulta.setEnabled(true);
        LimparCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonNovoActionPerformed

    private void LimparCampos() {

        jTextFieldN_Serviço.setText("");
        jTextFieldIdAnimal.setText("");
        jFormattedTextFieldCpf.setText("");
        jFormattedTextFieldData.setText("");
        jFormattedTextFieldHoraConsulta.setText("");
        JTexFieldPesquisar.setText("");
    }


    private void JButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalvarActionPerformed

        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");      
        
        mod.setN_servico(Integer.parseInt(jTextFieldN_Serviço.getText()));
        mod.setId_animal(Integer.parseInt(jTextFieldIdAnimal.getText()));
        mod.setTipo((String) JComboBoxTipoAnimal.getSelectedItem());
        mod.setCpf(jFormattedTextFieldCpf.getText());
        mod.setTiposervico((String) JComboBoxTipoServiço.getSelectedItem());
        mod.setData(jFormattedTextFieldData.getText());
        mod.setHora(jFormattedTextFieldHoraConsulta.getText());
        cadastro.Salvar(mod);
        LimparCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonSalvarActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed

        jTextFieldN_Serviço.setEnabled(true);
        jTextFieldIdAnimal.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        JComboBoxTipoAnimal.setEnabled(true);
        JComboBoxTipoServiço.setEnabled(true);
        jFormattedTextFieldHoraConsulta.setEnabled(true);
        
        
        AgendamentoDao adao = new AgendamentoDao();
        Agendamento a = new Agendamento();
        
        String servico = jTextFieldN_Serviço.getText();
        String id = jTextFieldIdAnimal.getText();
        String cpf = jFormattedTextFieldCpf.getText();
        String data = jFormattedTextFieldData.getText();
        String tipo = (String)JComboBoxTipoAnimal.getSelectedItem();
        String serv = (String)JComboBoxTipoServiço.getSelectedItem();
        String hora = jFormattedTextFieldHoraConsulta.getText();
        //UsuarioDao userdao = new UsuarioDao();
        
        a.setCpf(cpf);
        a.setData(data);
        a.setHora(hora);
        a.setId_animal(WIDTH);
        a.setN_servico(WIDTH);
        a.setTipo(tipo);
        a.setTiposervico(serv);
        cadastro.Alterar(a);
        LimparCampos();

    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed
        LimparCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonNovo;
    private javax.swing.JButton JButtonSalvar;
    private javax.swing.JComboBox JComboBoxTipoAnimal;
    private javax.swing.JComboBox JComboBoxTipoServiço;
    private javax.swing.JTextField JTexFieldPesquisar;
    private javax.swing.JLabel JlabelAgendamento;
    private javax.swing.JLabel JlabelTipoAnimal;
    private javax.swing.JLabel JlabelTipoServiço;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelFundoTela;
    private javax.swing.JLabel jLabelHoraConsulta;
    private javax.swing.JLabel jLabelIdAnimal;
    private javax.swing.JLabel jLabelImgAgenda;
    private javax.swing.JLabel jLabelNServico;
    private javax.swing.JLabel jLabeldataConsulta;
    private javax.swing.JTextField jTextFieldIdAnimal;
    private javax.swing.JTextField jTextFieldN_Serviço;
    // End of variables declaration//GEN-END:variables
}
