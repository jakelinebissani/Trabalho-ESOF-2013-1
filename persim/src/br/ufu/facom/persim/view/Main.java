package br.ufu.facom.persim.view;

import br.ufu.facom.persim.control.DisciplinaControl;
import br.ufu.facom.persim.model.Disciplina;
import br.ufu.facom.persim.view.CadastroDisciplina;

public class Main {

    public static void main(String[] args) {
        
        Disciplina dc = new Disciplina("ESOF", "Engenharia de Software");
        DisciplinaControl.save(dc);
        Disciplina dc2 = DisciplinaControl.load("ESOF");
        
        System.out.println("TESTES!!");
        System.out.println("* "+dc2.getID()+" - "+dc2.getNome());
        CadastroDisciplina cadastro = new CadastroDisciplina();
        cadastro.show();
    }
}
