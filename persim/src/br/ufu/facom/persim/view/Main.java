package br.ufu.facom.persim.view;

import br.ufu.facom.persim.control.DisciplinaControl;
import br.ufu.facom.persim.model.Disciplina;
import br.ufu.facom.persim.model.Professor;

public class Main {

    public static void main(String[] args) {
        
        Professor prof = new Professor("Fulano", "fulano@ufu.br", "1B123");
        Disciplina dc = new Disciplina("ESOF", "Engenharia de Software", prof, "adicionais aqui");
        DisciplinaControl.save(dc);
        Disciplina dc2 = DisciplinaControl.load("ESOF");
        System.out.println("\nTESTES!!\n");
        System.out.println("ID: "+dc2.getID()+"\nNome Disc: "+dc2.getNome()
                +"\nProfessor: "+dc2.getProfessor().getNome()+"\nEmail Prof: "
                + dc2.getProfessor().getEmail() + "\nSala Prof: "+dc2.getProfessor().getSala()
                + "\nAdicionais: " +  dc2.getAdicionais()
                );
    }
}
