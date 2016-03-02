package br.ufg.inf.es.mds.professor;

public class Professor {

    private String nomeProfessor;
    private String codigoProfessor;
    

    public Professor(String nomeProfessor, String codigoProfessor) 
            throws Exception {
        setNome(nomeProfessor);
        setCod(codigoProfessor);
    }

    public Professor(String codigoProfessor) throws Exception {
        //this.nomeProfessor = "";
        setCod(codigoProfessor);
    }

    public String getNome() {
        return nomeProfessor;
    }

    public void setNome(String nomeProfessor) throws Exception {
        if (nomeProfessor != null && !"".equals(nomeProfessor)) {
            this.nomeProfessor = nomeProfessor;
        } else {
            throw new Exception("\nNome inválido!");
        }
    }

    public String getCod() {
        return codigoProfessor;
    }

    public void setCod(String codigoProfessor) throws Exception {
        if (codigoProfessor != null && !"".equals(codigoProfessor)) {
            this.codigoProfessor = codigoProfessor;
        } else {
            throw new Exception("\nCódigo inválido!");
        }
    }
}
