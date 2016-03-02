package br.ufg.inf.es.mds.disciplina;

import br.ufg.inf.es.mds.atendimento.Dia;
import br.ufg.inf.es.mds.professor.Professor;

public class Disciplina {

    private String nomeDisciplina;
    private String codigoDisciplina;
    private Professor professor;
    private Dia segunda;
    private Dia terca;
    private Dia quarta;
    private Dia quinta;
    private Dia sexta;
    private Dia sabado;

    public Disciplina(String nomeDisciplina, String codigoDisciplina,
            Professor professor) throws Exception {
        setNome(nomeDisciplina);
        setCodigo(codigoDisciplina);
        setProfessor(professor);
    }

    public Disciplina(String codigoDisciplina) throws Exception {
        setCodigo(codigoDisciplina);
    }

    public String getNome() {
        return nomeDisciplina;
    }

    public void setNome(String nomeDisciplina) throws Exception {
        if (nomeDisciplina != null && !"".equals(nomeDisciplina)) {
            this.nomeDisciplina = nomeDisciplina;
        } else {
            throw new Exception("\nNome inválido!");
        }
    }

    public String getCodigo() {
        return codigoDisciplina;
    }

    public void setCodigo(String codigoDisciplina) throws Exception {
        if (codigoDisciplina != null && !"".equals(codigoDisciplina)) {
            this.codigoDisciplina = codigoDisciplina;
        } else {
            throw new Exception("\nCódigo inválido!");
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) throws Exception {
        if (professor != null) {
            this.professor = professor;
        } else {
            throw new Exception("\nProfessor inválido!");
        }
    }

    public Dia getDia(int flag) throws Exception {
        switch (flag) {
            case 1:
                return this.segunda;
            case 2:
                return this.terca;
            case 3:
                return this.quarta;
            case 4:
                return this.quinta;
            case 5:
                return this.sexta;
            case 6:
                return this.sabado;
            default:
                throw new Exception("\nDia inválido!");
        }

    }

    public void setDia(Dia dia, int flag) throws Exception {
        switch (flag) {
            case 1:
                this.segunda = dia;
                break;
            case 2:
                this.terca = dia;
                break;
            case 3:
                this.quarta = dia;
                break;
            case 4:
                this.quinta = dia;
                break;
            case 5:
                this.sexta = dia;
                break;
            case 6:
                this.sabado = dia;
                break;
            default:
                throw new Exception("\nDia inválido!");
        }
    }
    
    public void setDiaaa(Dia dia, int horaInicio, int horaFim) throws Exception {
        if (horaInicio < horaFim) {
        dia.setHoraInicio(horaInicio);
        dia.setHoraFim(horaFim);
        } else {
            throw new Exception("\nHora de início deve ser maior que a de "
                    + "término!");
        }
    }

    public void reset(int flag) throws Exception {
        switch (flag) {
            case 1:
                this.segunda = null;
                break;
            case 2:
                this.terca = null;
                break;
            case 3:
                this.quarta = null;
                break;
            case 4:
                this.quinta = null;
                break;
            case 5:
                this.sexta = null;
                break;
            case 6:
                this.sabado = null;
                break;
            default:
                throw new Exception("\nDia inválido!");
        }
    }
}
