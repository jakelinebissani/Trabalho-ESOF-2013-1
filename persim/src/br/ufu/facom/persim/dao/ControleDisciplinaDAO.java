/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.dao;
import br.ufu.facom.persim.model.ControleDisciplina;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jakeline Bissani
 */
public class ControleDisciplinaDAO {

    public void save (ControleDisciplina ctr, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO controle_disciplina VALUES (?, ?, ?, ?);";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, ctr.getDisc_id());
        ps.setFloat(2, ctr.getNotas());
        ps.setInt(3, ctr.getFaltas());
        ps.setString(4, ctr.getTrf_adicionais());
        ps.setString(4, ctr.getTrf_adicionais());
        ps.execute();
    }
}
