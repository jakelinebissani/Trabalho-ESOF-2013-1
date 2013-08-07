package br.ufu.facom.persim.model;
import java.util.Date;
import java.util.List;

public class Disciplina {
    
    private String nome;
    private String ID;
    private List<Date> horarios;
    private List<String> local;
    private List<Date> atendimento;
    private String professor;
    private List<String> bibliografia;
    private List<Evento> eventos;

    public Disciplina (String ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Date> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Date> horarios) {
        this.horarios = horarios;
    }

    public List<String> getLocal() {
        return local;
    }

    public void setLocal(List<String> local) {
        this.local = local;
    }

    public List<Date> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(List<Date> atendimento) {
        this.atendimento = atendimento;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<String> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(List<String> bibliografia) {
        this.bibliografia = bibliografia;
    }
    
}
