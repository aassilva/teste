package br.ufg.inf.es.mds.atendimento;

import java.util.ArrayList;

public class Dia {

    private String diaDaSemana;
    private int horaInicio;
    private int horaFim;
    private ArrayList<Aluno> listaDeAlunos = new ArrayList();

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        if (diaDaSemana != null && !"".equals(diaDaSemana)) {
            this.diaDaSemana = diaDaSemana;
        } else {
            this.diaDaSemana = "";
        }
    }

    public Dia(String dia, int horaInicio, int horaFim) throws Exception {
        setDiaDaSemana(dia);
        setHoraInicio(horaInicio);
        setHoraFim(horaFim);
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) throws Exception {
        if (horaInicio >= 7 && horaInicio <= 21) {
            this.horaInicio = horaInicio;
        } else {
            throw new Exception("\nHora de início inválida!");
        }
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) throws Exception {
        if (horaFim > 7 && horaFim <= 22) {
            this.horaFim = horaFim;
        } else {
            throw new Exception("\nHora de término inválida!");
        }
    }

    public void limparListaDeAlunos() throws Exception {
        if (listaDeAlunos.isEmpty() == true) {
            throw new Exception("\nNenhum aluno cadastrado!");
        } else {
            this.listaDeAlunos.clear();
        }
    }

    public void listarAlunos(int horaInicio, int horaFim) throws Exception {
        if (listaDeAlunos.isEmpty() == true) {
            throw new Exception("\nNenhum aluno cadastrado!");
        } else {
            String listarElemento;
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                Aluno aluno = listaDeAlunos.get(i);
                listarElemento = i + 1 + " - " + "ALUNO: " + aluno.getNome()
                        + " " + horaInicio + ":00" + " - " + horaFim + ":00"
                        + "\n";
                System.out.println(listarElemento);
            }
        }
    }
    
    public void listarFeesbacks(int horaInicio, int horaFim) throws Exception {
        if (listaDeAlunos.isEmpty() == true) {
            throw new Exception("\nNenhum feedback enviado!");
        } else {
            String listarElemento;
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                Aluno aluno = listaDeAlunos.get(i);
                listarElemento = i + 1 + " - " + "Feedback: "
                        + aluno.getFeedBack()
                        + " " + horaInicio + ":00" + " - " + horaFim + ":00"
                        + "\n";
                System.out.println(listarElemento);
            }
        }
    }

    public void adicionarAluno(Aluno aluno) throws Exception {
        if (existeAluno(aluno)) {
            throw new Exception("\nAluno já cadastrado!");
        } else {
            listaDeAlunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) throws Exception {
        if (listaDeAlunos.isEmpty() == true) {
            throw new Exception("\nNenhum aluno cadastrado");
        } else {
            if (existeAluno(aluno)) {
                this.listaDeAlunos.remove(aluno);
            } else {
                throw new Exception("\nAluno não cadastrado na lista!");
            }
        }
    }
    

    public Aluno getAlunoPeloNome(String nome) throws Exception {
        for (Aluno alunoAlvo : listaDeAlunos) {
            if (alunoAlvo.getNome().equalsIgnoreCase(nome)) {
                return alunoAlvo;
            }
        }
        throw new Exception("\nAluno não existe ou entrada inválida!");
    }

    public boolean existeAluno(Aluno aluno) {
        for (Aluno alunoAlvo : listaDeAlunos) {
            if (alunoAlvo.getNome().equalsIgnoreCase(aluno.getNome())) {
                return true;
            }
        }
        return false;
    }
}
