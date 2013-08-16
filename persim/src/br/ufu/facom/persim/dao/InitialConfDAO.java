package br.ufu.facom.persim.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Modulo de inicializacao do banco de dados a ser usado pela aplicacao
 */

public class InitialConfDAO {
    
    public static void configure (Connection dbconn, File SQLscript) 
                       throws FileNotFoundException, SQLException {
        
        String endOfQuery = ";";
        Scanner scanner = new Scanner(SQLscript).useDelimiter(endOfQuery);
        
        while (scanner.hasNext()){
            String query = scanner.next() + endOfQuery;
            Statement st = dbconn.createStatement();
            st.execute(query);
        }
    }
    
    public static boolean isConfigured (Connection dbconn) throws SQLException {
        
        String query = "SELECT name FROM sqlite_master WHERE type='table';";
                
        Statement st = dbconn.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs.next();
    }
}
