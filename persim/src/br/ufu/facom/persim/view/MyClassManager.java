package br.ufu.facom.persim.view;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;

public class MyClassManager {

    public static void main(String[] args) {
        
        ConnectionSQLiteDAO cons = new ConnectionSQLiteDAO();
        cons.closeDB();
    }
}
