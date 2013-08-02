package br.ufu.facom.persim.view;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClassManager {

    public static void main(String[] args) {
        
        ConnectionSQLiteDAO cons = new ConnectionSQLiteDAO();
        cons.closeDB();
    }
}
