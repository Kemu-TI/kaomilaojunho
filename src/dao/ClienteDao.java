/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import com.toedter.calendar.JCalendar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Animal;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author S.I
 */
public class ClienteDao extends AbstractDao{

    dao.Conectar conex = new dao.Conectar();
    Cliente mod = new Cliente();
    // Abre conexão e puxa os modelos de usuario

    public void Salvar(Cliente cad) {

        conex.conexao();
        // ps = c.prepareStatement(sql);
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cad_cliente(nome,cpf,rg,"
                    + "data_nascimento,sexo,logradouro,complemento,"
                    + "numero,cidade,estado,cep,contato,email,cartao_de_credito,validade,n_do_cartao,id_animal)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, cad.getNome());
            pst.setString(2, cad.getCpf());
            pst.setString(3, cad.getRg());
            pst.setString(4, cad.getData());
            pst.setString(5, cad.getSexo());
            pst.setString(6, cad.getLogradouro());
            pst.setString(7, cad.getComplemento());
            pst.setInt(8, cad.getNumero());
            pst.setString(9, cad.getCidade());
            pst.setString(10, cad.getEstado());
            pst.setString(11, cad.getCep());
            pst.setString(12, cad.getContato());
            pst.setString(13, cad.getEmail());
            pst.setString(14, cad.getCartao());
            pst.setString(15, cad.getValidade());
            pst.setInt(16, cad.getN_cartao());
            pst.setInt(17, cad.getId_animal());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente " + ex.getMessage());

            ex.printStackTrace();
        }
        conex.desconectar();
    }

    public void Alterar(Cliente alterar) {

        conex.conexao();
        String sql ="update cad_cliente set nome=?,cpf=?,rg=?,"
                + "data_nascimento=?,sexo=?,logradouro=?,complemento=?,"
                + "numero=?,cidade=?,estado=?,cep=?,contato=?,email=?,cartao_de_credito=?,validade=?,"
                + "n_do_cartao=?,id_animal=? where cpf=?";
        
        try {
            PreparedStatement pst = conex.con.prepareStatement(sql);
            
            pst.setString(1, alterar.getNome());
            pst.setString(2, alterar.getCpf());
            pst.setString(3, alterar.getRg());
            pst.setString(4, alterar.getData());
            pst.setString(5, alterar.getSexo());
            pst.setString(6, alterar.getLogradouro());
            pst.setString(7, alterar.getComplemento());
            pst.setInt(8, alterar.getNumero());
            pst.setString(9, alterar.getCidade());
            pst.setString(10, alterar.getEstado());
            pst.setString(11, alterar.getCep());
            pst.setString(12, alterar.getContato());
            pst.setString(13, alterar.getEmail());
            pst.setString(14, alterar.getCartao());
            pst.setString(15, alterar.getValidade());
            pst.setInt(16, alterar.getN_cartao());
            pst.setInt(17, alterar.getId_animal());
            pst.setString(18, alterar.getCpf());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente Alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Cliente " + ex.getMessage());
            ex.printStackTrace();
        }

    }
public Cliente Buscar(String cpf) {
        conex.conexao();
        
        String sql = "select*from cad_cliente where cpf=?";
        try {
              
               PreparedStatement pst = conex.con.prepareStatement(sql);
               pst.setString(1, cpf);
               rs = pst.executeQuery();
               if(rs.next()){
           return new Cliente(rs.getInt("id_animal"), rs.getString("nome"), rs.getString("cpf"), rs.getString("rg"), rs.getString("data_nascimento"), rs.getString("sexo"), rs.getString("logradouro"), rs.getString("complemento"), rs.getInt("numero"), rs.getString("cidade"), rs.getString("estado"), rs.getString("cep"), rs.getString("contato"), rs.getString("email"), rs.getString("cartao_de_credito"), rs.getString("validade"), rs.getInt("n_do_cartao"));
               
               }else{
                   return null;
               }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        
}

}