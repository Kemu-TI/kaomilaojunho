/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Animal;
import model.Usuario;

/**
 *
 * @author S.I
 */
public class AnimalDao extends AbstractDao {

    dao.Conectar conex = new dao.Conectar();
    Animal mod = new Animal();
    // Abre conexão e puxa os modelos de usuario

    public void Salvar(Animal cad) {

        conex.conexao();
        // ps = c.prepareStatement(sql);
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cad_animal(id_animal,nome,apelido,raca,porte,cor,sexo,data_nascimento,observacao,caminho_imagem,tipo_animal)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, cad.getId());
            pst.setString(2, cad.getNome());
            pst.setString(3, cad.getApelido());
            pst.setString(4, cad.getRaca());
            pst.setString(5, cad.getPorte());
            pst.setString(6, cad.getCor());
            pst.setString(7, cad.getSexo());
            pst.setString(8, cad.getData());
            pst.setString(9, cad.getObservacao());
            pst.setString(10, cad.getFoto());
            pst.setString(11, cad.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Animal Cadastrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Animal " + ex.getMessage());

            ex.printStackTrace();
        }
        conex.desconectar();
    }

    public void Alterar(Animal alterar) {

        conex.conexao();
        String sql ="update cad_animal set nome=?,apelido=?,raca=?,porte=?,cor=?,sexo=?,data_nascimento=?,observacao=?,caminho_imagem=?,tipo_animal=? where nome=?"; 
        try {
            
            PreparedStatement pst = conex.con.prepareStatement(sql);

            pst.setString(1, alterar.getNome());
            pst.setString(2, alterar.getApelido());
            pst.setString(3, alterar.getRaca());
            pst.setString(4, alterar.getPorte());
            pst.setString(5, alterar.getCor());
            pst.setString(6, alterar.getSexo());
            pst.setString(7, alterar.getData());
            pst.setString(8, alterar.getObservacao());
            pst.setString(9, alterar.getFoto());
            pst.setString(10, alterar.getTipo());
            pst.setString(11, alterar.getNome());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Animal Alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Animal " + ex.getMessage());
            ex.printStackTrace();
        }

    }

  public Animal Buscar(String nome) {
        conex.conexao();
        
        String sql = "select*from cad_animal where nome=?";
        try {
            
               PreparedStatement pst = conex.con.prepareStatement(sql);
               pst.setString(1, nome);
               rs = pst.executeQuery();
               if(rs.next()){
            return new Animal(rs.getInt("id_animal"),rs.getString("nome"), rs.getString("apelido"), rs.getString("raca"), rs.getString("porte"), rs.getString("cor"),rs.getString("sexo"),rs.getString("data_nascimento"),rs.getString("observacao"),rs.getString("caminho_imagem"),rs.getString("cor"),rs.getString("tipo_animal"));
            
               }else{
                   return null;
               }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        

    }

}
