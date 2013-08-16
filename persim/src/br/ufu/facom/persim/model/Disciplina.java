package br.ufu.facom.persim.model;
import java.util.List;

public class Disciplina {
    
    /*
     * Eventos incluem aulas, horarios de atendimento...
     */
    
    private String ID;
    private String nome;
    private Professor professor;
    private String adicionais;
    private List<String> bibliografia;
    private List<Evento> eventos;
    
    public Disciplina () {}
    
    public Disciplina (String ID, String nome, Professor professor, String adicionais) {
        this.ID = ID;
        this.nome = nome;
        this.professor = professor;
        this.adicionais = adicionais;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(List<String> bibliografia) {
        this.bibliografia = bibliografia;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public List<Evento> getEventos() {
        return eventos;
    }

    public String getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }
    
}
