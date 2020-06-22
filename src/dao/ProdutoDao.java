/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.prism.j2d.J2DPipeline;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Cliente;
import model.Produto;

/**
 *
 * @author S.I
 */
public class ProdutoDao extends AbstractDao {

    dao.Conectar conex = new dao.Conectar();
    Produto mod = new Produto();
    // Abre conexão e puxa os modelos de usuario

    public void Salvar(Produto cad) {

        conex.conexao();
        // ps = c.prepareStatement(sql);
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cad_produto(codigo,categoria,nome_produto,"
                    + "descricao,data_fabricacao,validade,nome_fabricante,"
                    + "cnpj,qtd_estoque,vlr_fornecedor,vlr_venda,mat_usuario)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setInt(1, cad.getCodigo());
            pst.setString(2, cad.getCategoria());
            pst.setString(3, cad.getNome());
            pst.setString(4, cad.getDescricao());
            pst.setString(5, cad.getData());
            pst.setString(6, cad.getValidade());
            pst.setString(7, cad.getFabricante());
            pst.setString(8, cad.getCnpj());
            pst.setInt(9, cad.getEstoque());
            pst.setInt(10, cad.getVlr_fornecedor());
            pst.setInt(11, cad.getVlr_venda());
            pst.setInt(12, cad.getMat_usuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Produto " + ex.getMessage());

            ex.printStackTrace();
        }
        conex.desconectar();
    }

    public void Alterar(Produto alterar) {

        conex.conexao();
        String sql = "update cad_produto set codigo=?,categoria=?,nome_produto=?,descricao=?,data_fabricacao=?,validade=?,nome_fabricante=?,cnpj=?,qtd_estoque=?,vlr_fornecedor=?,vlr_venda=?,mat_usuario=? where nome_produto=?";
                  
        try {
            PreparedStatement pst = conex.con.prepareStatement(sql);

            pst.setInt(1, alterar.getCodigo());
            pst.setString(2, alterar.getCategoria());
            pst.setString(3, alterar.getNome());
            pst.setString(4, alterar.getDescricao());
            pst.setString(5, alterar.getData());
            pst.setString(6, alterar.getValidade());
            pst.setString(7, alterar.getFabricante());
            pst.setString(8, alterar.getCnpj());
            pst.setInt(9, alterar.getEstoque());
            pst.setInt(10, alterar.getVlr_fornecedor());
            pst.setInt(11, alterar.getVlr_venda());
            pst.setInt(12, alterar.getMat_usuario());
            pst.setString(13, alterar.getNome());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Produto " + ex.getMessage());
            ex.printStackTrace();
        }

    }
    public Produto Buscar(String nome) {
        conex.conexao();
        
        String sql = "select*from cad_produto where nome_produto=?";
        try {
            
               PreparedStatement pst = conex.con.prepareStatement(sql);
               pst.setString(1, nome);
               rs = pst.executeQuery();
               if(rs.next()){
            return new Produto(rs.getInt("codigo"), rs.getString("categoria"), rs.getString("nome_produto"),rs.getString("descricao"), rs.getString("data_fabricacao"), rs.getString("validade"),rs.getString("nome_fabricante"),rs.getString("cnpj"),rs.getInt("qtd_estoque"), rs.getInt("vlr_fornecedor"), rs.getInt("vlr_venda"), rs.getInt("mat_usuario"));
           
               }else{
                   return null;
               }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
} 
        

    

   