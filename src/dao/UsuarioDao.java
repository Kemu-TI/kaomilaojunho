
package dao;

import model.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Kemu27
 */
public class UsuarioDao extends AbstractDao {

    dao.Conectar conex = new dao.Conectar();
    Usuario mod = new Usuario();
    // Abre conexão e puxa os modelos de usuario

    public void Salvar(Usuario cad) {

        conex.conexao();
        // ps = c.prepareStatement(sql);
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cad_user(nome,usuario,senha,tipo,mat)"
                    + "values(?,?,?,?,?)");
            pst.setString(1, cad.getNome());
            pst.setString(2, cad.getUsuario());
            pst.setString(3, cad.getSenha());
            pst.setString(4, cad.getTipo());
            pst.setInt(5, cad.getMatricula());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Usuário" + ex.getMessage());

            ex.printStackTrace();
        }
        conex.desconectar();
    }

    public void Alterar(Usuario alterar) {
        conex.conexao();
        String sql = "update cad_user set nome=?,usuario=?,senha=?,tipo=? where usuario=?";
        
        try {

            PreparedStatement pst = conex.con.prepareStatement(sql);
            pst.setString(1, alterar.getNome());
            pst.setString(2, alterar.getUsuario());
            pst.setString(3, alterar.getSenha());
            pst.setString(4, alterar.getTipo());
            pst.setString(5, alterar.getUsuario());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados alterados Com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error na alteraçaõ de dados : \n" + ex.getMessage());
        }
        conex.desconectar();
    }

    public Usuario Buscar(String nome) {
        conex.conexao();
        
        String sql = "select*from cad_user where nome=?";
        try {
            
               PreparedStatement pst = conex.con.prepareStatement(sql);
               pst.setString(1, nome);
               rs = pst.executeQuery();
               if(rs.next()){
            return new Usuario(rs.getString("nome"), rs.getString("usuario"), rs.getString("senha"), rs.getString("tipo"), rs.getInt("mat"));
            
               }else{
                   return null;
               }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        
     }

    public void Excluir(Usuario excluir) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cad_user where nome=?");
            pst.setInt(1, excluir.getMatricula());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com sucesso!\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao Excluir dados : \n" + ex.getMessage());
        }
        conex.desconectar();
    }

    
    
    
}
