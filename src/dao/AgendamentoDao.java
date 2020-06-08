/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Agendamento;
import model.Animal;
import model.Cliente;

/**
 *
 * @author S.I
 */
public class AgendamentoDao extends AbstractDao {

   dao.Conectar conex = new Conectar();
   Agendamento mod = new Agendamento();
    // Abre conexão e puxa os modelos de usuario

    public void Salvar(Agendamento cad) {
       
        conex.conexao();
        
        // ps = c.prepareStatement(sql);
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cad_agendamento(n_serviço,id_animal,tipo_animal,cpf,tipo_serviço,data,hora)"
                    + "values(?,?,?,?,?,?,?)");
            pst.setInt(1, cad.getN_servico());
            pst.setInt(2, cad.getId_animal());
            pst.setString(3, cad.getTipo());
            pst.setString(4, cad.getCpf());
            pst.setString(5, cad.getTiposervico());
            pst.setString(6, cad.getData());
            pst.setString(7, cad.getHora());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Agendamento " + ex.getMessage());

            ex.printStackTrace();
        }
        conex.desconectar();
    }

    public void Alterar(Agendamento alterar) {

        conex.conexao();
        String sql ="update cad_agendamento set n_serviço=?,id_animal=?,tipo_animal=?,cpf=?,tipo_serviço=?,data=?,hora=? where cpf=?";
        
        try {
            
            PreparedStatement pst = conex.con.prepareStatement(sql);
            pst.setInt(1, alterar.getN_servico());
            pst.setInt(2, alterar.getId_animal());
            pst.setString(3, alterar.getTipo());
            pst.setString(4, alterar.getCpf());
            pst.setString(5, alterar.getTiposervico());
            pst.setString(6, alterar.getData());
            pst.setString(7, alterar.getHora());
            pst.setString(8,alterar.getCpf());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Agendamento Alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Agendamento " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public Agendamento Buscar(String cpf) {
        conex.conexao();
        
        String sql = "select*from cad_agendamento where cpf=?";
        try {
            
               PreparedStatement pst = conex.con.prepareStatement(sql);
               pst.setString(1, cpf);
               rs = pst.executeQuery();
               if(rs.next()){
         return new Agendamento(rs.getInt("n_serviço"),rs.getInt("id_animal"),rs.getString("tipo_animal"),rs.getString("cpf"),rs.getString("n_serviço"),rs.getString("data"),rs.getString("hora"));
            
               }else{
                   return null;
               }
        } catch (SQLException ex) {
                  ex.printStackTrace();
            return null;
        }
      
    }
    
      
    
}
        
    

