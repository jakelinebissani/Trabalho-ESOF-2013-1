package br.ufu.facom.persim.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Modulo para estabelecer conexao do banco a aplicacao.
 * Se ainda nao ha um DB configurado, InitialConfDAO configura
 * criando um novo arquivo "myclassmanager.db"
 */

public class ConnectionSQLiteDAO {
    
    private Connection conn;
    
    public ConnectionSQLiteDAO (){
        try{
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:myclassmanager.db");
            
            if (!InitialConfDAO.isConfigured(conn)){
                InitialConfDAO.configure(this.conn);
            }
            
        } catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
    
    public Connection getDBConnection() {
        return conn;
    }
    
    public void closeDB () {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQLiteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Closed database successfully");
    }
    
}
