package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.DisciplinaDAO;
import br.ufu.facom.persim.model.Disciplina;
import java.sql.SQLException;

public class DisciplinaControl {
    
    public static void save (Disciplina disc){
        try {
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            DisciplinaDAO.save(disc, conn);
        } catch (SQLException e) {
            System.err.println("Problema ao salvar disciplina: " + e.getMessage());
        }
    }
    
    public static Disciplina load (String nome){
        try {
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            return DisciplinaDAO.load(nome, conn);
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar info. de disciplina: " + e.getMessage());
        }
        return null;
    }
}
