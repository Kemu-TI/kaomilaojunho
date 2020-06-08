
import dao.AbstractDao;
import dao.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Animal;
import model.Foto;

public class FotoDao extends AbstractDao {

    dao.Conectar conex = new dao.Conectar();
    Foto mod = new Foto();

    public Boolean Salvar(FotoDao imagem) {
        
  return null;
    }
}
