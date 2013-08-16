package br.ufu.facom.persim.dao;
import br.ufu.facom.persim.model.Disciplina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisciplinaDAO {
    
    public void save (Disciplina disc, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO disciplina VALUES (?, ?, ?, ?);";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, disc.getID());
        ps.setString(2, disc.getNome());
        try{
            ProfessorDAO dao = new ProfessorDAO();
            dao.save(disc.getProfessor(), conn);
            ps.setString(3, disc.getProfessor().getNome());
        } catch (SQLException e) {
            ps.setString(3, disc.getProfessor().getNome());
        } catch (NullPointerException e) {
            ps.setNull(3, java.sql.Types.NULL);
        }
        ps.setString(4, disc.getAdicionais());
        ps.execute();
    }
    
    public Disciplina load (String ID, ConnectionSQLiteDAO conn) throws SQLException{
        
        String query = "SELECT * FROM disciplina LEFT OUTER JOIN professor "
                            + "ON disciplina.fk_prof_nome LIKE professor.prof_nome "
                            + "WHERE disciplina.disc_id LIKE ?";
        
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, ID);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return build(rs);
    }
    
    private Disciplina build (ResultSet rs) throws SQLException{
        Disciplina ds = new Disciplina();
        ProfessorDAO dao = new ProfessorDAO();
        
        ds.setID(rs.getString("disc_id"));
        ds.setNome(rs.getString("disc_nome"));
        ds.setProfessor(dao.build(rs));
        ds.setAdicionais(rs.getString("disc_adicionais"));
        
        return ds;
    }
}
