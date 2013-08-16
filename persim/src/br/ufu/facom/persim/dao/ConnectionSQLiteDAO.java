package br.ufu.facom.persim.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Modulo para estabelecer conexao do banco a aplicacao.
 * Se ainda nao ha um DB configurado, InitialConfDAO configura.
 * criando um novo arquivo "myclassmanager.db".
 * InitialConfDAO.configure utiliza um script sql que esta na
 * pasta database.
 */

public class ConnectionSQLiteDAO {
    
    private Connection conn;
    
    public ConnectionSQLiteDAO () 
            throws ClassNotFoundException, SQLException, FileNotFoundException {
        
        String udir = System.getProperty("user.dir");       //diretorio da app.
        String fsep = System.getProperty("file.separator"); //separador de diretorios do SO de uso
        String dbpath = udir+fsep+"database"+fsep;          //caminho do diretorio 'database'
            
        Class.forName("org.sqlite.JDBC");       //testa plugin sqlite
        
        this.conn = DriverManager.getConnection("jdbc:sqlite:"+dbpath+"myclassmanager.db");
            
        if (!InitialConfDAO.isConfigured(conn)){
            File SQLscript = new File(dbpath+"myclassmanager.sql");
            InitialConfDAO.configure(this.conn, SQLscript);
        }
        
        System.out.println("StatusDB: Aberto.");
    }
    
    public Connection getDBConnection() {
        return conn;
    }
    
    public void closeDB () throws SQLException {
        this.conn.close();
        System.out.println("StatusDB: Fechado.");
    }
    
}
