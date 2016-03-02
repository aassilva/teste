package br.ufg.inf.es.mds.professor;

import java.util.ArrayList;
import java.util.List;

public class ListaProfessores {

    private ArrayList<Professor> listaDeProfessores = new ArrayList();

    public void adicionarProfessor(Professor professor) throws Exception {
        if (existeProfessor(professor) == true) {
            throw new Exception("\nJá existe um professor com este código!");
        } else {
            listaDeProfessores.add(professor);
        }
    }

    
    
    public void removerProfessor(Professor professor) throws Exception {
        if (existeProfessor(professor)) {
            this.listaDeProfessores.remove(professor);
        } else {
            throw new Exception("\nProfessor não existe!");
        }
    }

    public boolean existeProfessor(Professor professor) {
        for (Professor professorAlvo : listaDeProfessores) {
            if (professorAlvo.getCod().equals(professor.getCod())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean codigoUtilizado(String codigo) {
        for (Professor professorAlvo : listaDeProfessores) {
            if (professorAlvo.getCod().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
    
    

    public boolean verificaListaVazia() {
        return listaDeProfessores.isEmpty() == true;
    }

    public void listarProfessores() throws Exception {
        if (listaDeProfessores.isEmpty() == true) {
            throw new Exception("Nenhum professor cadastrado!");
        } else {
            String listarElemento;
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                Professor p = listaDeProfessores.get(i);
                listarElemento = i + 1 + " - " + "Nome do Professor: "
                        + p.getNome()
                        + "\nCódigo do Professor: " + p.getCod() + "\n";
                System.out.println(listarElemento);
            }
        }
    }
    
    public void atualizaProfessor(Professor professor, String nome, 
            String codigo) throws Exception{
        if(existeProfessor(professor) && codigoUtilizado(codigo) == false) {
            professor.setCod(codigo);
            professor.setNome(nome);
        } else {
            throw new Exception("\nNão foi possível atualizar este professor!");
        }
    }

    public Professor getProfessor(int indice) {
        return listaDeProfessores.get(indice);
    }

    public Professor getProfessorPeloCodigo(String codigo) throws Exception {
        for (Professor professor : listaDeProfessores) {
            if (professor.getCod().equals(codigo)) {
                return professor;
            }
        }
        throw new Exception("\nProfessor não existe ou entrada inválida!");
    }

    public int getSize() {
        return this.listaDeProfessores.size();
    }
}
