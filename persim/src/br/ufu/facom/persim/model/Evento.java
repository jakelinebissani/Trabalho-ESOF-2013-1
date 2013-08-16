package br.ufu.facom.persim.model;

import java.sql.Date;

public class Evento {
    
    private String local;
    private Date dataHora;
        
    public Evento () {}
    
    public Evento (String local, Date dataHora) {
        this.local = local;
        this.dataHora = dataHora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
        
}
