package br.ufu.facom.persim.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Modulo de inicializacao do banco de dados a ser usado pela aplicacao
 */

public class InitialConfDAO {
    
    public static void configure (Connection dbconn) {
        
        String disciplina = "CREATE TABLE disciplina ( " + 
                                "id CHAR(20) PRIMARY KEY NOT NULL,"+
                                "nome CHAR(50)"+
                            ")";
        
        try {
            Statement st = dbconn.createStatement();
            st.executeUpdate(disciplina);
            st.close();
            System.out.println("Database is Initialized!");
        } catch (SQLException e) {
            System.err.println("Configuring Problems: " + e.getMessage());
        }
    }
    
    public static boolean isConfigured (Connection dbconn) {
        
        String query = "SELECT name FROM sqlite_master WHERE type='table';";
                
        try{
            Statement st = dbconn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs.next();
        } catch (SQLException e) {
            System.err.println("trying to 'identify configuration' problem: " + e.getMessage());
        }
        return false;
    }
    
}
