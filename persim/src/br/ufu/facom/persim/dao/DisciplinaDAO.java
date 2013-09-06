package br.ufu.facom.persim.dao;
import br.ufu.facom.persim.model.Disciplina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisciplinaDAO {
    
    public static void save (Disciplina disc, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO disciplina VALUES (?, ?);";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, disc.getID());
        ps.setString(2, disc.getNome());
        ps.execute();
        conn.closeDB();
    }
    
    public static Disciplina load (String ID, ConnectionSQLiteDAO conn) throws SQLException{
        
        String query = "SELECT * FROM disciplina WHERE id LIKE ?";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, ID);
        ResultSet rs = ps.executeQuery();
        Disciplina dc = build(rs);
        conn.closeDB();
        return dc;
    }
    
    private static Disciplina build (ResultSet rs) throws SQLException{
        rs.next();
        String ID = rs.getString("id");
        String nome = rs.getString("nome");
        return new Disciplina(ID, nome);
    }
}
