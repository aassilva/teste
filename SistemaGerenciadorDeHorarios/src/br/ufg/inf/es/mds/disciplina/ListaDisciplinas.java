package br.ufg.inf.es.mds.disciplina;

import br.ufg.inf.es.mds.professor.Professor;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaDisciplinas {

    private ArrayList<Disciplina> listaDeDisciplinas = new ArrayList();

    public void adicinarDisciplina(Disciplina disciplina) throws Exception {
        if (existeDisciplina(disciplina) == true) {
            throw new Exception("\nNão foi possível adicionar"
                    + " essa disciplina!");
        } else {
            listaDeDisciplinas.add(disciplina);
        }
    }

    public void removerDisciplina(Disciplina disciplina) throws Exception {
         if (existeDisciplina(disciplina)) {
            this.listaDeDisciplinas.remove(disciplina);
        } else {
            throw new Exception("\nDisciplina não existe!");
        }
    }

    public boolean existeDisciplina(Disciplina disc) {
        for (Disciplina disciplina : listaDeDisciplinas) {
            if (disciplina.getCodigo().equals(disc.getCodigo())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean codigoUtilizado(String codigo) {
        for (Disciplina disciplina : listaDeDisciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarVazio() {
        return listaDeDisciplinas.isEmpty() == true;
    }

    public void listarDisciplinas() throws Exception{
        if (listaDeDisciplinas.isEmpty() == true) {
            throw new Exception("Nenhuma disciplina cadastrada");
        } else {
            String listarElemento;
            for (int i = 0; i < listaDeDisciplinas.size(); i++) {
                Disciplina disciplina = listaDeDisciplinas.get(i);
                listarElemento = i + 1 + " - " + "Nome da Disciplina: " 
                        + disciplina.getNome()
                        + "\nCódigo da Disciplina: " + disciplina.getCodigo() 
                        + "\n"
                        + "Nome do Professor: " + disciplina.getProfessor().
                                getNome()
                        + "\nCodigo do Professor: " + disciplina.getProfessor().
                                getCod() + "\n";
                System.out.println(listarElemento);
            }
        }
    }
    
    public void atualizaDisciplina(Disciplina disciplina, String codigo, 
            String nome, Professor professor) throws Exception {
        if(existeDisciplina(disciplina) && codigoUtilizado(codigo) == false) {
            disciplina.setCodigo(codigo);
            disciplina.setNome(nome);
            disciplina.setProfessor(professor);
        } else {
            throw new Exception("\nNão foi possível atualizar esta disciplina!");
        }
        
    }

       
    public Disciplina getDisciplinaPeloCodigo(String codigo) throws Exception {
        for (Disciplina disciplina : listaDeDisciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        throw new Exception("\nDisciplina não existe ou entrada inválida!");
    }
        
    public Disciplina getDisciplina(int indice){
        return this.listaDeDisciplinas.get(indice);
    }
    
    public int getSize() {
        return this.listaDeDisciplinas.size();
    }
}
